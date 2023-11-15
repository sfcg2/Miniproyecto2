import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Eliminar {

    private static ArrayList<Candidato> listaC2 = Insertar.getInscritos();   

    public Eliminar(){}

    //App pp = new App();
    public static boolean val4 = false;
    public void eliminar(){     
             
        
        Candidato candidato = new Candidato();
        //Interfazz inz = new Interfazz();
        String cc = Interfazz.getBuscarCedula();
        

        candidato.setCedula(cc);

        for(int i = 0; i<listaC2.size(); i++){ 
            
            if(candidato.getCedula().equalsIgnoreCase(listaC2.get(i).getCedula())){
                val4 = true;
                listaC2.remove(i);
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato Eliminado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                //inz.dispose();
                return;
            }

        }if(val4 == false){

            JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato NO encontrado,\n vuelva a ingresar la cedula.",
            "ERROR", JOptionPane.ERROR_MESSAGE);
            //inz.dispose();
            //inz.contenedor.setVisible(false);
            return;
        } 
    
            
    }public static ArrayList<Candidato> getListaC2() {
        return listaC2;

    }public static boolean getVal4(){
        return val4;
    };


}




