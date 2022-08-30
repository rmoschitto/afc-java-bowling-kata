import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//# Bowling Rules
//The game consists of 10 frames. In each frame the player has two rolls to
// knock down 10 pins. The score for the frame is the total number of pins knocked
// down, plus bonuses for strikes and spares.
//
//A spare is when the player knocks down all 10 pins in two rolls. The bonus for
// that frame is the number of pins knocked down by the next roll.
//
//A strike is when the player knocks down all 10 pins on his first roll. The frame
// is then completed with a single roll. The bonus for that frame is the value of
// the next two rolls.
//
//In the tenth frame a player who rolls a spare or strike is allowed to roll the
// extra balls to complete the frame. However no more than three balls can be rolled
// in tenth frame.

//Write a class Game that has two methods
//- void roll(int) is called each time the player rolls a ball. The argument is the
// number of pins knocked down.
//- int score() returns the total score for that game.

//public class GameTest {
//
//    @Test
//    public void createGame(){
//        Game game1 = new Game();
//    }
//
//    @Test
//    public void createGameFrames(){
//        Game game1 = new Game();
//        Frame frame1 = new Frame();
//        assertEquals(0 ,game1.frameScorePlayer1);
//        assertEquals(0, game1.frameScorePlayer2);
//        assertEquals(1, game1.frameNumber);
//    }
////    @Test
////    public void rollingBowlingBallTest(){
////        roll(int pins);
////        assertEquals(3, game1.roll(3));
////    }
//
//}
