import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvOrani;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı yazınız. ");
        tutar = input.nextDouble();
        kdvOrani = (tutar <= 1000)? 0.18 : 0.08;
        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar += kdvTutari;
    }
}