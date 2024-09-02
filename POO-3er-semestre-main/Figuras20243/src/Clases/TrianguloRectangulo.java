package Clases;

public class TrianguloRectangulo {
    private int base;
    private int altura;
    
    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase(){
        return this.base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getAltura(){
        return this.altura;   
    }
    public void setAltura(int altura){
        this.altura = altura;

    }
    public double area(){
        return base * altura / 2.0;
              
    }
    public double perimetro(){
       //return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa();
    }
    
    private double hipotenusa(){
        //raiz de base 2 + altura 2
        //double baseCuadrada = Math.pow(base, 2);
        //double alturaCuadrada = Math.pow(altura, 2);
        //double raiz = Math.sqrt(baseCuadrada + alturaCuadrada);
        //return raiz;
        
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
               
    }
}

