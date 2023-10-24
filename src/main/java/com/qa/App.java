package com.qa;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal tiger;
        tiger = new Animal("Vinnie", "Meat", "Mammal", "Male" , 10);
//        System.out.println(tiger);

        Animal panda;
        panda = new Animal ("Dan", "Bamboo", "Mammal", "Male");
//        System.out.println(panda);

        Animal shrimp;
        shrimp = new Animal ("Rob", "Sand", "C", "Male");
//        System.out.println(shrimp);

//        Animal[] zoo = new Animal[3];
//        zoo[0] = tiger;
//        zoo[1] = panda;
//        zoo[2] = shrimp;
//
//        for( Animal a: zoo){
//            System.out.println(a);
//        }

//        for( int i =0; i< zoo.length; i++){
//            System.out.println(zoo[i]);
//        }

        ArrayList<Animal> zoolist = new ArrayList<>(2);
        zoolist.add(tiger);
        zoolist.add(shrimp);

        for( int i =0; i< zoolist.size(); i++){
            System.out.println(zoolist.get(i));
        }
        zoolist.add(panda);

        for( Animal a:zoolist){
            System.out.println(a);
        }
    }
}
