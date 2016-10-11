/**
 * Created by Dell on 11.10.2016.
 */
public class IceCream extends Candy {
    private String name = "IceCream";
    private int sugarLevel = 5;
    private int tastyLevel = 7;
    private int price = 5;
    private int weight = 200;

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
