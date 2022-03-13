package edpractica4;

/**
 *
 * @author marcb
 */
public class Humano {
    
    // Atributos
    protected String nombre;
    protected String DNI;
    protected int edad;

    public Humano() {
    }

    // Getters/Setters del atributo nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters/Setters del atributo DNI
    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    // Getters/Setters del atributo edad
    public int getEdad() {
        return this.edad;
    }

    public void setEdad() {
        this.edad = edad;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Persona{nombre=" + this.nombre + ", DNI=" + this.DNI + ", edad=" + this.edad + '}';
    }
    
}
