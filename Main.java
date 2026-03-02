/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uno;
import java.util.Scanner;
/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("============================================================");
        System.out.println("                UNO - VERSION NUMEROS (0-9)");
        System.out.println("============================================================");
        System.out.println("\nREGLAS:");
        System.out.println("• Se juega con cartas numéricas del 0 al 9");
        System.out.println("• Puedes jugar cartas del mismo color o mismo número");
        System.out.println("• El primero en quedarse sin cartas gana");
        System.out.println("• Si no tienes carta, tomas UNA del mazo");
        System.out.println("• Si la carta robada es válida, SE JUEGA AUTOMÁTICAMENTE");
        System.out.println("• NUEVA REGLA: Si tienes UNA carta y NO dices UNO, te pueden sorprender");
        System.out.println("  y robarás 2 cartas como penalización.");
        System.out.println("-".repeat(60));
        
        System.out.print("\n¿Como te llamas? ");
        String nombre = scanner.nextLine().trim();
        if (nombre.isEmpty()) {
            nombre = "Jugador";
        }

        System.out.println("\n¡Hola " + nombre + "! Preparando el juego...");
        
        JuegoUno juego = new JuegoUno(nombre, scanner);
        
        scanner.close();
    }
} 