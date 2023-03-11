package week4;

import java.util.Scanner;

public class P02_forloop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Başlangıç ve bitiş değeri olmak üzere iki sayı giriniz");
        int başlangıç= scan.nextInt();
        int bitişDeğeri= scan.nextInt();
        int sayilarToplamı=0;
        if ( başlangıç>=bitişDeğeri){
            System.out.println("yanlış Giriş");
        }else {
            for (int i = başlangıç; i <bitişDeğeri ; i++) {
                sayilarToplamı+=i;


            }
        }
        System.out.println(sayilarToplamı);

        System.err.println("====================");

    }
}
