package org.learning.java.abstraction.animals;

public class Main {

  public static void main(String[] args) {

    Cow luise = new Cow("Luise");
    Dog tom = new Dog("Tom");
    Fish nemo = new Fish("Nemo");
    Butterfly gina = new Butterfly("Gina");
    Duck taddeus = new Duck("Taddeus");

    Animal[] animals = {luise, tom, nemo, gina, taddeus};

    for (Animal animal : animals) {
      System.out.println(animal.getName());
      animal.eat("something");
      animal.sleep();
      animal.makeNoise();
      if (animal instanceof CanSwim) {
        ((CanSwim) animal).swim();
      }
    }

    CanSwim[] swimmingAnimals = {nemo, taddeus};
    for (CanSwim swimmer : swimmingAnimals) {
      swimmer.swim();
    }

    CanFly[] flyingObjects = {new Butterfly("Pina"), new Balloon(), new Duck("Piero")};
    for (CanFly flyer : flyingObjects) {
      flyer.fly();
      if (flyer instanceof Balloon) {
        ((Balloon) flyer).pop();
      }
      if (flyer instanceof Animal) {
        ((Animal) flyer).makeNoise();
      }
    }
  }
}
