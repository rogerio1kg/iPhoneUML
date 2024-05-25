package IphonePackage;

import IphonePackage.AparelhoTelefonico.AparelhoTelefonico;
import IphonePackage.NavegadorInternet.NavegadorInternet;
import IphonePackage.ReprodutorMusical.ReprodutorMusical;

public class FuncionalidadeAparelho implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    public void tocar() {
        System.out.println("Reproduzir Música.");
    }

    public void pausar() {
        System.out.println("Musica Pausada!");
    }

    public void selecionaMusica() {
        System.out.println("Selecione uma musica...");
    }


    public void ligar() {
        System.out.println("Ligando....");
    }

    public void atender() {
        System.out.println("Atender a Ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Chamando Correio de Voz.");
    }


    public void exibirPaginas() {
        System.out.println("Carregando as Páginas.");
    }

    public void adicionarNovaAba() {
        System.out.println("Abrir Uma Nova Aba no Navegador.");
    }

    public void fechaAba() {
        System.out.println("Aba do Navegador Finalizada.");
    }

    public void AtualizaAba() {
        System.out.println("Atualizando a página atual.");
    }
}
