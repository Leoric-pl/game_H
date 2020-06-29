package files_0;

import java.util.Scanner;

public class Controller {
    void loadAll(int teamIndex, int playerIndex)
    {
        Turn turn=new Turn();
        Scanner textInput=new Scanner(System.in);
        int numberOfCommands=100;
        while(numberOfCommands>0){String command=textInput.nextLine();
            if(command.equals("ba0")) turn.basicTurn0(teamIndex,playerIndex);
            else if(command.equals("ba1")) turn.basicTurn1(teamIndex, playerIndex);

        }
    }
}
