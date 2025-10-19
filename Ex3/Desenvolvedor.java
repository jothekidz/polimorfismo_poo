public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase + (this.salarioBase * 0.10);
    }
}