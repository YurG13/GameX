public class Win_Game {
    public boolean version_1(String[][] game_Array, String symbol, int sizeWin) {
        int cont = 0;
                                                      //Victory towards horizontal and vertical

        for (int i = 0; i < game_Array.length; i++) {
            for (int j = 0; j <= game_Array.length - sizeWin; j++) {
                for (int k = j; k < j + sizeWin; k++) {
                    if (game_Array[i][k].equals(symbol)) {
                        cont++;
                    } else {
                        break;
                    }
                }
                if (cont == sizeWin) {
                    return true;
                }
                cont = 0;

                for (int k = j; k < j + sizeWin; k++) {
                    if (game_Array[k][i].equals(symbol)) {
                        cont++;
                    } else {
                        break;
                    }
                }
                if (cont == sizeWin) {
                    return true;
                }
                cont = 0;
            }
        }
                                                               //Victory diagonal

        int p;
        cont = 0;
        for (int i = 0; i <= game_Array.length-sizeWin; i++) {
            p = i;
            for (int j = 0; j <= game_Array.length-sizeWin; j++) {
                if (game_Array[p][j].equals(symbol)) {
                    cont++;
                    if (cont==sizeWin)return true;
                    p++;
                } else {
                    cont = 0;
                }
            }
            cont = 0;
        }

        for (int i = 0; i <= game_Array.length-sizeWin; i++) {
            p = i;
            for (int j = game_Array.length-1; j >= game_Array.length-sizeWin; j--) {
                if (game_Array[p][j].equals(symbol)) {
                    cont++;
                    if (cont==sizeWin)return true;
                    p++;
                } else {
                    cont = 0;
                }
            }
            cont = 0;
        }


        for (int i = 0; i < game_Array.length; i++) {
            if (game_Array[i][i].equals(symbol)) {
                cont++;
                if (cont == sizeWin) return true;
            } else {
                cont = 0;
            }
        }
        return false;
    }
}
