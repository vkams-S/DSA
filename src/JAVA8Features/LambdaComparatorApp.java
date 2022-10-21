package JAVA8Features;

import java.util.Comparator;
import java.util.LinkedList;

class  sortByComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.price > o2.price)		return 1;
        else if (o1.price < o2.price)	return -1;
        else							return 0;
    }
}
public class LambdaComparatorApp {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Adidas Alphabounce", 5000);
        Product p2 = new Product(201, "Adidas BackPack", 3000);
        Product p3 = new Product(701, "Nike Track Suit", 4300);
        Product p4 = new Product(301, "Apple iPhone", 70000);
        Product p5 = new Product(501, "Samsung LED TV", 45000);

        LinkedList<Product> prdList = new LinkedList<>();
        prdList.add(p1);
        prdList.add(p2);
        prdList.add(p3);
        prdList.add(p4);
        prdList.add(p5);
        //anonymous class
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.price > o2.price) return 1;
                else if (o1.price < o2.price) return -1;
                else return 0;
            }
        };

        Comparator<Product> lambda = (o1, o2) -> {

            if (o1.price > o2.price) return 1;
            else if (o1.price < o2.price) return -1;
            else return 0;

        };

        //prdList.sort(new sortByComparator());
        //prdList.sort(comparator);
        //prdList.sort(lambda);
        /*prdList.sort((o1, o2) -> {

            if (o1.price > o2.price) return 1;
            else if (o1.price < o2.price) return -1;
            else return 0;

        });*/
        prdList.sort((o1,o2) ->{
            return o1.name.compareTo(o2.name);
        });
        /*for (Product product : prdList) {
            System.out.println(product);

        }*/
        prdList.forEach((product -> System.out.println(product)));
    }
}
