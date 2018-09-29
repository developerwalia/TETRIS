//contains the board
public class Board
{
    private int rows;
    private int cols;
    private char[][] arr;

    public Board()
    {
        rows=60;
        cols=40;
        arr = new char[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=' ';
            }
        }
    }
    //constructors
    //getters
    public char[][] getARR()
    {
        return arr;
    }
    //setters
    public void setARR(char[][] arr)
    {
        this.arr=arr;
    }
    //functions
    public void printBoard()
    {
        for(int i=0;i<rows;i++)
        {
            System.out.print("|");
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("|");
        }
    }

    public void insertShape(Shape S) //get block array
    {
        for(int i=0;i<4;i++)
        {
            int r = S.getshape()[0].getX();
            int c = S.getshape()[1].getY();
            arr[r][c] = '#';
        }
    }
}