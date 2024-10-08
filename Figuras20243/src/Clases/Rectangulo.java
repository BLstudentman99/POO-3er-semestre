package Clases;

public class Rectangulo {
 
    private int base; 
    private int altura;
    
    /**
     * Constructor para inicializar la base y la altura
     */
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura; 
    }
    
    public void setBase(int b){
        base = b;
    }
    
    public int getBase(){
        return base;
    }
     public void setAltura(int a){
        altura = a;
    }
    
    public int getAltura(){
        return altura;
    }
            
    public int area(){
        return base * altura;
    }
    
    public int perimetro(){
        return base * 2 + altura * 2;   
    }
}

