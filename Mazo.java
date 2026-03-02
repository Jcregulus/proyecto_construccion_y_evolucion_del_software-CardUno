package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;
    
    public Mazo() {
        cartas = new ArrayList<>();
        inicializar();
        barajar();
    }
    
    private void inicializar() {
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo"};
        
        for (String color : colores) {
            // Un 0 por color
            cartas.add(new Carta(color, 0));
            
            // Dos cartas de cada número del 1 al 9
            for (int numero = 1; numero <= 9; numero++) {
                cartas.add(new Carta(color, numero));
                cartas.add(new Carta(color, numero));
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
    }
    
    public Carta tomarCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }
    
    public boolean hayCartas() {
        return !cartas.isEmpty();
    }
    
    public int size() {
        return cartas.size();
    }
    
    public boolean reconstruir(List<Carta> descarte) {
        if (descarte.size() <= 1) {
            return false;
        }
        
        Carta ultima = descarte.remove(descarte.size() - 1);
        cartas.addAll(descarte);
        descarte.clear();
        descarte.add(ultima);
        barajar();
        
        System.out.println("  Reconstruyendo mazo desde descarte...");
        return true;
    }
    
    @Override
    public String toString() {
        return "Mazo con " + cartas.size() + " cartas";
    }
}