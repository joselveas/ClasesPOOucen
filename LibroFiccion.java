public class LibroFiccion extends Libro{
    private String sinopsis;
    private int anio;
    public LibroFiccion(String sinopsis, int anio, String nombre, String autor, String genero, int numeroPaginas){
        super(nombre, autor, genero, numeroPaginas);
        this.sinopsis = sinopsis;
        this.anio = anio;
    }
    String getSinopsis(){return sinopsis;}
    int getAnio(){return anio;}
}