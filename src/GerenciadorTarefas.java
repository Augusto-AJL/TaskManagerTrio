import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private final List<Tarefa> tarefas = new ArrayList<>();

    // Dev A
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    // Dev B
    public List<Tarefa> listarTarefas() {
        return new ArrayList<Tarefa>(tarefas);
    }

}
