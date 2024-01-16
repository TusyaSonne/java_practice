package bilets;

import java.util.ArrayList;
import java.util.Collection;

public class LongestSortedSequence {
    public static class ArrayIntList {
        private int[] elementData;
        private int size;

        public void setElementData(int[] elementData) {
            this.elementData = elementData;
            size = elementData.length;
        }

        public int longestSortedSequence() {
            int count = 1;
            int maxCount = 1;
            for (int i = 0; i < size - 1; i++) {
                if (elementData[i] < elementData[i + 1]) {
                    count += 1;
                } else {
                    maxCount = Math.max(maxCount, count);
                    count = 1;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
            return maxCount;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, -5, -3, 10, 15, 20, 23, -3, 0, 42, 308, 17,23,45,56,57,0,4,6,7,9,12,22};
            ArrayIntList list = new ArrayIntList();
            list.setElementData(arr);
            System.out.println(list.longestSortedSequence());
        }
    }
}
