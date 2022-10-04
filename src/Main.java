public class Main {
    public static void main(String[] args)
    {
        int n = args.length;
        float s=0;
        int[] argList = new int[n];
        for(int i=0; i<n; i++)
        {
            argList[i] = Integer.parseInt(args[i]);
            s+=argList[i];
        }
        s=s/n;
        System.out.println(s);
    }
}