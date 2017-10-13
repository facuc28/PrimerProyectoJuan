package interfaz;

import fuente.Usuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) throws Exception{
        //Variables auxiliares y declaraciones de objetos
        Usuario usuario1 = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Usuario> usuarios = new ArrayList<>();
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
                //Menu Principal
                System.out.println("-------- Menu Principal ------");
                System.out.println("1- Agregar Usuario");
                System.out.println("2- Ver Usuario");
                System.out.println("3- Borrar Usuario");
                System.out.println("4- Salir");
                System.out.println("------------------------------");
                //Esta condicion checkea si hay algo que mostrar entonces lo muestra.
                if (!salidaPantalla.equalsIgnoreCase("")) {
                    System.out.println("------Resultado-------");
                    System.out.println(salidaPantalla);
                    System.out.println("----------------------");
                }
                //Limpiamos la variable que mostramos en pantalla para mantener esto ordenado y  sin basura
                salidaPantalla = "";
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
                        String contrasena = br.readLine();
                        System.out.println("Ingrese alias: ");
                        String alias = br.readLine();
                        usuario1 = new Usuario(usuario, contrasena, alias);
                        usuarios.add(usuario1);
                        salidaPantalla = "Usuario Creado!";
                        break;
                    }
                    //Ver Usuario
                    case 2: {
                        //Logica para ver un usuario
                        System.out.println("Ingrese Nombre usuario: ");
                        String nombreUsuario =  br.readLine();
                        Usuario usuarioBuscado = buscarUsuario(nombreUsuario, usuarios);
                        if (usuarioBuscado != null) {
                            salidaPantalla = usuarioBuscado.toString();
                        } else {
                            salidaPantalla = "Usuario No Encontrado!";
                        }
                        break;
                    }
                    //Borrar Usuario
                    case 3: {
                        //Logica para borrar un usuario
                        System.out.println("Ingrese nombre de usuario a borrar: ");
                        String nombreUsuario = br.readLine();
                        usuarios.remove(buscarUsuario(nombreUsuario, usuarios));
                        salidaPantalla = "Usuario Borrado!";
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
    private static void limpiarPantalla(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println("");
        }
    }

    private static Usuario buscarUsuario(String nombreUsuario, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombreUsuario))
                return usuario;
        }

        return null;
    }
}
