/**
 * Clase abstracta Mascota que implementa la interface de Sonido
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public abstract class Mascota implements Sonido{
    // Atributos
    private String nombre;
    private int edad;
    // Constructor vacio
    public Mascota() {}
    /**
     * Constructor completo
     * @param nombre String que contiene el nombre
     * @param edad Integer que contiene la edad
     */
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Getters/Setters del atributo nombre
     * @param nombre String que contiene el nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return this.nombre; }

    /**
     * Getters/Setters del atributo edad
     * @param edad Integer que contiene el nuevo valor del atributo edad
     */
    public void setEdad(int edad) { this.edad = edad; }
    public int getEdad() { return this.edad; }

    // Implementacion del método sonido
    @Override
    public void sonido() {}
    // Metodo toString
    @Override
    public String toString() { return "Mascota{nombre="+this.nombre+", edad="+this.edad+'}'; }
}
