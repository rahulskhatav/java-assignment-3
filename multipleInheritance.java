interface calcAdd{
    int add(int x, int y);
}

interface calcSub{
    int sub(int x, int y);
}

class calc implements calcAdd, calcSub{
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x-y;
    }
}

public class multipleInheritance{
    public static void main(String args[]){
        calc A = new calc();
        System.out.println("1 + 2 = " + A.add(1, 2));
        System.out.println("1 - 2 = " + A.sub(1, 2));
    }
}