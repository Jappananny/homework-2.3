package AnimalProg;

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
    public String toString() {
        return "Млекопитающие: " + getName() +
                ". \nВозраст: " + getAge() +
                ". \nСреда обитания: " + getHabitat() +
                ". \nТип питания: " + typeFood +
                ". \nСкорость передвежения: " + getMoveSpeed() + " км/ч.";
    }

}
