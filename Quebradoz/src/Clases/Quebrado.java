
package Clases;

public class Quebrado {
    private int numerador;
    private int denominador;
    
    public Quebrado(){
        this.numerador = 0;
        this.denominador = 0;
        
    }
   
    public Quebrado(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
     @Override
    public String toString(){
        return "{" + this.numerador + " " + this.denominador + "}";
    
    }
}
