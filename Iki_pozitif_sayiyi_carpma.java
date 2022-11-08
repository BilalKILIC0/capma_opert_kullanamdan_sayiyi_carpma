
package iki_pozitif_sayiyi_carpma;
import java.util.Scanner;
/*
Adım 1: Başla 
Adım 2: Kullanıcan a ve b iki tane değer al
Adım 3: int sonuc= 0 ve int artır=0 değişkenlerini tanımla 
Adım 4: artır< sayi2 doğru ise artırı 1 artır ve sonuca sayi1 i ekle
Adım 5: sonucu ekrana yazdır
Adım 6: Bitir.
*/
public class Iki_pozitif_sayiyi_carpma {

    //Klavyeden girilen iki pozifit sayıyı çarpma operatörü kullanmadan çarpan program .
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen Birinci Sayıyı Giriniz :");
        int sayi1 = input.nextInt();
        
        System.out.println("Lütfen İkinci Sayıyı Giriniz :");
        int sayi2 = input.nextInt();
        
        int sonuc =0;
        int sayac =0;
        
        while (sayac < sayi2) { //int artır = 1;  while (artır <= girilen) şeklinde de olabilir.
            sayac =sayac+1;
            sonuc = sonuc+sayi1;
        }
        
        System.out.println("Girdiğiniz Sayıların Çarpımı : "+sonuc);
        
        
    }
    
}
