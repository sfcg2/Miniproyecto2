import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Actualizar extends Insertar{

    public Actualizar(){}
    
    //App pp = new App();

    public void actualizar(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();
           
        Interfazz inz = new Interfazz();
        boolean val4 = false;
        Candidato candidato = new Candidato();
        //String nom = Interfazz.getNom();
        String cc = Interfazz.getCC();

        

            //System.out.print("Actualizar Candidato -> ");
        candidato.setCedula(cc);

        for(int i = 0; i<listaC.size(); i++){ 
            
            if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                val4 = true;
                listaC.remove(i);
                inz.inscripciones();                    
                JOptionPane.showMessageDialog(inz.wnd, "Candidato encontrado\n ingrese los datos", "INFO", JOptionPane.INFORMATION_MESSAGE);
                inz.dispose();
                return;
            }

        }if(val4 == false){

            inz.dispose();
            JOptionPane.showMessageDialog(null, "Candidato NO encontrado,\n vuelva a ingresar la cedula.",
            "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
    }
    
}

