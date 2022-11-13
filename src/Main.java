import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transport;

public class Main {
    public static void main(String[] args) {
        Transport.Key keyLada = new Car.Key(false,false);
        Car.Insurance insuranceLada = new Transport.Insurance(1995, 5500,"АЯ8990780");
        Car[] car = new Car[5];
        car[0] = new Car("Lada", "", 2015, "", "желтый", 1.7,
                false,"Седан","М655AS32",3,   false,keyLada,insuranceLada);
        Transport.Key keyTrain = new Train.Key(false,false);
        Train.Insurance insuranceTrain = new Transport.Insurance(2035, 1235500,"АE8097011");
        Train[] train = new Train[5];
        train[0] = new Train("Ласточка","B-901","Россия",2011,
                keyTrain,insuranceTrain, 3500, 301, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        train[1] = new Train("Ленинград","D-125","Россия",2019,
                keyTrain,insuranceTrain, 1700, 270, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        Transport.Key keyBus = new Bus.Key(false,false);
        Bus.Insurance insuranceBus = new Transport.Insurance(2024, 22500,"АЯ0045291");
        Bus[] bus = new Bus[5];
        bus[0] = new Bus("ЛИАЗ","12-Б", "Россия", 2016,keyBus,insuranceBus,
                89);
        //Вывод результата
        System.out.println("================================================================");
        //System.out.println(car[0].toString());
        transport.Car.printAllCar(car);
        System.out.println("================================================================");
        transport.Train.printAllTrain(train);
        System.out.println("================================================================");
        transport.Bus.printAllBus(bus);
    }
}