package files_0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static files_0.Main.neutralcities;

class Loadmap {

    /**
    do zinterpretowania:
     0-  puste pole,
     1- droga,modyfikatoor: 0.5
     2- przeszkoda nie do przejscia
     3- kopalnia zlota, podstawowe poza miastem zrodlo przychodu, 1000 dziannie
     4- farma, zrodlo podstawowych surwcow,10 dziennie
     5- kopalnia krysztalow, 1 dziennie
            */
    private int empty=0;
    private int road=1;
    private int wall=2;
    private int gold_mine=3;
    private int farm=4;
    private int crystal_mine=5;
    private int castle0=100;
//    int castle1=101,castle2=102, castle3=103, castle4=104, castle5=105, castle6=106;
private int castle7=107;
    /**
     koniec przypisania */
    static int HEIGHT,WIDTH;
    void load_static() throws FileNotFoundException {
    File satatic_map = new File("src\\files_0\\static_map_int.txt");
  //  File dynamic_map = new File("src\\files_0\\dynamic_map.txt");
        Scanner basic = new Scanner(satatic_map);
      //  Scanner actual=new Scanner(dynamic_map);
        HEIGHT = basic.nextInt();
        WIDTH = basic.nextInt();
        Map firstmap=new Map();
        int data_to_load;
        for(int i=0;i<HEIGHT;i++)
        {
            basic.nextLine();
            for(int j=0;j<WIDTH;j++)
            {
                data_to_load=basic.nextInt();
                if(data_to_load==empty)                                       {firstmap.map[i][j]=Field.empty____;}
                else if(data_to_load==road)                                   {firstmap.map[i][j]=Field.road_____;}
                else if(data_to_load==wall)                                   {firstmap.map[i][j]=Field.wall____W;}
                else if(data_to_load==gold_mine)                              {firstmap.map[i][j]=Field.gold_mine;}
                else if(data_to_load==crystal_mine)                           {firstmap.map[i][j]=Field.crystal_mine;}
                else if(data_to_load==farm)                                   {firstmap.map[i][j]=Field.farm_____;}
                else if(data_to_load>=castle0&&data_to_load<=castle7)         {firstmap.map[i][j]=Field.castle___;
                neutralcities.add(new City(i,j,i+"City"+j));
                }
            }
        }
        firstmap.showmap();
    }
    void load_setup()
    {System.out.print("On static map numbers mean");}
}