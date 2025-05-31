package uap.mains;

import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Donat dengan lubang
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("DIRA AYUDIA");
        System.out.println("245150707111013");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan Radius: ");
        double radiusLuar = scanner.nextDouble(); // Input radius luar
        System.out.print("Isikan Radius: ");
        double radiusDalam = scanner.nextDouble(); // Input radius dalam
        
        Torus donatDenganLubang = new Torus(radiusLuar, radiusDalam);
        donatDenganLubang.printInfo();
        
        // Donat tanpa lubang
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan Radius: ");
        double radius = scanner.nextDouble(); // Input radius
        
        Sphere donatTanpaLubang = new Sphere(radius);
        donatTanpaLubang.printInfo();
        
        scanner.close();
    }
}

