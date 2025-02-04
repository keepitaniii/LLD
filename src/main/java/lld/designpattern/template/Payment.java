package main.java.lld.designpattern.template;

public abstract class Payment {
  public abstract void validateUser();
  public abstract void debitMoney();
  public abstract void calculateFee();
  public abstract void creditMoney();

  // Made final so no child class can override it.
  // Every child class (i.e. payment class) will follow this steps for payment,
  // as they will have only this method from {@link Payment#sendMoney()} class exposed.
  public final void sendMoney() {
    validateUser();  // step-1

    debitMoney();  // step-2

    calculateFee(); // step-3

    creditMoney(); // step-4
  }
}
