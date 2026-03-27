public class Persona {

    private String nombre;
    private String identificacion;
    private String celular;
    private String direccion;

    public Persona(String nombre, String identificacion,
                   String celular, String direccion) {
        this.nombre          = nombre;
        this.identificacion  = identificacion;
        this.celular         = celular;
        this.direccion       = direccion;
    }


    public String getResumen() {
        return String.format("Persona: %s | ID: %s | Cel: %s | Dir: %s",
                nombre, identificacion, celular, direccion);
    }

    @Override
    public String toString() {
        return getResumen();
    }

    public String getNombre()         { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getCelular()        { return celular; }
    public String getDireccion()      { return direccion; }

    public void setNombre(String nombre)                  { this.nombre          = nombre; }
    public void setIdentificacion(String identificacion)  { this.identificacion  = identificacion; }
    public void setCelular(String celular)                { this.celular         = celular; }
    public void setDireccion(String direccion)            { this.direccion       = direccion; }
}