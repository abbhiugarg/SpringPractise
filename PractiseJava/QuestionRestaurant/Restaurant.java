package QuestionRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static List<Menu> items = new ArrayList<>();

        static void addItems(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id of item");
        int itemId = sc.nextInt();
        System.out.println("Enter item name");
        String itemName = sc.next();
        System.out.println("Enter price of item");
        float price = sc.nextFloat();
        System.out.println("Enter rating of item");
        float rating = sc.nextFloat();
        Menu item = new Menu(itemId,itemName,price,rating);
        items.add(item);
    }

    static int removeItem(int id){
        for (Menu item: items) {
            if (item.getItemId() == id){
                items.remove(item);
                System.out.println("Item is successfully removed");
                return id;
            }
        }
        System.out.println("Item whose id is " + id + " not in list");
        return -1;
    }

    static float calculateAvgRating(){
            float sum = 0;
            for (Menu item: items) {
                sum += item.getRating();
            }
            return sum/items.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        addItems();
//        addItems();
//        addItems();
//        addItems();
        Menu item1 = new Menu(1,"pizza",200.50f,3.7f);
        Menu item2 = new Menu(2,"juice",75.8f,6.7f);
        Menu item3 = new Menu(3,"coffee",500,9.8f);
        Menu item4 = new Menu(4,"tea",20.40f,6.8f);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        System.out.println(items);

//        System.out.println("Enter id of item which you want remove");
//        int itemId = sc.nextInt();
//        int result = removeItem(itemId);
//        System.out.println(result);
//        System.out.println(items);

        float avgResult = calculateAvgRating();
        System.out.println(avgResult);

    }
}
