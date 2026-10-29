package org.firstinspires.ftc.teamcode.Modules;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

public class Intake {
    private boolean IntakeOn = false;

    public void Power_Intake(DcMotor Intake, Gamepad gamepad) {
        if (gamepad.aWasPressed()){
            IntakeOn = !IntakeOn; //Change the intake from [true to false] or from [false to true]
        }

        //This comment serves no logical purpose
        //But it may help with git understanding
        if (IntakeOn) {
            Intake.setPower(1.0);
        }
        else if (!IntakeOn){
            Intake.setPower(0.0);
        } else {
            //Creates an error and halts script execution unless this error is addressed.
            throw new IllegalArgumentException("Intake neither on or off");
        }
    }
}