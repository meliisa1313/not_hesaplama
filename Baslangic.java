package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int Matematik,Fizik,Kimya,Türkce,Tarih,Muzik;
        Scanner dersler=new Scanner(System.in);
        System.out.println("mat notu nedir");
        Matematik=dersler.nextInt();

        System.out.println("fizik notu nedir");
        Fizik=dersler.nextInt();

        System.out.println("kimya notu nedir");
        Kimya=dersler.nextInt();

        System.out.println("turkce notu nedir");
        Türkce=dersler.nextInt();

        System.out.println("tarih notu nedir");
        Tarih= dersler.nextInt();

        System.out.println("muzik notu nedir");
        Muzik=dersler.nextInt();

        int toplam=(Matematik+Fizik+Kimya+Türkce+Tarih+Muzik)/6;
        System.out.println(toplam);

        System.out.println(toplam>60 ? "sinif gecti":"sinifta kaldi");


    }
}
