package ss7_abstract_iterface.practice.practice1.controller1;
import ss7_abstract_iterface.practice.practice1.model1.animal.Animal;
import ss7_abstract_iterface.practice.practice1.model1.animal.Chicken;
import ss7_abstract_iterface.practice.practice1.model1.animal.Tiger;
import ss7_abstract_iterface.practice.practice1.model1.edible.Edible;

public class MainAbstract {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
