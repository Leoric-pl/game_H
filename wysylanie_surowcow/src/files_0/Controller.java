package files_0;

import java.util.Scanner;

import static files_0.Main.Cities;

public class Controller {
    void loadAll(int teamIndex, int playerIndex)
    {
        Turn turn=new Turn();
        Scanner textInput=new Scanner(System.in);
        int numberOfCommands=100;
        String order0,order1;
        while(numberOfCommands>0){String command=textInput.nextLine();
            if(command.equals("ba0")) turn.basicTurn0(teamIndex,playerIndex);
            else if(command.equals("ba1")) turn.basicTurn1(teamIndex, playerIndex);
            else if(command.startsWith("city 0 ")){
                order0=command.substring(7);
                if(order0.equals("increase level"))
                    Cities.get(0).increaseLevelOfCity();
                else if(order0.startsWith("upgradeUnit"))
                {order1=order0.substring(12);
                System.out.println(order1);}

            }
        }
    }
}
