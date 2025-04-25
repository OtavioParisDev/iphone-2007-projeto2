public class Iphone {

    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico aparelho;
    private NavegadorWeb navegador;

    public Iphone(ReprodutorMusical reprodutor, AparelhoTelefonico aparelho, NavegadorWeb navegador){
        this.reprodutor = reprodutor;
        this.aparelho = aparelho;
        this.navegador = navegador;
    }

    public void usarReprodutor(){
        reprodutor.playMusic();
        reprodutor.pauseMusic();
        reprodutor.selectMusic();
    }

    public void usarTelefone(){
        aparelho.Call();
        aparelho.Answer();
        aparelho.voiceMail();
    }

    public void usarNavegador(){
        navegador.showTab();
        navegador.addTab();
        navegador.refreshTab();
    }
}
