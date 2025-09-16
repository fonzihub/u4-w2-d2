import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quanti elementi creare?");

        int e = scan.nextInt();

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < e; i++) {
            int randomNumber = (int) (Math.random() * 101);
            lista.add(randomNumber);

        }
         List<Integer> listaOrdinata = new ArrayList<>(lista);
        Collections.sort(listaOrdinata);

        List<Integer> listaFinale = new ArrayList<>();
        listaFinale.addAll(listaOrdinata);

        for(int i = 0; i < e ; i++){
            int randomNumber = (int)(Math.random()*101);
            listaFinale.add(randomNumber);
        }
        System.out.println("lista iniziale " + listaOrdinata);
        System.out.println("lista finale: " + listaFinale);





    }






}
