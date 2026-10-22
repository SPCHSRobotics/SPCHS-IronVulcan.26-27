package org.firstinspires.ftc.teamcode.HardwareMapping;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
    //Each object of the class RobotHardware shall have the following variables:
    public DcMotor[] Wheels = new DcMotor[4];
    public DcMotor Intake;


    public RobotHardware(HardwareMap hardwareMap){
        /* Each object of the class RobotHardware shall take a HardwareMap object at declaration,
         * and use it to assign these variables:
         */
        Intake = hardwareMap.get(DcMotor.class, "intakeMotor");

        Wheels[0] = hardwareMap.get(DcMotor.class, "rightFront");
        Wheels[1] = hardwareMap.get(DcMotor.class, "rightBack");
        Wheels[2] = hardwareMap.get(DcMotor.class, "leftBack");
        Wheels[3] = hardwareMap.get(DcMotor.class, "leftFront");

        //Then, set behaviour to BRAKE of all wheels via a loop:
        for (int i = 0; i <= 3; i = i + 1){
            Wheels[i].setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

        //Edit this block to change the direction the wheels spin when powered
        Wheels[0].setDirection(DcMotorSimple.Direction.FORWARD);
        Wheels[1].setDirection(DcMotorSimple.Direction.FORWARD);
        Wheels[2].setDirection(DcMotorSimple.Direction.FORWARD);
        Wheels[3].setDirection(DcMotorSimple.Direction.FORWARD);
    }
}