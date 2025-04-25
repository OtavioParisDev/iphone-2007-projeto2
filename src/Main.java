public class Main {
    public static void main(String[] args) {
        Iphone i = new Iphone(
                                new ReprodutorMusicalImp(),
                                new AparelhoTelefonicoImp(),
                                new NavegadorWebImp());

        i.usarReprodutor();
        i.usarTelefone();
        i.usarNavegador();
    }
}