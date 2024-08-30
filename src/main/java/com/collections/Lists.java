package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String value, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String occ, List<String> list, int index) {
        for (int i = index; i < list.size(); i++) {
            if (list.get(i).equals(occ)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    public static int put(String occ, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                list.set(i, occ);
                return i;
            }
        }
        return -1;
    }

    public static int remove(String occ, List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(occ)) {
                list.set(i, "");
                count++;
            }
        }
        return count;
    }
}
