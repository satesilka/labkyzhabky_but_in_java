package com.satesilka.lab7;

public class Main {
    public static void main(String[] args){
        //русні пизда путін хуйло всі москалі йобнуті нема хароших рускіх хіба ті кого в тепловізор не  видно
        //наша русофобія ще досі недостатня
        var regex = new Regex("Acdafaofn fafoafa ehaofoaf ibofa oaiop idafia");
        regex.sortWords().forEach(System.out::println);
    }
}
