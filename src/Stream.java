
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Stream {
      
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,8);
    
        //stream - fluxo de dados
//        lista.stream()
//        .skip(2)
//        .distinct()
//        .limit(3)
//        .forEach(e -> System.out.println(e));
     
//        	lista.stream()
//        	.limit(3)
//        	.map(e -> e * 2) //
//        	.forEach(e -> System.out.println(e));
        
//        	long count = lista.stream()
//        			.filter(e -> e % 2 == 0)
//        			.count();
//    
        
        List<Integer> newList =  lista.stream()
    			//.filter(e -> e % 2 == 0)
        		.map(e -> e * 3)
    			.collect(Collectors.toList());

        System.out.println(newList);
    
    }
    
   
    
}
