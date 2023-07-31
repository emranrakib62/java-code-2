
class Thread111 extends Thread{
    
    Table1 t;
    Thread111(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
