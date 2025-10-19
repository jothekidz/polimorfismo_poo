public class Suporte extends Funcionario {

    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return this.salarioBase + 200.00;
    }
}