import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompt {
    public static Integer getFrameNumber() {
        System.out.println("\nWhat is your current frame? (1-10)");
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = is.readLine();
            return Integer.parseInt(inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    public static Integer getScore() {
        System.out.println("");
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = is.readLine();
            return Integer.parseInt(inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getName(){
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter player's name: ");
        try {
            String inputString = is.readLine();
            return inputString;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String presentString() {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            return is.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Default";
    }

    public static boolean play(){
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nReady to play? (y/n)");
        try {
            String inputString = is.readLine();
            if (inputString.equals("y")){
                return true;
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}