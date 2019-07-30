package com.samijradi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static List<List<Integer>> partition(List<Integer> liste, int taille) throws Exception
    {
        if(liste == null) {
            throw new Exception("liste is null");
        } else if(taille <= 0) {
            throw new Exception("taille is null or negative");
        }

        return new ArrayList<>(liste.stream()
                .collect(Collectors.groupingBy(s -> (s - 1) / taille))
                .values());
    }
}
