import java.util.Scanner;

public class Picture_Game {
    private String[][] sizeArray;

    public void gamePicture(int size) {
        sizeArray = new String[size][size];
        for (int i = 0; i < size; i++) {
            System.out.print(i + "--");
            for (int j = 0; j < size; j++) {
                sizeArray[i][j] = "□";
                System.out.print(j + sizeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String pictureElement(int num1, int num2) {
        return sizeArray[num1][num2];
    }

    public void newPicture(int num1, int num2, String symbol) {
        sizeArray[num1][num2] = symbol;

        for (int i = 0; i < sizeArray.length; i++) {
            System.out.print(i + "--");
            for (int j = 0; j < sizeArray.length; j++) {
                System.out.print(j + sizeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String[][] game_Array() {
        return sizeArray;
    }
}
