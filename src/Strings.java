public class Strings {

    public static void main (String[] args) {
// 2a task
        System.out.println("x        x");
        System.out.println("  x    x  ");
        System.out.println("    xx    ");
        System.out.println("   x  x   ");
        System.out.println("  x    x  ");
        System.out.println("x        x");
// 2b task
        System.out.println("\n");
        System.out.println("x=====x");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("x=====x");
// 2c task
        System.out.println("\n");
        System.out.println("******************");
        System.out.println("* Tadas Naudziunas *");
        System.out.println("******************");
// 4 task
        System.out.println("x        x \n" +
                "  x    x  \n" +
                "    xx    \n" +
                "   x  x   \n" +
                "  x    x  \n" +
                "x        x\n");

        System.out.println("\n x=====x \n" +
                " |     | \n" +
                " |     | \n" +
                " |     | \n" +
                " x=====x \n");

        System.out.println("\n ****************** \n" +
                " * Tadas Naudziunas * \n" +
                " ******************");


        // Task 7

        String name = "Tadas";
        System.out.println(name.toUpperCase());
        // Task 8
        System.out.println("\n");
        String xxx = ("x        x \n" +
                "  x    x  \n" +
                "    xx    \n" +
                "    xx   \n" +
                "  x    x  \n" +
                "x        x\n");
        // System.out.println(xxx.length());
        System.out.println(xxx.substring(0, 33));
        // Task 9
        System.out.println("\n");
        String xx = ("x   x  \n" +
                " xx  \n" +
                " xx  \n" +
                "x   x  \n");
        System.out.println(xx.substring(0, xx.indexOf("xx") + 3));


    }
}
