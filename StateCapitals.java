
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bacag
 */
public class StateCapitals {
    public static void main(String[] args) {
        //instantiate an empty map
        Map<String, String> capitals = new HashMap<>();
        
        capitals.put("Alabama", "Montgommery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Pheonix");
        capitals.put("Arkansas", "Little Rock");
        capitals.put("California", "Sacramento");
        capitals.put("Colorado", "Hartford");
        capitals.put("Connecticut", "Denver");
        
        System.out.println(capitals.size());
    }
}
