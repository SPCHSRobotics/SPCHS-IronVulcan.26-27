package org.firstinspires.ftc.teamcode.Controls;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class InputControls {
    public InputControls(Telemetry telemetry){
        telemetry.addLine(
                "\nDrive using the LEFT STICK\n" +
                        "Rotate using the RIGHT STICK\n"
        );
    }
    //God forbid a man tries to use a hashmap
    public float[][] Driving = new float[2][2];
    /*
    0 0 | Lateral   | Pitch
    0 1 | Axial     | Roll
    1 0 | Yaw       | Yaw
     */
    public void Update(Gamepad gamepad1, Telemetry telemetry) {
        //Omnidrive inputs
        Driving[0][0] = gamepad1.left_stick_x;
        Driving[0][1] = -gamepad1.left_stick_y;
        Driving[1][0] = gamepad1.right_stick_x;
    }
}