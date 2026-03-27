public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "L001", "El principito", "Antoine de Saint-Exupery",
                1943, 96, "Infantil/Filosofico", "Gallimard");

        Libro libro2 = new Libro(
                "L002", "Clean Code", "Robert C. Martin",
                2008, 431, "Programacion", "Prentice Hall");

        Revista revista1 = new Revista(
                "R001", "National Geographic", "Varios",
                2024, 120, 315, "Marzo");

        Revista revista2 = new Revista(
                "R002", "Science", "Varios",
                2024, 98, 402, "Junio");

        Audiolibro audio1 = new Audiolibro(
                "A001", "Sapiens", "Yuval Noah Harari",
                2011, 443, 900, "Jose Corbato", "MP3");

        Audiolibro audio2 = new Audiolibro(
                "A002", "Atomicos Habitos", "James Clear",
                2018, 320, 480, "Carlos Leal", "WAV");

        Persona p1 = new Persona("Brandon Garcia",  "INE-001", "228-555-0101", "Calle 5 #10");
        Persona p2 = new Persona("Ana Lopez",        "INE-002", "228-555-0202", "Av. Veracruz #33");

        Prestamo prestamo1 = new Prestamo("2025-06-10", p1);
        Prestamo prestamo2 = new Prestamo("2025-06-10", p2);

        System.out.println("\n── Prestamo 1: Brandon ──");
        prestamo1.agregarMaterial(libro1);
        prestamo1.agregarMaterial(revista1);
        prestamo1.agregarMaterial(audio1);
        // Intentar agregar un cuarto (debe rechazarse)
        prestamo1.agregarMaterial(libro2);

        System.out.println("\n── Prestamo 2: Ana ──");
        prestamo2.agregarMaterial(libro2);
        prestamo2.agregarMaterial(audio2);
        // Intentar prestar libro1 que ya esta prestado
        prestamo2.agregarMaterial(libro1);

        System.out.println();
        prestamo1.mostrarInfo();
        System.out.println();
        prestamo2.mostrarInfo();

        prestamo1.devolverTodo("2025-06-11");

        System.out.println();
        prestamo1.mostrarInfo();

        System.out.println("\n── Prueba de getters ──");
        System.out.println("Codigo libro1     : " + libro1.getCodigo());
        System.out.println("Titulo libro1     : " + libro1.getTitulo());
        System.out.println("Autor libro1      : " + libro1.getAutor());
        System.out.println("Anio libro1       : " + libro1.getAnioPublicacion());
        System.out.println("Paginas libro1    : " + libro1.getNumPaginas());
        System.out.println("Estado libro1     : " + libro1.getEstado());
        System.out.println("Genero libro1     : " + libro1.getGenero());
        System.out.println("Editorial libro1  : " + libro1.getEditorial());

        System.out.println("Edicion revista1  : " + revista1.getNumEdicion());
        System.out.println("Mes revista1      : " + revista1.getMesPublicacion());

        System.out.println("Duracion audio1   : " + audio1.getDuracionMinutos() + " min");
        System.out.println("Narrador audio1   : " + audio1.getNarrador());
        System.out.println("Formato audio1    : " + audio1.getFormato());

        System.out.println("Nombre p1         : " + p1.getNombre());
        System.out.println("ID p1             : " + p1.getIdentificacion());
        System.out.println("Celular p1        : " + p1.getCelular());
        System.out.println("Direccion p1      : " + p1.getDireccion());

        System.out.println("FechaSolicitud p1 : " + prestamo1.getFechaSolicitud());
        System.out.println("FechaDevolucion   : " + prestamo1.getFechaDevolucion());
        System.out.println("Persona prestamo1 : " + prestamo1.getPersona().getNombre());
        System.out.println("Cantidad mats     : " + prestamo1.getCantidad());

        System.out.println("\n── Prueba de setters ──");
        libro2.setCodigo("L999");
        libro2.setTitulo("The Clean Coder");
        libro2.setAutor("Robert C. Martin");
        libro2.setAnioPublicacion(2011);
        libro2.setNumPaginas(256);
        libro2.setGenero("Profesional");
        libro2.setEditorial("Prentice Hall");
        System.out.println("Libro2 actualizado: " + libro2.getInfo());

        revista2.setNumEdicion(500);
        revista2.setMesPublicacion("Diciembre");
        System.out.println("Revista2 actualizada: " + revista2.getInfo());

        audio2.setDuracionMinutos(600);
        audio2.setNarrador("Pedro Ruiz");
        audio2.setFormato("MP3");
        System.out.println("Audio2 actualizado: " + audio2.getInfo());

        p1.setNombre("Brandon G.");
        p1.setIdentificacion("INE-999");
        p1.setCelular("228-000-0000");
        p1.setDireccion("Calle Nueva #1");
        System.out.println("Persona actualizada: " + p1.getResumen());

        prestamo2.setFechaSolicitud("2025-07-01");
        prestamo2.setFechaDevolucion("2025-07-02");
        prestamo2.setPersona(p1);
        System.out.println("Prestamo2 actualizado: " + prestamo2.toString());

        System.out.println("\n── toString ──");
        System.out.println(libro1);
        System.out.println(revista1);
        System.out.println(audio1);
        System.out.println(p1);
        System.out.println(prestamo1);
    }
}