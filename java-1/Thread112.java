
class Thread112 extends Thread{
    Table1 t;
     Thread112(Table1 t){
        this.t=t;
  }
    public void run(){
        t.printTable(100);
    }
}
