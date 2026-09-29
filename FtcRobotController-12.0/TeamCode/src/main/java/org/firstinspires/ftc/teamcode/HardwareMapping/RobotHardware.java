package org.firstinspires.ftc.teamcode.HardwareMapping;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
    //Each object of the class RobotHardware shall have the following variables:
    public DcMotor[] Wheels = new DcMotor[4];

    public RobotHardware(HardwareMap hardwareMap){
        /*
        Each object of the class RobotHardware shall take a HardwareMap object at declaration,
        and use it to assign these four variables to DcMotor objects.
        */
        Wheels[0] = hardwareMap.get(DcMotor.class, "rightFront");
        Wheels[1] = hardwareMap.get(DcMotor.class, "rightBack");
        Wheels[2] = hardwareMap.get(DcMotor.class, "leftBack");
        Wheels[3] = hardwareMap.get(DcMotor.class, "leftFront");

        //This loop is here for convenience
        for (int i = 0; i <= 3; i = i + 1){
            Wheels[i].setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

        Wheels[0].setDirection(DcMotorSimple.Direction.FORWARD);
        Wheels[1].setDirection(DcMotorSimple.Direction.FORWARD);
        Wheels[2].setDirection(DcMotorSimple.Direction.FORWARD);
        Wheels[3].setDirection(DcMotorSimple.Direction.FORWARD);

    }
}