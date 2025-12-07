import java.util.*;

class Pgm9
{
    int a[][] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11,0},
        {12,13, 14,15}   
    };

    public void display()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[i][j] == 0)
                    System.out.print("_ ");
                else
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean isGoal()
    {
        int k=1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i==3 && j==3)
                    return a[i][j] == 0;

                if(a[i][j] != k)
                    return false;

                k++;
            }
        }
        return true;
    }

    public int[] findBlank()
    {
        int pos[] = new int[2];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[i][j] == 0)
                {
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        return pos;
    }

   public void move(char ch)
{
    int b[] = findBlank();
    int r = b[0];
    int c = b[1];

    if(ch=='w' && r > 0)   // UP
    {
        a[r][c] = a[r-1][c];
        a[r-1][c] = 0;
    }
    else if(ch=='s' && r < 3)  // DOWN
    {
        a[r][c] = a[r+1][c];
        a[r+1][c] = 0;
    }
    else if(ch=='a' && c > 0)  // LEFT
    {
        a[r][c] = a[r][c-1];
        a[r][c-1] = 0;
    }
    else if(ch=='d' && c < 3)  // RIGHT
    {
        a[r][c] = a[r][c+1];
        a[r][c+1] = 0;
    }
    else
    {
        System.out.println("Invalid move");
    }
}

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Pgm9 obj = new Pgm9();

        System.out.println("Initial Board:");
        obj.display();

        while(true)
        {
            System.out.println("Move (w=up, s=down, a=left, d=right):");
            char ch = s.next().charAt(0);

            obj.move(ch);
            obj.display();

            if(obj.isGoal())
            {
                System.out.println("Puzzle Solved!");
                break;
            }
        }
    }
}
