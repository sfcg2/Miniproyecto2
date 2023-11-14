public class Candidato extends Ciudadano {

    private String ideologia; 
    private String partido_P;
    private String promesas;
    private int votos;
    
    public Candidato(){}; 
   
    public String getIdeologia() {
        return ideologia.toUpperCase();
    }
<<<<<<< HEAD
    public void setIdeologia() {
        System.out.print("Ideologia: ");
        ideologia = scanner.nextLine();
=======
    public void setIdeologia(String idel) {
        this.ideologia = idel;
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a
    }
    public String getPartido_P() {
        return partido_P.toUpperCase();
    }
<<<<<<< HEAD
    public void setPartido_P() {
        System.out.print("Partido Politico: ");
        partido_P = scanner.nextLine();
=======
    public void setPartido_P(String part) {
        this.partido_P = part;
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a
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
<<<<<<< HEAD
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
=======
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
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\nCedula: " + getCedula() + "\nCiudad: " + getCiudad()
        + "\nIdeologia: " + getIdeologia() + "\nPartido Politico: " + getPartido_P() +"\nPromesas: " 
        + getPromesas();
    }

    public String getPromesas() {
        return promesas.toUpperCase();
    }

<<<<<<< HEAD
    public void setPromesas() {
        System.out.print("Promesa: ");
        promesas = scanner.nextLine();
=======
    public void setPromesas(String prom) {
        this.promesas = prom;
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a
    }

    public void setsumarVotos() {
        votos++;
        
    }

    public int getVotos() {
        return votos;
    }

}