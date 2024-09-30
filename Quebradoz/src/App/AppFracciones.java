package App;
import Clases.OpQuebrados;
import Clases.Quebrado;
import java.util.Scanner;

public class AppFracciones {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("APP PARA OPERACIONES CON QUEBRADOS");
        Scanner captura = new Scanner(System.in);
        
        System.out.println("CAPTURA EL PRIMER QUEBRADO");
        System.out.print("DAME EL NUMERADOR");
        int n1 = captura.nextInt();
        System.out.print("DAME EL DENOMINADOR");
        int d1 = captura.nextInt();
        
        System.out.println("CAPTURA EL SEGUNDO QUEBRADO");
        System.out.print("DAME EL NUMERADOR");
        int n2 = captura.nextInt();
        System.out.print("DAME EL DENOMINADOR");
        int d2 = captura.nextInt();
     
        Quebrado q1 = new Quebrado(n1, d1);     
        Quebrado q2 = new Quebrado(n2, d2);
        
        OpQuebrados op1 = new OpQuebrados(q1, q2);
        
        Quebrado suma = op1.suma();
        Quebrado resta = op1.resta();
        Quebrado multi = op1.multiplicacion();
        Quebrado divi = op1.division();
        
        System.out.println("LA SUMA ES:" + suma);
        System.out.println("LA RESTA ES: " + resta);
        System.out.println("LA MULTIPLICACION ES: " + multi);
        System.out.println("LA DIVISION ES: " + divi);
    }
    
}
