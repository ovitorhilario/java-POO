package org.cell.util;

public class Iphone implements Smartphone{

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public void showPage() {
        System.out.println("Abrindo a pagina");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void play() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando a musica");
    }

    @Override
    public void call() {
        System.out.println("Ligando");
    }

    @Override
    public void acceptCall() {
        System.out.println("Aceitando a ligacao");
    }

    @Override
    public void sendVoiceMail() {
        System.out.println("Encaminhando correio de voz");
    }
}
