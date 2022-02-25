
import java.util.ArrayList;
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
public class Stream {
      
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Erick");
        list.add("Erick");
        list.add("Erick");
        
        System.out.println(list.stream().getClass());
        System.out.println(list.stream().count());
    }
    
   
    
}
