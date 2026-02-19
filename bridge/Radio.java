class Radio implements Dispositivo {

    private int volume = 5;

    @Override
    public void ligar() {
        System.out.println("Radio ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Radio desligado");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume do Radio: " + volume);
    }
}