package org.firstinspires.ftc.teamcode.HardwareMapping;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
    //Each object of the class RobotHardware shall have the following variables:
    public DcMotor[] wheels = new DcMotor[4];
    public DcMotor intake;
    public DcMotor shooter;
    public Servo flowerDingus;

    public RobotHardware(HardwareMap hardwareMap){
        /* Each object of the class RobotHardware shall take a HardwareMap object at declaration,
         * and use it to assign these variables:
         */
        intake = hardwareMap.get(DcMotor.class, "intakeMotor");
        intake.setDirection(DcMotorSimple.Direction.FORWARD);

        flowerDingus = hardwareMap.get(Servo.class, "flower");
        flowerDingus.setDirection(Servo.Direction.FORWARD);

        wheels[0] = hardwareMap.get(DcMotor.class, "rightFront");
        wheels[1] = hardwareMap.get(DcMotor.class, "rightBack");
        wheels[2] = hardwareMap.get(DcMotor.class, "leftBack");
        wheels[3] = hardwareMap.get(DcMotor.class, "leftFront");

        //Then, set behaviour to BRAKE of all wheels via a loop:
        for (int i = 0; i <= 3; i = i + 1){
            wheels[i].setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

        //Edit this block to change the direction the wheels spin when powered
        wheels[0].setDirection(DcMotorSimple.Direction.FORWARD);
        wheels[1].setDirection(DcMotorSimple.Direction.FORWARD);
        wheels[2].setDirection(DcMotorSimple.Direction.FORWARD);
        wheels[3].setDirection(DcMotorSimple.Direction.FORWARD);
    }
}