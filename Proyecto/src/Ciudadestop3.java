import java.util.Arrays;
import java.util.Comparator;

public class Ciudadestop3{

    public Ciudadestop3(){};

    public void ciudadestop3(){

        CiudadOrigen[] listaCiudad = CiudadOrigen.values();
        Comparator<CiudadOrigen> comparadorC = Comparator.comparing(CiudadOrigen::getCont);
        Arrays.sort(listaCiudad,comparadorC);
        
        Interfazz.getArea().append("\n-> TOP 3 DE CIUDADES CON MENOS CANDIDATOS\n");

        for(int i = 0; i<3; i++){
            Interfazz.getArea().append(" " + (i+1) + ". " + listaCiudad[i] + " con " + listaCiudad[i].getCont() + " Candidato/s." + "\n");
            
        }

    }

}
