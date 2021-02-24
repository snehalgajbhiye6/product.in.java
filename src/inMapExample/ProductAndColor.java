package inMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ProductAndColor {

	public static void main(String[] args) {
		List bata=new ArrayList();
		bata.add("shoes");
		
		HashMap india=new HashMap();
		india.put("Bata",bata);
		
		HashMap world=new HashMap();
		world.put("India", india);
		
		Set worlds=world.keySet();
		for(Object obj1:worlds)
		{
			String worldkey=(String)obj1;
		    System.out.println(worldkey);
		    
		    HashMap setOfcountry=(HashMap)world.get(worldkey);
		    
		    Set country=setOfcountry.keySet();
		    for(Object obj2:country)
		    {
		    	String countrykey=(String)obj2;
		    	System.out.println("\t"+countrykey);
		    	
		    	List comapany=(List)setOfcountry.get(countrykey);
		    	for(Object obj3:comapany)
		    	{
		    		String comapanykey=(String)obj3;
		    		System.out.println("\t"+"\t"+comapanykey);
		    	}
		    }
		 }
		
	}	
		
}
