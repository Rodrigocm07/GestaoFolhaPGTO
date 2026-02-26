/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestao;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorRH {
    
    private List<Funcionario> funcionarios;
    
    public GerenciadorRH(){
        this.funcionarios = new ArrayList<>();
    }
    
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void listarFuncionario(){
        
        if(funcionarios.isEmpty()){
            System.out.println("Nenhum funcionario encontrado.");
            return;
        }
        
    double totalFolha = 0.0;
    
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println("-------------------");
            
            totalFolha += f.CalcularPagamento();
        }
        
        System.out.printf("Custo total da folha: R$ %.2f%n", totalFolha);
        
    }
}
