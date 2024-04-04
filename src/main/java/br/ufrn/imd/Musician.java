package br.ufrn.imd;

public class Musician extends Person {
    
    public boolean canImprovise;
    public boolean canCompose;
    public boolean playClassicalMusic;

    public Musician(String name, String hometown, boolean canImprovise, boolean canCompose, boolean playClassicalMusic) {
        super(name, hometown);
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
        this.playClassicalMusic = playClassicalMusic;
    }

    public boolean canImprovise() {
        return canImprovise;
    }

    public boolean canCompose() {
        return canCompose;
    }

    public boolean playClassicalMusic() {
        return playClassicalMusic;
    }

    public void play() {
    }
}
