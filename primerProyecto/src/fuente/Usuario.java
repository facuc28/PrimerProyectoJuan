package fuente;

public class Usuario {
    //Atributos de clase
    private String nombre;
    private String contraseña;
    private String alias;

    //Constructor sin parametros
    public Usuario(){}

    //Constructor por parametros
    public Usuario(String nombre, String contraseña, String alias) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.alias = alias;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getAlias() {
        return alias;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    //Metodo toString - Muestra todos los atributos de  la clase junto a una descripcion:
    @Override
    public String toString() {
        String resultado = "Nombre usuario: " + nombre + "\n"
                + "Contraseña: " + contraseña + "\n"
                + "Alias: " + alias + "\n";

        return resultado;
    }
}
