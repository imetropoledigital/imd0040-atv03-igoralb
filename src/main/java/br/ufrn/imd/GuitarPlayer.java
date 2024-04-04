package br.ufrn.imd;

public class GuitarPlayer extends Musician {
    public int howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;

    public GuitarPlayer(String name, String hometown, boolean canImprovise, boolean canCompose, boolean playClassicalMusic,
                        int howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar) {
        super(name, hometown, canImprovise, canCompose, playClassicalMusic);
        this.howManyYears = howManyYears;
        this.playEletronicGuitar = playEletronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }

    public int getHowManyYears() {
        return howManyYears;
    }

    public boolean playEletronicGuitar() {
        return playEletronicGuitar;
    }

    public boolean playAcousticGuitar() {
        return playAcousticGuitar;
    }

    public void playGuitar() {
    
    }
}
