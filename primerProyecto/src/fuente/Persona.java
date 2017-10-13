package fuente;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private int documento;

    public Persona(){}

    public Persona(String nombreParametro, String apellidoParametro, int edadParametro, String nacionalidadParametro, int documentoParametro) {
        nombre = nombreParametro;
        apellido = apellidoParametro;
        edad = edadParametro;
        nacionalidad = nacionalidadParametro;
        documento = documentoParametro;
    }

    public Persona (String nombreParametro, String apellidoParametro){
        nombre = nombreParametro;
        apellido = apellidoParametro;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidadParametro){
        nacionalidad = nacionalidadParametro;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombreParametro){
        nombre = nombreParametro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoParametro){
        apellido = apellidoParametro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() { return documento; }

    public void setDocumento(int documento){this.documento = documento;
    }
}
