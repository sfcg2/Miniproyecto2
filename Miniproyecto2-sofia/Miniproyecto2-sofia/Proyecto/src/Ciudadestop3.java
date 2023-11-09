import java.util.Arrays;
import java.util.Comparator;

public class Ciudadestop3{

    public Ciudadestop3(){};

    public void ciudadestop3(){

        CiudadOrigen[] listaCiudad = CiudadOrigen.values();
        Comparator<CiudadOrigen> comparadorC = Comparator.comparing(CiudadOrigen::getCont);
        Arrays.sort(listaCiudad,comparadorC);
        
        System.out.println("\n\n> TOP 3 DE CIUDADES CON MENOS CANDIDATOS\n");

        for(int i = 0; i<3; i++){
            System.out.println(" " + (i+1) + ". " + listaCiudad[i] + " con " + listaCiudad[i].getCont() + " Candidato/s." + "\n\n ++++++");
        }

        /*for(int i = listaCiudad.length - 1; i >= 40; i--){
            System.out.println(listaCiudad[i] +" "+ listaCiudad[i].getCont());
            //System.out.println(" " + (43-i) + ". " + listaCiudad[i] + " con " + listaCiudad[i].getCont() + " Candidatos.");
        }*/
    }

}
