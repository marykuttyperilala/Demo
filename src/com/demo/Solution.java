package com.demo;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(

                "aaryanna",

                "aayanna",

                "airianna",

                "alassandra",

                "allanna",

                "allannah",

                "allessandra",

                "allianna",

                "allyanna",

                "anastaisa",

                "anastashia",

                "anastasia",

                "annabella",

                "annabelle",

                "annebelle"

        );

        

        names.stream()

                .filter(Filter.nameStartingWithPrefix("aa"))

                .map(Mapper.getDistinctCharactersCount())

                .forEachOrdered(System.out::println);

    }

}