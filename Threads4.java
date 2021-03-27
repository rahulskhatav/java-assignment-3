import java.util.Vector;

class Thread1 extends Thread{
    public void run(){
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Vector<Integer> arr = new Vector<Integer>();
        int num;
        for( int i = 0; i < 5; i++ ){
            num = (int) (Math.random() * 100) + 1;
            if( num % 2 == 0 )
               t2.run(num);
            else
                t3.run(num);
            arr.addElement(num);
        }
        t4.run(arr);
    }
}

class Thread2 extends Thread{
    public void run(int x){
        System.out.println("Cubed: " + (int) Math.pow(x, 3));
    }
}

class Thread3 extends Thread{
    public void run(int x){
        System.out.println("Squared: " + (int) Math.pow(x, 2));
    }
}

class Thread4 extends Thread{
    public void run(Vector<Integer> x){
        int sum = 0;
        for( int i = 0; i < x.size(); i++ ){
            sum += x.elementAt(i);
        }
        System.out.println("Sum = " + sum);
    }
}

public class Threads4 {
    public static void main(String args[]){
        Thread1 t1 = new Thread1();
        t1.run();
    }
}
