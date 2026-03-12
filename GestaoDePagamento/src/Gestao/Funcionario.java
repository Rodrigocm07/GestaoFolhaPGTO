package Gestao;

public abstract class Funcionario {

    protected String nome;
    protected String CPF;
    protected double salarioBase;

    public Funcionario(String nome, String CPF, double salarioBase) {
        this.nome = nome;
        this.CPF = CPF;
        this.salarioBase = salarioBase;
    }

    public abstract double CalcularPagamento();

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Salário Base: R$ %.2f",
                nome, CPF, salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
