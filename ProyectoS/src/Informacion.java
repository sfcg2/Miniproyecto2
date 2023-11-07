import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Informacion {
    
    public Informacion(){};

    public void info(){

        // 1. Qué candidato ganó, su nombre y cédula

        ArrayList<Candidato> listaC = Insertar.getInscritos(); 

        int mayor = listaC.get(0).getVotos();

        System.out.println(" I N F O R M A C I O N\n");

        for(int i = 0; i<listaC.size(); i++){
            
            if(listaC.get(i).getVotos() > mayor && listaC.get(i).getVotos() > 0){
                
                mayor = listaC.get(i).getVotos();
                System.out.println("> CANDIDATO GANADOR\n");
                System.out.println("Nombre: " + listaC.get(i).getNombre());
                System.out.println("Cedula: " + listaC.get(i).getCedula());
                System.out.println("Votos Totales: " + listaC.get(i).getVotos());
                System.out.println("Propuestas: " + listaC.get(i).getPromesas()); // 2. Promesas del Candidato
                
            }else if(listaC.get(i).getVotos() == mayor){
                System.out.println("> NO HAY CANDIDATO GANADOR");
                break;

            }
        }

        // 3. Que partido tiene más candidatos inscritos

        int contDr = 0;
        int contIz = 0;

        for (PartidoDer pd : PartidoDer.values()){

            contDr = contDr + pd.getSumaDr();
            
        }

        for (PartidoIzq pz : PartidoIzq.values()){

            contIz = contIz + pz.getSumaIz();
            
        }

        if (contDr > contIz){

            System.out.println("\n\n> PARTIDO CON MAS CANDIDATOS -> Partido de Derecha\n");
            System.out.println("  Con un Total de " + contDr + " Candidato/s.");
        }

        else if (contDr < contIz){

            System.out.println("\n\n> El Partido Con Mas Candidatos Es -> El Partido de Izquierda\n");
            System.out.println("  Con Un Total De " + contIz + ".");

        }else if(contDr == contIz){

            System.out.println("\n\n> PARTIDOS EMPATADOS");
            System.out.println("Con Un Total De " + contIz + " Candidatos En Cada Partido.\n");
        }


        // 4. El top 3 de las ciudades que menos candidatos tienen esa ciudad como ciudad de origen

        
        CiudadOrigen[] listaCiudad = CiudadOrigen.values();
        Comparator<CiudadOrigen> comparadorC = Comparator.comparing(CiudadOrigen::getCont);
        Arrays.sort(listaCiudad,comparadorC);
        
        System.out.println("\n\n> TOP 3 DE CIUDADES CON MENOS CANDIDATOS\n");

        for(int i = 0; i<3; i++){
            System.out.println(" " + (i+1) + ". " + listaCiudad[i] + " con " + listaCiudad[i].getCont() + " Candidato/s." + "\n");
        }

        /*for(int i = listaCiudad.length - 1; i >= 40; i--){
            System.out.println(" " + (43-i) + ". " + listaCiudad[i] + " con " + listaCiudad[i].getCont() + " Candidatos.");
        }*/
    }

}
