import java.util.ArrayList;

public class ListaCandidatos {

    public void listaCandidatos(){     
        
        ArrayList<Candidato> listaC = Insertar.getInscritos();   

        for(int i=0; i<listaC.size();i++){
            Interfazz.getArea().append("\n\nCANDIDATO # " + (i + 1) + "\n"+ listaC.get(i).toString());
            Interfazz.getArea().append("\n-----------------------------------------------------");
        }
    }
    
}
