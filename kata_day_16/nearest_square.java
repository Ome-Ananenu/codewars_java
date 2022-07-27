public class CodeWarsMath {
    public static int nearestSq(final int n) {

        int m=n;
        int o=n;

        if (Math.sqrt(n)%1==0)
           return n;
        else
        {
            while (Math.sqrt(m)%1!=0)
            {
                m--;
            }
            while (Math.sqrt(o)%1!=0)
            {
                o++;
            }
            if(n-m<o-n)
                return m;
            else
                return o;
        }
    }
}