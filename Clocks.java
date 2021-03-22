class clock{
    public int hr, min, sec;
    clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public clock add(clock c1){
        clock c3 = new clock(0, 0, 0);
        c3.sec += c1.sec + this.sec;
        if(c3. sec >= 60){
            c3.min++;
            c3.sec -= 60;
        }
        c3.min += c1.min + this.min;
        if(c3. min >= 60){
            c3.hr++;
            c3.min -= 60;
        }
        c3.hr += c1.hr + this.hr;
        if(this.hr >= 24)
            this.hr -= 24;
        return c3;
    }
}


class Clocks{
    public static void main(String args[]){
        clock c1, c2;
        c1 = new clock(5, 23, 12);
        c2 = new clock(6, 38, 50);
        clock c3 = c1.add(c2);
        System.out.println(c1.hr + ":" + c1.min + ":" + c1.sec);
        System.out.println(c2.hr + ":" + c2.min + ":" + c2.sec);
        System.out.println(c3.hr + ":" + c3.min + ":" + c3.sec);
    }
}