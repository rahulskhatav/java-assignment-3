class printOOPS extends Thread{
    public void run(){
        for( int i = 0; i < 5; i ++ ){
            System.out.println("OOPS");
            try{
                sleep(2000);
            }catch(Exception e){ System.out.println(e);}
        }
    }
}

class printJAVA extends Thread{
    public void run(){
        for( int i = 0; i < 5; i ++ ){
            System.out.println("JAVA");
            try{
                sleep(2000);
            }catch(Exception e){ System.out.println(e);}
        }
    }
}

public class ThreadsPrint{
    public static void main(String args[]){
        printOOPS Obj1 = new printOOPS();
        Obj1.start();
        printJAVA Obj2 = new printJAVA();
        Obj2.start();
    }
}