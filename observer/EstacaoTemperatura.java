import java.util.ArrayList;
import java.util.List;

class EstacaoTemperatura implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperatura;

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservers();
    }

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(temperatura);
        }
    }
}