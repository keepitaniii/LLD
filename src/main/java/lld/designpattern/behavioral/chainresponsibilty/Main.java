package main.java.lld.designpattern.behavioral.chainresponsibilty;

public class Main {

  public static void main(String[] args) {
    LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    logger.log(LogLevel.ERROR, "error occured");
    logger.log(LogLevel.DEBUG, "debug it");
    logger.log(LogLevel.INFO, "Successful");

  }
}
