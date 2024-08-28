package app;

import Clases.Rectangulo;
import Clases.Circulo;
public class AppRectangulo {


    public static void main(String[] args) {
        int base = 50;
        int largo = 100;
        
        Rectangulo canchaFut = new Rectangulo(base, largo);
        int ar = canchaFut.area();
        int per = canchaFut.perimetro();
        System.out.println(ar);
        System.out.println(per);
        
    }
    
    
}
