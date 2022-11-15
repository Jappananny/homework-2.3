package transport;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Train extends Transport{
    private double tripPrice; //Цена поездки
    private int speed;//Скорость поезда
    private String departureStation;//Станция отбытия
    private String endStation;//Конечная станция
    private int numberWagons;//Количество вагонов

    public Train(String brand, String model, String productionCountry, int productionYear, Key key,
                 Insurance insurance, String gasType, double tripPrice, int speed, String departureStation,
                 String endStation, int numberWagons) {
        super(brand, model, productionCountry, productionYear, key, insurance, gasType);
        this.tripPrice = tripPrice;
        this.speed = speed;
        this.departureStation = departureStation;
        this.endStation = endStation;
        this.numberWagons = numberWagons;
    }
    @Override
    public String toString() {
        return "Поезд: " +getBrand() + ". Модель: " + getModel() + ". Год выпуска: " + getProductionYear() +
                ". Страна выпуска: " + getProductionCountry() + ". Скорость: " + speed + " км/ч. Количество вагонов: "
                + numberWagons + ". \nТопливо: " + getGasType() + ". Отходит от станции: " + departureStation+ ". Следует до станции: " + endStation +
                ". Стоимость билета: " + tripPrice + " рублей. \n" + getKey() + ". \n" + getInsurance() + " рублей.";
    }

    @Override
    public void refill() {
        if (getGasType() == this.getGasType()) {
            //this.setGasType("Дизель");
            System.out.println("Топливо для заправки: " + this.getBrand() + " " + this.getModel() + " - " + this.getGasType() + ".");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Double.compare(train.tripPrice, tripPrice) == 0 && speed == train.speed && numberWagons == train.numberWagons && departureStation.equals(train.departureStation) && endStation.equals(train.endStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripPrice, speed, departureStation, endStation, numberWagons);
    }

    public static void printAllTrain(Train[] train) {
        for (Train train1 : train) {
            if (train1 != null) {
                System.out.println(train1.toString());
            }
        }
    }

}
