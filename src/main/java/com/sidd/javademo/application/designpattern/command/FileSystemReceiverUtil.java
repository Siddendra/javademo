package com.sidd.javademo.application.designpattern.command;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
      String osName = System.getProperty("os.name");
      System.out.print("Underlying OS is : "+osName);
      if(osName.contains("Windows")) {
          return new WindowsFileSystemReceiver();
      } else {
          return new UnixFileSystemReceiver();
      }
    }
}
