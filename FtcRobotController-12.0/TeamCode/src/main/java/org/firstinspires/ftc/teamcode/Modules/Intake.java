package org.firstinspires.ftc.teamcode.Modules;

//Hi Atlas. Here I import the hardware map so that you can access that intake variable in
//this file.
import org.firstinspires.ftc.teamcode.HardwareMapping.RobotHardware;

import com.qualcomm.robotcore.hardware.Gamepad;

public class Intake {

    public void PowerIntake(RobotHardware robot, Gamepad gamepad) {
        if (gamepad.a) {
            robot.Intake.setPower(1.0);
        } else {
            robot.Intake.setPower(0.0);
        }
    }
}
//lets go i did it lets go meeow
