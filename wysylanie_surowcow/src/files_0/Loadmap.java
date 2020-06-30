package files_0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static files_0.Main.Cities;


class Loadmap {

    /**
    basic:
     0-  empty field,
     1- road, modifier: 0.5
     2- wall with no place to go
     3- gold mine, 1000 income
     4- farm, basic sources resource, 10/day
     5- crystal mine, 1 /day
            */
    private int empty=0;
    private int road=1;
    private int wall=2;
    private int goldMine=3;
    private int sawmill=4;
    private int crystalMine=5;
    private int castle0=100;
//    int castle1=101,castle2=102, castle3=103, castle4=104, castle5=105, castle6=106;
private int castle7=107;
    /**
     koniec przypisania */
    static int HEIGHT,WIDTH;
    void loadStatic() throws FileNotFoundException {
    File sataticMap = new File("src\\files_0\\static_map_int.txt");
  //  File dynamicMap = new File("src\\files_0\\dynamic_map.txt");
        //  Scanner actual=new Scanner(dynamicMap);
        Scanner basic = new Scanner(sataticMap);
        HEIGHT = basic.nextInt();
        WIDTH = basic.nextInt();
        Map firstmap=new Map();
        int DataToLoad;
        for(int i=0;i<HEIGHT;i++)
        {
            basic.nextLine();
            for(int j=0;j<WIDTH;j++)
            {
                DataToLoad=basic.nextInt();
                if(DataToLoad==empty)                                       {firstmap.map[i][j]=Field.empty____;}
                else if(DataToLoad==road)                                   {firstmap.map[i][j]=Field.road_____;}
                else if(DataToLoad==wall)                                   {firstmap.map[i][j]=Field.wall____W;}
                else if(DataToLoad==goldMine)                              {firstmap.map[i][j]=Field.gold_mine;}
                else if(DataToLoad==crystalMine)                           {firstmap.map[i][j]=Field.crystal_mine;}
                else if(DataToLoad==sawmill)                                   {firstmap.map[i][j]=Field.sawmill__;}
                else if(DataToLoad>=castle0&&DataToLoad<=castle7)         {firstmap.map[i][j]=Field.castle___;
                Cities.add(new City(i,j,i+"City"+j));
                }
            }
        }
        firstmap.showMap();
    }
    void loadSetup()
    {System.out.print("On static map numbers mean");}
}