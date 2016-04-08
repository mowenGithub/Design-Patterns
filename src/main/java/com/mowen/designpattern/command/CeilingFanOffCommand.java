package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 * 这里其实可以把其他几个吊扇命令抽出一个父类
 */
public class CeilingFanOffCommand extends Command {
    private CeilingFan ceilingFan;
    private int preSpeed;
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
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
