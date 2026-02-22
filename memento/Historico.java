import java.util.Stack;
class Historico {

    private Stack<Memento> historico = new Stack<>();

    public void salvar(Memento memento) {
        historico.push(memento);
    }

    public Memento desfazer() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }
        return null;
    }
}