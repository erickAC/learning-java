import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Lambda {
    
	public void main(String[] args ) {

		List<Integer> array = Arrays.asList(1,2,3,4);
		array.stream()
			 .forEach(x -> System.out.println(x));
		
	}
	
}
