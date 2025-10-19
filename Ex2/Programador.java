public class Programador extends Funcionario {

    public Programador(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + (salarioBase * 0.20);
    }
}