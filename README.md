# java_practice

package weekEightProject;
//w8 problem2

import java.util.Scanner;

class asterisks
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] a=new int[4];
        String[] citi_names = new String[4];
        for(int i=0; i<4; i++)
        {
            System.out.println("Enter name of caption : ");
            citi_names[i] = in.next();
            System.out.println("Enter value for " + citi_names[i] + ": ");
            a[i] = in.nextInt();
        }
        int max = a[0];
        for(int i=1; i<4; i++)
        {
            if(a[i] > max)
            max = a[i];
        }
        System.out.println();
        for(int i=0; i<4; i++)
        {
            System.out.print(citi_names[i]+ " ");
            for(int k=0; k<(40*a[i]/max); k++)
            System.out.print("*");
            System.out.println();
        }
    }
}
