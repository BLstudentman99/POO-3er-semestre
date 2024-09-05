package app;
import java.util.Scanner;
import Clases.PrismaRectangular;

public class AppPrismaRectangular {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        System.out.println("APP PARA CALCULAR AREA, VOLUMEN Y PERIMETRO DE UN PRISMA REC");
        System.out.print("introduce la base: ");
        int base = captura.nextInt();
       
        System.out.println("introduce la altura"); 
        double altura = captura.nextDouble();
        
        System.out.println("introduce la longitud");
        short longitud = captura.nextShort();
        
        PrismaRectangular medidasPrisma = new PrismaRectangular(base, altura, longitud);
        
        double volumen = medidasPrisma.volumen();
        
        System.out.println("El volen es: " + volumen);
    }
    
}
