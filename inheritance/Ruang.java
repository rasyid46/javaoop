public class  Ruang  {
   int sisi,luas;

   Ruang(int inputRuang){
    this.sisi = inputRuang;
   }

   int hitungLuas(){ // method function yang menggembaikan nilai
      return luas = sisi * sisi; //pakai return supaya haris balikan nilai bisa di proses pada fungsi mainnya
   }

   void cetakLuas(){ //method prosedural
      System.out.println("Luas = "+ luas);  // tidak mengembalikan nilai karena langsung di cetak hasilnya
   }


}