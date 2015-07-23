import java.util.Vector;
public class RemoveFromVector {
  public static void main(String[] args) {
     // Creating a Vector of String Elements
     Vector<String> vector = new Vector<String>();
 
     //Adding elements to the Vector
     vector.add("Harry");
     vector.add("Steve");
     vector.add("Vince");
     vector.add("David");
     vector.add("Matt");

     System.out.println("Vector elements before remove(): ");
     for(int i=0; i < vector.size(); i++)
     {
        System.out.println(vector.get(i));
     }
 
     // Removing Harry
     vector.remove("Harry");
     // Removing Matt
     vector.remove("Matt");
 
     System.out.println("\nVector elements after remove(): ");
     for(int i=0; i < vector.size(); i++)
     {
        System.out.println(vector.get(i));
     }
  }
}