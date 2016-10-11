/**
 * Created by Dell on 11.10.2016.
 */
public class Candy {
    private int sugarLevel;
    private int tastyLevel;
    private int weight;
    private int price;


    public String getName(){
        return "unknown";
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTastyLevel() {
        return tastyLevel;
    }

    public void setTastyLevel(int tastyLevel) {
        this.tastyLevel = tastyLevel;
    }
}
