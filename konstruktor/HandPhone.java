public class HandPhone {
    int x;  // Create a class attribute
  
    // Create a class constructor for the MyClass class
    public HandPhone(int x) {
      this.x = x;
    }
  
    public static void main(String[] args) {
      HandPhone myObj = new HandPhone(12); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
  }