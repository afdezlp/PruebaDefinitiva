package carta;

public class Baraja {

    public static enum Cara {
        As, Dos, Tres, Cuatro, Cinco, Seis,
        Siete, Ocho, Nueve, Diez, Joker, Reina, Rey
    };

    public static enum Palo {
        Bastos, Diamantes, Corazones, Espadas
    };
    
    private final Cara cara;
    private final Palo palo;
    
// constructor

    public Baraja(Cara cara, Palo palo) {
        this.cara = cara;
        this.palo = palo;
    }

    // devuelve la cara de la carta
    public Cara obtenerCara() {
        return cara;
    }

    // devuelve el palo de la Baraja
    public Palo obtenerPalo() {
        return palo;
    }
    
    
    // devuelve la representación String de la Baraja
    @Override
    public String toString() {
        return String.format("%s de %s", cara, palo);
    }

}
