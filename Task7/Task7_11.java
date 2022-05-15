package Task7;

import java.util.*;

public class Task7_11 {
      public static void main(String args[]){
          Map<Integer, String> items = new HashMap<>();
          Scanner sc = new Scanner(System.in);

          items.put(34528, "Denial");
          items.put(25525, "Stacy");
          items.put(92805, "Alex");

          System.out.println("Sort by key: ");
          List<Integer> l1 = new ArrayList<>(items.keySet());
          Collections.sort(l1);

          for(int i =0; i<3; i++)
              System.out.println(l1.get(i) + " " +items.get(l1.get(i)));

          System.out.println("\nSort by value: ");
          List<String> l2 = new ArrayList<>(items.values());
          Collections.sort(l2);

          for(int i =0; i<3; i++){
              System.out.print(l2.get(i) + " ");
              for(Object o:items.keySet()) {
                  if (items.get(o).equals(l2.get(i))) {
                      System.out.println(o);
                  }
              }
          }
      }
}