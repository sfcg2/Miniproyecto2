public enum PartidoIzq {
    
    Mais(0), Aico(0), ColombiaHumana(0), EsperanzaDemocratica(0), PoloDemocratico(0), PartidoComunes(0), 
    PartidoComunista(0), PartidodelTrabajo(0), DignidadyCompromiso(0), UP(0), TodosSomosColombia(0);
    
    private int sumaIz;

    private PartidoIzq(int sumaIz){
        this.sumaIz = sumaIz;
    }

    public int getSumaIz() {
        return sumaIz;
    }

    public void setSumaIz() {
        sumaIz++;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}