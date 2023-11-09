import java.util.ArrayList;
import java.util.Scanner;

public class Votar {

    Scanner scanner = new Scanner(System.in);
    App pp = new App();

    public void votar() {

        ArrayList<Candidato> listaCandidatos = InsertarPanel.getInscritos();

        System.out.println("\n[Ingrese 0 para salir]\n");
        System.out.println("Número de Candidatos Inscritos: " + listaCandidatos.size());

        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println("\nCANDIDATO # " + (i + 1));
            System.out.println(listaCandidatos.get(i));
        }

        boolean candidatoEncontrado = false;

        while (!candidatoEncontrado) {

            System.out.print("\nPosición del Candidato que Desea Votar: ");
            int posicionCandidato = scanner.nextInt();

            if (posicionCandidato == 0){
                return;
    
            }else if(posicionCandidato != 0){
                if (posicionCandidato > 0 && posicionCandidato <= listaCandidatos.size()) {

                    candidatoEncontrado = true;
                    listaCandidatos.get(posicionCandidato - 1).setsumarVotos();;
                    System.out.println("\nVoto Registrado para el Candidato " + listaCandidatos.get(posicionCandidato - 1).getNombre()+ ".");
                }else {
                    
                    System.out.println("\nPosición de Candidato NO Valida. Intente Nuevamente.");
                    //pp.esperarSegundos(1520);
                    //pp.limpiarPantalla();

                    for (int i = 0; i < listaCandidatos.size(); i++) {
                        System.out.println("\nCANDIDATO # " + (i + 1));
                        System.out.println(listaCandidatos.get(i));
                    }
                }
            }
        }
    }
    
    
    public void VotosTotales() {

        ArrayList<Candidato> listaCandidatos = InsertarPanel.getInscritos();

        System.out.println("-> VOTOS DE CADA CANDIDATO:\n");

        int maxVotos = Integer.MIN_VALUE;
        Candidato candidatoMasVotado = null;

        for (Candidato candidato : listaCandidatos) {

            System.out.println("   Candidato: " + candidato.getNombre() + ", Votos: " + candidato.getVotos());

            if (candidato.getVotos() > maxVotos) {
                maxVotos = candidato.getVotos();
                candidatoMasVotado = candidato;
            }
        }

        if (candidatoMasVotado != null) {
            System.out.println("\n-> CANDIDATO GANADOR\n");
            System.out.println("   " + candidatoMasVotado.getNombre() + " con " + maxVotos + " voto/s.\n");
            System.out.println("   Promesas: " + candidatoMasVotado.getPromesas());
        }else {
            System.out.println("NO hay Candidatos Registrados o NO se han Registrado Votos.");
        }
    }
}
