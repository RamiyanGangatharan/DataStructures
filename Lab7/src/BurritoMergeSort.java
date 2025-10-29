import java.util.List;

public class BurritoMergeSort {
    // CODE TAKEN FROM ACTIVITY 7B2

    // TODO: convert to use the burrito object
    public static List sort(List LinkedList, int left, int right) {
        //if the LinkedList can be divided, divide, conquer, combine
        if (left < right) {
            int midpoint = (left + right) / 2;
            sort(LinkedList, left, midpoint);
            sort(LinkedList, midpoint + 1, right);
            merger(LinkedList, left, midpoint, right);
        }
        return LinkedList;
    }

    public static void merger(List LinkedList, int left, int mid, int right) {
        // Sizes of two arrays to be merged
        int leftSize = mid-left+1;
        int rightSize = right-mid;

        // Temp arrays
        Burrito [] leftArray = new Burrito[leftSize];
        Burrito [] rightArray = new Burrito[rightSize];

        // Copy data to temp arrays (manual)
        for (int i = 0; i < leftSize; i++) { leftArray[i] = (Burrito) LinkedList.get(left + i); }
        for (int i = 0; i < rightSize; i++) { rightArray[i] = (Burrito) LinkedList.get(mid + 1 + i); }

        // Initial indexes of first/second sub-LinkedList, and merged sub-LinkedList
        int i = 0, j = 0, k = left;

        // merge by taking smallest of two values
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].getCost() < rightArray[j].getCost()) { LinkedList.set(k++, leftArray[i++]); }
            else { LinkedList.set(k++, rightArray[j++]); }
        }

        //take the rest of the left LinkedList and right LinkedList
        while (i < leftSize) { LinkedList.set(k++, leftArray[i++]); }
        while (j < rightSize) { LinkedList.set(k++, rightArray[j++]); }
    }

}
