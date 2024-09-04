package Clases;

public class PrismaRectangular {
    private int base;
    private double altura;
    private short longitud;
    
    public PrismaRectangular (int base, double altura, short longitud){
        this.base = base;
        this.altura = altura;
        this.longitud = longitud;
                
    }
    public int getBase(){
        return this.base;
    }
    public void setBase(int base){
        this.base = base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public short getLongitud(){
        return this.longitud;
    }
    public void setLongitud(short longitud){
        this.longitud = longitud;
    }
    
    
        
}
