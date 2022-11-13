package transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends Transport{
    private int busRouteNumber;
    public Bus(String brand, String model, String productionCountry, int productionYear, Key key,
               Insurance insurance, int busRouteNumber) {
        super(brand, model, productionCountry, productionYear, key, insurance);
        this.busRouteNumber = busRouteNumber;
    }
    @Override
    public String toString() {
        return "Бренд: " + getBrand() + " Модель: " + getModel() + ". Год выпуска: " + getProductionYear() +
                ". Сборка: " + getProductionCountry() + ". Номер автобуса: " + busRouteNumber+ ". \n" + getKey() +
                ". \n" + getInsurance() + " рублей.";
    }
    public static void printAllBus(Bus[] bus) {
        for (Bus bus1 : bus) {
            if (bus1 != null) {
                System.out.println(bus1.toString());
            }
        }
    }
}
