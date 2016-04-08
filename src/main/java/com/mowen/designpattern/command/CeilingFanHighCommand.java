package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 */
public class CeilingFanHighCommand extends Command {

    private CeilingFan ceilingFan;
    private int preSpeed;
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    void undo() {
        if(preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if(preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if(preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if(preSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
