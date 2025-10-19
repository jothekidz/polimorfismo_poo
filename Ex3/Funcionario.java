public abstract class Funcionario {
    
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();
}