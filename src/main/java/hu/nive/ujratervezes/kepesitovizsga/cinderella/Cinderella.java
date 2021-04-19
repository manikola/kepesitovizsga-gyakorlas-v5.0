package hu.nive.ujratervezes.kepesitovizsga.cinderella;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cinderella {

    private final String[] NAMES = {"Hamupipőke", "galamb", "királyfi", "mostoha", "cipő"};
    private int[] counter = new int[5];

    public int[] getNumbers() {
        return counter;
    }

    public void readFromFile(){
        try(BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/cinderella/cinderella.txt"))) {
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split(" ");
                for (String item : words) {
                    for (int i = 0; i < 5; i++) {
                        if (item.toLowerCase().contains(NAMES[i].toLowerCase())) {
                            counter[i]++;
                        }
                    }
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public Object[] getMax() {
        Object[] result = new Object[2];
        result[1] = 0;
        for (int i = 0; i < 5; ++i) {
            if (counter[i] > (int) result[1]) {
                result[0] = NAMES[i];
                result[1] = counter[i];
            }
        }
        return result;
    }


}
