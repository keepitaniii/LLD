package main.java.lld.designpattern.adapterpattern.client;

import main.java.lld.designpattern.adapterpattern.adaptee.WeighMachineForBabies;
import main.java.lld.designpattern.adapterpattern.adapter.WeighMachineAdapter;
import main.java.lld.designpattern.adapterpattern.adapter.WeighMachineAdapterImpl;

public class Main {
  public static void main(String[] args) {
    WeighMachineAdapter weighMachineAdapter = new WeighMachineAdapterImpl(new WeighMachineForBabies());
    System.out.println(weighMachineAdapter.getWeighInKg());
  }
}
