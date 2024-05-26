package funcionalidades.reprodutormusical;

public class ReprodutorMusical implements ReprodutorMusicalInterface{
    public void tocar() {
        System.out.println("Tocando...");
    }
    public void pausar() {
        System.out.println("Pausando");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}
