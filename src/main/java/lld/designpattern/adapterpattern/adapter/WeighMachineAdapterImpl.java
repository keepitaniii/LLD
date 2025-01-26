package main.java.lld.designpattern.adapterpattern.adapter;

import main.java.lld.designpattern.adapterpattern.adaptee.WeighMachine;

public class WeighMachineAdapterImpl implements WeighMachineAdapter {

  WeighMachine weighMachine;

  public WeighMachineAdapterImpl(WeighMachine weighMachine) {
    this.weighMachine = weighMachine;
  }

  @Override
  public double getWeighInKg() {
    double weightInPound = weighMachine.getWeighInPound();

    //Convert it to KGs
    double weightInKg = weightInPound * .45;
    return weightInKg;

  }
}
