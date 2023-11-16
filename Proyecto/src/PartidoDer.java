public enum PartidoDer {
    
    SalvaciónNacional(0), NuevaFuerzaDemocratica(0), CentroDemocratico(0),
    ColombiaJustayLibres(0), PartidoConservador(0), Creemos(0), Mira(0);

    private int sumaDr;

    private PartidoDer(int sumaDr){
        this.sumaDr = sumaDr;
    }

    public int getSumaDr() {
        return sumaDr;
    }

    public void setSumaDr() {
        sumaDr++;
    }

    @Override
    public String toString() {
        return super.toString();
    
    }
}

