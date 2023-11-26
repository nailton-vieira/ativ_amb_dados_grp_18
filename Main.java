
public class Main {
     Software n_gruposoft = new Software(" Atividade Final - Grupo 18 - Software House - v.1.0.1 ");
        System.out.println("****** " + n_gruposoft.getn_Software()+ "******" + "\n");
        System.out.println("<*****> Percentual de Contribuição por Profissional/Cargo no projeto Sofware House <*****>" + "\n");
        
    
    public static void calcularPorcentagem(Funcionario funcionario) {
        if (funcionario.getFerramenta() != null) {
            System.out.println("Cargo: " + funcionario.getCargo() + " - Ferramenta Escolhida: " + funcionario.getFerramenta().getNome()+ " - Ok");
            
        } else {
            System.out.println(funcionario.getCargo() + " ainda não escolheu uma ferramenta.");
        }
    }
    
}
