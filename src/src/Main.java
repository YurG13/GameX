public class Main {
    public static void main(String[] args) {
        Players_Parametr pParametr = new Players_Parametr();
        Size_Game size_game = new Size_Game();
        Picture_Game game_picture = new Picture_Game();
        Win_Game winGame = new Win_Game();
        Cordinate_Number cordinateNumber = new Cordinate_Number();

        String parametr[], symbol, symbolPlayer1, symbolPlayer2, namePlayer2, namePlayer1;
        int size[], cordinate[], cordinate1, cordinate2, sizeField, cont = 0, sizeWin;

                                                                //Player's data

        parametr = pParametr.playersParametr();
        namePlayer1 = parametr[0];
        namePlayer2 = parametr[1];
        symbolPlayer1 = parametr[2];
        symbolPlayer2 = parametr[3];
                                                                //Settings of the game

        size = size_game.sizeField();
        sizeField = size[0];
        sizeWin = size[1];


        System.out.println("\n\n\n" + namePlayer1 + "'s Symbol is :_ " + symbolPlayer1 +
                "\n" + namePlayer2 + "'s Symbol is :_ " + symbolPlayer2 +
                "\n\n" + " Let's play ");

                                                            //The picture of the game
        game_picture.gamePicture(sizeField);

        System.out.println("For choosing correct place in the field write cell and row number.\n" +
                "Without any symbol.  For example 00" +
                "\n" + namePlayer1 + " start to play");

        boolean result = false;
        while (cont < sizeField * sizeField) {

            do {
                cordinate = cordinateNumber.scanner_method();
                cordinate1 = cordinate[0];
                cordinate2 = cordinate[1];
            } while (!(Check_Eror.empty_Eror(game_picture.pictureElement(cordinate1, cordinate2))));

            if (cont % 2 == 0) {
                symbol = symbolPlayer1;
                cont++;
            } else {
                symbol = symbolPlayer2;
                cont++;
            }


            game_picture.newPicture(cordinate1, cordinate2, symbol);
            if (winGame.version_1(game_picture.game_Array(), symbol, sizeWin)) {
                if (symbol.equals(symbolPlayer1)){
                    System.out.println(namePlayer1 + " Wins"+ " Symbol " + symbol);
                } else {
                    System.out.println(namePlayer2 + " Wins"+ " Symbol " + symbol);
                }
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("Draw GAME OVER");
        }
    }
}
