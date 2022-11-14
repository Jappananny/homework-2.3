
import AnimalProg.*;

public class Main {
    public static void main(String[] args) {
        /*Transport.Key keyLada = new Car.Key(false,false);
        Car.Insurance insuranceLada = new Transport.Insurance(1995, 5500,"АЯ8990780");
        Car[] car = new Car[5];
        car[0] = new Car("Lada", "", 2015, "", "желтый", 1.7,
                false,"Седан","М655AS32",3,   false,keyLada,insuranceLada,"Электрокар");
        Transport.Key keyTrain = new Train.Key(false,false);
        Train.Insurance insuranceTrain = new Transport.Insurance(2035, 1235500,"АE8097011");
        Train[] train = new Train[5];
        train[0] = new Train("Ласточка","B-901","Россия",2011,
                keyTrain,insuranceTrain, "Ялерное топлево",3500, 301, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        train[1] = new Train("Ленинград","D-125","Россия",2019,
                keyTrain,insuranceTrain, "Дизель",1700, 270, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        Transport.Key keyBus = new Bus.Key(false,false);
        Bus.Insurance insuranceBus = new Transport.Insurance(2024, 22500,"АЯ0045291");
        Bus[] bus = new Bus[5];
        bus[0] = new Bus("ЛИАЗ","12-Б", "Россия", 2016,keyBus,insuranceBus,
                "Бензин",89);
        */
        Animal[] animals = new Animal[15];
        animals[0] = new Amphibians("Лягушка",2,"Болото");
        animals[1] = new Fly("Чайка",5,"Пребрежная черта",true);
        animals[2] = new NoFly("Пингвин",8,"Антарктика",false);
        animals[3] = new Predator("Тигр",6,"Джунгли",35,false);
        animals[4] = new Herbivorous("Лошадь",3,"Степь",48,true);
        animals[5] = new Mammals("Медведь",4,"Лес",40);
        animals[6] = new Bird("Альбатрос",3,"Вблизи океана");
        //Вывод результата
        //System.out.println("================================================================");
        //System.out.println(car[0].toString());
        //transport.Car.printAllCar(car);
        //System.out.println("================================================================");
        //transport.Train.printAllTrain(train);
        //System.out.println("================================================================");
        //transport.Bus.printAllBus(bus);
        //System.out.println("================================================================");
        //train[0].refill();
        System.out.println("================================================================");
        System.out.println(animals[0].toString());
        System.out.println("================================================================");
        System.out.println(animals[1].toString());
        System.out.println("================================================================");
        System.out.println(animals[2].toString());
        System.out.println("================================================================");
        System.out.println(animals[3].toString());
        System.out.println("================================================================");
        System.out.println(animals[4].toString());
        System.out.println("================================================================");
        System.out.println(animals[5].toString());
        System.out.println("================================================================");
        System.out.println(animals[6].toString());
        System.out.println("================================================================");
        animals[1].equals(animals[2]);

    }


}