/**
 * Created by Dell on 11.10.2016.
 */
public class Program {
    public static void main(String[] args) {
        Candy candy1 = new Lollipop();
        Candy candy2 = new KitKat();
        Candy candy3 = new IceCream();

        Gift gift = new Gift();
        gift.addCandy(candy1);
        gift.addCandy(candy2);
        gift.addCandy(candy3);

        System.out.println("Gift structure:");
        System.out.println(gift.getCandiesList());
        System.out.println("Weight: "+gift.getWeight()+System.getProperty("line.separator"));
        gift.sortByPrice();
        System.out.println("Get candies sorted by price:");
        System.out.println(gift.getCandiesList());
        System.out.println("Candies in sugar level rate:");
        System.out.println(gift.getCandiesList(gift.getCandiesBySugarLevel(2, 6)));
        
    }
}
