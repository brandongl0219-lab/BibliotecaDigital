public abstract class Material {

    private String codigo;
    private String titulo;
    private String autor;
    private int    anioPublicacion;
    private int    numPaginas;
    private String estado;   // "Disponible" o "Prestado"

    public Material(String codigo, String titulo, String autor,
                    int anioPublicacion, int numPaginas) {
        this.codigo          = codigo;
        this.titulo          = titulo;
        this.autor           = autor;
        this.anioPublicacion = anioPublicacion;
        this.numPaginas      = numPaginas;
        this.estado          = "Disponible";   // siempre inicia disponible
    }

    public boolean prestar() {
        if (estado.equals("Disponible")) {
            estado = "Prestado";
            return true;
        }
        System.out.println("  [!] \"" + titulo + "\" no esta disponible.");
        return false;
    }

    public void devolver() {
        estado = "Disponible";
        System.out.println("  [ok] \"" + titulo + "\" devuelto correctamente.");
    }

    public abstract String getInfo();

    public String getInfoBase() {
        return String.format("[%s] \"%s\" | %s | %d | %d pags. | %s",
                codigo, titulo, autor, anioPublicacion, numPaginas, estado);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getCodigo()          { return codigo; }
    public String getTitulo()          { return titulo; }
    public String getAutor()           { return autor; }
    public int    getAnioPublicacion() { return anioPublicacion; }
    public int    getNumPaginas()      { return numPaginas; }
    public String getEstado()          { return estado; }

    public void setCodigo(String codigo)               { this.codigo          = codigo; }
    public void setTitulo(String titulo)               { this.titulo          = titulo; }
    public void setAutor(String autor)                 { this.autor           = autor; }
    public void setAnioPublicacion(int anioPublicacion){ this.anioPublicacion = anioPublicacion; }
    public void setNumPaginas(int numPaginas)          { this.numPaginas      = numPaginas; }
}