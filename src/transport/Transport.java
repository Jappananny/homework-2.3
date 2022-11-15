package transport;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

import static java.lang.Character.isDigit;
@Getter
@Setter
public abstract class Transport {
    private final String brand;
    private final String model;
    private final String productionCountry;
    private final int productionYear;
    private Car.Key key;
    private Car.Insurance insurance;
    private String gasType;

    public Transport(String brand, String model, String productionCountry, int productionYear,
                     Key key, Insurance insurance, String gasType) {
        if (brand.length() <= 0 || brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.length() <= 0 || model == null){
            this.model = "Что за покомон ?";
        } else {
            this.model = model;
        }
        if (productionYear <= 0){
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry.length() <= 0 || productionCountry == null){
            this.productionCountry = "Ваканда";
        } else {
            this.productionCountry = productionCountry;
        }
        this.key = key;
        this.insurance = insurance;
        this.gasType = gasType;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static class Key {
    private String remoteStart;
    private String keylessAccess;

    public Key(boolean remoteStart, boolean keylessAccess) {
        this.remoteStart = remoteStart ? "Удаленным запуском двигателя" : "Обычным запуском двигателя";
        this.keylessAccess = keylessAccess ? "Доступом к транспорту без ключа" : "Доступом к транспорту с ключем";
    }
    @Override
    public String toString() {
        return "Транспорт с : " + remoteStart + " и " + keylessAccess;
    }
    }
    public static class Insurance {
    private int validity;
    private double costInsurance;
    private String numberInsurance;

    public Insurance(int validity, double costInsurance, String numberInsurance) {

        if (validity < java.time.LocalDate.now().getYear()) {
            this.validity = (Math.max(validity, 2000));
        } else {
            this.validity = validity;
        }
        if (costInsurance < 0) {
            this.costInsurance = 0;
        } else {
            this.costInsurance = costInsurance;
        }
        boolean correctNumberInsurance = false;
        if (numberInsurance.length() == 9 && numberInsurance != null) {
            for (int i = 0; i < numberInsurance.length(); i++) {
                switch (i) {
                    case 0:
                        correctNumberInsurance = !isDigit(numberInsurance.toCharArray()[i]);
                    case 1:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        correctNumberInsurance = isDigit(numberInsurance.toCharArray()[i]);
                        break;
                }
                if (!correctNumberInsurance) {
                    break;
                }
            }
        }
        this.numberInsurance = correctNumberInsurance ? numberInsurance : "Некоректный номер страховки";
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Insurance insurance = (Insurance) o;
            return validity == insurance.validity && Double.compare(insurance.costInsurance, costInsurance) == 0 && Objects.equals(numberInsurance, insurance.numberInsurance);
        }

        @Override
        public int hashCode() {
            return Objects.hash(validity, costInsurance, numberInsurance);
        }

        @Override
    public String toString() {
        return "Номер страховки : " + numberInsurance + ". Срок действия страховки до : " + validity +
                ". Стоимость страховки : " + costInsurance;
    }
    }
    public abstract void refill();
}