package DayTry.Day9.Multithreadtasks;

public class TestThreads {
    public static void main (String[] args){
       bankregister atm = new bankregister();
       registerupdate bankreg = new registerupdate();

        atm.start();
        bankreg.start();
    }
}

class bankregister extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Please Register Here");
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("System Over Loading");
            }
        }
    }

}

class registerupdate extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Registered Successfully");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                System.out.println("Registered Progress Loading");
            }
        }
    }
}