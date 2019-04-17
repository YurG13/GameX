public class Check_Eror {
    public static boolean symbol_Eror(String symbol) {
        if (symbol.equals("X") || symbol.equals("O")) {
            return true;
        }
        System.out.print("Written symbol is incorrect input <<X>> or <<O>>");
        return false;
    }

    public static boolean cordinate_Eror(String cordinate) {
        if (cordinate.length() != 2) {
            System.out.print("Choose the right place: ");
            return false;
        }
        return true;
    }

    public static boolean empty_Eror(String symbol) {
        if (symbol.equals("□")) {
            return true;
        } else {
            System.out.print("Chosen field is busy! ");
            return false;
        }
    }
}
