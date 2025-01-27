package main.java.lld.designpattern.chainresponsibilty;

public class DebugLogProcessor extends LogProcessor {
  public DebugLogProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(LogLevel level, String msg) {
    if (level == LogLevel.DEBUG) {
      System.out.println("DEUG: " + msg);
    } else {
      super.log(level, msg);
    }
  }
}
