import GameHelper.GameHelper;

public class DotComTester {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom dotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        dotCom.setLocationCells(locations);
        boolean isAlive = true;


        while (isAlive) {
            String userGuess = helper.getUserInput("enter a number");
            String result = dotCom.checkYourself(userGuess);
            numOfGuesses++;

            if (result.equals("kill"))
                isAlive = false;
            System.out.println("You took " + numOfGuesses + " guesses");
            }


        }
    }
