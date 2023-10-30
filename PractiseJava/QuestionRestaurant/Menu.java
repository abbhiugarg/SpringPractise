package QuestionRestaurant;

public class Menu {
    private int itemId;
    private String itemName;
    private float price;
    private float rating;

    public Menu(int itemId, String itemName, float price, float rating) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.rating = rating;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
