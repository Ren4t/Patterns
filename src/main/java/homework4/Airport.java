package homework4;

public class Airport {

    public String examinationOnMaxWeight(Bag bag) {
        if (bag.getWeight() > 100) {
            return "forbidden";
        }
        return "allowed";
    }
}
