package homework4;

public class Car {
    private int weight;

    public Car(){
        this(1000);
    }

    public Car (int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}
