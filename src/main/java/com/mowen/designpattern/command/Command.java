package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 */
public abstract class Command {

    abstract void execute();
    abstract void undo();
}
