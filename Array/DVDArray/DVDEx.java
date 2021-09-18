class DVD {
    public String name;
    public String director;
    public int releaseYear;

    public DVD(String name, String director, int releaseYear) {
        this.name = name;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return (this.name + " directed by, " + this.director + "released in the year " + this.releaseYear);

    }

}

public class DVDEx {
    public static void main(String[] args) {
        DVD[] DVDCollection = new DVD[5];

        DVD IncrediblbesDVD = new DVD("Incredibles", "abcd", 1994);
        DVD doryDVD = new DVD("FindinfDory", "disney", 2003);

        DVDCollection[1] = IncrediblbesDVD;
        DVDCollection[3] = doryDVD;

        System.out.println(DVDCollection);
        System.out.println(DVDCollection[0]);
        System.out.println(DVDCollection[1]);

        // using loops for array

        int[] squareNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            squareNumbers[i] = (i + 1) * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(squareNumbers[i]);
        }

        // for each loop to print array elements
        for (int square : squareNumbers) {
            System.out.println(square);
        }

    }
}
