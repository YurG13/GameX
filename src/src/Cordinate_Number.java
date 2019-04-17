import java.util.Scanner;

public class Cordinate_Number extends Picture_Game {
    Scanner sc = new Scanner(System.in);
    private String[] coordinateString;
    private int[] coordinateInt = new int[2];
    public String field;

    public int[] scanner_method() {
        do {
            field = sc.nextLine();
        } while (!Check_Eror.cordinate_Eror(field));

        coordinateString = field.split("");
        coordinateInt[0] = Integer.parseInt(coordinateString[0]);
        coordinateInt[1] = Integer.parseInt(coordinateString[1]);

        return coordinateInt;
    }
}
