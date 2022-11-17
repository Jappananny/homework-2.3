package AnimalProg;

import java.util.Objects;

public class Predator extends Mammals{
    String typeFood;

    public Predator(String name, int age, String habitat, int moveSpeed, boolean typeFood) {
        super(name, age, habitat, moveSpeed);
        this.typeFood = typeFood ? "Травоядное" : "Плотоядное";
    }
    public void whatDoing(){
        System.out.println("Охотиться");
    }
    @Override
    public void eat() {
        System.out.println("Питаеться мясом");
    }
    @Override
    public void walk() {
        System.out.println("Перемешаеться скрытно");
    }
    @Override
    public void sleep() {
        System.out.println("Спит днем");
    }

    @Override
    public String toString() {
        return "Млекопитающие: " + getName() +
                ". \nВозраст: " + getAge() +
                ". \nСреда обитания: " + getHabitat() +
                ". \nТип питания: " + typeFood +
                ". \nСкорость передвежения: " + getMoveSpeed() + " км/ч.";
    }
}
