
public class Main{
    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Pedro", 123453457, "sdfgsdfgg");
        Usuario usuario2 = new Usuario("Pablo", 234574568, "sdfhsdgh");
        Biblioteca bibliotecaUsuario1 = new Biblioteca("bibliotecaU1");
        Biblioteca bibliotecaUsuario2 = new Biblioteca("bibliotecaU2");
        Libro libro1 = new LibroNoFiccion(false, null, "libro1", "autor1", "genero1", 1234);
        Libro libro2 = new LibroNoFiccion(false, null, "libro2", "autor1", "genero1", 1234);
        Libro libro3 = new LibroNoFiccion(false, null, "libro3", "autor1", "genero1", 1234);
        Libro libro4 = new LibroNoFiccion(false, null, "libro4", "autor1", "genero1", 1234);
        Libro libro5 = new LibroNoFiccion(false, null, "libro5", "autor1", "genero1", 1234);
        Libro libro6 = new LibroNoFiccion(false, null, "libro6", "autor1", "genero1", 1234);
        //
        Libro libro7 = new LibroFiccion("sinopsis1",123, "libro7", "autor1", "genero1", 1234);
        Libro libro8 = new LibroFiccion("sinopsis1",123, "libro8", "autor1", "genero1", 1234);
        Libro libro9 = new LibroFiccion("sinopsis1",123, "libro9", "autor1", "genero1", 1234);
        Libro libro10 = new LibroFiccion("sinopsis1",123, "libro10", "autor1", "genero1", 1234);
        Libro libro11 = new LibroFiccion("sinopsis1",123, "libro11", "autor1", "genero1", 1234);
        Libro libro12 = new LibroFiccion("sinopsis1",123, "libro12", "autor1", "genero1", 1234);
        Libro libro13 = new LibroFiccion("sinopsis1",123, "libro13", "autor1", "genero1", 1234);
        Libro libro14 = new LibroFiccion("sinopsis1",123, "libro14", "autor1", "genero1", 1234);
        Libro libro15 = new LibroFiccion("sinopsis1",123, "libro15", "autor1", "genero1", 1234);
        Libro libro16 = new LibroFiccion("sinopsis1",123, "libro16", "autor1", "genero1", 1234);
        bibliotecaUsuario1.agregarLibro(libro1);
        bibliotecaUsuario1.agregarLibro(libro2);
        bibliotecaUsuario1.agregarLibro(libro3);
        bibliotecaUsuario1.agregarLibro(libro7);
        bibliotecaUsuario1.agregarLibro(libro8);
        bibliotecaUsuario1.agregarLibro(libro9);
        bibliotecaUsuario1.agregarLibro(libro10);
        bibliotecaUsuario1.agregarLibro(libro11);
        bibliotecaUsuario2.agregarLibro(libro4);
        bibliotecaUsuario2.agregarLibro(libro5);
        bibliotecaUsuario2.agregarLibro(libro6);
        bibliotecaUsuario2.agregarLibro(libro12);
        bibliotecaUsuario2.agregarLibro(libro13);
        bibliotecaUsuario2.agregarLibro(libro14);
        bibliotecaUsuario2.agregarLibro(libro15);
        bibliotecaUsuario2.agregarLibro(libro16);
        usuario1.agregarBiblioteca(bibliotecaUsuario1);
        usuario2.agregarBiblioteca(bibliotecaUsuario2);
    }
}