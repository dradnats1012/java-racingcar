package Controller;

import Message.ConsoleMessage;
import Model.Car;
import Model.Name;
import View.Input;
import View.Output;

import java.util.ArrayList;

public class Controller {
    public static int gameFlag = 1;

    public void gamePlay() {
        Input input = new Input();
        Name name = new Name();
        Output output = new Output();

        String names = input.getNames();
        ArrayList<Car> nameList = name.makeCar(names);
        int arrive = input.getArrival();

        System.out.println(ConsoleMessage.GAME_RESULT.getMessage());
        gamePrint(nameList, output, arrive);

    }

    private void gamePrint(ArrayList<Car> nameList, Output output, int arrive) {
        for (int index = 0; index < nameList.size(); index++) {
            gameMove(nameList, output, arrive);
        }
        output.gameEnd(nameList, arrive);
    }

    private void gameMove(ArrayList<Car> nameList, Output output, int arrival) {
        while (gameFlag == 1) {
            for (int i = 0; i < nameList.size(); i++) {
                nameList.get(i).move();
                if (nameList.get(i).getState() == arrival) {
                    gameFlag = 0;
                }
            }
            output.gameStatus(nameList);
            System.out.println();
        }
    }

}
//pobi,crong,honux
