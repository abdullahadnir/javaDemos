public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Abdullah";
        String ogrenci2 = "Nazar";
        String ogrenci3 = "Sezgin";
        String ogrenci4 = "Berk";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Abdullah";
        ogrenciler[1] = "Nazar";
        ogrenciler[2] = "Sezgin";
        // ogrenciler[3] = "Berk";       hata verir

        for(int i = 0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }


        System.out.println("-----------------------------");


        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}