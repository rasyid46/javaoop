public class LatihanLoop {

   
    public static void main(String args[]) {
        for (int i = 1; i <=5; i++) {
                for (int j = 5; j >= i; j--) {
                    
                    System.out.printl(j);
                }
        }
        LatihanLoop lt = new LatihanLoop();
        Tes.hello();
    }
}

public class Tes {

    public  static void hello(){
        System.out.printl("hello");
    }
}
