import datastructures.usingArray.Stack;

public class Runner {

    public static void main(String[] args) {
        Stack st = new Stack(11);

        for(int i=0;i<10;i++){
            st.push(i);
        }

        for(int i=0;i<10;i++){
            System.out.println(st.pop());
        }

    }
}
