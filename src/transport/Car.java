package transport;
import lombok.Getter;

import java.util.Objects;

import static java.lang.Character.isDigit;
@Getter
public class Car extends Transport{
    private String color;;
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String typeTyre;
    private String regNumber;
    private final int seats;



    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double engineVolume, boolean transmission, String bodyType, String regNumber, int seats,
               boolean typeTyre, Key key, Insurance insurance, String gasType){
        super(brand, model, productionCountry, productionYear, key, insurance, gasType);
        boolean regNumberCorrect = false;
        if (color.length() <= 0 || color == null){
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (seats <= 0){
            this.seats = 2;
        } else {
            this.seats = seats;
        }
        if(regNumber.length() == 9 && regNumber != null) {
            for (int i = 0; i < regNumber.length(); i++){
                switch (i) {
                    case 0 : regNumberCorrect = !isDigit(regNumber.toCharArray()[i]);
                        break;
                    case 1 :
                    case 2 :
                    case 3 : regNumberCorrect = isDigit(regNumber.toCharArray()[i]);
                        break;
                    case 4 :
                    case 5 : regNumberCorrect = !isDigit(regNumber.toCharArray()[i]);
                        break;
                    case 6 :
                    case 7 :
                    case 8 : regNumberCorrect = isDigit(regNumber.toCharArray()[i]);
                        break;
                }
                if(!regNumberCorrect){
                    break;
                }
            }
        }
        this.regNumber = regNumberCorrect ? regNumber : "Некоректный номер";
        this.transmission = transmission ? "МКП" : "АКП";
        if (bodyType.length() <= 0 || bodyType == null){
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        this.typeTyre = typeTyre ? "летняя" : "зимняя";


    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }
    public Car setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        return this;
    }
    public Car setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }
    public Car setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }

    public Car setTypeTyre(String typeTyre) {
        this.typeTyre = typeTyre;
        return this;
    }
    @Override
    public String toString() {
        return "Бренд: " + getBrand() + " Модель: " + getModel() + ". Год выпуска: " + getProductionYear() +
                ". Сборка: " + getProductionCountry() + ". Цвет " + color + ". Объем двигателя - "
                + engineVolume + " литра. " + "\nТопливо: " + getGasType() + ". Тип коробки передач: " + transmission + ". Тип кузова: "
                + bodyType + ". Регистрационный номер автомобиля: " + regNumber + ".\nКоличество мест: "
                + seats + ". На автомобиле установленна " + typeTyre + " резина. " + getKey() + ". \n"
                + getInsurance() + " рублей.";
    }
    public static void printAllCar(Car[] car) {
        for (Car car1 : car) {
            if (car1 != null) {
                System.out.println(car1.toString());
            }
        }
    }
    @Override
    public void refill() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && seats == car.seats && color.equals(car.color) && transmission.equals(car.transmission) && bodyType.equals(car.bodyType) && typeTyre.equals(car.typeTyre) && regNumber.equals(car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engineVolume, transmission, bodyType, typeTyre, regNumber, seats);
    }




}

