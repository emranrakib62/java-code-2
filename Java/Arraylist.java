
public class Arraylist {
    public static void main(String args[]) {
ArrayList<String> al = new ArrayList<String>();
al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
System.out.print("Contents of list: ");
Iterator<String> itr = al.iterator();
while(itr.hasNext()) {
Object element = itr.next();
System.out.print(element + " ");
}
    }
}