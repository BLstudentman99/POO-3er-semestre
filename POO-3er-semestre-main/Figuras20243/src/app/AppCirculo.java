package app;
import Clases.Circulo;

public class AppCirculo {

    public static void main(String[] args) {
      double radio = 5.4;
      
      Circulo circulo = new Circulo(radio);
      double ar = circulo.area();
      double per = circulo.perimetro();
      System.out.println(ar);
      System.out.println(per);
    }
    
}