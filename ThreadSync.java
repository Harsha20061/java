class Table{
    synchronized void printTable(int n ){
        for(int i =0 ;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class MyThread extends Thread{
    Table t;
    MyThread(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}

public class ThreadSync{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread t1 = new MyThread(obj);
        t1.start();
        MyThread1 t2 = new MyThread1(obj);
        t2.start();
    }
}