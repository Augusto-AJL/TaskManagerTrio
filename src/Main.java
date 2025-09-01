import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas manager = new GerenciadorTarefas();
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("=== TaskManagerTrio ===");
            System.out.println("1) Adicionar tarefa");
            System.out.println("2) Listar tarefas");
            System.out.println("3) Remover tarefa");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            int op = Integer.parseInt(sc.nextLine());
        }

        switch (op) {
            case 1:
                System.out.print("Digite a descrição da tarefa: ");
                String desc = sc.nextLine();
                manager.adicionarTarefa(desc);
                System.out.println("Tarefa adicionada!");
            break;
        }
        case 2:
                List<Tarefa> lista = manager.listarTarefas();
                if (lista.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ") " + lista.get(i));
                    }
                }
        break;
    }
}
