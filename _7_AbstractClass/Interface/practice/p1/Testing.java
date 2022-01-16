package _Module2_java._3_Array.exercise._7_AbstractClass.Interface.practice.p1;

public class Testing {

    public static void main(String[] args) {

            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                if (animal instanceof Chicken){
                    System.out.println(animal.makeSound());
                    Chicken chicken = (Chicken) animal;
                    chicken.howToEat();
                    System.out.println(chicken.howToEat());
                }
                if (animal instanceof Tiger){
                    System.out.println(animal.makeSound());
                }
            }
        }

}
