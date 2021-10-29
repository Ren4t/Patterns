package homework4;

public class App {
    public static void main(String[] args) {
        String str;
        Car car1 = new Car(1500);
        Car car2 = new Car(50);

        Bag bag1 = new Bag(40);
        Bag bag2 = new Bag(120);

        Airport airport = new Airport();

        airport.examinationOnMaxWeight(bag1);
        airport.examinationOnMaxWeight(bag2);

        airport.examinationOnMaxWeight(new Adapter(car1));
        airport.examinationOnMaxWeight(new Adapter(car2));
    }
}
