package org.firstinspires.ftc.teamcode;

//Importing the libraries needed to run "Main.java"
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


import org.firstinspires.ftc.teamcode.HardwareMapping.RobotHardware; //Import Hardware
import org.firstinspires.ftc.teamcode.Controls.InputControls; //Import Controls
import org.firstinspires.ftc.teamcode.Modules.Mechanum_Drive; //Import Driving module
import org.firstinspires.ftc.teamcode.Modules.Intake; //Import intake module


@TeleOp(name="Main", group="Linear OpMode")
public class Main extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    // Wait for the game to start (driver presses INIT)
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");

        InputControls InputControlObject = new InputControls(telemetry); //Load out input bindings
        RobotHardware RobotHardwareObject = new RobotHardware(hardwareMap); //Initialize Hardware as an object
        //Load modules:
        Mechanum_Drive DrivingObject = new Mechanum_Drive();
        Intake IntakeObject = new Intake();

        telemetry.update(); //Print all above generated telemetry to screen

        waitForStart(); //Driver presses PLAY
        runtime.reset();


        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            InputControlObject.Update(gamepad1, telemetry);
            DrivingObject.POV_Driving(InputControlObject.Driving, RobotHardwareObject.Wheels, telemetry);
            IntakeObject.PowerIntake(RobotHardwareObject.Intake, gamepad1);

            telemetry.update();
        }
    }
}
