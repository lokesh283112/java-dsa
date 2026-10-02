public class Loops {
    public static void main(String[] args) {
        int n = 5;

        //For loops
        for(int i = 0; i <= 5; i++)
        {
            System.out.print(i+" ");
        }

        //while loops
        while(n <= 10) {
            System.out.print(n + " ");
            n++;
        }

        //do...while loops
        do {
            n++;
            System.out.print(n + " ");
        }while(n <= 15);

        //Continue 
       for (int i = 17; i <= 25; i++) {
            if (i == 19) 
            {
            continue;
            }
            System.out.print(i + " ");
        }

        //break 
        for(int i = 26; i <= 30; i++)
        {
            if(i == 30)
            {
                break;
            }
            System.out.print(i + " ");
        }
    }
}