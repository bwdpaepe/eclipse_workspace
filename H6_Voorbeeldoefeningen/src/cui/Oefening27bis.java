package cui;

import domein.Rekening;
import domein.RekeningOperaties;
import java.util.Scanner;

public class Oefening27bis {
	public static void main(String[] args) {
        Rekening[] rekeningen = new Rekening[3];
        rekeningen[0] = new Rekening(123123456712L, "Sam");
        rekeningen[1] = new Rekening(123456789012L, "Arno");
        rekeningen[2] = new Rekening(101010101010L, "Stef");

        // toon informatie van de rekeningen
        Oefening27bis app = new Oefening27bis();                                            //
        Scanner input = new Scanner(System.in);

        boolean storten = true;
        do {
            stortOpRekeningen(rekeningen);                                      //
            System.out.print("Wil je nog storten op een rekening (ja=1): ");
            storten = input.nextInt() == 1;
        } while (storten);

        System.out.println("Beginsituatie");
        toonRekeningen(rekeningen);                                             //
        rekeningen[0].haalAf(299);
        rekeningen[1].stortOp(50);
        rekeningen[2].schrijfBedragOverNaar(20, rekeningen[0]);
        System.out.println("Eindsituatie");
        toonRekeningen(rekeningen);                                             //
    }

    private static void stortOpRekeningen(Rekening[] rekeningen) {

        Scanner input = new Scanner(System.in);
        int index = 0;
        do {
            System.out.printf("Geef nummer van de rekening [1 - %d]: ", rekeningen.length);
            index = input.nextInt();
        } while (index < 1 || index > rekeningen.length);

        System.out.print("Geef het bedrag: ");
        double bedrag = input.nextDouble();
        index--;

        RekeningOperaties.stortOpEenRekening(index, bedrag, rekeningen);
    }

    private static void toonRekeningen(Rekening[] rekeningen) {
        for (Rekening rek : rekeningen) {
            toon1Rekening(rek);
        }
    }

    private static void toon1Rekening(Rekening r) {
        System.out.print(r);
    }
}
