public class ReprodutorMusicalImp implements ReprodutorMusical{
    @Override
    public void playMusic() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando Música");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando Música");
    }
}
