import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Buscar {
        
    public Buscar(){}

    App pp = new App();
    
    public void buscar(){

        ArrayList<Candidato> listaC = Insertar.getInscritos();   
            
            boolean val4 = false;
            Candidato candidato = new Candidato();
            String cc = Interfazz.getCC();
            

        
            while(val4 == false){

                candidato.setCedula(cc);
                
                for(int i = 0; i<listaC.size(); i++){ 
                    
                    if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                        val4 = true;
                        JOptionPane.showMessageDialog(null, "Candidato Encontrado", "INFO", JOptionPane.INFORMATION_MESSAGE);
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



