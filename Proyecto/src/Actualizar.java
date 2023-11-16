import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Actualizar extends Insertar{

    public Actualizar(){}
    
    public static boolean val4;

    public void actualizar(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();
        Candidato candidato = new Candidato();
        String cc = Interfazz.getBuscarCedula();

        candidato.setCedula(cc);

        for(int i = 0; i<listaC.size(); i++){ 
            
            if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                Actualizar.setVal4(true);
                listaC.remove(i);                   
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato Encontrado\n", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }

        }if(val4 == false){
        
            JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato NO encontrado\n","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
    }public static void setVal4(boolean valorin){
        val4 = valorin;
    } 
    public static boolean getVal4(){
        return val4;
    };
    
}

