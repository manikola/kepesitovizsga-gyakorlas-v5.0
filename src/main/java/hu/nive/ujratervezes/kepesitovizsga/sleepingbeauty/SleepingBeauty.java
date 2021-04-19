package hu.nive.ujratervezes.kepesitovizsga.sleepingbeauty;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SleepingBeauty {

    public Map<Character, Integer> countCharacters(String fileName) {
        Map<Character, Integer> results = new LinkedHashMap<>();
        List<Character> chars = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/" + fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                char[] arr = line.toLowerCase().toCharArray();
                for (char item : arr) {
                    if (Character.isAlphabetic(item)) {
                        chars.add(item);
                    }
                }
            }
            createMap(results, chars);



        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return results;
    }

    private void createMap(Map<Character, Integer> results, List<Character> chars) {
        for (char c : chars) {
            if (!results.containsKey(c)) {
                results.put(c, 0);
            }
            results.put(c, results.get(c) + 1);
        }
    }

}
