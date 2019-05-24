
public class Estudiante {
    private String nombre, apellido, genero;
    private int cuenta, edad;
    private Carrera carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String genero, int cuenta, int edad, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.cuenta = cuenta;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", cuenta=" + cuenta + '}';
    }

    
}
