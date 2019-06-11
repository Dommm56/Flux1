package ca.csf.dfc.main.console;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
//		 Function<Integer, Integer> id1 = Main::identite;
//		 System.out.println(id1.apply(123));
//		 
//		 Function<Integer, Integer> id2 = (Integer v) -> v;
//		 System.out.println(id2.apply(123)); 
//		 
//		 Function<Double,Double> care1 = Main::carre;
//		 System.out.println(care1.apply(2.0));
//		 
//		 Function<Double, Double> care2= (Double m) -> m*m;
//		 System.out.println(care2.apply(2.0));
		
		
		 //ADDITION
//		 BiFunction<Integer,Integer,Integer> fct =
//				 ( a,  b)->a+b;
//		System.out.println(fct.apply(1,2));	 
//		
//		//Multiplication
//		BiFunction<Integer,Integer,Integer> fct3 =
//				 ( a,  b)->a*b;
//		System.out.println(fct3.apply(2,2));
//		
//		 Function<Integer, Integer> id3 = v -> v;
//		 System.out.println(id3.apply(123));
//		 BiFunction<Integer, Integer, Integer> fct2 = (a, b) -> a + b;
//		 System.out.println(fct2.apply(123, 456)); 
//		 
		 //obtenirElement01_v01();
		 //obtenirSousListeCategorieCondiments_v01();
		// obtenirSousListePrixSupp100_v01();
		 //obtenirElement01_v02();
		// obtenirElement666_v02();
		//obtenirListeNomsProduits_v01();
		//obtenirListeCategorie_v01();
		//obtenirListeCategorie_v02();
		//obtenirListeNomsProduitsOrdonnes_v01();
		//obtenirListeCategorieORDONNE_v01();
		obtenirPrixMoyen_v01();

	}//fin main
	
	 public static Integer identite(Integer p_Valeur) {
		 return p_Valeur;     
		 }
	 
	 public static Double carre(Double p_Valeur) {
		 return p_Valeur*p_Valeur;
	 }
	 
	 private static void obtenirElement01_v01()     {         
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
		 List<Product> resultat = produits.stream()
    		 .filter(p -> p.getProductID() == 12)                 
    		 .collect(Collectors.toList());
		 resultat.forEach(System.out::println);     
     }
	 
	 private static void obtenirSousListeCategorieCondiments_v01()     {         
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
		 List<Product> resultat = produits.stream()
    		 .filter(p -> p.getCategory() == "Condiments")                 
    		 .collect(Collectors.toList());
		 resultat.forEach(System.out::println);     
     }
	 
	 private static void  obtenirSousListePrixSupp100_v01()     {         
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
		 List<Product> resultat = produits.stream()
    		 .filter(p -> p.getUnitPrice() >100)                 
    		 .collect(Collectors.toList());
		 resultat.forEach(System.out::println);     
     }
	 
	 private static void obtenirElement01_v02()     {
		 List<Product> produits = DonneesTestStream.createProductList(); 
		 Optional<Product> resultat = produits.stream()
				 .filter(p -> p.getProductID() == 12)                 
				 .collect(Collectors.reducing((a, b) -> null)); 
		 
	        if (resultat.isPresent()) {
	        	System.out.println(resultat.get());
	        	} else {
	        		System.out.println("Non present ou en double");
	        		}
	 
	 }
	 
	 private static void obtenirElement666_v02()     {
		 List<Product> produits = DonneesTestStream.createProductList(); 
		 Optional<Product> resultat = produits.stream()
				 .filter(p -> p.getProductID() == 666)                 
				 .collect(Collectors.reducing((a, b) -> null)); 
		 
	        if (resultat.isPresent()) {
	        	System.out.println(resultat.get());
	        	} else {
	        		System.out.println("Non present ou en double");
	        		}
	 
	 }
	 
	 private static void obtenirSousListeCategorieCondiments_v02()     {
		 List<Product> produits = DonneesTestStream.createProductList(); 
		 Optional<Product> resultat = produits.stream()
				 .filter(p -> p.getCategory() == "Condiments")                 
				 .collect(Collectors.reducing((a, b) -> null)); 
		 
	        if (resultat.isPresent()) {
	        	System.out.println(resultat.get());
	        	} else {
	        		System.out.println("Non present ou en double");
	        		}
	 
	 }
	 
	 private static void obtenirListeNomsProduits_v01() {
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
	     List<String> categories = produits.stream()                 
	    		 .map(p -> p.getProductName())                 
	    		 .collect(Collectors.toList());
	     categories.forEach(System.out::println);     
     }
	 
	 private static void obtenirListeCategorie_v01() {
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
	     List<String> categories = produits.stream()                 
	    		 .map(p -> p.getCategory())                 
	    		 .collect(Collectors.toList());
	     categories.forEach(System.out::println);     
     }
	 
	 private static void obtenirListeCategorie_v02() {
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
	     List<String> categories = produits.stream()                 
	    		 .map(p -> p.getCategory()).distinct()                 
	    		 .collect(Collectors.toList());
	     categories.forEach(System.out::println);     
     }
	 
	 private static void obtenirListeNomsProduitsOrdonnes_v01() {
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
	     List<String> categories = produits.stream()                 
	    		 .map(p -> p.getProductName())                 
	    		 .sorted()                 
	    		 .collect(Collectors.toList());                  
	     categories.forEach(System.out::println);     
	     } 
	 
	 private static void obtenirListeCategorieORDONNE_v01() {
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
	     List<String> categories = produits.stream()                 
	    		 .map(p -> p.getCategory()).sorted() .distinct()              
	    		 .collect(Collectors.toList());
	     categories.forEach(System.out::println);     
     }
	 
	 private static void obtenirPrixMoyen_v01() {
		 List<Product> produits = DonneesTestStream.createProductList(); 
	 
	     List<Double> categories = produits.stream()                 
	    		 .map(p -> p.getUnitPrice())             
	    		 .collect(Collectors.toList());
	     categories.forEach(System.out::println);     
     }
	 
	

}//fin class Main
