public class Threads{
    public static void main(String[] args) {
        int sum = 0;
        if (args.length < 1 || args[0].isBlank()) {
        System.out.println("usage: java ThreadDriver <number>");
        return;
        }
        int upper = Integer.parseInt(args[0]);
        MyThread thread = new MyThread(upper);
        thread.start();
        try {
        thread.join();
        sum = thread.getSum();
        } catch (InterruptedException ie) {}
        System.out.println("sum = " + sum);
        System.exit(0);
    }
}