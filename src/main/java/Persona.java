/**
 * Clase abstracta de Persona
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public abstract class Persona {
    // Atributos
    private String nombre;
    private String DNI;
    private int edad;
    /**
     * Constructores (vacío y completo)
     * @param nombre String que contiene el nombre
     * @param DNI String que contiene el DNI
     * @param edad Integer que contiene la edad
     */
    public Persona() {}
    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }
    // Getters/Setters del atributo nombre
    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    // Getters/Setters del atributo DNI
    public String getDNI() { return this.DNI; }
    public void setDNI(String DNI) { this.DNI = DNI; }
    // Getters/Setters del atributo edad
    public int getEdad() { return this.edad; }
    public void setEdad() { this.edad = edad; }
    // Metodo toString
    @Override
    public String toString() { return "Persona{nombre="+this.nombre+", DNI="+this.DNI+", edad="+this.edad+'}'; }
}
