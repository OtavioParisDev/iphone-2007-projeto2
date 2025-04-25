public class AparelhoTelefonicoImp implements AparelhoTelefonico{
    @Override
    public void Call() {
        System.out.println("Ligando");
    }

    @Override
    public void Answer() {
        System.out.println("Atendendo");
    }

    @Override
    public void voiceMail() {
        System.out.println("Correio de voz");
    }
}
