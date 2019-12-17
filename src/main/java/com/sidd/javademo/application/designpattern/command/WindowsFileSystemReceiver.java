package com.sidd.javademo.application.designpattern.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Open File in Unix Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Write File in Unix Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Close File in Unix Windows");
    }
}
