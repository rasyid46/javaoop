import java.util.Scanner;
public class MainEnc {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Segitiga s  = new Segitiga();
        s.setAlas(1);
        System.out.println(s.getAlas());
        

        Persegi pe = new Persegi(9);
        pe.printSisi();
        pe.printLuas();
        pe.printSisiPro();
//        pe.printSisiPrivate();  karena tidak bisa diakses diluar kelas

    }
}