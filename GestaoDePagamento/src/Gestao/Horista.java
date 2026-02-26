package Gestao;

public class Horista extends Funcionario {

    private double ValorHora = 4.50;
    private double HorasTrabalhadas;

    public Horista(double HorasTrabalhadas, String nome, String CPF, double salarioBase) {
        super(nome, CPF, salarioBase);
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    @Override
    public double CalcularPagamento() {
        return ValorHora * HorasTrabalhadas;
    }

}
