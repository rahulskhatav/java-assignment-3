import java.util.Vector;

class Producer extends Thread{
    public synchronized void produce(Vector<Integer> arr){
        while(true){
            if(arr.size() >= 10)
                return;
            arr.addElement(1);
            System.out.println("Produced");
        }
    }
}

class Consumer extends Thread{
    public synchronized void consume(Vector<Integer> arr){
        while(true){
            if(arr.size() > 0){
                arr.removeElementAt(arr.size() - 1);
                System.out.println("Consumed");
            }
            if(arr.size() > 0){
                arr.removeElementAt(arr.size() - 1);
                System.out.println("Consumed");
            }
        }
    }
}

public class ProducerConsumer extends Thread {
    Producer P = new Producer();
    Consumer C = new Consumer();
    Vector<Integer> Market = new Vector<Integer>();
    public void beginConsuming(){
        this.start();
        C.consume(Market);
    }
    public void run(){
        P.produce(Market);
    }
    public static void main(String args[])    {
        ProducerConsumer World = new ProducerConsumer();
        World.beginConsuming();
    }
}
