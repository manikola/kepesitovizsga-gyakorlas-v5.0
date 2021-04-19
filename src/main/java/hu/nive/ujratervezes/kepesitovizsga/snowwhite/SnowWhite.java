package hu.nive.ujratervezes.kepesitovizsga.snowwhite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SnowWhite {

    private List<Dwarf> sevenDwarfs = new ArrayList<>();

    public SnowWhite(List<Dwarf> dwarfList) {
        this.sevenDwarfs = dwarfList;
    }

    public List<Dwarf> getSevenDwarfs() {
        return new ArrayList<>(sevenDwarfs);
    }

    public List<Dwarf> getSevenDwarfsOrderedByNames(){
        List<Dwarf> alphabetical = new ArrayList<>();
        sevenDwarfs.sort(Comparator.comparing(Dwarf::getName));
        for(Dwarf item : sevenDwarfs){
            alphabetical.add(item);
        }
        return alphabetical;
    }

    public List<Dwarf> getSevenDwarfsOrderedByAges(){
        List<Dwarf> byAge = new ArrayList<>();
        sevenDwarfs.sort(Comparator.comparing(Dwarf::getAge));
        for(Dwarf item : sevenDwarfs){
            byAge.add(item);
        }
        return byAge;
    }
}
