package org.firstinspires.ftc.teamcode.mine;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

public class DriveControl extends OpMode {

    public Drivebase drivebase;
    public Gamepad gamepad;

    public DriveControl(Drivebase drivebase, Gamepad gamepad){
        this.drivebase = drivebase;
        this.gamepad = gamepad;
    }
    @Override
    public void init(){
    }
    public void loop(){

    }
    public void update(){
        double forward = -gamepad.left_stick_y;
        double strafe = gamepad.left_stick_x;
        double turn = gamepad.right_stick_x;
        drivebase.drive(forward, turn, strafe);
    }
}
