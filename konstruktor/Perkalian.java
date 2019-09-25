public class Perkalian {
    int x,hasilperkalian;  // Create a class attribute
   
    // Create a class constructor for the MyClass class
    public Perkalian(int x) {
      this.x = x;
    }
    int hitungPerkalian(){
      System.out.println("Nilai perkali");
      return  hasilperkalian =  x * x;
    }


    void cetakNilai(){
      System.out.println("Nilai perkalian "+ hasilperkalian);
    }
  
    public static void main(String[] args) {
      HandPhone myObj = new HandPhone(12); // Create an object of class MyClass (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
      myObj.hitungPerkalian();
      myObj.cetakNilai();
    }
  }