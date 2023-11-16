import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Eliminar {

    private static ArrayList<Candidato> listaC2 = Insertar.getInscritos();   

    public Eliminar(){}

    

    public void eliminar(){     
        
        boolean val4 = false;
        Candidato candidato = new Candidato();
        String cc = Interfazz.getBuscarCedula();
        
        candidato.setCedula(cc);

        for(int i = 0; i<listaC2.size(); i++){ 
            
            if(candidato.getCedula().equalsIgnoreCase(listaC2.get(i).getCedula())){
                val4 = true;
                listaC2.remove(i);
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "  Candidato Eliminado", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }

        }if(val4 == false){

            JOptionPane.showMessageDialog(Interfazz.getwidth(), "  Candidato NO encontrado","ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } 
    
    }public static ArrayList<Candidato> getListaC2() {
        return listaC2;

    }

}




