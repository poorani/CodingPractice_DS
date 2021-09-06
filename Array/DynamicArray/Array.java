
class Array {
    private int[] items;
    private int count;
    public int size;

    // construct an array of size length
    public Array(int length) {
        items = new int[length];
        size = items.length;
    }

    // insert --- O(n)
    public void insert(int item) {
        // if the array is full resize the array
        if (count == items.length) {
            int[] newItems = new int[count * 2]; // new array of twice the size of old array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // Assign newitems to items
            items = newItems;
            size = newItems.length;
        }
        // insert the items at the end of the array
        items[count] = item;
        count++;
    }

    // deleting at index -- O(n)
    public void delete(int index) {
        // if the index is not available return exception
        if (index < 0 || index > count)
            throw new IllegalArgumentException(); // do not want to print in console when u have big application
                                                  // running. nobody watches console.so throw exception to crash.

        // shift all the elements left;
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        // decrement the array size as we deleted one item
        count = count - 1;
    }

    // Search item in array -- O(n)
    public int search(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    // print the items
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
