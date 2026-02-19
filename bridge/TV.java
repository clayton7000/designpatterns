class TV implements Dispositivo {

    private int volume = 10;

    @Override
    public void ligar() {
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume da TV: " + volume);
    }
}