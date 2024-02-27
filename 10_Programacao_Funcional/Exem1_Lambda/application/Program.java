package application;

import java.util.ArrayList;
// import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));


        /* Comparator objeto de classe anônima */
        // Comparator<Product> comparator = new Comparator<Product>() {
        //     @Override
        //     public int compare(Product p1, Product p2) {
        //         return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //     } 
        // };  
		// list.sort(comparator);


        /* Comparator objeto de expressão lambda com chaves */
        // Comparator<Product> comparator = (p1, p2) -> {
        //     return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // };
		// list.sort(comparator);


        /* Comparator objeto de expressão lambda sem chaves */
        // Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		// list.sort(comparator);


        /* Comparator expressão lambda "direto no argumento" */
        list.sort( 
            (p1, p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) 
        );


		for (Product p : list) {
			System.out.println(p);
		}
	}
}