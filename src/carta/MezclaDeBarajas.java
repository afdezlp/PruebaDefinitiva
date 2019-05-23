package carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MezclaDeBarajas {

    private List<Baraja> lista = new ArrayList<>(); // declara objeto List que almacenará los objetos Baraja

    // establece mazo de objetos Baraja y baraja
    public MezclaDeBarajas() {

        // llena el mazo con objetos Baraja
        for (Baraja.Palo palo : Baraja.Palo.values()) {
            for (Baraja.Cara cara : Baraja.Cara.values()) {
                lista.add(new Baraja(cara, palo));
            }
        }
        Collections.shuffle(lista); // baraja el mazo
    }

    // imprime el mazo
    public void imprimirCartas() {
        // muestra las 52 cartas en dos columnas
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%-22s%s", lista.get(i),
            ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

   

}
