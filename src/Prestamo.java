// ============================================================
//  CLASE: Prestamo
//  Registra cada solicitud de prestamo.
//  Reglas:
//    - Maximo 3 materiales por prestamo.
//    - Solo se presta si el material esta "Disponible".
//    - Todos los prestamos son por un dia.
//  El arreglo materiales[] es de tipo Material (polimorfismo):
//  puede contener Libro, Revista o Audiolibro en el mismo arreglo.
// ============================================================
public class Prestamo {

    private static final int MAX_MATERIALES = 3;

    private String     fechaSolicitud;
    private String     fechaDevolucion;
    private Material[] materiales;
    private Persona    persona;
    private int        cantidad;      // cuantos materiales lleva actualmente

    // ── Constructor ──
    public Prestamo(String fechaSolicitud, Persona persona) {
        this.fechaSolicitud  = fechaSolicitud;
        this.fechaDevolucion = "";
        this.persona         = persona;
        this.materiales      = new Material[MAX_MATERIALES];
        this.cantidad        = 0;
    }

    // ── Operaciones ──

    public boolean agregarMaterial(Material m) {
        if (cantidad >= MAX_MATERIALES) {
            System.out.println("  [!] No se pueden prestar mas de " +
                    MAX_MATERIALES + " materiales por solicitud.");
            return false;
        }
        if (m.prestar()) {
            materiales[cantidad] = m;
            cantidad++;
            System.out.println("  [ok] \"" + m.getTitulo() + "\" agregado al prestamo.");
            return true;
        }
        return false;
    }

    public void devolverTodo(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        System.out.println("\n── Devolucion de prestamo ──");
        for (int i = 0; i < cantidad; i++) {
            materiales[i].devolver();
        }
    }

    public void mostrarInfo() {
        System.out.println("========== Informacion de Prestamo ==========");
        System.out.println(persona.getResumen());
        System.out.println("Solicitud   : " + fechaSolicitud);
        System.out.println("Devolucion  : " +
                (fechaDevolucion.isEmpty() ? "Pendiente" : fechaDevolucion));
        System.out.println("Materiales  : " + cantidad + " / " + MAX_MATERIALES);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("  " + (i + 1) + ". " + materiales[i].getInfo());
        }
        System.out.println("=============================================");
    }

    @Override
    public String toString() {
        return String.format("Prestamo[%s | %s | %d material(es)]",
                fechaSolicitud, persona.getNombre(), cantidad);
    }

    public String     getFechaSolicitud()  { return fechaSolicitud; }
    public String     getFechaDevolucion() { return fechaDevolucion; }
    public Persona    getPersona()         { return persona; }
    public Material[] getMateriales()      { return materiales; }
    public int        getCantidad()        { return cantidad; }

    public void setFechaSolicitud(String fechaSolicitud)   { this.fechaSolicitud  = fechaSolicitud; }
    public void setFechaDevolucion(String fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }
    public void setPersona(Persona persona)                { this.persona         = persona; }
    public void setMateriales(Material[] materiales)       { this.materiales      = materiales; }
    public void setCantidad(int cantidad)                  { this.cantidad        = cantidad; }
}