
public class Carrera {
    private String nombre, facultad, jefe;
    private double costo;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, String jefe, double costo) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.jefe = jefe;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return nombre + " "+ facultad;
    }
    
    
}
