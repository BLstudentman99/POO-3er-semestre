package app;
import Clases.Cilindro;
import java.util.Scanner;

public class Appcilindro {

    public static void main(String[] args) {
        System.out.println("App para cilindros /n");
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Captura el radio del cilindro");
        double radio = captura.nextDouble();
        
        System.out.println("Captura la altura del cilindro");
        int altura = captura.nextInt();
        
        Cilindro unaLata = new Cilindro(radio, altura);
        System.out.println("el area de la lata es: " + unaLata.area());
      
    }
    
}
