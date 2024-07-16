package main.java.lld.ratelimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindow implements RateLimiter {
  Queue<Integer> slidingWindow;
  int bucketCap;
  int time;

  public SlidingWindow(int time, int cap) {
    this.time = time;
    this.bucketCap = cap;
    slidingWindow = new ConcurrentLinkedQueue<>();
  }

  @Override
  public boolean grantAccess() {
    long currentTimeMs = System.currentTimeMillis();
    updateQueue(currentTimeMs);
    if (slidingWindow.size() < bucketCap) {
      slidingWindow.offer((int) currentTimeMs);
      return true;
    }
    return false;
  }

  private void updateQueue(long currentTime) {
    if (slidingWindow.isEmpty()) return;
    long expiredTime = (currentTime - slidingWindow.peek())/1000;
    while (expiredTime >= this.time) {
      slidingWindow.poll();
      if (slidingWindow.isEmpty()) break;
      expiredTime = (currentTime - slidingWindow.peek())/1000;
    }
  }
}
