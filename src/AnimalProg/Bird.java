package AnimalProg;
public class Bird extends Animal {
    public Bird(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public void hunt() {
        System.out.println("Охотиться");
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
        return "Птица: " + getName() +
                ". \nВозраст: " + getAge() +
                ". \nСреда обитания: " + getHabitat() + ".";
    }
}
