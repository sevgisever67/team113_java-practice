package week02;

import java.util.Scanner;

public class P06_EytSoruları {
    //Kullanıcıdan EYT li olup  olmayacağını tespit eden ve emekli olup olmayacağını yazdırı
    //olamıyorsa kac prim günü eksik eksik yazdırın.

           //Kurallar:

    //1999 9. ay yılı öncesi
    //Kadınlar :5000 prim günü 20 yıl hizmet süresi
    //Erkekler: 5500 pirim günü , 25 yıl hizmet süresi,

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("sigorta girişinizi giriniz");
        double sigortaGiriş=scan.nextDouble();

        if (sigortaGiriş>1999.9){
            System.out.println("eyt kanununa tabi değilsiniz");
        }else {
            System.out.println("lütfen cinsiyetinizi girin");
            char cinsiyet=scan.next().toLowerCase().charAt(0);
            System.out.println("pirim gününüzü girin");
            int prim=scan.nextInt();
            System.out.println("hizmet yılınızı giriniz");
            int yıl=scan.nextInt();
        if (cinsiyet=='k'){
            if (prim>=5000&&yıl>=20){
                System.out.println("Tebrikler EYT kanunu yürürlüğe girdiği zaman emekli olabilirsiniz");
            }else if (prim<5000&&yıl>20){
                System.out.println("EYT kanunu ile emekli olmanız için : "
                        + (5000-prim) + " gün daha çalışmanız gerekiyor");
            } else if (prim>=5000&&yıl<20){
                System.out.println("EYT kanunu ile emekli olmanız için : "
                        + (20-yıl) + " yıl daha çalışmanız gerekiyor");
            }else {
                System.out.println("EYT kanunu ile emekli olmanız için : "
                        + (5000-prim) + " gün daha ve"+ (20-yıl)+ " yıl daah çalışmanız gerekiyor");
            }
        } else if (cinsiyet=='e'){
            if (prim>=5500&&yıl>=25){
                System.out.println("Tebrikler EYT kanunu yürürlüğe girdiği zaman emekli olabilirsiniz");
            }else if (prim<5500&&yıl>25){
                System.out.println("EYT kanunu ile emekli olmanız için : "
                        + (5500-prim) + " gün daha çalışmanız gerekiyor");
            } else if (yıl<25&&prim>=5500){
                System.out.println("EYT kanunu ile emekli olmanız için : "
                        + (25-yıl) + " yıl daha çalışmanız gerekiyor");
            }else {
                System.out.println("EYT kanunu ile emekli olmanız için : "
                        + (5500-prim) + " gün daha ve"+ (25-yıl)+ " yıl daha çalışmanız gerekiyor");
            }
        }else {
            System.out.println("yanlış cinsiyet girişi");
        }

        }
    }
}
