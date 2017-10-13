package interfaz;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String args[]) throws Exception{
        //Variables auxiliares y declaraciones de objetos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                //Menu Principal
                System.out.println("-------- Menu Principal ------");
                System.out.println("1- Agregar Usuario");
                System.out.println("2- Ver Usuario");
                System.out.println("3- Borrar Usuario");
                System.out.println("------------------------------");
                //Se solicita la opcion a elegir al usuario
                System.out.print("Ingrese Opcion: ");
                String opcion = br.readLine();
                int opcionMenu = Integer.parseInt(opcion);
                switch (opcionMenu) {
                    //Agregar Usuario
                    case 1: {
                        //Logica para crear un nuevo usuario
                        break;
                    }
                    //Ver Usuario
                    case 2: {
                        //Logica para ver un usuario
                        break;
                    }
                    //Borrar Usuario
                    case 3: {
                        //Logica para borrar un usuario
                        break;
                    }
                    default: {
//                        ejecucionPrograma = 1;
//                        finalizarPrograma = true;
                        break;
                    }
                }

            }while (ejecucionPrograma < 1);
        }

    }

//    public static void limpiarPantalla(){
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println("");
//        }
//    }

    public static void limpiarPantalla() throws AWTException {
        try {
            String cmd = "limpiarPantalla";
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println (ioe);
        }
    }
}
