public class Candidato extends Ciudadano {

    private String ideologia; 
    private String partido_P;
    private String promesas;
    private int votos;

    public Candidato(){}; 
   
    public String getIdeologia() {
        return ideologia.toUpperCase();
    }
    public void setIdeologia() {
        System.out.print("Ideologia: ");
        ideologia = scanner.nextLine();
    }
    public String getPartido_P() {
        return partido_P.toUpperCase();
    }
    public void setPartido_P() {
        System.out.print("Partido Politico: ");
        partido_P = scanner.nextLine();
    }
    public String getPromesas() {
        return promesas.toUpperCase();
    }
    public void setPromesas() {
        System.out.print("Promesa: ");
        promesas = scanner.nextLine();
    }
    
    public int getVotos() {
        return votos;
    }
    public void setVotos() {
        votos++;
    }

    @Override
    public String getCedula() {
        return super.getCedula();
    }
    @Override
    public String getCiudad() {
        return super.getCiudad().toUpperCase();
    }
    @Override
    public String getNombre() {
        return super.getNombre().toUpperCase();
    }
    @Override
    public void setCedula() {
        super.setCedula();
    }
    @Override
    public void setCiudad() {
        super.setCiudad();
    }
    @Override
    public void setNombre() {
        super.setNombre();
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\nCedula: " + getCedula() + "\nCiudad: " + getCiudad()
        + "\nIdeologia: " + getIdeologia() + "\nPartido Politico: " + getPartido_P() +"\nPromesas: " 
        + getPromesas() + "\nVotos: " + getVotos();
    }

}


