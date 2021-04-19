package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Objects;

public class Wolf extends Forest{

    private final String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        Forest.playersOfTheTale.remove(new LittleRedRidingHood("Piroska"));
        Forest.playersOfTheTale.remove(new Grandma("Nagymama"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(name, wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
