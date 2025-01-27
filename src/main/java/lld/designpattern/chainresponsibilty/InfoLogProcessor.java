package main.java.lld.designpattern.chainresponsibilty;

public class InfoLogProcessor extends LogProcessor {
  public InfoLogProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(LogLevel logLevel, String msg) {
    if (logLevel == LogLevel.INFO) {
      System.out.println("INFO: " + msg);
    } else {
      super.log(logLevel, msg);
    }
  }
}
