//Demon Threads are working in BackGround is called Demon Threads.
public class DemonThread extends Thread {
    public void run(){
        while(true)
        {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        DemonThread D = new DemonThread();
        D.setDaemon(true);
        D.start(); //Runnable ne start keya and runnable state mai Dala.
        System.out.println("Main done");
    }
}
