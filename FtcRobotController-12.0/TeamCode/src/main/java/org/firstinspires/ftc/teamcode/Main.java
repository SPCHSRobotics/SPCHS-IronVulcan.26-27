package org.firstinspires.ftc.teamcode;

//Importing the libraries needed to run "Main.java"
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="Main", group="Linear OpMode")
public class Main extends LinearOpMode {

    @Override
    public void runOpMode() {
        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Initialized");

        telemetry.update();
        waitForStart();

        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // Call our functions here

        }

    }
}
