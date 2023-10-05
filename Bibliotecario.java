public class Bibliotecario extends Usuario {
    public Bibliotecario(String name, int telefono, String rut){
        super(name, telefono, rut);
    }
    public void eliminarLibro(String nombreBiblioteca, String nombreLibro, Usuario usuario){
        Biblioteca [] bibliotecaUsuario = usuario.getBibliotecaUsuario();
        for(int i =0 ; i<10;i++){
            if(bibliotecaUsuario[i].getNombre() == nombreBiblioteca){
                bibliotecaUsuario[i].eliminarLibro(nombreLibro);
                return;
            }
        }
    }
}
