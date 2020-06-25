package files_0;


public class Map {
   /* public Map(int HEIGHT, int WIDTH)
    {
        Field map[][]=new Field[HEIGHT][WIDTH];

    }*/
    Field map[][]=new Field[Loadmap.HEIGHT][Loadmap.WIDTH];

    public void showmap() {
        for(int i = 0; i< Loadmap.HEIGHT; i++)
        {
            for(int j = 0; j< Loadmap.WIDTH; j++)
            {System.out.print(map[i][j]+"  ");}
            System.out.println();
        }
        }
}
