/**
 * Created by Dell on 11.10.2016.
 */
public class Lollipop extends Candy {
    private String name = "Lollipop";
    private int sugarLevel = 10;
    private int tastyLevel = 4;
    private int price = 2;
    private int weight = 45;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getSugarLevel() {
        return sugarLevel;
    }
    @Override
    public int getTastyLevel() {
        return tastyLevel;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

}
