public class User {
    int x;  // Create a class attribute
  
    // Create a class constructor for the MyClass class
    public User() {
      x = 5;  // Set the initial value for the class attribute x
    }
  
    public static void main(String[] args) {
        User myObj = new User(); // Create an object of class MyClass (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
    }
  }