
public class Table1 {
    void printtable(int n){
        for(int i=1;i<=n;i++){
            System.out.println(""+n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
