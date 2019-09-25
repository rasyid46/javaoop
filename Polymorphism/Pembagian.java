class Pembagian {
  
    int hitungBagi (int a , int b){
        return a/b;
    }

    double hitungBagi(double a , double b){
        return a/b;
    }

    public static void main(String args[]) {
       Pembagian pem  = new Pembagian();
       int bagiPositif = pem.hitungBagi(6, 2);
       double bagiDouble =  pem.hitungBagi(11,3);
       System.out.println("Hasil bilangan int "+bagiPositif);
       System.out.println("Hasil bilangan decimal "+ bagiDouble+"");
    }
}