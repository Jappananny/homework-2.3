package transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Train extends Transport{
    private double tripPrice; //Цена поездки
    private int speed;//Скорость поезда
    private String departureStation;//Станция отбытия
    private String endStation;//Конечная станция
    private int numberWagons;//Количество вагонов

    public Train(String brand, String model, String productionCountry, int productionYear, Key key,
                 Insurance insurance, double tripPrice, int speed, String departureStation,
                 String endStation, int numberWagons) {
        super(brand, model, productionCountry, productionYear, key, insurance);
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
                + numberWagons + ". \nОтходит от станции: " + departureStation+ ". Следует до станции: " + endStation +
                ". Стоимость билета: " + tripPrice + " рублей. \n" + getKey() + ". \n" + getInsurance() + " рублей.";
    }
    public static void printAllTrain(Train[] train) {
        for (Train train1 : train) {
            if (train1 != null) {
                System.out.println(train1.toString());
            }
        }
    }

}
