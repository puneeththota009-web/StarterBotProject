package org.firstinspires.ftc.teamcode.mine;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.MecanumDrive;

public class TeleOp extends LinearOpMode {
    Drivebase drivebase;
    DriveControl driveControl;
    MecanumDrive mecanumDrive;
    Intake intake;
    IntakeControl intakeControl;

    @Override
    public void runOpMode() {
        drivebase = new Drivebase(mecanumDrive, hardwareMap);
        driveControl = new DriveControl(drivebase, gamepad1);
        intake = new Intake(hardwareMap);
        intakeControl = new IntakeControl(intake, gamepad1);

        waitForStart();

        while(opModeIsActive()) {
            driveControl.update();
            intakeControl.update();
        }
    }
}
