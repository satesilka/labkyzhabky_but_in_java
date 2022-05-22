package com.satesilka.lab7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Regex {
    private String text;

    public Regex(String text) {
        this.text = text;
    }

    public List<String> getWords() {
        List<String> words = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (matcher.group().matches("\\b[aouieAOUIE]\\w+")) {
                words.add(matcher.group());
            }
        }

        return words;
    }

    public List<String> sortWords() {
        return getWords().stream().sorted(Comparator.comparing(Regex::getFirstNonVowel)).collect(Collectors.toList());
    }

    public static char getFirstNonVowel(String word) {
        for (char c : word.toLowerCase().toCharArray()) {
            if (c != 'a' && c != 'o' && c != 'u' && c != 'i' && c != 'e'){
                return c;
            }
        }
        return '\0';
    }

}
