class CaractereConcreto implements Caractere {

    private char simbolo; // estado intrínseco (compartilhado)

    public CaractereConcreto(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public void mostrar(int linha, int coluna) {
        System.out.println(
            "Caractere: " + simbolo +
            " Linha: " + linha +
            " Coluna: " + coluna
        );
    }
}