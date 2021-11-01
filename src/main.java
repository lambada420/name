public class main {


    public static void main(String[]args) throws InterruptedException {
        int x = 1000;
        int y = 7;
        System.out.println("я гуль");
        Thread.sleep(1000);
        while (y < x) {
            int z = x - y;
            String result = (x) + "-" + (y) + "=" + (z);
            x = z;
            System.out.println(result);
            Thread.sleep(60);

        }

    }
}
