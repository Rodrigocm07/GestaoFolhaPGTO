package Gestao;

public class Assalariado extends Funcionario {

    private double Bonus;

    public Assalariado(String nome, String CPF, double salarioBase, double Bonus) {
        super(nome, CPF, salarioBase);
        this.Bonus = Bonus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Bônus: R$ %.2f | Total: R$ %.2f",
                Bonus, CalcularPagamento());
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        this.Bonus = bonus;
    }

    @Override
    public double CalcularPagamento() {
        return salarioBase + Bonus;
    }

}
