package AnimalProg;
import lombok.Getter;

@Getter
public class Mammals extends Animal{
    private int moveSpeed;//Скорость передвижения

    public Mammals(String name, int age, String habitat, int moveSpeed) {
        super(name, age, habitat);
        if (moveSpeed <=0){
            this.moveSpeed = 1;
        } else {
            this.moveSpeed = moveSpeed;
        }
    }
    public void whatDoing(){
        System.out.println("Гуляет!");
    }
    @Override
    public void eat() {
        System.out.println("Ест!");
    }
    @Override
    public void walk() {
        System.out.println("Двигаеться!");
    }
    @Override
    public void sleep() {
        System.out.println("Спит!");
    }
    @Override
    public String toString() {
        return "Млекопитающие: " + getName() +
                ". \nВозраст: " + getAge() +
                ". \nСреда обитания: " + getHabitat() +
                ". \nСкорость передвежения: " + moveSpeed + " км/ч.";
    }
}
