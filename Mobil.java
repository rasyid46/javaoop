class Mobil {
    String merek;
    int kecepatan;
    
    //ini method settger
    public void setKecepatan(int kecepatan) {   
        this.kecepatan = kecepatan;
    }

    // ini method gether
    public int getKecepatan() { //function parameter
        return this.kecepatan;
    }

    public int tambahKecepatan(int kecepatan){
        int hitungkecepatan = this.kecepatan + kecepatan;
        return this.kecepatan = hitungkecepatan;
    }

    public int kurangiKecepatan(int kecepatan){
        int kurangikecepatan = this.kecepatan - kecepatan;
        return this.kecepatan = kurangikecepatan;
    } 


}