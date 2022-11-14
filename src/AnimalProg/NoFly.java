package AnimalProg;
public class NoFly extends Bird {
    String typeMovement;

    public NoFly(String name, int age, String habitat, boolean typeMovement) {
        super(name, age, habitat);
        this.typeMovement = typeMovement ? "Летает" : "Ходит";
    }
    public void noFly(){
        System.out.println("Ходит");
    }
    @Override
    public void eat() {
        System.out.println("Ест!");
    }
    @Override
    public void walk() {
        System.out.println("Ходит!");
    }
    @Override
    public void sleep() {
        System.out.println("Спит!");
    }
    @Override
    public String toString() {
        return "Птица: " + getName() +
                ". \nВозраст: " + getAge() +
                ". \nСреда обитания: " + getHabitat() +
                ". \nЖивотное: " + typeMovement + ".";
    }



}
