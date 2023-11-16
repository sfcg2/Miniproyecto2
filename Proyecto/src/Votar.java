import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Votar {

    public void votar() {

        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();

        boolean candidatoEncontrado = false;

        while (!candidatoEncontrado) {

            int posicionCandidato = Integer.parseInt(Interfazz.getPosic());
            
            if (posicionCandidato == 0){
                return;
    
            }else if(posicionCandidato != 0){
                
                if (posicionCandidato > 0 && posicionCandidato <= listaCandidatos.size()) {

                    candidatoEncontrado = true;
                    listaCandidatos.get(posicionCandidato - 1).setsumarVotos();
                    
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "Voto Registrado para " + listaCandidatos.get(posicionCandidato - 1).getNombre() , "INFO", JOptionPane.INFORMATION_MESSAGE);
                    return;

                }else{
                    
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "Posición NO Válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;                   
                }
            }
        }
    }
    
    
    public void VotosTotales() {

        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();
        Candidato candidatoMasVotado = null;
        int maxVotos = Integer.MIN_VALUE;
        
        for (Candidato candidato : listaCandidatos) {

            if (candidato.getVotos() > maxVotos) {
                maxVotos = candidato.getVotos();
                candidatoMasVotado = candidato;
            }

        }if (candidatoMasVotado != null) {
            
            Interfazz.getArea().append("\n-> CANDIDATO GANADOR\n");
            Interfazz.getArea().append("   " + candidatoMasVotado.getNombre() + " con " + maxVotos + " voto/s.\n");
            Interfazz.getArea().append("   Promesas: " + candidatoMasVotado.getPromesas());

        }else{
            Interfazz.getArea().append("-> NO hay Candidatos Registrados o \n   NO se han Registrado Votos.");
        } 
    }
}
