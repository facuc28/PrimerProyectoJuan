package interfaz;

import fuente.Persona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.channels.UnresolvedAddressException;

public class main {


    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       Persona persona = new Persona();
       Persona persona1 = new Persona("Juan", "Gomez", 20, "Argentino", 40201079);
       Persona persona2 = new Persona("Efrain", "Kain");



       //Esto se muestra por pantalla

       System.out.print("Ingrese Nombre: ");
       String nombre = br.readLine();

       System.out.print("Ingrese Apellido: ");
       String apellido = br.readLine();

       // Necesito ayuda con esto

       System.out.print("Ingrese Edad: ");
       String edad = RC.readline();
        int edadNumero = integer.parseInt(edad);

       System.out.print("Ingrese Nacionalidad: ");
       String nacionalidad = br.readLine();

       //Necesito ayuda con esto

       System.out.print("Ingrese DNI: ");
        Integer documento = br.read();

       //Condicional

       if (nombre.length() >= 3) {
           persona.setNombre(nombre);
       } else {
           persona.setNombre(" ");
       }

       // Set

       persona.setNombre(nombre);
       persona.setApellido(apellido);
       persona.setEdad(edad);
       persona.setNacionalidad(nacionalidad);
       persona.setDocumento(documento);

       // Los resultados no me los trae como los puse (INT)

       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("Apellido: " +persona.getApellido());
       System.out.println("Edad : " +persona.getEdad());
       System.out.println("Nacionalidad: " +persona.getNacionalidad());
       System.out.println("Documento: " +persona.getDocumento());









    }
}
