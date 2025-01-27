package main.java.lld.designpattern.adapter.client;

import main.java.lld.designpattern.adapter.adaptee.WeighMachineForBabies;
import main.java.lld.designpattern.adapter.adapter.WeighMachineAdapter;
import main.java.lld.designpattern.adapter.adapter.WeighMachineAdapterImpl;

public class Main {
  public static void main(String[] args) {
    WeighMachineAdapter weighMachineAdapter = new WeighMachineAdapterImpl(new WeighMachineForBabies());
    System.out.println(weighMachineAdapter.getWeighInKg());
  }
}
