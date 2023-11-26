
public class Main {
    
        Ferramenta ide = new Ferramenta("VSCode");
        Ferramenta photoshop = new Ferramenta("AutoCad");
        Ferramenta MOffice = new Ferramenta("Excel");
        Ferramenta SGBDs = new Ferramenta("MySQL");
        Ferramenta totvs = new Ferramenta("Financeiro");

        programador.escolherFerramenta(ide);
        designer.escolherFerramenta(photoshop);
        administrativo.escolherFerramenta(MOffice);
        DBA.escolherFerramenta(SGBDs);
        gerente.escolherFerramenta(totvs);

        // Cada funcionário escolhe sua ferramenta


    public static void calcularPorcentagem(Funcionario funcionario) {
        if (funcionario.getFerramenta() != null) {
            System.out.println("Cargo: " + funcionario.getCargo() + " - Ferramenta Escolhida: " + funcionario.getFerramenta().getNome()+ " - Ok");
            
        } else {
            System.out.println(funcionario.getCargo() + " ainda não escolheu uma ferramenta.");
        }
    }
    
}
