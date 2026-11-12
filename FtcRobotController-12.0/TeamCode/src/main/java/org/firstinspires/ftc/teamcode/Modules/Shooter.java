package org.firstinspires.ftc.teamcode.Modules;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Shooter {
    private final double shooterMaxSpeed = 1; //Must be between [0,1]
    public void Update_Shooter(DcMotor Shooter, boolean on) {
        if (on){
            Shooter.setPower(shooterMaxSpeed);
        } else {
            Shooter.setPower(0.5*shooterMaxSpeed);
        }
    }
}