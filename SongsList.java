package main;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SongsList {
	 LinkedHashMap<String,String> map;
	    int capacityCheck;
	    int capacity;

	    public SongsList(int capacity) {
	        map=new LinkedHashMap<>();
	        capacityCheck=0;
	        this.capacity=capacity;
	    }

	public void set(String user, String song) {
	        if(map.containsKey(user))
	        {
	            map.remove(user);
	            map.put(user,song);

	        }else
	        {          
	              if(capacityCheck<capacity)
	               {
	                    map.put(user,song);
	                    capacityCheck++;
	               } else{
	                    removeFirstElement();
	                    map.put(user,song);
	               }
	           
	        }
	    }
	    
	public void removeFirstElement()
	    {
	       String mapFirstKey="-1";
	       for(Entry<String, String> entry:map.entrySet())
	       {
	           mapFirstKey=entry.getKey();
	           break;
	       }
	       map.remove(mapFirstKey);
	    }
}
