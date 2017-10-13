package interfaz;

import fuente.Usuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

    public static void main(String args[]) throws Exception{
        //Variables auxiliares y declaraciones de objetos
        Usuario usuario1 = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String salidaPantalla = "";
        int ejecucionPrograma = 0;
        boolean noEsPrimerCiclo = false;
        boolean finalizarPrograma = false;
        //Ciclo de ejecucion
        while (!finalizarPrograma)
        {
            do {
                if (noEsPrimerCiclo) {
                   limpiarPantalla();
                }
                noEsPrimerCiclo = true;
                if (!salidaPantalla.equalsIgnoreCase("")) {
                    System.out.println("------Resultado-------");
                    System.out.println(salidaPantalla);
                    System.out.println("----------------------");
                }
                salidaPantalla = "";
                //Menu Principal
                System.out.println("-------- Menu Principal ------");
                System.out.println("1- Agregar Usuario");
                System.out.println("2- Ver Usuario");
                System.out.println("3- Borrar Usuario");
                System.out.println("4- Salir");
                System.out.println("------------------------------");
                //Se solicita la opcion a elegir al usuario
                System.out.print("Ingrese Opcion: ");
                String opcion = br.readLine();
                int opcionMenu = Integer.parseInt(opcion);
                switch (opcionMenu) {
                    //Agregar Usuario
                    case 1: {
                        //Logica para crear un nuevo usuario
                        System.out.println("Ingrese nombre usuario: ");
                        String usuario = br.readLine();
                        System.out.println("Ingrese contraseña: ");
                        String contraseña = br.readLine();
                        System.out.println("Ingrese alias: ");
                        String alias = br.readLine();
                        usuario1 = new Usuario(usuario, contraseña, alias);
                        break;
                    }
                    //Ver Usuario
                    case 2: {
                        //Logica para ver un usuario
                        salidaPantalla = usuario1.toString();
                        break;
                    }
                    //Borrar Usuario
                    case 3: {
                        //Logica para borrar un usuario
                        usuario1 = null;
                        System.out.println("Usuario Borrado.");
                        break;
                    }
                    default: {
                        ejecucionPrograma = 1;
                        finalizarPrograma = true;
                        break;
                    }
                }

            }while (ejecucionPrograma < 1);
        }

    }
    public static void limpiarPantalla(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("");
        }
    }

}
