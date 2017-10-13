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
       //Aca era br no RC me equivoque yo cuando te lo pase
       String edad = br.readLine();
       //Aca es Integer no integer
       int edadNumero = Integer.parseInt(edad);

       System.out.print("Ingrese Nacionalidad: ");
       String nacionalidad = br.readLine();

       //Necesito ayuda con esto

       System.out.print("Ingrese DNI: ");
       String documento = br.readLine();
       int docNumero = Integer.parseInt(documento);

       //Condicional

       if (nombre.length() >= 3) {
           persona.setNombre(nombre);
       } else {
           persona.setNombre(" ");
       }

       // Set
        //Ojo con esto, fijate que le estas seteando el nombre directamente, acordate que ya habiamos agregado
        // un condicional arriba que controlaba que el nombre sea mayor o igual a 3 letras sino lo deja vacio.
        //Esta linea lo setea si o si. Deberias sacarla.
       persona.setNombre(nombre);
       persona.setApellido(apellido);
       //aca seteas la variable que ya tiene el valor int y no el String
       persona.setEdad(edadNumero);
       persona.setNacionalidad(nacionalidad);
       // Igual aca
       persona.setDocumento(docNumero);

       // Los resultados no me los trae como los puse (INT)

       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("Apellido: " +persona.getApellido());
       System.out.println("Edad : " +persona.getEdad());
       System.out.println("Nacionalidad: " +persona.getNacionalidad());
       System.out.println("Documento: " +persona.getDocumento());









    }
}
