package com.sidd.javademo.application.designpattern.command;

public class OpenFileCommand implements Command{

    private FileSystemReceiver filesystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.filesystem = fs;
    }
    @Override
    public void execute() {
    // Open command is forwarding request to open file method.
        this.filesystem.openFile();
    }
}
