package com.oleg.jerseyapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Utils {


    public static Map<String, String[]> randomize(Map<String, String[]> jsonMap) {
        Map<String, String[]> temp = new HashMap<>();
        ArrayList<String> houses = new ArrayList<String>(Arrays.asList(jsonMap.get("houses")));
        ArrayList<String> players = new ArrayList<String>(Arrays.asList(jsonMap.get("players")));

        houses = removeEmpty(houses);
        players = removeEmpty(players);

        Collections.shuffle(houses);
        Collections.shuffle(players);

        temp.put("players", players.toArray(new String[players.size()]));
        temp.put("houses", houses.toArray(new String[houses.size()]));

        return temp;
    }


    private static ArrayList<String> removeEmpty(ArrayList<String> list) {
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(new HashSet<>(list));
        if (listWithoutDuplicates.contains("empty")) {
            listWithoutDuplicates.remove("empty");
        }
        return listWithoutDuplicates;
    }


}
