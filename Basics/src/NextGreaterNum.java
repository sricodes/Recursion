import java.util.Stack;

public class NextGreaterNum {

    public static void printNextGreater(int[] arr){
        Stack<Integer>  st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1 ; i < arr.length ; i++){

            int next = arr[i];
            if(!st.isEmpty()){
                int popped=st.pop();
                if(next<popped){
                    st.push(popped);
                    st.push(next);
                }else{
                    System.out.println("next greated element for " + popped + "  is   " + next);
                    while(!st.isEmpty() && st.peek()<next){
                        System.out.println("next greated element for " + st.pop() + "  is   " + next);
                    }
                    st.push(next);
                }
            }else{
                st.push(next);
            }



        }
        while (!st.isEmpty()){
            System.out.println("next greated element for " + st.pop() + "  is   " + -1);
        }


    }

    public static void main(String[] args) {
        printNextGreater(new int[]{12,23,45,7,2,22,80});
    }
}
