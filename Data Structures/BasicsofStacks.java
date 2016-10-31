import java.io.*;
import java.util.*;

public class BasicsofStacks {

    public static void main(String[] args) throws Exception {
        int intArray[] =new int[99];
        int i=0;
        int j=0;
        int x=0;
        int y=0;
        int arrayRows=0;
        int arrayColumns=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        String stringArray[]= null;
        line = br.readLine();
        stringArray=line.trim().split(" ");
        Stack st = new Stack();

        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }

}
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
}
