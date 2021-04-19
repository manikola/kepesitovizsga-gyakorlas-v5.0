package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Objects;

public class Hunter extends Forest{
    private final String name;

    public Hunter(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        Forest.playersOfTheTale.remove(new Wolf("Farkas"));
        Forest.playersOfTheTale.add(new Grandma("Nagymama"));
        Forest.playersOfTheTale.add(new LittleRedRidingHood("Piroska"));

        LittleRedRidingHood.giveCake(3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hunter)) return false;
        Hunter hunter = (Hunter) o;
        return Objects.equals(name, hunter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
