import java.util.HashMap;
import java.util.Map;

public class StairClimber {

    Map<Integer,Integer> mp = new HashMap<>();

    public int helper(int n ){
        if(n<0) return 0;
        if(n==0) return 1;



        int one_stepper = helper(n-1);
        int two_stepper = helper(n-2) ;



        return one_stepper+ two_stepper;
    }

    public int helperwithDP(int n ){
        if(n<0) return 0;
        if(n==0) return 1;

        if(mp.containsKey(n)) return mp.get(n);

        int one_stepper = helper(n-1);
        int two_stepper = helper(n-2) ;

        mp.put(n,one_stepper+two_stepper);

        return one_stepper+ two_stepper;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(new StairClimber().helper(10));
        long end = System.nanoTime();
        System.out.println(end-start + "\tnanoTime without dp");

         start = System.nanoTime();
        System.out.println(new StairClimber().helperwithDP(10));
         end = System.nanoTime();
        System.out.println(end-start + "\tnanoTime with dp");



    }



}
