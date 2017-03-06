
public class Item
{
    String item_description; // Stores the name for the item description
    int quantity; // Stores the quantity of the item
    double price; // Stores the price of the item
    String date_purchased; // Stores the date purchased for the item
    String time_stamp; //Stores the time stamp for the item


    // Constructor method
    public Item(String item_description, int quantity, double price, String date_purchased, String time_stamp){
        super();
        this.item_description = item_description;
        this.quantity = quantity;
        this.price = price;
        this.date_purchased = date_purchased;
        this.time_stamp = time_stamp;
    }

    //get and set methods to access and modify the variables
    public String getItem_Description(){
        return item_description;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public String getDate_purchased(){
        return date_purchased;
    }
    public String getTime_stamp(){
        return time_stamp;
    }

    public void setItem_description(String item_description){
        this.item_description = item_description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setDate_purchased(String date_purchased){
        this.date_purchased = date_purchased;
    }
    public void setTime_stamp(String time_stamp){
        this.time_stamp = time_stamp;
    }


}
