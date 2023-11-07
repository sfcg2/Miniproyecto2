import java.util.ArrayList;
import java.util.Scanner;

public class Buscar {
    Scanner scanner = new Scanner(System.in);
    App pp = new App();
    public Buscar(){}
    
    public void buscar(){

        ArrayList<Candidato> listaC = Insertar.getInscritos();   

        boolean val4 = false;
        String opcion;
        System.out.println("[Ingrese 0 para salir]\n");

        while(val4 == false){

            Candidato cc = new Candidato();
            System.out.print("Buscar Candidato -> ");
            cc.setCedula();

            if (cc.getCedula().equals("0")){
                break;

            }else if(cc.getCedula() != "0"){
                for(int i = 0; i<listaC.size(); i++){
                    
                    if(cc.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){

                        val4 = true;
                        System.out.println(listaC.get(i));

                        System.out.print("\n¿Desea Votar Por El Candidato?, si/no: ");
                        opcion = scanner.nextLine();

                        if(opcion.equalsIgnoreCase("SI")){
                                listaC.get(i).setVotos();
                                System.out.println("> Voto Ingresado");

                        }else if(opcion.equalsIgnoreCase("NO")){
                            break;
                            
                        }else{
                            System.out.println("\n> Opcion Incorrecta");
                        }
                    }
                }if(val4 == false){
                    System.out.println("\n > Candidato NO encontrado, vuelva a ingresar la cedula\n");
                    //pp.esperarSegundos(1520);
                    //pp.limpiarPantalla();
                    System.out.println("[Ingrese 0 para salir]\n");
                }
            } 
                
        }
                
    }

}

