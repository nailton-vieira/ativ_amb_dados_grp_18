
public class Main {
     Software n_gruposoft = new Software(" Atividade Final - Grupo 18 - Software House - v.1.0.1 ");
        System.out.println("****** " + n_gruposoft.getn_Software()+ "******" + "\n");
        System.out.println("<*****> Percentual de Contribuição por Profissional/Cargo no projeto Sofware House <*****>" + "\n");
        
    
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
