package AnimalProg;
import lombok.Getter;

@Getter
public class Amphibians extends Animal{
    public Amphibians(String name, int age, String habitat) {
        super(name, age, habitat);
    }
    public void hunt(){
        System.out.println("Охотиться");
    }
    @Override
    public void eat() {
        System.out.println("Ест!");
    }
    @Override
    public void walk() {
        System.out.println("Плавает!");
    }
    @Override
    public void sleep() {
        System.out.println("Спит!");
    }

    @Override
    public String toString() {
        return "Земноводное: " + getName() +
                ". \nВозраст: " + getAge() +
                ". \nСреда обитания: " + getHabitat() + ".";
    }



}
