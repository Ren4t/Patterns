package homework4;

public class Bag {
    private int weight;

    public Bag(){
        this(1);
    }

    public Bag(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}
