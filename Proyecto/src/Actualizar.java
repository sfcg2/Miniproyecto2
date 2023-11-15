import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Actualizar extends Insertar{

    public Actualizar(){}
    
    //App pp = new App();
    public static boolean val4 = false;
    public void actualizar(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();
           
        //Interfazz inz = new Interfazz();
        
        Candidato candidato = new Candidato();
        //String nom = Interfazz.getNom();
        String cc = Interfazz.getBuscarCedula();

        

            //System.out.print("Actualizar Candidato -> ");
        candidato.setCedula(cc);

        for(int i = 0; i<listaC.size(); i++){ 
            
            if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                val4 = true;
                listaC.remove(i);
                //inz.inscripciones();                    
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato Encontrado\n", "INFO", JOptionPane.INFORMATION_MESSAGE);
                //inz.dispose();
                return;
            }

        }if(val4 == false){

            //inz.dispose();
            JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato NO encontrado\n","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
    }public static boolean getVal4(){
        return val4;
    };
    
}

