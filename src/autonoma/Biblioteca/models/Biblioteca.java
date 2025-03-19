package autonoma.Biblioteca.models;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
  
    
    private List<Libro> libros;
    
  
    public Biblioteca() {
        this.libros = new ArrayList<>();


    }
  
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
    
   public boolean agregarLibro(Libro libro) {
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == libro.getId()) {
            return false; // Ya existe un libro con ese ID
        }
    }
    return libros.add(libro);
}
    
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "no hay libros en la biblioteca";
        }

    String resultado = "libros: ";
    for (int i = 0; i < libros.size(); i++) {
        resultado += "id: " + libros.get(i).getId() + ", titulo: " + libros.get(i).getTitulo();
    }
    return resultado;
}
    
    public boolean eliminarLibro(long id) {
    for (Libro libro : libros) {
        if (libro.getId() == id) {
            libros.remove(libro);
            return true;
        }
    }
    return false;
}
    
    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    
   public boolean actualizarLibro(Libro libro, long id) {
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == id) {
            libros.get(i).setTitulo(libro.getTitulo());   
            return true; 
        }
    }
    return false; 
}
    
       public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        for (int i = 0; i < librosOrdenados.size() - 1; i++) {
            for (int j = i + 1; j < librosOrdenados.size(); j++) {
                if (librosOrdenados.get(i).getTitulo().compareTo(librosOrdenados.get(j).getTitulo()) > 0) {
                    Libro temp = librosOrdenados.get(i);
                    librosOrdenados.set(i, librosOrdenados.get(j));
                    librosOrdenados.set(j, temp);
                }
            }
        }
        return librosOrdenados;
   }
}