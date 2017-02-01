package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList myers = new ArrayList();
        myers.add("Bubb");
        myers.add("Mr. P");
        myers.add(0, "Argen the Dragon");
        myers.add(27);
        myers.remove(0);
        int num = (Integer)myers.get(2);

        //indexOf
        //lastIndexOf
        //What is the difference?
            //indexOf starts from beginning
            //lastIndexOf starts from the end

        System.out.println(myers.size());
        System.out.println(num);
        System.out.println(myers);

    }
}
