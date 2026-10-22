package org.firstinspires.ftc.teamcode.Modules;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

public class Intake {
    private boolean IntakeOn = false;

    public void PowerIntake(DcMotor Intake, Gamepad gamepad) {
        if (gamepad.aWasPressed()){
            IntakeOn = !IntakeOn; //Change the intake from [true to false] or from [false to true]
        }

        if (IntakeOn)   {Intake.setPower(1.0);} //This is just a cleaner way to write a two-result
        else            {Intake.setPower(0.0);} //if-else statement in my opinion.
    }
}