package main.java.lld.designpattern.behavioral.chainresponsibilty;

public class ErrorLogProcessor extends LogProcessor {

  public ErrorLogProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(LogLevel level, String msg) {
    if (level == LogLevel.ERROR) {
      System.out.println("ERROR: " + msg);
    } else {
      super.log(level, msg);
    }
  }
}
