package CollectionPractice;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push("Sohan");
        st.push("Shalu");
        st.push("shilpi");
        st.push("Shilpi");
        st.push(100);
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);

    }



}
