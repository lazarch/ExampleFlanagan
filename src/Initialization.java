/**
 * Created by alex on 24-Dec-16.
 */
class Initialization
{
    int i;
    short z = 10;
    static int x;
    static float y;
    static
    {
        x = 2000;
        y = (float) 3.141;
    }
    Initialization()
    {
        System.out.println("i="+i);
        System.out.println("z="+z);
        z = 20;
        System.out.println("z="+z);
    }

    public static void main(String[] args) {
    Initialization initialization = new Initialization();
        System.out.println("initialization.value primary=" +initialization.i);

    }
}