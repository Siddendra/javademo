package com.sidd.javademo.application.designpattern.command;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Open File in Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Write File in Unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Close File in Unix OS");
    }
}
