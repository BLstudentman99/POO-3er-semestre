package Clases;

public class Cilindro {
    private double radio;
    private int altura;
    
    public Cilindro(double radio, int altura){
        this.radio = radio;
        this.altura = altura; 
    }
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public int getAltura(){
        return this.altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public double area(){
        return 2 * Math.PI + radio + (altura + radio);
    }
    
    public double volumen(){
        return Math.PI * Math.pow(radio, 2.0) * altura;
    }
}
