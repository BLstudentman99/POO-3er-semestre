
package Clases;


public class Recta {
   private Punto p1;
   private Punto p2;
   
   public Recta(Punto p1, Punto p2){
       this.p1 = p1;
       this.p1 = p2;
   }
   
   public Recta(int x1, int y1, int x2, int y2){
       p1 = new Punto(x1, y1);
       p2 = new Punto(x2, y2);
   
   }
   //  el primer punto estará en el origen
   //  x2 es la coordenada x del punto 2
   //  y2 es la coordenada y del punto 2 
   
   public Recta(int x2, int y2){
       p1 = new Punto();
       p2 = new Punto(x2, y2);
   
   }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }
   
    public double distancia(){
        int x2_x1 = p2.getX() - p1.getX();
        double cuadradoRestaX = Math.pow(x2_x1, 2);
        
        int y2_y1 = p2.getY() - p1.getY();
        double cuadradoRestaY = Math.pow(y2_y1, 2);
        
        double d = Math.sqrt(cuadradoRestaX + cuadradoRestaY);
        return d;
        
    }
   
   
}
