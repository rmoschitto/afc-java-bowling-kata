import java.util.ArrayList;

public class Game {

    //public void createGameFrames(){
    //        Game bowlingGame1 = new Game(int frameNumber, int score);
    //    }
    public int frameNumber; //allows the 1-10 frames to be tied to a score
    public int frameScorePlayer1;  //allows a score for player1 for each frame
    public int frameScorePlayer2;  //allows a score for player2 for each frame
    int player1TotalScore;
    int player2TotalScore;
    int frameScorePlayer1bowl1;
    int frameScorePlayer1bowl2;
    int frameScorePlayer2bowl1;
    int frameScorePlayer2bowl2;
    StringBuilder gameHistory = new StringBuilder();

    //Game Constructor requiring frameNumber and frameScore set at 1 and 0 initially
    public Game() {
//        ArrayList<Integer> scoresPlayer1 = new ArrayList<>();
//        ArrayList<Integer> scoresPlayer2 = new ArrayList<>();
    }

    //Frame Constructor
//    public void FrameNumber(int frameNumber, int frameScorePlayer1, int frameScorePlayer2) {
//        this.frameNumber = 1;
//        this.frameScorePlayer1 = 0;
//        this.frameScorePlayer2 = 0;
//    }

    //for loop i less than 2,
    //

    public void roll() {
        while (true) {
            System.out.println("Let's Get Ready to BOWL!?");
            String player1name = Prompt.getName();
            String player2name = Prompt.getName();
            System.out.println("Good deal, get your bowling balls, and walk to your lane!");

            for (int frameNumber = 1; frameNumber < 11; ) {
                for (int i = 1; i < 3; ) {
                    System.out.printf("For Frame %d, what is Player 1's bowl %d?___", frameNumber, i);
                    frameScorePlayer1bowl1 = Prompt.getScore();
                    if (frameScorePlayer1bowl1 > 10 || frameScorePlayer1bowl1 < 0) {
                        System.out.println("Sorry please enter the score again, cannot be greater than 10 or negative\n");
                    } else if (frameScorePlayer1bowl1 == 10) {
                        System.out.println("You bowled a STRIKE!!");
                        i = 3; // This sends it to next players turn in same frame
                    } else if (frameScorePlayer1bowl1 < 10) {
                        i = 2;
                        System.out.printf("For Frame %d, what is Player 1's bowl %d?___", frameNumber, i);
                        frameScorePlayer1bowl2 = Prompt.getScore();
                        if (frameScorePlayer1bowl1 + frameScorePlayer1bowl2 > 10) {
                            System.out.println("Sorry please enter the score again, total score cannot be greater than 10 or negative\n");
                            i = 1;
                        } else if (frameScorePlayer1bowl1 + frameScorePlayer1bowl2 == 10) {
                            System.out.println("You bowled a SPARE!!");
                            frameScorePlayer1 = 10;
                            player1TotalScore += frameScorePlayer1;
                            i++;
                        } else if (frameScorePlayer1bowl1 + frameScorePlayer1bowl2 < 10) {
                            i = 3;
                        }
                    }
                    frameScorePlayer1 = frameScorePlayer1bowl1 + frameScorePlayer1bowl2;
                    player1TotalScore += frameScorePlayer1;
                    i++;
                    System.out.printf("Player 1 total score: %d\n", player1TotalScore);
                }

                for (int b = 1; b < 3; ) {
                    System.out.printf("For Frame %d, what is Player 2's bowl %d?___", frameNumber, b);
                    frameScorePlayer2bowl1 = Prompt.getScore();
                    if (frameScorePlayer2bowl1 > 10 || frameScorePlayer2bowl1 < 0) {
                        System.out.println("Sorry please enter the score again, cannot be greater than 10 or negative\n");
                    } else if (frameScorePlayer2bowl1 == 10) {
                        System.out.println("You bowled a STRIKE!!");
                        b = 3; // This sends it to next players turn
                    } else if (frameScorePlayer2bowl1 < 10) {
                        b = 2;
                        System.out.printf("For Frame %d, what is Player 2's bowl %d?___", frameNumber, b);
                        frameScorePlayer2bowl2 = Prompt.getScore();
                        if (frameScorePlayer2bowl1 + frameScorePlayer2bowl2 > 10) {
                            System.out.println("Sorry please enter the score again, total score cannot be greater than 10 or negative\n");
                            b = 1;
                        } else if (frameScorePlayer2bowl1 + frameScorePlayer2bowl2 == 10) {
                            System.out.println("You bowled a SPARE!!");
                            frameScorePlayer2 = 10;
                            player2TotalScore += frameScorePlayer2;
                            b++;
                        } else if (frameScorePlayer2bowl1 + frameScorePlayer2bowl2 < 10) {
                            b = 3;
                        }
                    }
                    frameScorePlayer2 = frameScorePlayer2bowl1 + frameScorePlayer2bowl2;
                    player2TotalScore += frameScorePlayer2;
                    b++;
                    System.out.printf("Player 2 total score: %d\n", player2TotalScore);
                }
                frameNumber++;
            }
//
//            }


//                //Redo for loop here for player 2
//
//
//                System.out.printf("For Frame %d, what is Player 2's score?___", frameNumber);
//                frameScorePlayer2 = Prompt.getScore();
//                player2TotalScore = frameScorePlayer2;
//                String frameHistory = "Frame:" + frameNumber + "  " + player1name + ":" + frameScorePlayer1 + "  " + player2name + ":" + frameScorePlayer2 + "\n";
//                gameHistory.append(frameHistory);
//
//                //Frame 2
//                frameNumber = Prompt.getFrameNumber();
//                System.out.printf("For Frame %d, what is Player 1's score?___", frameNumber);
//                frameScorePlayer1 = Prompt.getScore();
//                player1TotalScore += frameScorePlayer1;
//                System.out.printf("For Frame %d, what is Player 2's score?___", frameNumber);
//                frameScorePlayer2 = Prompt.getScore();
//                player2TotalScore += frameScorePlayer2;
//                frameHistory = "Frame:" + frameNumber + "  " + player1name + ":" + frameScorePlayer1 + "  " + player2name + ":" + frameScorePlayer2 + "\n";
//                gameHistory.append(frameHistory);
//                System.out.println(gameHistory);
//                System.out.printf("Current Score (Frame %d)  %s:%d -- %s:%d", frameNumber, player1name, player1TotalScore, player2name, player2TotalScore);
//                break;
//            }

        }
    }}

