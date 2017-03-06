import java.util.Hashtable;
import java.util.Set;

public class Main {
    public static void main (String args[]) throws Exception{
        Hashtable<Integer, Item> hash = new Hashtable<Integer, Item> (); //Creates a hash table called "hash" that stores an integer as key and "Item" object as value

        hash.put(1, new Item("Orange", 5, 1.25, "01-24-17", "02-31-18"));  //Add new items to our hashtable
        hash.put(2, new Item("Apple", 10, 2.25, "05-21-17", "05-12-18"));
        hash.put(3, new Item("Banana", 23, 0.99, "02-01-17", "02-01-18"));

        Set<Integer> keys = hash.keySet(); //Get a set view of the keys contained in the table

        System.out.println("Inventory ID | Item Description | Quantity | Price | Date Purchased | Time Stamp"); //Prints out the headers of each field

        // Iterate through the items in the hashtable and retrieve the variables in the object Item, and print them out corresponding to its headers
        for (Integer key : keys){
            Item item = hash.get(key);
            System.out.println(key + " | " + item.getItem_Description() + " | " + item.getQuantity() + " | " + item.getPrice() + " | " + item.getDate_purchased() + " | " + item.getTime_stamp());
        }
    }
}
