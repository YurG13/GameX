import java.util.Scanner;

public class Size_Game {
    Scanner sc = new Scanner(System.in);

    public int[] sizeField() {
        int[] size = new int[2];

        System.out.print("Choose size of the field: ");
        size[0] = sc.nextInt();

        System.out.print("Quantity of the victory: ");
        size[1] = sc.nextInt();

        return size;
    }
}
