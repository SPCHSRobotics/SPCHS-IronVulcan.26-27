package org.firstinspires.ftc.teamcode.Controls;

import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class InputControls {
    public InputControls(Telemetry telemetry){ //Run when initialized:
        telemetry.addLine(
                "\nDrive using the [LEFT STICK]\n" +
                        "Rotate using the [RIGHT STICK]\n" +
                        "Toggle intake with [RIGHT BUMPER]\n" +
                        "Change intake direction with [LEFT BUMPER]\n" +
                        "Toogle shooter with [RIGHT TRIGGER]"
        );
    }
    //Variables used throughout this page
    public int intakeState = 0;
    private boolean intakeDirection = false;

    public boolean shooterOn = false;
    private boolean previouslyHeld = false;

    public float[][] driving = new float[2][2];
    /*
    0 0 | Lateral   | Pitch
    0 1 | Axial     | Roll
    1 0 | Yaw       | Yaw
     */

    public void Update(Gamepad gamepad1, Telemetry telemetry) {
        //Omnidrive inputs
        driving[0][0] = gamepad1.left_stick_x;
        driving[0][1] = -gamepad1.left_stick_y;
        driving[1][0] = gamepad1.right_stick_x;

        //Other logic
        if (gamepad1.right_trigger_pressed){
            if (intakeState == 0){
                intakeState = (intakeDirection) ? 1 : 0;
            } else {
                intakeState = 0;
            }
        }
        if (gamepad1.left_trigger_pressed){
            intakeDirection = !intakeDirection;
        }

        boolean triggerHeld = gamepad1.right_trigger >= 0.5;
        if (triggerHeld){
            if (previouslyHeld){
                //Do nothing
            } else {
                shooterOn = !shooterOn;
            }
        }
    }
}