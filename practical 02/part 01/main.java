public class Main 
{
    public static void main(String[] args) {
        // Create an Item object
        Item item = new Item(1, "This is an item.");
        System.out.println("Item Location: " + item.getLocation());
        System.out.println("Item Description: " + item.getDescription());

        // Create a Monster object
        Monster monster = new Monster(2, "Scary monster.");
        System.out.println("Monster Location: " + monster.getLocation());
        System.out.println("Monster Description: " + monster.getDescription());
    }
}


//Output  

//Item Location: 1
//Item Description: This is an item.
//Monster Location: 2
//Monster Description: Scary monster
