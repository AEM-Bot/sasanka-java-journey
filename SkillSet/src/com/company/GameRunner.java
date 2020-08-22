package com.company;

/*
    Below is an example of polymorphism --> mario and chess using same methods up,
    down, right, left but the logic is being done by two different classes

 */
public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};
        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.right();
            game.left();
        }
        /*MarioGame marioGame = new MarioGame();
        marioGame.up();
        marioGame.down();
        marioGame.right();
        */
//        ChessGame chessGame = new ChessGame();
//        chessGame.up();
//        chessGame.down();
////        chessGame.right();
//        GamingConsole game = new MarioGame();
//        game.down();
//        game.right();
//        game.up();

        /*
            Same Code is being re used and utilized for Mario and Chess Games
            Polymorphism --> Multiple Implementations with the same method
            by having same methods in Mario and Chess --> But Overrride nethods have
            their own custom code in the implementaion methods
         */

    }
}
