class CobaStatic {

    static int panjang = 10;
    static int tinggi = 9;

    static void tulisan() {
        System.out.println("Ini method diakses langsung");
    }

    static int tambah(int inputA, int inputB) {
        return inputA + inputB;
    }
    static int tambah(){
        return panjang + tinggi;
    }
}