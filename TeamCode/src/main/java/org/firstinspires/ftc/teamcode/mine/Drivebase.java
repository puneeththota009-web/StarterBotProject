package org.firstinspires.ftc.teamcode.mine;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.MecanumDrive;

public class Drivebase{
    public final MecanumDrive drive;
    public DcMotorEx leftFront, rightFront, rightBack, leftBack;

    public Drivebase(MecanumDrive drive, HardwareMap hwMap) {
        this.drive = drive;
        leftFront = hwMap.get(DcMotorEx.class, "leftFront");
        rightFront = hwMap.get(DcMotorEx.class, "rightFront");
        rightBack = hwMap.get(DcMotorEx.class, "rightBack");
        leftBack = hwMap.get(DcMotorEx.class, "leftBack");
        rightFront.setDirection(DcMotorEx.Direction.REVERSE);
        rightBack.setDirection(DcMotorEx.Direction.REVERSE);
    }

    
    public void drive(double forward, double turn, double strafe) {

        double frontLeftPower  = forward + strafe + turn;
        double frontRightPower = forward - strafe - turn;
        double backLeftPower   = forward - strafe + turn;
        double backRightPower  = forward + strafe - turn;

        leftFront.setPower(frontLeftPower);
        rightFront.setPower(frontRightPower);
        leftBack.setPower(backLeftPower);
        rightBack.setPower(backRightPower);

    }
}
