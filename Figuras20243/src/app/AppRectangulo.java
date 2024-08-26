package app;

import Clases.Rectangulo;
public class AppRectangulo {


    public static void main(String[] args) {
        int base = 50;
        int largo = 100;
        
        Rectangulo canchaFut = new Rectangulo(base, largo);
        int ar = canchaFut.area();
    }
    
}
