public class LibroNoFiccion extends Libro{
    private boolean bibliografico;
    private String nombreBilibliografico;
    public LibroNoFiccion(boolean bibliografico, String nombreBilibliografico, String nombre, String autor, String genero, int numeroPaginas){
        super(nombre, autor, genero, numeroPaginas);
        this.bibliografico = bibliografico;
        if(bibliografico){
            this.nombreBilibliografico = nombreBilibliografico;
        }else{
            this.nombreBilibliografico = null;
        }
    }
    boolean getBibliografico(){return bibliografico;}
    String getNombreBibliografico(){
        if(bibliografico){
            return nombreBilibliografico;
        }
        return null;
    }
}