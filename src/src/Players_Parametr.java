import java.util.Scanner;

public class Players_Parametr {
    Scanner sc = new Scanner(System.in);

    public String[] playersParametr() {
        String[] parametr = new String[4];

        System.out.print("Input Player1's name _ : ");
        parametr[0] = sc.nextLine();

        System.out.print("Input Player2's name _ : ");
        parametr[1] = sc.nextLine();

        System.out.print("Player1 choose a symbol << X >> or << O >> _ : ");
        do {
            parametr[2] = sc.nextLine();
        } while (!Check_Eror.symbol_Eror(parametr[2]));

        if (parametr[2].equals("X")) {
            parametr[3] = "O";
        } else {
            parametr[3] = "X";
        }

        return parametr;
    }
}
