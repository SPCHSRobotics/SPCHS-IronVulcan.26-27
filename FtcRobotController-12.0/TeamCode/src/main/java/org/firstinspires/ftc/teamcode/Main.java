package org.firstinspires.ftc.teamcode;

//Importing the libraries needed to run "Main.java"
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


import org.firstinspires.ftc.teamcode.HardwareMapping.RobotHardware;    //Import Hardware
import org.firstinspires.ftc.teamcode.Controls.InputControls;           //Import Controls
import org.firstinspires.ftc.teamcode.Modules.Mechanum_Drive;           //Import Driving module
import org.firstinspires.ftc.teamcode.Modules.Intake;                   //Import intake module
import org.firstinspires.ftc.teamcode.Modules.Shooter;                  //Import shooter module


@TeleOp(name="Main", group="Linear OpMode")
public class Main extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("Status", "Initialized");

        //Initialize Hardware as an object
        RobotHardware RobotHardwareObject = new RobotHardware(hardwareMap);
        //Load out input bindings
        InputControls InputControlObject = new InputControls(telemetry);
        //Load modules
        Mechanum_Drive DrivingObject = new Mechanum_Drive();
        Intake IntakeObject = new Intake();
        Shooter ShooterObject = new Shooter();

        //Telemetry business
        telemetry.update();
        waitForStart();
        runtime.reset();

        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // Call our functions here
            InputControlObject.Update(
                    gamepad1,
                    telemetry
            );

            DrivingObject.POV_Driving(
                    InputControlObject.driving,
                    RobotHardwareObject.wheels,
                    telemetry
            );
            IntakeObject.Update_Intake(
                    RobotHardwareObject.intake,
                    InputControlObject.intakeState
            );
            ShooterObject.Update_Shooter(
                    RobotHardwareObject.shooter,
                    InputControlObject.shooterOn
            );
        }

    }
}
