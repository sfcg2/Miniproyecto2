import java.util.ArrayList;

public class Buscar {
        
    public Buscar(){}

    App pp = new App();
    
    public void buscar(){

        ArrayList<Candidato> listaC = Insertar.getInscritos();   
            
            boolean val4 = false;
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
                            System.out.println("\nC A N D I D A T O # " + (i+1));
                            System.out.println(listaC.get(i));
                            break;
                        }

                    }if(val4 == false){
                            System.out.println("\nCandidato NO encontrado, vuelva a ingresar la cedula.\n");
                            System.out.println("[Ingrese 0 para salir]\n");
                    } 
                }
            }
            
    }

}

