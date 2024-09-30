package Clases;

public class OpQuebrados {
    private Quebrado quebrado1;
    private Quebrado quebrado2;
    
    public OpQuebrados(Quebrado q1, Quebrado q2){
        this.quebrado1 = q1;
        this.quebrado2 = q2;
    
    }
    public Quebrado getQuebrado1(){
        return this.quebrado1;
    }
    
    public void setQuebrado1(Quebrado q){
        this.quebrado1 = q;
    }
    
    public Quebrado getQuebrado2(){
        return this.quebrado2;
    }
    
    public void setQuebrado2(Quebrado q){
        this.quebrado2 = q;
    }
    
    public Quebrado suma(){
        int n1 = quebrado1.getNumerador();
        int d1 = quebrado1.getDenominador();
        
        int n2 = quebrado2.getNumerador();
        int d2 = quebrado2.getDenominador();
        
        int dr = d1 * d2;
        int nr = n1 * d2 + n2 * d1;
        
        Quebrado QuebradoResultante = new Quebrado(nr, dr);
        return QuebradoResultante;
                
    }
    
     public Quebrado resta(){
        int n1 = quebrado1.getNumerador();
        int d1 = quebrado1.getDenominador();
        
        int n2 = quebrado2.getNumerador();
        int d2 = quebrado2.getDenominador();
        
        int dr = d1 * d2;
        int nr = n1 * d2 - n2 * d1;
        
        Quebrado QuebradoResultante = new Quebrado(nr, dr);
        return QuebradoResultante;
                
    }
    
      public Quebrado multiplicacion(){
        int n1 = quebrado1.getNumerador();
        int d1 = quebrado1.getDenominador();
        
        int n2 = quebrado2.getNumerador();
        int d2 = quebrado2.getDenominador();
        
        int dr = d1 * d2;
        int nr = n1 * n2;
        
        Quebrado QuebradoResultante = new Quebrado(nr, dr);
        return QuebradoResultante;
                
    }
       public Quebrado division(){
        int n1 = quebrado1.getNumerador();
        int d1 = quebrado1.getDenominador();
        
        int n2 = quebrado2.getNumerador();
        int d2 = quebrado2.getDenominador();
        
        int dr = d1 * d2;
        int nr = n1 * d2;
        
        Quebrado QuebradoResultante = new Quebrado(nr, dr);
        return QuebradoResultante;
                
    }
     
}
