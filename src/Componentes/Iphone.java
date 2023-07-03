package Componentes;

import java.security.PublicKey;

public abstract class Iphone implements ReprodutorMusical, Navegador, Celular {
    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        // Implementação para tocar música
        System.out.println("Musica iniciada");
    }
    public void pausar() {
        // Implementação para pausar música
        System.out.println("Musica pausada");
    }

    public void selecionarMusica() {
        // Implementação para selecionar música
        System.out.println("Selecione sua musica:");
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        // Implementação para exibir página
        System.out.println(url);
    }
    public void adicionarNovaAba(String url) {
        // Implementação para adicionar nova aba
       String novaUrl = url;
        System.out.println(novaUrl);
    }
    public void atualizarPagina() {
        // Implementação para atualizar página
        System.out.println("Página atualizada");
    }

    // Implementação dos métodos da interface AparelhoTelefonico

    public void ligar() {
        // Implementação para ligar
        System.out.println("Ligando para contato");
    }
    public void atender() {
        // Implementação para atender
        System.out.println("Ligação atendida com sucesso!");
    }
    public void iniciarCorrerioDeVoz() {
        // Implementação para iniciar correio de voz
        System.out.println("pressione o botão play para iniciar o correio de voz");
    }

    // Métodos específicos da classe iPhone

    public void  desbloquear() {
        // Implementação para desbloquear
        System.out.println("Celular desbloqueado");
    }

    public boolean desligarIphone(boolean choice) {
        System.out.println("Desligando Iphone");
        return true;
    }

    public boolean ligarIphone(boolean choice) {
        System.out.println("Ligando Iphone");
        return true;
    }

    public void isLigado() {
        if (ligarIphone(true)) {
            System.out.println("Ligado");
        } else {
            System.out.println("Desligado");
        }
    }
}
