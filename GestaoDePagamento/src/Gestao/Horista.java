package Gestao;

public class Horista extends Funcionario {

    private double ValorHora = 4.50;
    private double HorasTrabalhadas;

    public Horista(String nome, String CPF, double salarioBase, double HorasTrabalhadas) {
        super(nome, CPF, salarioBase);
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Valor/Hora: R$ %.2f | Horas: %d | Total: R$ %.2f",
                ValorHora, HorasTrabalhadas, CalcularPagamento());
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }

    public double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(double HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }
    
    @Override
    public double CalcularPagamento() {
        return ValorHora * HorasTrabalhadas;
    }

}
