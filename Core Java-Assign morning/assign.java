import java.util.*; 

public class assign
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int n;
        System.out.print("Enter value of n");
        n=sc.nextInt();
        
        System.out.print("Enter "+ n +" values");
        
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr.add(x);
        }

        Collections.sort(arr); 

        System.out.print(arr);

    }
}