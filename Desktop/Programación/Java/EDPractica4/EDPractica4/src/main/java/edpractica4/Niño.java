package edpractica4;

/** 
 * Clase Niño que heredará los atributos y métodos de la clase Persona
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Niño extends Persona {
    private String colegio;
    private Juguete juguete;
    /**
     * Constructores (vacío y completo)
     * @param nombre String que contiene el nombre del Niño
     * @param DNI String que contiene el DNI del Niño
     * @param edad Integer que contiene la edad del Niño
     * @param colegio String que contiene el colegio del Niño
     * @param juguete Objeto Juguete que contiene el juguete del Niño
     */
    public Niño() {}
    public Niño(String nombre, String DNI, int edad, String colegio, Juguete juguete) {
        super(nombre, DNI, edad);
        this.colegio = colegio;
        this.juguete = juguete;
    }
    // Setters/Getters del atributo colegio
    public String getColegio() { return this.colegio; }
    public void setColegio(String colegio) { this.colegio = colegio; }
    // Setters/Getters del atributo juguete
    public Juguete getJuguete() { return this.juguete; }
    public void setJuguete(Juguete juguete) { this.juguete = juguete; }
    // Método toString
    @Override
    public String toString() { return "Niño{nombre="+this.getNombre()+", DNI="+this.getDNI()+", edad="+this.getEdad()+", colegio="+this.colegio+", juguete="+this.juguete+'}'; }
}

