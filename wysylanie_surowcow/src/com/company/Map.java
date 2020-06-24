package com.company;


import static com.company.Loadmap.HEIGHT;
import static com.company.Loadmap.WIDTH;

public class Map {
   /* public Map(int HEIGHT, int WIDTH)
    {
        Field map[][]=new Field[HEIGHT][WIDTH];

    }*/
    Field map[][]=new Field[HEIGHT][WIDTH];

    public void showmap() {
        for(int i=0;i<HEIGHT;i++)
        {
            for(int j=0;j<WIDTH;j++)
            {System.out.print(map[i][j]+"  ");}
            System.out.println();
        }
        }
}
