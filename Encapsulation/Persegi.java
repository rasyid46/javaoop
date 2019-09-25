import java.util.Scanner;

class Persegi {
    int sisi,luas;

    public Persegi(int inputSisi){
        this.sisi = inputSisi;
    }
      

    public void printSisi() {   
        System.out.println("Sisi sebagai public "+ sisi); 
    }
    
    protected void printSisiPro() {   
        System.out.println("Sisi dengan protected "+ sisi); 
    }

    private void printSisiPrivate() {   
        System.out.println("Sisi dengan private "+ sisi); 
    }

    void printLuas(){
        luas = sisi * sisi;
        System.out.println("luas "+ luas);
    }

    public static void main(String args[]) {
        
    }
}