public class Revista extends Material {

    private int    numEdicion;
    private String mesPublicacion;

    public Revista(String codigo, String titulo, String autor,
                   int anioPublicacion, int numPaginas,
                   int numEdicion, String mesPublicacion) {
        super(codigo, titulo, autor, anioPublicacion, numPaginas);
        this.numEdicion      = numEdicion;
        this.mesPublicacion  = mesPublicacion;
    }


    @Override
    public String getInfo() {
        return getInfoBase() + String.format(
                " | Edicion: %d | Mes: %s", numEdicion, mesPublicacion);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public int    getNumEdicion()      { return numEdicion; }
    public String getMesPublicacion()  { return mesPublicacion; }

    public void setNumEdicion(int numEdicion)           { this.numEdicion     = numEdicion; }
    public void setMesPublicacion(String mesPublicacion){ this.mesPublicacion = mesPublicacion; }
}