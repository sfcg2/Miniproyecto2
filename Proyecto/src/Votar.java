import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Votar {

    Scanner scanner = new Scanner(System.in);
    App pp = new App();

    public void votar() {

        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();

/*        System.out.println("\n[Ingrese 0 para salir]\n");
        System.out.println("Número de Candidatos Inscritos: " + listaCandidatos.size());*/

        for (int i = 0; i < listaCandidatos.size(); i++) {
            Interfazz.getArea().append("\nCANDIDATO # " + (i + 1) + "\n"+ listaCandidatos.get(i).toString());
            
        }

        boolean candidatoEncontrado = false;

        while (!candidatoEncontrado) {

            //System.out.print("\nPosición del Candidato que Desea Votar: ");
            int posicionCandidato = Integer.parseInt(Interfazz.getPosic());
            

            if (posicionCandidato == 0){
                return;
    
            }else if(posicionCandidato != 0){
                if (posicionCandidato > 0 && posicionCandidato <= listaCandidatos.size()) {

                    candidatoEncontrado = true;
                    listaCandidatos.get(posicionCandidato - 1).setsumarVotos();
                    
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "Voto Registrado para \n " + listaCandidatos.get(posicionCandidato - 1).getNombre() , "INFO", JOptionPane.INFORMATION_MESSAGE);
                    return;
                    //System.out.println("\nVoto Registrado para el Candidato " + listaCandidatos.get(posicionCandidato - 1).getNombre()+ ".");
                }else {
                    
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "Posición de Candidato NO Valida. Intente Nuevamente.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                    //System.out.println("\nPosición de Candidato NO Valida. Intente Nuevamente.");
                   
                }
            }
        }
    }
    
    
    public void VotosTotales() {

        ArrayList<Candidato> listaCandidatos = Insertar.getInscritos();
        Candidato candidatoMasVotado = null;
        //System.out.println("-> VOTOS DE CADA CANDIDATO:\n");

        int maxVotos = Integer.MIN_VALUE;
        

        for (Candidato candidato : listaCandidatos) {

            //System.out.println("   Candidato: " + candidato.getNombre() + ", Votos: " + candidato.getVotos());

            if (candidato.getVotos() > maxVotos) {
                maxVotos = candidato.getVotos();
                candidatoMasVotado = candidato;
            }
        }
        if (candidatoMasVotado != null) {
            
            //System.out.println("\n-> CANDIDATO GANADOR\n");
            Interfazz.getArea().append("\n-> CANDIDATO GANADOR\n");
            Interfazz.getArea().append("   " + candidatoMasVotado.getNombre() + " con " + maxVotos + " voto/s.\n");
            Interfazz.getArea().append("   Promesas: " + candidatoMasVotado.getPromesas());
            //System.out.println("   " + Votar.getCandidatoMasVotado().getNombre() + " con " + maxVotos + " voto/s.\n");
            //System.out.println("   Promesas: " + candidatoMasVotado.getPromesas());

        }else{
            Interfazz.getArea().append("-> NO hay Candidatos Registrados o \n   NO se han Registrado Votos.");
        }

        
    }
}
