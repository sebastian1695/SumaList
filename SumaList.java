import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SumaList {
    public static void main (String[] args){
        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(3);
        numeros.add(7);
        boolean numero1= numeros.add(1);
        boolean numero2= numeros.add(3);
        boolean numero3= numeros.add(7);


        for (Iterator<Integer> numero = numeros.iterator(); numero.hasNext();){
            Integer v =numero.next();
            System.out.println(v);

    }
        if (numero1 == numeros.add(1) && numero3 ==numeros.add(7)){
            System.out.println(true);
            System.out.println("Sí");
        } else {
            System.out.println("no");
        }

    }
}
