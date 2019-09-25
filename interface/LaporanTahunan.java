public class LaporanTahunan implements CetakLaporan{
    public void cetakA4(){
        System.out.println("Cetak Laporan di A4");
    }
    public void cetakA3(){
        System.out.println("Cetak Laporan di A3");
    }
    public void cetakA5(){
        System.out.println("Cetak Laporan di A5");
    }
    public static void main(String[] args) {
        LaporanTahunan lt = new LaporanTahunan();
        lt.cetakA3();
        lt.cetakA4();
        lt.cetakA5();
    }
}