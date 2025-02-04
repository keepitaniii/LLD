package main.java.lld.designpattern.behavioral.memento;

public class Client {
  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator(10, 20);

    // save.
    Memento snapshot1 = originator.createMemento();
    // add it to history.
    careTaker.addMemento(snapshot1);

    // originator changing to new state.
    originator.setHeight(12);
    originator.setWidth(15);

    // save it.
    Memento snapshot2 = originator.createMemento();
    // add it to history.
    careTaker.addMemento(snapshot2);

    // originator to new state.
    originator.setHeight(-1); // wrong state, have to restore.

    // UNDO
    Memento restoreMementoState = careTaker.undo();
    // restore
    originator.restoreMemento(restoreMementoState);

    System.out.println("Current state: Height " + originator.getHeight() + ", Width " + originator.getWidth());
  }
}
