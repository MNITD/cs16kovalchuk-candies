/**
 * Created by Dell on 11.10.2016.
 */
public class KitKat extends Candy {
    private String name = "KitKat";
    private int sugarLevel = 3;
    private int tastyLevel = 15;
    private int price = 12;
    private int weight = 100;
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
