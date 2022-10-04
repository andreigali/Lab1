public class Main {
    public static void main(String[] args)
    {
        int n = args.length;
        float s=0;
        for(int i=0; i<n; i++)
            s+= Integer.parseInt(args[i]);

        s=s/n;
        System.out.println(s);
    }
}