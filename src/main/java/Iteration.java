public class Iteration {

    private int num;
    private int range;

    public Iteration(int num, int range) {
        this.num = num;
        this.range = range;
    }

     public void getIteration(){
          for (int i = 0; i <= range; i++) {
             if (i % num == 0) {
                 System.out.println(i);

             }
         }
     }

}
