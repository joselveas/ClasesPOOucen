public class Usuario{
    private String name;
    private int telefono;
    private String rut;
    private Biblioteca [] bibliotecaUsuario;
    Usuario(String name, int telefono, String rut){
        this.name = name;
        this.telefono = telefono;
        this.rut = rut;
        this.bibliotecaUsuario = new Biblioteca[10];
    };
    String getName(){return name;}
    int getTelefono(){return telefono;}
    String getRut(){return rut;}
    Biblioteca [] getBibliotecaUsuario(){return bibliotecaUsuario;}
    void agregarBiblioteca(Biblioteca biblioteca){
        for(int i = 0; i < bibliotecaUsuario.length; i++){
            if(bibliotecaUsuario[i] == null){
                bibliotecaUsuario[i] = biblioteca;
                return;
            }
        }
        System.out.println("No se pueden agregar mas bibliotecas");
    }
    void eliminarBiblioteca(String nombreBiblioteca){
        for(int i = 0; i < bibliotecaUsuario.length; i++){
            if(bibliotecaUsuario[i].getNombre() == nombreBiblioteca){
                bibliotecaUsuario[i] = null;
                return;
            }
        }
        System.out.println("No se encontro la biblioteca");
    }

}