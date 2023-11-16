import java.util.ArrayList;

public class PMasC{

    public PMasC(){};

    public void pMasC(){

        ArrayList<Candidato> listaC = Eliminar.getListaC2(); 
        
        int contDr = 0;
        int contIz = 0;

        for (PartidoDer pd : PartidoDer.values()){

            contDr = contDr + pd.getSumaDr();    

        }if(contDr != listaC.size()){
            contDr = contDr - 1;}
        

        for (PartidoIzq pz : PartidoIzq.values()){

            contIz = contIz + pz.getSumaIz();

        }if(contIz != listaC.size()){
            contIz = contIz - 1;}


        if (contDr > contIz){

            Interfazz.getArea().append("\n\n-> PARTIDO CON MÁS CANDIDATOS -> Partido de Derecha\n");
            Interfazz.getArea().append("  Con Un Total De " + contDr + " Candidato/s.\n");
        }

        else if (contDr < contIz){

            Interfazz.getArea().append("\n\n-> PARTIDO CON MÁS CANDIDATOS -> El Partido de Izquierda\n");
            Interfazz.getArea().append("  Con Un Total De " + contIz + "Candidato/s.\n");

        }else if(contDr == contIz){

            Interfazz.getArea().append("\n\n-> PARTIDOS EMPATADOS\n");
            Interfazz.getArea().append("  Con Un Total De " + contIz + " Candidatos En Cada Partido.\n");   
        }
    }
}
