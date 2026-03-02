package uno;

public class Jugador {
    private String nombre;
    private Mano mano;
    private boolean esHumano;
    private boolean dijoUno;  // NUEVO: indica si el jugador dijo UNO cuando le queda 1 carta
    
    public Jugador(String nombre, boolean esHumano) {
        this.nombre = nombre;
        this.mano = new Mano();
        this.esHumano = esHumano;
        this.dijoUno = false;  // Inicialmente no ha dicho UNO
    }
    
    public Carta tomarCarta(Mazo mazo) {
        Carta carta = mazo.tomarCarta();
        if (carta != null) {
            mano.agregarCarta(carta);
            if (esHumano) {
                System.out.println("  Tomaste: " + carta);
            }
        }
        return carta;
    }
    
    public Carta jugarCarta(int indice) {
        Carta carta = mano.quitarCarta(indice);
        // Al jugar una carta, restablecemos el estado de dijoUno
        this.dijoUno = false;
        return carta;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Mano getMano() {
        return mano;
    }
    
    public boolean isEsHumano() {
        return esHumano;
    }
    
    // NUEVOS MÉTODOS GET Y SET para dijoUno
    public boolean isDijoUno() {
        return dijoUno;
    }
    
    public void setDijoUno(boolean dijoUno) {
        this.dijoUno = dijoUno;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + mano.size() + " cartas)";
    }
}