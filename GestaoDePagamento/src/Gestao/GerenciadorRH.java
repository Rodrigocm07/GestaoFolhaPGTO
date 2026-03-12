package Gestao;

import java.util.ArrayList;

public class GerenciadorRH {
    private ArrayList<Funcionario> funcionarios;

    public GerenciadorRH() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f); 
    }

    public Funcionario buscarPorCpf(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f.getCPF().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

    public boolean removerFuncionario(String cpf) {
        Funcionario f = buscarPorCpf(cpf);
        if (f != null) {
            funcionarios.remove(f);
            return true;
        }
        return false;
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public double calcularCustoTotal() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.CalcularPagamento(); 
        }
        return total;
    }
}