package FacablePattern.Demo2;

public class Test {

    public static void main(String[] args) {

        System.out.println(test());

        int i, n = 0;

        double x = 1, y1 = 2.1 / 1.9, y2 = 1.9 / 2.1;



        for ( i = 1; i < 22; i++)

            x = x * y1;


        while ( x != 1.0 )

        {

            x = x * y2; n++;

        }


        System.out.println(n);



    }

    private static int test() {

        int temp = 1;

        try {

            System.out.println(temp);

            return ++temp;

        } catch (Exception e) {

            System.out.println(temp);

            return ++temp;

        } finally {

            ++temp;

            System.out.println(temp);

        }

    }

}
