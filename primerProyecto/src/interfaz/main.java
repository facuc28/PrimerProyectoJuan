package interfaz;

import fuente.Persona;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {


    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       Persona persona = new Persona();
       Persona persona1 = new Persona("Juan", "Gomez", 20, "Argentino");
       Persona persona2 = new Persona("Efrain", "Kain");



       //Esto se muestra por pantalla
       System.out.print("Ingrese Nombre: ");
       String nombre = br.readLine();
       System.out.print("Ingrese Apellido: ");
       String apellido = br.readLine();

       if (nombre.length() >= 3) {
           persona.setNombre(nombre);
       } else {
           persona.setNombre(" ");
       }

       persona.setApellido(apellido);

       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("Apellido: " +persona.getApellido());








    }
}
