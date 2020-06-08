package com.github.sparsick.openapi.feign.bug.server.model;

public class OneOfFishMammal {

    private Fish fish;

    private Mammal mammal;

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    public Mammal getMammal() {
        return mammal;
    }

    public void setMammal(Mammal mammal) {
        this.mammal = mammal;
    }
}
