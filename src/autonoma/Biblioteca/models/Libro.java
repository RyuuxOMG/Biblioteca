package autonoma.Biblioteca.models;

public class Libro {
    private long id; // Cambia int a long
    private String titulo;

    public Libro(long id, String titulo) { // Cambia el constructor a long
        this.id = id;
        this.titulo = titulo;
    }

    public long getId() { // Cambia el getter a long
        return id;
    }

    public void setId(long id) { // Cambia el setter a long
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
