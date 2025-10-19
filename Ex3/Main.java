public class Main {
    public static void main(String[] args) {
        
        Funcionario dev = new Desenvolvedor(3000.00);
        Funcionario sup = new Suporte(2000.00);

        System.out.println("Salário Final Desenvolvedor: R$ " + dev.calcularSalarioFinal());
        System.out.println("Salário Final Suporte: R$ " + sup.calcularSalarioFinal());
    }
}