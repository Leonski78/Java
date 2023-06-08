/**
 * program
 */
public class program {

    public static void main(String[] args) {
        boolean f = true || false;
        System.out.println(f);
        boolean a = true ^ false;
        System.out.println(a);
        boolean c = true ^ true;
        System.out.println(c);
        boolean b = true && false;
        System.out.println(b);
         //System.out.println("Hello world!");
        String s = "qwerty";
        s.charAt(0);
        System.out.println(s.charAt(0));
        var d = "123";
        System.out.println(d.length());
        System.out.println(getType(d));
        int e = 123;
        System.out.println(e++);
        System.out.println(e++);
        System.out.println(++e);
        int g = 123;
        g = g-- - --g;
        System.out.println(g);
        boolean h = 123 != 234;
        System.out.println(h);
        int k = 10;
        System.out.println(k >> 1);
        System.out.println(k << 1);
        int l = 2, m = 3;
        int n = l + m;
        String res = l + "+" + m + "=" + n;
        System.out.println(res);
        System.out.printf("%d + %d = %d \n", l, m, n);

        int arr [][] = new int [4][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%d", arr[i][j]);
                }
            }  
    }
    static String getType (Object o) {
        return o.getClass().getSimpleName();
    }
        
}
