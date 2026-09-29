package org.firstinspires.ftc.teamcode;

//Importing the libraries needed to run "Main.java"
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


import org.firstinspires.ftc.teamcode.HardwareMapping.RobotHardware; //Import Hardware
import org.firstinspires.ftc.teamcode.Controls.InputControls; //Import Hardware


@TeleOp(name="Main", group="Linear OpMode")
public class Main extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Initialized");

        //Load out input bindings
        InputControls InputControlObject = new InputControls(telemetry);

        //Telemetry business
        telemetry.update();
        waitForStart();
        runtime.reset();

        //Initialize Hardware as an object
        RobotHardware RobotHardwareObject = new RobotHardware(hardwareMap);

        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // Call our functions here
            InputControlObject.Update(gamepad1, telemetry);
        }

    }
}
