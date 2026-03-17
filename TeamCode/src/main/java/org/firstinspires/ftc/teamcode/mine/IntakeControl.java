package org.firstinspires.ftc.teamcode.mine;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class IntakeControl{
    Intake intake;
    Gamepad gamepad1;



    public IntakeControl(Intake intake, Gamepad gamepad1){
        this.intake = intake;
        this.gamepad1 = gamepad1;

    }

    public void update(){
        if(gamepad1.right_trigger > 0.1){
            intake.setPower(1);
        }
        if(gamepad1.left_trigger > 0.1){
            intake.setPower(-1);
        }
    }

}
