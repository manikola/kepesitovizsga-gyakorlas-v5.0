package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.Objects;

public class LittleRedRidingHood extends Forest{

    private final String name;
    public static int cake = 10;

    public LittleRedRidingHood(String name) {
        this.name = name;
    }

    public static void giveCake(int pieces) {
        cake = cake - pieces;
    }

    @Override
    void eat() {
        this.cake = this.cake-1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LittleRedRidingHood)) return false;
        LittleRedRidingHood that = (LittleRedRidingHood) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
