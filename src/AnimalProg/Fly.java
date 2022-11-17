package AnimalProg;


public class Fly  extends Bird{
    String typeMovement;

    public Fly(String name, int age, String habitat, boolean typeMovement) {
        super(name, age, habitat);
        this.typeMovement = typeMovement ? "Летает" : "Ходит";
    }
    public void fly(){
        System.out.println("Летает");
    }
    @Override
    public void eat() {
        System.out.println("Ест!");
    }
    @Override
    public void walk() {
        System.out.println("Летает!");
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
