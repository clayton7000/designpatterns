public class Main {

    public static void main(String[] args) {

        Luz luz = new Luz();

        Command ligar = new LigarLuzCommand(luz);
        Command desligar = new DesligarLuzCommand(luz);

        ControleRemoto controle = new ControleRemoto();

        controle.setCommand(ligar);
        controle.pressionarBotao();

        controle.setCommand(desligar);
        controle.pressionarBotao();
    }
}