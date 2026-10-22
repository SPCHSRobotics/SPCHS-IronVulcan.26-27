package org.firstinspires.ftc.teamcode.Modules;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Shooter {
    private final DcMotor shootBall = hardwareMap.get(DcMotor.class, "ShootBall");

    public void PowerShooter() {
        //shooting ball when right trigger pressed
        float triggerValue = gamepad1.right_trigger;
        shootBall.setPower(triggerValue);
        boolean rightTriggerPressed2 = gamepad1.right_trigger_pressed;
        boolean rightTriggerPressed = rightTriggerPressed2;
        {
            //define
            DcMotor[] Shooter = new DcMotor[1];
            Shooter[3] = hardwareMap.get(DcMotor.class, "ShootBall");
        }
    }
}