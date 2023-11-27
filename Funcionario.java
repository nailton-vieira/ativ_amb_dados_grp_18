public class Funcionario{
    public static int contador = 0 ;

    private String cargo;
    private Ferramenta ferramenta;
    private Demanda demanda;
    
    public Funcionario(String cargo) {
        this.cargo = cargo;
        ++ contador;
    }

    public String getCargo() {
        return this.cargo;
    }
    
    public Ferramenta getFerramenta() {
        return this.ferramenta;
    }
    
    public void escolherFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Demanda getDemanda() {
        return this.demanda;
    }

    public void reaizarDemanda(Demanda demanda) {
        this.demanda = demanda;
    }

    @Override
	protected void finalize() throws Throwable {
		--contador;
    }

}
