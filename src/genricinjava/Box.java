package genricinjava;

//Define a generic class with a type parameter T
public class Box<T> {
 // Variable of type T
 private T item;

 // Method to set the item
 public void setItem(T item) {
     this.item = item;
 }

 // Method to get the item
 public T getItem() {
     return item;
 }
 
 // Example of a generic method
 public <U> void printDetails(U detail) {
     System.out.println("Detail: " + detail);
 }

 public static void main(String[] args) {
     // Create a Box object for Integer type
     Box<Integer> integerBox = new Box<>();
     integerBox.setItem(123);
     System.out.println("Integer Box contains: " + integerBox.getItem());

     // Create a Box object for String type
     Box<String> stringBox = new Box<>();
     stringBox.setItem("Hello, Generics!");
     System.out.println("String Box contains: " + stringBox.getItem());

     // Using the generic method
     integerBox.printDetails("This is an integer box.");
     stringBox.printDetails(456);
 }
}
