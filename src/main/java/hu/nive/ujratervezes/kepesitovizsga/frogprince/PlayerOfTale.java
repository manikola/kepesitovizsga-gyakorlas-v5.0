package hu.nive.ujratervezes.kepesitovizsga.frogprince;

import java.util.Objects;

public class PlayerOfTale {

    private String name;
    private int age;
    private Tale tale;

    public PlayerOfTale(String name, int age, Tale tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Tale getTale() {
        return tale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerOfTale)) return false;
        PlayerOfTale that = (PlayerOfTale) o;
        return getAge() == that.getAge() && Objects.equals(getName(), that.getName()) && getTale() == that.getTale();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getTale());
    }
}
