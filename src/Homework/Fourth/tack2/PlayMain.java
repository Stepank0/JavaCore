package Homework.Fourth.tack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayMain {
//    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        PhoneTable phoneTable = new PhoneTable();

        phoneTable.add( "89999999999", "Ivanov");
        phoneTable.add("89777777777", "Petrov" );
        phoneTable.add("89666666666", "Aleksandrov");
        phoneTable.add("89555555555", "Dalakyan");
        phoneTable.add("89444444444", "Petrosyan");
        phoneTable.add("89333333333","Lavrov");
        phoneTable.add("89222222222", "Shibanov");
        phoneTable.add("89111111111", "Vasilev");
        phoneTable.add("899998887766", "Aleksandrov");

        System.out.println(phoneTable.getPhoneByFIO("Aleksandrov"));
        System.out.println(phoneTable.getPhoneByFIO("89999999999"));




//        PhoneTable person1 = new PhoneTable("Ivanov", "89999999999", "aaa@mail.ru");
//        PhoneTable person2 = new PhoneTable("Petrov", "89777777777", "bbb@mail.ru");
//        PhoneTable person3 = new PhoneTable("Aleksandrov", "89666666666", "ccc@mail.ru");
//        PhoneTable person4= new PhoneTable("Dalakyan", "89555555555", "ddd@mail.ru");
//        PhoneTable person5 = new PhoneTable("Petrosyan", "89444444444", "eee@mail.ru");
//        PhoneTable person6 = new PhoneTable("Lavrov", "89333333333", "fff@mail.ru");
//        PhoneTable person7 = new PhoneTable("Shibanov", "89222222222", "ggg@mail.ru");
//        PhoneTable person8 = new PhoneTable("Vasilev", "89111111111", "hhh@mail.ru");
//        PhoneTable person9 = new PhoneTable("Aleksandrov", "899998887766", "jjj@mail.ru");

//        PhoneTable.showAll();
//        PhoneTable.addPerson(new PhoneTable("Lavrov", "89777777777", "kkk@mail.ru"));
//        PhoneTable.addPerson(new PhoneTable("Petrov", "89755555555", "lll@mail.ru"));

//        PhoneTable.removePerson(person5);
//        PhoneTable.showAll();

//        System.out.print("If you want to search by name, please enter 1, by number 2, by email 3: ");
//        String  searchType = in.nextLine();

//        System.out.print("Please enter a search term: ");
//        String  searchString = in.nextLine();

//        PhoneTable.getPerson(searchType, searchString);


    }
}
