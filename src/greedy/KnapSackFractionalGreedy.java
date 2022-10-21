package greedy;

import java.util.ArrayList;

public class KnapSackFractionalGreedy {

    /* KnapSack 0/1 problem
    double[] weights = {10, 20, 30};
    double[] values = {60, 100, 120};*/
    ArrayList<product> products;
    ArrayList<product> productsInKnapSack;
    int capacity=50;
    KnapSackFractionalGreedy()
    {
        product product1 = new product(10,60);
        product product2 = new product(20,100);
        product product3 = new product(30,120);


        products = new ArrayList<>();
        productsInKnapSack = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

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
                productsInKnapSack.add(p);
            }else {
                // 20/30 =2/3;
               double fraction = capacity/p.weight;
               maxValue+=(p.value*fraction);
               capacity-=(p.value*fraction);
               productsInKnapSack.add(new product(p.weight*fraction,p.value*fraction));
               break;
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        KnapSackFractionalGreedy App = new KnapSackFractionalGreedy();
        System.out.println(App.getMaxValue());
        App.productsInKnapSack.forEach((p) -> System.out.println(p));
    }
}
