package org.firstinspires.ftc.teamcode.Modules;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

public class Intake {

    public void Update_Intake(DcMotor Intake, int intakeState) {
        Intake.setPower(intakeState);
    }
}