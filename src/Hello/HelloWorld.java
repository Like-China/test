package Hello;

import java.util.ArrayList;

/**
 * 123
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("HelloWorld.main");

        int[] a = new int[]{1, 2, 34};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        ArrayList<Integer> like = new ArrayList<Integer>();
        like.add(1);
        for (int i = 0; i < like.size(); i++) {

        }
    }


}
