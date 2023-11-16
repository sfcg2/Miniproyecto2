public class Candidato extends Ciudadano {

    private String ideologia; 
    private String partido_P;
    private String promesas;
    private int votos;
    
    public Candidato(){}; 
   
    public String getIdeologia() {
        return ideologia.toUpperCase();
    }

    public void setIdeologia(String idel) {
        this.ideologia = idel;
    }
    public String getPartido_P() {
        return partido_P.toUpperCase();
    }

    public void setPartido_P(String part) {
        this.partido_P = part;
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

    public void setCedula(String cc) {
        super.setCedula(cc);
    }
    @Override
    public void setCiudad(String cdad) {
        super.setCiudad(cdad);
    }
    @Override
    public void setNombre(String nom) {
        super.setNombre(nom);
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\nCédula: " + getCedula() + "\nCiudad: " + getCiudad()
        + "\nIdeología: " + getIdeologia() + "\nPartido Politico: " + getPartido_P() +"\nPromesas: " 
        + getPromesas() + "\nVotos: " + getVotos();
    
    }

    public String getPromesas() {
        return promesas.toUpperCase();
    }

    public void setPromesas(String prom) {
        this.promesas = prom;
    }

    public void setsumarVotos() {
        votos++;
        
    }

    public int getVotos() {
        return votos;
    }
    
}