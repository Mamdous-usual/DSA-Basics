import java.util.*;
public class OperationsOnArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); 

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // Add at index
        list.add(1,40);
        System.out.println(list);

        // Get
        System.out.println(list.get(2));

        // Set
        list.set(2,50);
        System.out.println(list.get(2));
        
        // Remove 
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        // Size
        System.out.println(list.size());



    }
}
