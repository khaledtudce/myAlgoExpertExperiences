package leetcodeContest;

import java.util.ArrayList;
import java.util.List;

public class AvoidFloodInTheCity {
   
	public int[] avoidFlood(int[] rains) {
        
		List<Integer> waterFullLakes =  new ArrayList<Integer>();
		int driableLakes = 0;
		List<Integer>result = new ArrayList<Integer>();
		
		for (int i = 0; i < rains.length; i++) {
			if(driableLakes>0 && waterFullLakes.contains(rains[i])){
				// Empty it and insert in waterFullLakes, that means do nothing
				driableLakes--;
				result.add(rains[i]);
				continue;
			}
			
			if(waterFullLakes.contains(rains[i])){
				waterFullLakes.remove(rains[i]);
				result.add(rains[i]);
			}
			
			if(rains[i] != 0) {
				waterFullLakes.add(rains[i]);
				result.add(-1);
			}else {
				if(waterFullLakes.isEmpty())
					result.add(1);
				else
					driableLakes++;
				if(waterFullLakes.size()==driableLakes) {
					result.addAll(waterFullLakes);
					waterFullLakes.removeAll(waterFullLakes);
					driableLakes = 0;
					continue;
				}
				
			}	
		}
		
		return result.stream().mapToInt(k->k).toArray();
    }
}
