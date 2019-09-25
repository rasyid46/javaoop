public class MainClass {
    public static void main(String args[]) {
        Mobil honda = new Mobil();
        
        honda.setKecepatan(20); // set value by method
        System.out.println("obj honda "+ honda.getKecepatan());
        
        MobilContructor tayo = new MobilContructor(40, "Tayo");
        tayo.printMerek();
        System.out.println("obj tayo "+ tayo.getKecepatan());
        

    }
}