import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double tutar,kdvOrani=0.18, kdvOrani2=0.8, kdvliTutar, kdvTutar;

        System.out.println("\t\t\t\tKDV HESAPLAMA");
    Scanner hesap = new Scanner(System.in);
    System.out.print("Tutarınızı giriniz : ");
    tutar = hesap.nextDouble();
    if (tutar<=1000){
        kdvTutar = tutar * kdvOrani;
        System.out.println("KDV Oranı : " + kdvOrani);
    }else{
        kdvTutar = tutar * kdvOrani2;
        System.out.println("KDV Oranı : " + kdvOrani2);
    }

    kdvTutar = tutar * kdvOrani;
    kdvTutar = tutar * kdvOrani2;
    kdvliTutar = tutar + kdvTutar;

    System.out.println("KDV'siz Tutar : " + tutar);
    System.out.println("KDV Tutarı : " + kdvTutar);
    System.out.println("KDV'li tutar : " + kdvliTutar);
        System.out.println("\t\t\tTUTARINIZ HESAPLANDI...");


    }
}
