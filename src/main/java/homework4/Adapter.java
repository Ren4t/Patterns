package homework4;

public class Adapter extends Bag{
    public Car car;

    public Adapter(Car car) {
        this.car = car;
    }

    @Override
    public int getWeight() {
        return car.getWeight();
    }
}
