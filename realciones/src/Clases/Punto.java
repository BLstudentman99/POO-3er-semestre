
package Clases;


public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        this.x = 0;
        this.y = 0;        
       
    }
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    
    }
    
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override
    public String toString(){
        return "{" + this.x + " " + this.y + "}";
    
    }
    
}
