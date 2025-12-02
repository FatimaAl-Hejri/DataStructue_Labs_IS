package Arrays;



public class Main {
    public static void main(String[] args) {
        Arrayss arr= new Arrayss();
        int []numbers={1,2,3,4,5};

        int result=arr.linearSearch(numbers,8);

        if (result!=-1)
        System.out.println("value fountd at index:"+result);

        else
            System.out.println("value found not found  ");
       // numbers[2]=7


       // arr.input(numbers2);
        //arr.update(numbers,4,7);
        //arr.delete(numbers,4);

        //arr.shiftLeft_delete(numbers,2);
        //arr.Traversal(numbers);

      }
}

