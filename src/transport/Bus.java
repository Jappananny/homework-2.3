package transport;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Bus extends Transport{
    private int busRouteNumber;
    public Bus(String brand, String model, String productionCountry, int productionYear, Key key,
               Insurance insurance, String gasType, int busRouteNumber) {
        super(brand, model, productionCountry, productionYear, key, insurance, gasType);
        this.busRouteNumber = busRouteNumber;
    }
    @Override
    public String toString() {
        return "Бренд: " + getBrand() + " Модель: " + getModel() + ". Год выпуска: " + getProductionYear() +
                ". Сборка: " + getProductionCountry() + ". Топливо: " + getGasType() + ". Номер автобуса: " +
                busRouteNumber+ ". \n" + getKey() + ". \n" + getInsurance() + " рублей.";
    }
    public static void printAllBus(Bus[] bus) {
        for (Bus bus1 : bus) {
            if (bus1 != null) {
                System.out.println(bus1.toString());
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
        Bus bus = (Bus) o;
        return busRouteNumber == bus.busRouteNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(busRouteNumber);
    }


}
