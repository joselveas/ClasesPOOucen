public class Libro{
    private String nombre;
    private String autor;
    private String genero;
    private int numeroPaginas;
    public Libro(String nombre, String autor, String genero, int numeroPaginas){
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }
    String getNombre(){return nombre;}
    String getAutor(){return autor;}    
    String getGenero(){return genero;}
    int getNumeroPaginas(){return numeroPaginas;}
    
}