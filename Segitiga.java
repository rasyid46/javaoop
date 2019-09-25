import java.util.Scanner;

class Segitiga {
    float alas,tinggi,panjang;
    float luas,keliling;

    Segitiga(float al , float ti  ){
        this.alas = al;
        this.tinggi = ti; 
    }
    float luas(){
        return luas =  (alas * tinggi)/2;
    }    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Segitiga s  = new Segitiga(2,3);
        int alas,tinggi,lebar;
        System.out.println("Luas dengan parameter "+s.luas());
        // System.out.println("Keliling dengan parameter"+s.keliling());
    }
}