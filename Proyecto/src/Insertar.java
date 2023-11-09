import java.util.ArrayList;
import java.util.Scanner;

public class Insertar {

    private static ArrayList<Candidato> inscritos = new ArrayList<>(); 
    
    Scanner scanner = new Scanner(System.in);
    App pp = new App();
    
    public Insertar(){};

    public void insertar(){
        
        Candidato candidato = new Candidato();

        boolean val = false;

        candidato.setNombre();
        if (candidato.getNombre().equals("0")){
            return;

        }else if(candidato.getNombre() != "0"){
            
            candidato.setCedula();
            
            for(int i = 0; i<inscritos.size(); i++){ 
                
                if(candidato.getCedula().equals(inscritos.get(i).getCedula())){
                    val = true;
                    System.out.println("-> Candidato Existente");
                    System.out.println("  Ingrese los datos nuevamente.");
                    //pp.esperarSegundos(1700);
                    //pp.limpiarPantalla();
                    insertar();
                }

            }if(val == false){  

                boolean val1 = false;

                while(val1 == false){
                    candidato.setCiudad();

                    for (CiudadOrigen cor : CiudadOrigen.values()){
                        
                        if(candidato.getCiudad().equals(cor.name().toUpperCase())){
                            val1 = true;
                            cor.setCont();
                            break;
                        }
                    }if(val1 == false){
                        System.out.println("\n-> Valido solo para Ciudades del Valle del Cauca");
                        System.out.println("   Vuelva a Ingresar la Ciudad.\n");
                        //pp.esperarSegundos(1700);
                        //pp.limpiarPantalla();
                    }
                }

                boolean val3 = false;

                while(val3 == false){
                    candidato.setIdeologia();
            
                    if(candidato.getIdeologia().equalsIgnoreCase("DERECHA")){
                        
                        candidato.setPartido_P();
                
                        for (PartidoDer pd : PartidoDer.values()){

                            if(candidato.getPartido_P().equals(pd.name().toUpperCase())){
                                val3 = true;
                                candidato.setPromesas();
                                pd.setSumaDr();
                                inscritos.add(candidato);
                                break;
                            }
                        }if(val3 == false){
                            System.out.println("\n-> Partido NO Valido");
                            System.out.println("   Vuelva a ingresar ideologia + partido.\n");
                            //pp.esperarSegundos(1700);
                            //pp.limpiarPantalla(); 
                        }             
                    }else if(candidato.getIdeologia().equalsIgnoreCase("IZQUIERDA")){

                        candidato.setPartido_P();

                        for (PartidoIzq pz : PartidoIzq.values()){

                            if(candidato.getPartido_P().toUpperCase().equals(pz.name().toUpperCase())){
                                val3 = true;
                                candidato.setPromesas();
                                pz.setSumaIz();
                                inscritos.add(candidato);
                                break;  
                            }
                        }if(val3 == false){
                            System.out.println("\n-> Partido NO Valido");
                            System.out.println("   Vuelva a ingresar ideologia + partido.\n");
                            //pp.esperarSegundos(1700);
                            //pp.limpiarPantalla(); 
                        }
                    }else{
                        System.out.println("\n-> IDEOLOGIAS VALIDAS -> Derecha o Izquierda.\n");
                        //pp.esperarSegundos(1650);
                        //pp.limpiarPantalla();
                        
                    }
                }
            } 
        }
    }
    
    public static ArrayList<Candidato> getInscritos() {
        return inscritos;
    }

}




    