import java.util.ArrayList;

// Generic Box class
public class Box<T> {
    private ArrayList<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    // Method to add an item to the box
    public void add(T item) {
        items.add(item);
    }

    // Method to print all items in the box
    public void printItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Create a Box for integers (autoboxing of int to Integer)
        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        integerBox.printItems();

        // Create a Box for strings
        Box<String> stringBox = new Box<>();
        stringBox.add("Apple");
        stringBox.add("Banana");
        stringBox.printItems();
    }
}
