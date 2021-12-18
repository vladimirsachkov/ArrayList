package ru.specialist;

import java.util.Arrays;

public class ArrayList {
    private int[] values;

    public ArrayList(int[] values) {
        this.values = values;
    }

    public void add(int number) {
        int sizeNewArray = this.size() + 1;
        int newValues[] = Arrays.copyOf(this.values, sizeNewArray);
        newValues[sizeNewArray-1] = number;
        this.values = Arrays.copyOf(newValues, newValues.length);
    }

    public int get(int number) {
        return this.values[number];
    }

    public void remove (int index) {
        int newArray[] = new int[this.size()-1];
        int indexOfNewArray = 0;
        for (int i = 0; i <this.values.length; i++) {
            if (i != index) {
                newArray[indexOfNewArray++] = this.values[i];
            }
        }
        this.values = newArray;
    }

    public void showValues() {
        int index = 0;
        int num = 1;
        for (int i: this.values) {
            System.out.println("NUM:" + num++ + " INDEX[" + index++ + "] " + i);
        }
    }


    public int size () {
        if (this.values != null) {
            int[] array = this.values;
            int amount = 0;
            for (int i : array) {
                amount++;
            }
            return amount;
        } else {
            return 0;
        }
    }

    public int[] getValues() {
        return values;
    }
}
