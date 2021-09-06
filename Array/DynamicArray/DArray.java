
public class DArray {
    public static void main(String[] args) {
        Array numbers = new Array(4);
        numbers.insert(10);
        numbers.insert(100);
        numbers.insert(50);
        numbers.insert(40);
        // print the size of the numbers array
        System.out.println("Size of the Array " + numbers.size);
        System.out.println("Contents of the Array after  inserting");
        numbers.print();
        // insert new item exceeding the size of the array
        numbers.insert(30);
        // print the size of the numbers array --after dynamic sizing
        System.out.println("Size of the Array " + numbers.size);
        System.out.println("Contents of the Array after synamic resizing");
        numbers.print();

        // Delete item at index n
        numbers.delete(0);
        System.out.println("Contents of the Array after deleting an item at index n");
        numbers.print();

        // search an item
        System.out.println(numbers.search(50));

    }
}