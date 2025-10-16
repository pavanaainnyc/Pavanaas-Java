import java.util.ArrayList;
import java.util.Iterator;

public class StudentMarks {
    public static void main(String[] args) {
        
        ArrayList<Integer> marksList = new ArrayList<>();


        marksList.add(85);
        marksList.add(90);
        marksList.add(78);
        marksList.add(92);

        System.out.println("Student Marks:");
        for (int mark : marksList) {
            System.out.println(mark);
        }

     
        marksList.set(2, 80); // Change the third student's mark to 80
        System.out.println("\nUpdated Student Marks:");
        for (int mark : marksList) {
            System.out.println(mark);
        }


        marksList.remove(1); // Remove the second student's mark
        System.out.println("\nAfter Removal:");
        for (int mark : marksList) {
            System.out.println(mark);
        }

  
        System.out.println("\nTraversing with Iterator:");
        Iterator<Integer> iterator = marksList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}