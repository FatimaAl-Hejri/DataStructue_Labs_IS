
package Stack;

public class Main {
    public static void main(String[] args) {
        LinkdStack<Integer> lstack =new LinkdStack<Integer>();
        lstack.push(1);
        lstack.push(80);
        lstack.push(5);
        lstack.push(12);
        System.out.println("the top is "+lstack.top());
        while (!lstack.isEmpty()){
            System.out.println("element removed="+lstack.pop());
        }

        //lstack.display();





    }
}

