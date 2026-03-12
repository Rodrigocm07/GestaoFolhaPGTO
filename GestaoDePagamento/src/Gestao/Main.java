package Gestao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorRH rh = new GerenciadorRH();
        int op = -1;

        while (op != 0) {
            System.out.println("\n=== SISTEMA DE GESTÃO ===");
            System.out.println("1- Menu Assalariado\n2- Menu Horista\n3- Listar Tudo\n0- Sair");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> { 
                    System.out.println("1- Adicionar | 2- Editar | 0- Voltar");
                    int sub = sc.nextInt(); sc.nextLine();
                    switch (sub) {
                        case 1 -> {
                            System.out.print("Nome: "); String n = sc.nextLine();
                            System.out.print("CPF: "); String c = sc.nextLine();
                            System.out.print("Salário: "); double s = sc.nextDouble();
                            System.out.print("Bónus: "); double b = sc.nextDouble();
                            rh.adicionarFuncionario(new Assalariado(n, c, s, b));
                        }
                        case 2 -> {
                            System.out.print("CPF para editar: "); String cpf = sc.nextLine();
                            Funcionario f = rh.buscarPorCpf(cpf);
                            if (f instanceof Assalariado a) {
                                System.out.print("Novo Nome: "); a.setNome(sc.nextLine());
                                System.out.print("Novo Salário: "); a.setSalarioBase(sc.nextDouble());
                                System.out.print("Novo Bónus: "); a.setBonus(sc.nextDouble());
                                System.out.println("Atualizado!");
                            } else { System.out.println("Assalariado não encontrado."); }
                        }
                    }
                }
                case 2 -> { 
                    System.out.println("1- Adicionar | 2- Editar | 0- Voltar");
                    int sub = sc.nextInt(); sc.nextLine();
                    switch (sub) {
                        case 1 -> {
                            System.out.print("Nome: "); String n = sc.nextLine();
                            System.out.print("CPF: "); String c = sc.nextLine();
                            System.out.print("Valor/Hora: "); double v = sc.nextDouble();
                            System.out.print("Horas: "); int h = sc.nextInt();
                            rh.adicionarFuncionario(new Horista(n, c, v, h));
                        }
                        case 2 -> {
                            System.out.print("CPF para editar: "); String cpf = sc.nextLine();
                            Funcionario f = rh.buscarPorCpf(cpf);
                            if (f instanceof Horista h) {
                                System.out.print("Novo Nome: "); h.setNome(sc.nextLine());
                                System.out.print("Novo Valor/Hora: "); h.setValorHora(sc.nextDouble());
                                System.out.print("Novas Horas: "); h.setHorasTrabalhadas(sc.nextInt());
                                System.out.println("Atualizado!");
                            } else { System.out.println("Horista não encontrado."); }
                        }
                    }
                }
                case 3 -> {
                    rh.listarFuncionarios();
                    System.out.println("Custo Total: R$ " + rh.calcularCustoTotal());
                }
            }
        }
    }
}