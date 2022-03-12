package edpractica4;

/** 
 * Clase Motor
 * @author marc barcelo comas
 * @author antoni xavier bascuñana
 */
public class Motor {
    // Atributos
    private String fabricante;
    private String potencia;
    private int codigo;
    // Constructor vacio
    public Motor() {}
    /**
     * Constructores (vacío y completo)
     * @param fabricante String que contiene el fabricante
     * @param potencia String que contiene la potencia
     * @param codigo Integer que contiene el código
     */
    public Motor(String fabricante, String potencia, int codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }
    /**
     * Getters/Setters del atributo fabricante
     * @param fabricante String que contiene el nuevo valor del atributo fabricante
     */
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
    public String getFabricante() { return this.fabricante; }
    
    // Getters/Setters del atributo potencia
    /**
     * @param potencia String que contiene el nuevo valor del atributo potencia
     */
    public void setPotencia(String potencia) { this.potencia = potencia; }
    public String getPotencia() { return this.potencia; }
    
    /**
     * Getters/Setters del atributo codigo
     * @param codigo Integer que contiene el nuevo valor del atributo codigo
     */
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public int getCodigo() { return this.codigo; }
    
    // Metodo toString
    @Override
    public String toString() { return "Motor{fabricante="+this.fabricante+", potencia="+this.potencia+", codigo="+this.codigo+'}'; }
}

