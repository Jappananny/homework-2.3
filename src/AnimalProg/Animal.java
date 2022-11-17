package AnimalProg;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class Animal {
    private String name;
    private final int age;
    protected String habitat;

    public Animal(String name, int age, String habitat) {
        if (name.length() <= 0 || name == null){
            this.name = "Животное";
        } else {
            this.name = name;
        }
        if (age <= 0){
            this.age = 0;
        } else {
            this.age = age;
        }
        if (habitat.length() <= 0 || habitat == null){
            this.habitat = "Дикая природа";
        } else {
            this.habitat = habitat;
        }
    }
    public abstract void eat();
    public abstract void walk();
    public abstract void sleep();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return name.equals(animal.name);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return super.toString();
    }

}

