public class Biblioteca{
    private String nombre;
    private Libro [] libros;
    Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new Libro[20];
    }
    public String getNombre(){return nombre;}
    public Libro [] getLibros(){return libros;}
    public void agregarLibro(Libro libro){
        for(int i = 0; i < libros.length; i++){
            if(libros[i] == null){
                libros[i] = libro;
                return;
            }
        }
        System.out.println("La "+ nombre + " esta llena");
    }
    public void eliminarLibro(String nombreLibro){
        for(int i = 0; i < libros.length; i++){
            if(libros[i].getNombre() == nombreLibro){
                libros[i] = null;
                return;
            }
        }
        System.out.println("No se encontro el libro");
    }
}