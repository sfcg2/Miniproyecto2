import java.util.ArrayList;

public class Actualizar extends Insertar{

    public Actualizar(){}
    
    public void actualizar(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();   

        boolean val4 = false;
        Candidato cc = new Candidato();
        System.out.println("\n[Ingrese 0 para salir]\n");

        System.out.print("Actualizar Candidato -> ");
        cc.setCedula();
        
        if (cc.getCedula().equals("0")){
            return;

        }else if(cc.getCedula() != "0"){
            for(int i = 0; i<listaC.size(); i++){ 
                
                if(cc.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                    val4 = true;
                    listaC.remove(i);
                    insertar();
                }

            }if(val4 == false){
                    System.out.println("Candidato NO encontrado, vuelva a ingresar la cedula");
                    return;
            } 
        }
    }

}
