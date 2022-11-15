package AnimalProg;

import java.util.Objects;

public class Herbivorous extends Mammals{
    String typeFood;

    public Herbivorous(String name, int age, String habitat, int moveSpeed, boolean typeFood) {
        super(name, age, habitat, moveSpeed);
        this.typeFood = typeFood ? "Травоядное" : "Плотоядное";
    }
    public void whatDoing(){
        System.out.println("Пасеться");
    }
    @Override
    public void eat() {
        System.out.println("Питаеться растительностью");
    }
    @Override
    public void walk() {
        System.out.println("Передвигаеться днем");
    }
    @Override
    public void sleep() {
        System.out.println("Спит ночью");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return typeFood.equals(that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
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
