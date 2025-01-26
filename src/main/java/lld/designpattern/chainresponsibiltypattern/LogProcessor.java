package main.java.lld.designpattern.chainresponsibiltypattern;

public abstract class LogProcessor {
  LogProcessor nextLogProcessor;

  public LogProcessor(LogProcessor nextLogProcessor) {
    this.nextLogProcessor = nextLogProcessor;
  }

  public void log(LogLevel logLevel, String msg) {
    if (this.nextLogProcessor != null) {
      this.nextLogProcessor.log(logLevel, msg);
    }
  }

}
