


package com.company;

import java.lang.reflect.Type;

public class  Main {

    public static void  main(String [] args ) {
String[] name =  { "Alana","Alfinur","Astrit","Elchie"};
for (int i = 0; i < name.length; i++) {
    switch (name[i]){
        case  "Alana":
            System.out.println("Good morning " + name[i]);
            break;
        case "Alfinur":
            System.out.println("Good  day " + name[i]);
            break;
        case "Astrit":
            System.out.println("Good evening " + name[i]);
            break;
        case "Elchie":
            System.out.println("Good night " + name[i]);
            break;

    }


}
    }
}