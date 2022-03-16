/**
 * Clase Juguete
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Juguete {
    // Atributos
    private String nombre;
    private int precio;
    private int edadRecomendada;
    // Constructor vacio
    public Juguete() {}
    /**
     * Constructores (vacío y completo)
     * @param nombre String que contiene el nombre
     * @param precio Integer que contiene el precio
     * @param edadRecomendada Integer que contiene la edad recomendada
     */
    public Juguete(String nombre, int precio, int edadRecomendada) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    /**
     * Getters/Setters del atributo nombre
     * @param nombre String que contiene el nuevo valor del atributo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return this.nombre; }

    /**
     * Getters/Setters del atributo precio
     * @param precio Integer que contiene el nuevo valor del atributo precio
     */
    public void setPrecio(int precio) { this.precio = precio; }
    public int getPrecio() { return this.precio;}

    /**
     * Getters/Setters del atributo edadRecomendada
     * @param edadRecomendada Integer que contiene el nuevo valor de edadRecomendada
     */
    public void setEdadRecomendada(int edadRecomendada) { this.edadRecomendada = edadRecomendada; }
    public int getEdadRecomendada() { return this.edadRecomendada; }

    // Metodo toString
    @Override
    public String toString() { return "Juguete{nombre="+this.nombre+", precio="+this.precio+", edadRecomendada="+this.edadRecomendada+'}'; }
}
