public class Main {
    public static void main(String[] args) {
        //For
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //While
        int i = 2;
        while (i<3)
            i+=2;

        System.out.println(i+"i yi yazdım");

        System.out.println("While Döngüsü Bitti");

        //Do While  (Şart uymasa bile döngü 1 kere çalıştırılır)
        int j=100;
        do {
            System.out.println("Loglandı");
            System.out.println(j);
            j += 2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");


    }
}