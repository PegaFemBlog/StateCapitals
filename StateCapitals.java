
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
        
        //purposely assigned wrong capitals to these two entries
        capitals.put("Colorado", "Hartford");
        capitals.put("Connecticut", "Denver");
        
        System.out.println(capitals.size());
        
        //called Colorado by its key, 
        //put in new capital for that state
        //calleed colorado again with the new capital
        String getColorado = capitals.get("Colorado");
        System.out.println(getColorado);
        capitals.put("Colorado","Denver");
        getColorado = capitals.get("Colorado");
        System.out.println(getColorado);
        
        //same process for connecticut
        String getConnect = capitals.get("Connecticut");
        System.out.println(getConnect);
        capitals.put("Connecticut", "Hartford");
        getConnect = capitals.get("Connecticut");
        System.out.println(getConnect);
        
    }
}
