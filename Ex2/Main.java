public class Main {
    public static void main(String[] args) {
        
        Funcionario[] listaDePagamento = {
            new Gerente("Samara Souza", "111.222.333-44"),
            new Programador("Marcia Pantoja", "555.666.777-88")
        };

        for (Funcionario f : listaDePagamento) {
            System.out.println("funcionário: " + f.getNome());
            System.out.println("salário a Pagar: R$ " + f.calcularSalario());
            System.out.println("--------------------");
        }
    }
}