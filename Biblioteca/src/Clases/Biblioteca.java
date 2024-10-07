package Clases;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String libro;
    private String autor;
    private String editorial;
    private String alumno;
    
    private List <Biblioteca> Bibliotecas = new ArrayList<>();
    
    public Biblioteca(String libro, String autor, String editorial, String alumno){
        this.libro = libro;
        this.autor = autor;
        this. editorial = editorial; 
        this.alumno = alumno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
    
    public List<Biblioteca> getBibliotecas(){
       return Bibliotecas;
    }
    
    public boolean agregarLibro(Biblioteca b){
        int posicion = Bibliotecas.indexOf(b);
        
        if (posicion < 0){
            return Bibliotecas.add(b);
        }
        return false;
    }
    
    public boolean eliminarLibro(Biblioteca Bibliotecas){
        int posicion = -1;
    
        
    }

}
