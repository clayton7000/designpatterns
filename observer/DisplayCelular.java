class DisplayCelular implements Observer {

    private String nome;

    public DisplayCelular(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(float temperatura) {
        System.out.println(nome + " recebeu temperatura: " + temperatura + "°C");
    }
}