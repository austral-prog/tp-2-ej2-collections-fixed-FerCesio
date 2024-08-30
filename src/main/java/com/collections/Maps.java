package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
            Map<String, Integer> inventory = new HashMap<>();
            for (String item : items) {
                inventory.put(item, inventory.getOrDefault(item, 0) + 1);
            }
            return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentQuantity = inventory.get(item);
                if (currentQuantity > 0) {
                    inventory.put(item, currentQuantity - 1);
                }
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> availableItems = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                availableItems.add(entry);
            }
        }

        return availableItems;
    }
}
