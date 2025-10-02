package org.example.task2;

import java.util.Arrays;

public class Cart {

    public Item[] contents;
    public int index;

    public Cart(Item[] _contents) {
        this.contents = _contents;
    }

    public void removeById(int itemIndex) {

        if (index == 0)
            return;

        int foundItemIndex = findItemInArray(itemIndex);

        if (foundItemIndex == -1)
            return;

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }


        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < contents.length - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index-1] = null;
        index--;
    }

    private int findItemInArray(int id) {
        for (int i = 0; i < index; i++) {
            if (contents[i].id == id) {
                return i;
            }

        }

        return -1;
    }

    public void add(Item item) {
        if (isCartFull()){
            return;
        }

        contents[index] = item;
        index++;
    }

    private boolean isCartFull() {
        return index == contents.length;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i=0; i<index; i++){
            str += "Cart{" +
                "contents=" + contents[i] + '}' + "\n";
        }

        return str;
    }
}
