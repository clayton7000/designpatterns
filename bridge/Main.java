public class Main {

    public static void main(String[] args) {

        Dispositivo tv = new TV();
        ControleRemoto controleTV = new ControleRemoto(tv);

        controleTV.ligar();
        controleTV.aumentarVolume();

        System.out.println("-----");

        Dispositivo radio = new Radio();
        ControleRemotoAvancado controleRadio = new ControleRemotoAvancado(radio);

        controleRadio.ligar();
        controleRadio.mute();
        controleRadio.desligar();
    }
}