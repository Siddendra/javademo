package com.sidd.javademo.application.designpattern.command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
