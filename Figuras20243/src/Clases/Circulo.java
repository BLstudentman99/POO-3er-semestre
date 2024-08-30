package Clases;

public class Circulo {
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public Circulo(){
        this.radio = 1.0;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return this.radio;
   
    }
    
    public double area(){
       //return 3.14169236 * radio * radio;
       return Math.PI * Math.pow(radio, 2.0);
    }
    
    public double perimetro(){
    return 2 * Math.PI * radio;
    }
}
