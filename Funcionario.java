public class Funcionario{
    
    private String cargo;
    private Ferramenta ferramenta;
    private Demanda demanda;
    
  

    public Funcionario(String cargo) {
        this.cargo = cargo;
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

    public void reaizarDemanda(Demanda demanda) {
        this.demanda = demanda;
    }
}