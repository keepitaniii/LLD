package main.java.lld.designpattern.structural.adapter.client;

import main.java.lld.designpattern.structural.adapter.adaptee.WeighMachineForBabies;
import main.java.lld.designpattern.structural.adapter.adapter.WeighMachineAdapter;
import main.java.lld.designpattern.structural.adapter.adapter.WeighMachineAdapterImpl;

public class Main {
  public static void main(String[] args) {
    WeighMachineAdapter weighMachineAdapter = new WeighMachineAdapterImpl(new WeighMachineForBabies());
    System.out.println(weighMachineAdapter.getWeighInKg());
  }
}
