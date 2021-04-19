package hu.nive.ujratervezes.kepesitovizsga.littleredridinghood;

import java.util.ArrayList;
import java.util.List;

public abstract class Forest {

    public static ArrayList<Forest> playersOfTheTale = new ArrayList<>(List.of(new LittleRedRidingHood("Piroska"), new Wolf("Farkas"), new Grandma("Nagymama"), new Hunter("Vadász")));



    abstract void eat();

}
