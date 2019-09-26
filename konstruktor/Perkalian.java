public class Perkalian {
  int x,hasilperkalian;  // Create a class attribute
   
    // Create a class constructor for the MyClass class
    public Perkalian(int inputX) {
      this.x = inputX;
    }
    int hitungPerkalian(){ // method yang mengebalikan nilai sehingga dapat di proses
      return  hasilperkalian =  x * x;
    }


     protected void cetakNilai(){
      System.out.println("Nilai perkalian = "+ hasilperkalian);
    }
  
    public static void main(String[] args) {
      Perkalian myObj = new Perkalian(12); // Create an object of class MyClass (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
      myObj.hitungPerkalian();
      myObj.cetakNilai();
    }
  }