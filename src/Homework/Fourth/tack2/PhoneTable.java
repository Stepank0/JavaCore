package Homework.Fourth.tack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneTable {
    private HashMap<String,String> stringHashMap = new HashMap<>();

    public void add(String phone, String fio){
        stringHashMap.put(phone,fio);
    }

    public String getPhoneByFIO(String fio){
        if(stringHashMap.containsValue(fio)){
            String result = "Phone numbers: ";
            for(String key: stringHashMap.keySet()){
                if(stringHashMap.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        } else return "Can't find";


    }


//    public static Scanner in = new Scanner(System.in);
//    private String name;
//    private String phone;
//    private String email;
//    private static ArrayList < PhoneTable > person = new ArrayList< PhoneTable>();
//
//    public PhoneTable(String name, String phone, String email) {
//        this.name = name;
//        this.phone = phone;
//        this.email = email;
//        addPerson(this);
//    }
//
//    public static void showAll (){
//        System.out.println("--------------------------");
//        for ( PhoneTable phoneTable: person) {
//            System.out.println(phoneTable);
//        }
//        System.out.println("--------------------------");
//    }
//
//    public static void addPerson(PhoneTable phoneTable) {
//        person.add(phoneTable);
//    }
//
//    public static void removePerson(PhoneTable phoneTable) {
//        person.remove(phoneTable);
//    }
//
//
//    @Override
//    public String toString() {
//        return "PhoneTable{" +
//                "name='" + name + '\'' +
//                ", phone='" + phone + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//
//    public static void getPerson (String searchType, String searchString){
//
//            switch (searchType) {
//                case "1" :
//                    for (PhoneTable phoneTable : person) {
//                        if (phoneTable.name.equals(searchString)) {
//                            System.out.println(phoneTable.name + ' ' + phoneTable.phone +
//                                    ' ' + phoneTable.email);
//                        }
//                    }
////                    find by name
//
//                case "2" :
//                    for (PhoneTable phoneTable : person) {
//                        if (phoneTable.phone.equals(searchString)) {
//                            System.out.println(phoneTable.name + ' ' + phoneTable.phone +
//                                    ' ' + phoneTable.email);
//                        }
//                    }
////                    find by phone
//
//                case "3" :
//                    for (PhoneTable phoneTable : person) {
//                        if (phoneTable.email.equals(searchString)) {
//                            System.out.println(phoneTable.name + ' ' + phoneTable.phone +
//                                    ' ' + phoneTable.email);
//                        }
//                    }
////                    find by emile
//
//            }
//
//    }

}
