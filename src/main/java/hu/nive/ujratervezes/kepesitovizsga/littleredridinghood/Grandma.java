package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Objects;

public class Grandma extends Forest{

    private final String name;

    public Grandma(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        LittleRedRidingHood.giveCake(2);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grandma)) return false;
        Grandma grandma = (Grandma) o;
        return Objects.equals(name, grandma.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
