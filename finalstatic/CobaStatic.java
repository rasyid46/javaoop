public class CobaStatic {

    static int panjang = 10;
    static int tinggi = 9;

    public static void tulisan() {
        System.out.println("Ini method diakses langsung");
    }

    public static int tambah(int a, int b) {
        return a + b;
    }
}