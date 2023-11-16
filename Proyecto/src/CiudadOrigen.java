public enum CiudadOrigen {
    
    Alcala(0), Andalucia(0), Ansermanuevo(0), Argelia(0), Bolivar(0), Buenaventura(0), 
    Buga(0), Bugalagrande(0), Caicedonia(0), Cali(0), Calima(0), Candelaria(0), Cartago(0), 
    Dagua(0), ElAguila(0), ElCairo(0), ElCerrito(0), ElDarien(0), ElDovio(0), Florida(0), 
    Ginebra(0), Guacari(0), Jamundi(0), LaCumbre(0), LaUnion(0), LaVictoria(0), Obando(0), 
    Palmira(0), Pradera(0), Restrepo(0), RioFrio(0), Roldanillo(0), SanPedro(0), Sevilla(0), 
    Toro(0), Trujillo(0), Tulua(0), Ulloa(0), Versalles(0), Vijes(0), Yotoco(0), Yumbo(0), 
    Zarzal(0);

    private int cont;

    private CiudadOrigen(int cont){
        this.cont = cont;
    }
    
    public int getCont() {
        return cont;
    }

    public void setCont() {
        cont++;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
