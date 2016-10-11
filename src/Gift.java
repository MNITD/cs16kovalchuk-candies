import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Dell on 11.10.2016.
 */
public class Gift {
    private ArrayList<Candy> candies;
    private int commonWeight;
    private int price;

    public Gift() {
        candies = new ArrayList<Candy>();
    }

    public void addCandy(Candy c) {
        candies.add(c);
        commonWeight += c.getWeight();;
         price += c.getPrice();;
    }

    public String getCandiesList() {
        return getMessage(candies);
    }
    public String getCandiesList(ArrayList<Candy>candies){
        return getMessage(candies);
    }
    public String getMessage(ArrayList<Candy>candies){
        String s = "";

        for (Candy c : candies) {

            s += "name: " + c.getName() + ", price: " + c.getPrice()
                    + ", weight:" + c.getWeight() + ", sugarLevel: " + c.getSugarLevel()
                    + System.getProperty("line.separator");
        }

        return s;
    }
    public int getWeight(){
        return commonWeight;
    }
    public int getPrice(){
        return price;
    }
    public void sortByPrice(){
        Collections.sort(candies, new Comparator<Candy>() {
            @Override
            public int compare(Candy candy1, Candy candy2) {
                return Integer.compare( candy1.getPrice(), (candy2.getPrice()));
            }
        });
    }
    public ArrayList getCandiesBySugarLevel(int a, int b) {
        ArrayList<Candy> candiesInRange = new ArrayList<Candy>();
        for (Candy c : candies) {
            if (c.getSugarLevel() >= a && c.getSugarLevel() <= b) {
                candiesInRange.add(c);
            }
        }
        return candiesInRange;
    }
}
