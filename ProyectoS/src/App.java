import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try (Scanner scanner = new Scanner(System.in)) {
        
            //Menu    
            
            System.out.println( "                         - - - - E L E C C I O N E S - - - - \n");

            int opcion;
            do{
                System.out.println("\nINDICACIONES");
                System.out.println("-> Ingresar cedula sin puntos");
                System.out.println("-> Si tiene mas de una promesa de campana, favor de ingresarlas juntas separadas con coma");
                System.out.println("\n1. Insertar Candidato");
                System.out.println("2. Actualizar Candidato");
                System.out.println("3. Eliminar Candidato");
                System.out.println("4. Buscar/Votar Candidato");
                System.out.println("5. Lista de Candidatos");
                System.out.println("0. No seguir haciendo CRUD");

                System.out.print("Para inscribir/modificar un candidato elija una opcion: ");
                opcion = scanner.nextInt();
                System.out.println();
                //limpiarPantalla();
                //esperarSegundos(300);

                Insertar obj1 = new Insertar();
                Actualizar obj2 = new Actualizar();
                Eliminar obj3 = new Eliminar();
                Buscar obj4 = new Buscar();
                ListaCandidatos obj5 = new ListaCandidatos();
                Informacion obj6 = new Informacion();

                switch (opcion) {

                    case 1:System.out.println("\n[Ingrese 0 para salir]\n");obj1.insertar();//esperarSegundos(330);limpiarPantalla();
                    break;
                    case 2: obj2.actualizar();//esperarSegundos(320);
                    break;
                    case 3: obj3.eliminar();//esperarSegundos(430);
                    break;
                    case 4: obj4.buscar();//esperarSegundos(1000);
                    break;
                    case 5: obj5.listaCandidatos();break;
                    case 0: obj6.info();break;
                    default:
                        System.out.println("Opcion No Valida");
                        break;
                }
            }while(opcion!=0);
        }
    }
/* 
    public static void limpiarPantalla() {
        try{ new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    
        }catch (Exception e){

            e.printStackTrace();
        }
    }
    public static void esperarSegundos(int sg) {
        try {
            Thread.sleep(sg); // Convierte segundos a milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
    
}
    
