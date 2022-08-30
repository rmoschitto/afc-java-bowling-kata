public class Application {
    public static void main(String[] args) {
        Game game1 = new Game();
        boolean playStatus = true;
        while (playStatus){
            game1.roll();
            playStatus = Prompt.play();
            //game1.printLeaderBoard();
            System.out.println("Thank you for playing! Hope to see you again!");
        }
    }


    //while loop for frames
    //randomize results for players, two bowls each,
    //variable for round number
    //game running boolean
    //
}
