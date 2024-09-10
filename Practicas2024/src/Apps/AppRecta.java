package Apps;
import Clases.Recta;
import java.util.Scanner;

public class AppRecta {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        System.out.println("APP para recta");
        System.out.println("introduce X1");
        int x1 = captura.nextInt();
        
        System.out.println("introduce X2");
        int x2 = captura.nextInt();
        
        System.out.println("introduce Y1");
        int y1 = captura.nextInt();
        
        System.out.println("introduce y2");
        int y2 = captura.nextInt();
        
        Recta distanciaRecta = new Recta(x1, y1, x2, y2);
        
        double distancia = distanciaRecta.distancia();
        
        System.out.println("La distancia es: " + distancia);
        
    }
    
}
