public class Main {

    public static void main(String[] args) {
        KronometreThread Thread1 = new KronometreThread("thread1");

        KronometreThread Thread2 = new KronometreThread("thread2");

        KronometreThread Thread3 = new KronometreThread("thread3");

        Thread1.start();
        Thread2.start();
        Thread3.start();


    }
}
