import java.util.ArrayList;

public class ListaCandidatos {

    public void listaCandidatos(){     
        
        ArrayList<Candidato> listaC = InsertarPanel.getInscritos();   

        for(int i=0; i<listaC.size();i++){
            System.out.println("\nCANDIDATO #" + (i+1));
            System.out.println(listaC.get(i));
        }

    }
    
}
