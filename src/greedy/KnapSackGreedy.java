package greedy;

import java.util.ArrayList;

public class KnapSackGreedy {
   /* KnapSack 0/1 problem
    double[] weights = {1, 3, 5, 4, 2};
    double[] values = {5, 10, 15, 7, 4};*/
   ArrayList<product> products;
   int capacity=11;
   KnapSackGreedy()
   {
       product product1 = new product(1,5);
       product product2 = new product(3,10);
       product product3 = new product(5,15);
       product product4 = new product(4,7);
       product product5 = new product(2,4);

       products = new ArrayList<>();
       products.add(product1);
       products.add(product2);
       products.add(product3);
       products.add(product4);
       products.add(product5);
   }
   int getMaxValue(){
       int maxValue =0;
       products.sort((p1,p2)->{
           if(p1.ratio<p2.ratio) return 1;
           else if(p1.ratio>p2.ratio) return -1;
           else return 0;
       });

       products.forEach((p) -> System.out.println(p));
       System.out.println();

       for(product p:products)
       {
           if(capacity - p.weight >=0)
           {
               maxValue+=p.value;
               capacity-=p.weight;
           }
       }
       return maxValue;
   }
    public static void main(String[] args) {
      KnapSackGreedy App = new KnapSackGreedy();
        System.out.println(App.getMaxValue());
    }
}
