class MobilContructor {
    String merek;
    int kecepatan;
    
    MobilContructor(int inputKecepatan, String inputMerek){
        this.merek= inputMerek;
        this.kecepatan = inputKecepatan;
    }
    
    void printMerek(){
        System.out.println("merek mobil "+ merek);
    }

    public int getKecepatan() { 
        return this.kecepatan;
    }

    public int tambahKecepatan(int inputKecepatan){
        return kecepatan = kecepatan + inputKecepatan;
    }

    public int kurangiKecepatan(int inputKecepatan){
        return kecepatan = kecepatan + inputKecepatan;
    } 

}