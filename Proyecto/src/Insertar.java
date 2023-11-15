import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Insertar {

    public static ArrayList<Candidato> inscritos = new ArrayList<>(); 
    
    App pp = new App();
    
    public Insertar(){};

    public void insertar(){
        
        Candidato candidato = new Candidato();
        String nom = Interfazz.getNom();
        String cc = Interfazz.getCC();
        

        boolean val = false;

        candidato.setNombre(nom);
        
        candidato.setCedula(cc);
            
        for(int i = 0; i<inscritos.size(); i++){ 
            
            if(candidato.getCedula().equals(inscritos.get(i).getCedula())){
                val = true;
                JOptionPane.showMessageDialog(Interfazz.getwidth(), "Cedula existente, ingresela nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
                //System.out.println("-> Candidato Existente");
                //System.out.println("  Ingrese los datos nuevamente.");
                //pp.esperarSegundos(1700);
                //pp.limpiarPantalla();
                //insertar();
            }

        }if(val == false){  

            boolean val1 = false;
            String cdad = Interfazz.getCdad();

            while(val1 == false){

                candidato.setCiudad(cdad);

                for (CiudadOrigen cor : CiudadOrigen.values()){
                    
                    if(candidato.getCiudad().equals(cor.name().toUpperCase())){
                        val1 = true;
                        cor.setCont();
                        break;
                    }
                }if(val1 == false){
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "Valido solo para Ciudades del Valle del Cauca, ingresela nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                    //System.out.println("   Vuelva a Ingresar la Ciudad.\n");
                    
                }
            }

            boolean val3 = false;
            String idel = Interfazz.getIdel();

            while(val3 == false){
                candidato.setIdeologia(idel);
                String part = Interfazz.getPart();
                String prom = Interfazz.getProm();

                if(candidato.getIdeologia().equalsIgnoreCase("DERECHA")){
                    
                    candidato.setPartido_P(part);
            
                    for (PartidoDer pd : PartidoDer.values()){

                        if(candidato.getPartido_P().equals(pd.name().toUpperCase())){
                            val3 = true;
                            candidato.setPromesas(prom);
                            pd.setSumaDr();
                            inscritos.add(candidato);
                            JOptionPane.showMessageDialog(Interfazz.getwidth(), "Candidato Inscrito", "INFO", JOptionPane.INFORMATION_MESSAGE);  
                            break;
                        }
                    }if(val3 == false){
                        JOptionPane.showMessageDialog(Interfazz.getwidth(), "Partido NO Valido, ingreselo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;
                        //System.out.println("\n-> Partido NO Valido");
                        //System.out.println("   Vuelva a ingresar ideologia + partido.\n");
                        
                    }             
                }else if(candidato.getIdeologia().equalsIgnoreCase("IZQUIERDA")){

                    candidato.setPartido_P(part);

                    for (PartidoIzq pz : PartidoIzq.values()){

                        if(candidato.getPartido_P().toUpperCase().equals(pz.name().toUpperCase())){
                            val3 = true;
                            candidato.setPromesas(prom);
                            pz.setSumaIz();
                            inscritos.add(candidato);
                            break;  
                        }
                    }if(val3 == false){
                        JOptionPane.showMessageDialog(Interfazz.getwidth(), "Partido NO Valido, ingreselo nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return;
                        //System.out.println("\n-> Partido NO Valido");
                        //System.out.println("   Vuelva a ingresar ideologia + partido.\n");
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(Interfazz.getwidth(), "IDEOLOGIAS VALIDAS -> Derecha o Izquierda", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                    //System.out.println("\n-> IDEOLOGIAS VALIDAS -> Derecha o Izquierda.\n");
                    
                    
                }
            }
        } 
    }

    public static ArrayList<Candidato> getInscritos() {
        return inscritos;
    }

}
