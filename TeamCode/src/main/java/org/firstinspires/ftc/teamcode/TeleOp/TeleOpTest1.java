package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class TeleOpTest1 extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Status:", "Doing fine :)");

    }

    @Override
    public void loop() {
        telemetry.addData("Run Status:", "Im running, I think...");
    }
}
