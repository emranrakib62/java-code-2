
public class Throws {
    public static void main(String[] args) {
        try{
            throw new Exception("Darshan custom Exception");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 
}
