package com.sidd.javademo.application.designpattern.command;

public class FileSystemClient {

    public static void main(String args[]) {

        //Creating the receiver Object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating Invoker and associating with command
        FileInvoker file = new FileInvoker(openFileCommand);

        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);

        file = new FileInvoker(writeFileCommand);

        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);

        file = new FileInvoker(closeFileCommand);

        file.execute();


    }
}
