// ============================================================
//  SUBCLASE: Libro  (extiende Material)
//  Agrega genero y editorial.
// ============================================================
public class Libro extends Material {

    private String genero;
    private String editorial;

    // ── Constructor ──
    public Libro(String codigo, String titulo, String autor,
                 int anioPublicacion, int numPaginas,
                 String genero, String editorial) {
        super(codigo, titulo, autor, anioPublicacion, numPaginas);
        this.genero    = genero;
        this.editorial = editorial;
    }

    // ── Operaciones ──

    // Implementacion obligatoria: agrega genero y editorial al resumen base.
    @Override
    public String getInfo() {
        return getInfoBase() + String.format(
                " | Genero: %s | Editorial: %s", genero, editorial);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getGenero()    { return genero; }
    public String getEditorial() { return editorial; }

    // ── Setters ──
    public void setGenero(String genero)       { this.genero    = genero; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
}