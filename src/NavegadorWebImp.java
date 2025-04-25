public class NavegadorWebImp implements NavegadorWeb {
    @Override
    public void showTab() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void addTab() {
        System.out.println("Adicionando Página");
    }

    @Override
    public void refreshTab() {
        System.out.println("Atualizando Página");
    }
}
