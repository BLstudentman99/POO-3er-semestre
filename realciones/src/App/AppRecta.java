package App;
import Clases.Punto;
import Clases.Recta;
import java.util.Scanner;

public class AppRecta {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("APPLICACION PARA RECTAS");
        System.out.println("CAPTURA EL PRIMER PUNTO DE LA RECTA");
        System.out.print("CAPTURA LA COORDENADA X");
        int x1 = captura.nextInt();
        System.out.print("CAPTURA LA COORDENADA Y");
        int y1 = captura.nextInt();
        
        System.out.println("CAPTURA EL segundo PUNTO DE LA RECTA");
        System.out.print("CAPTURA LA COORDENADA X");
        int x2 = captura.nextInt();
        System.out.print("CAPTURA LA COORDENADA Y");
        int y2 = captura.nextInt();
        
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        
        Recta r1 = new Recta(p1, p2);
        
    }
    
}
