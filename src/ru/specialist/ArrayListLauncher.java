package ru.specialist;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.Array;
import java.util.Arrays;

public class ArrayListLauncher {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(new int[]{2,4});
        arrayList.showValues();
        System.out.println("-------");
        //add
        arrayList.add(5);
        arrayList.showValues();
        System.out.println("-------");
        //get
        System.out.println(arrayList.get(2));
        System.out.println("-------");
        //size
        System.out.println(arrayList.size());
        System.out.println("-------");

        //remove
        arrayList.remove(2);
        arrayList.showValues();
    }
}
