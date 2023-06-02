public class Videojuegos {
    //Creamos los atributos que van a tener los futuros objetos
    String nombre, empresaDesarrollo, genero;
    int fechaLanzamiento, ventas;

    //Creacion del constructor para todas las variables
    public Videojuegos(String nombre, String empresaDesarrollo, String genero, int fechaLanzamiento, int ventas) {
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.ventas = ventas;
    }

    //Creacion de getters y setters para todas las variables

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    // Agregamos un método para imprimir los datos
    public void imprimirDatos(){
        System.out.println("El nombre del juego es: "+this.nombre);
        System.out.println("La empresa desarrolladora es: "+this.empresaDesarrollo);
        System.out.println("El género es: "+this.genero);
        System.out.println("La fecha de lanzamiento fue el: "+this.fechaLanzamiento);
        System.out.println("La recaudacion en ventas es de: "+this.ventas+" dólares");
        System.out.println(" ");
    }
}
