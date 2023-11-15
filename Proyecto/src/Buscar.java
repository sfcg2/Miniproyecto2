import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Buscar {
        
    public Buscar(){}

    App pp = new App();
    public static boolean val4 = false;
    public void buscar(){

        ArrayList<Candidato> listaC = Insertar.getInscritos();   
            
            
            Candidato candidato = new Candidato();
            String cc = Interfazz.getBuscarCedula();
            

        
            while(val4 == false){

                candidato.setCedula(cc);
                
                for(int i = 0; i<listaC.size(); i++){ 
                    
                    if(candidato.getCedula().equalsIgnoreCase(listaC.get(i).getCedula())){
                        val4 = true;
                        JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato Encontrado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                        Interfazz.getArea().append(listaC.get(i).toString());
                        //System.out.println("\nC A N D I D A T O # " + (i+1));
                        //System.out.println(listaC.get(i));
                        break;
                    }

                }if(val4 == false){
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato NO encontrado,\n Vuelva a ingresar la cédula.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                } 
            }
    }public static boolean getVal4(){
        return val4;
    }
            
}



