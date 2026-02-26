package Gestao;

public class Assalariado extends Funcionario {

    private double Bonus;

    public Assalariado(double Bonus, String nome, String CPF, double salarioBase) {
        super(nome, CPF, salarioBase);
        this.Bonus = Bonus;
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
