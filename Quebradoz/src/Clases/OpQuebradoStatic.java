
package Clases;


public class OpQuebradoStatic {
    public static Quebrado suma(Quebrado uno, Quebrado dos){
        int n1 = uno.getNumerador();
        int d1 = uno.getDenominador();
        
        int n2 = dos.getNumerador();
        int d2 = dos.getDenominador();
        
    
        int nr = n1 * d2 + n2 * d1;
        int dr = d1 * d2;
        
        return new Quebrado(nr, dr);
        
    }
    
}
