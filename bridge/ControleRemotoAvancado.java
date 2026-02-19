class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mute() {
        dispositivo.setVolume(0);
        System.out.println("Mute ativado");
    }
}