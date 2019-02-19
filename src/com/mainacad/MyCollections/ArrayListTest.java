package com.mainacad.MyCollections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> myColl = new ArrayList<>();

        myColl.add("aaa");
        myColl.add("bbbb");
        myColl.add("ccccc");
        myColl.set(1, "wwwwww");

        System.out.println(myColl);

        for( String str: myColl){
            System.out.println(str);
        }

        for (int i=1; i < myColl.size(); i++){
            System.out.println(myColl.get(i));
        }

        int sizeOfColl = myColl.size();
        System.out.println(sizeOfColl);

        myColl.clear();
        System.out.println(myColl);
    }
}
