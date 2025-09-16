package ex1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quante parole vuoi inserire?");
        int n = scan.nextInt();
        scan.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        String parola = null;
        for (int i = 0; i < n; i++) {
            System.out.println("inserisci parola " + (i + 1) + ": ");
            parola = scan.nextLine();


            if (paroleDistinte.contains(parola)) {

                duplicati.add(parola);
            } else {
                paroleDistinte.add(parola);
            }
        }
        System.out.println("parole duplicate: " + duplicati);
        System.out.println("numero di parole distinte: " + paroleDistinte.size());
        System.out.println("lista parole distinte: " + paroleDistinte);
    }
}
