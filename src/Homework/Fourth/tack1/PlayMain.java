package Homework.Fourth.tack1;

import java.util.*;

public class PlayMain {

    public static int arrayStringSize = 1000;
    public static String[] arrayString  = new String[arrayStringSize];
    public static List<String> stringsArrayList = Arrays.asList(arrayString);

    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Belgorod");
        stringList.add("Bryansk");
        stringList.add("Vladivostok");
        stringList.add("Dubna");
        stringList.add("Ivanovo");
        stringList.add("Kazan");
        stringList.add("Kaluga");
        stringList.add("Moscow");
        stringList.add("Novosibirsk");
        stringList.add("Obninsk");
        stringList.add("Omsk");
        stringList.add("Perm");
        stringList.add("Samara");
        stringList.add("Tula");
        stringList.add("Yakutsk");
        stringList.add("Moscow");
        stringList.add("Dubna");
        stringList.add("Kazan");
        stringList.add("Dubna");
        stringList.add("Belgorod");

        System.out.println("List size > " + stringList.size());
        Set<String> stringSet = new HashSet<String>(stringList);
        System.out.println("Set size > " + stringSet.size());

        HashMap<String, Integer> stringMap = new HashMap<>();

        for(String str: stringList) {
            int amount = stringMap.getOrDefault(str, 0)+1;
                stringMap.put(str, amount);
        }
        System.out.println(stringMap);

    }

}
