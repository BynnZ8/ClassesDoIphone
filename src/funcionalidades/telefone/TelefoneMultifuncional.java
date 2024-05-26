package funcionalidades.telefone;

import funcionalidades.aparelhotelefonico.AparelhoTelefonicoInterface;
import funcionalidades.navegadordeinternet.NavegadorDeInternetInterface;
import funcionalidades.reprodutormusical.ReprodutorMusicalInterface;

public class TelefoneMultifuncional implements AparelhoTelefonicoInterface, ReprodutorMusicalInterface, NavegadorDeInternetInterface{

    public void exibirPagina() {
        System.out.println("Exibindo pagina via TelefoneMultifuncional");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via TelefoneMultifuncional");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina via TelefoneMultifuncional");
    }
    public void tocar() {
        System.out.println("Tocando Musica via TelefoneMultifuncional");
    }
    public void pausar() {
        System.out.println("Pausando musica via TelefoneMultifuncional");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica via TelefoneMultifuncional");
    }
    public void ligar() {
        System.out.println("Ligando via TelefoneMultifuncional");
    }
    public void atender() {
        System.out.println("Atendendo via TelefoneMultifuncional");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via TelefoneMultifuncional");
    }

}
