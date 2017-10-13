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
        int ejecucionPrincipal = 0;
        int ejecucionPrograma = 0;
        //Menu Principal
        do {
            do {
                System.out.println("-------- Menu Principal ------");
                System.out.println("1- Agregar Usuario");
                System.out.println("2- Ver Usuario");
                System.out.println("3- Borrar Usuario");
                System.out.println("------------------------------");
                //Se solicita la opcion a elegir al usuario
                System.out.println("Ingrese Opcion: ");
                int opcionMenu = br.read();

                switch (opcionMenu) {
                    case 1: {
                        //Logica para crear un nuevo usuario
                        break;
                    }
                    case 2: {
                        //Logica para ver un usuario
                    }
                    case 3: {
                        //Logica para borrar un usuario
                    }
                    default: {
                        ejecucionPrincipal = 1;
                    }
                }

            }while (ejecucionPrograma < 1);
        }while (ejecucionPrincipal < 1);

    }
}
