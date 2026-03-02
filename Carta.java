package uno;

public class Carta {
    private String color;
    private int numero;
    private boolean visible;
    
    public Carta(String color, int numero) {
        this.color = color;
        this.numero = numero;
        this.visible = true;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public boolean isVisible() {
        return visible;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public boolean esValida(String colorMesa, int numeroMesa) {
        return this.color.equals(colorMesa) || this.numero == numeroMesa;
    }
    
    @Override
    public String toString() {
        return color + " " + numero;
    }
}