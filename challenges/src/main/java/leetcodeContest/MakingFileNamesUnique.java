package leetcodeContest;

import java.util.HashMap;
import java.util.Map;

public class MakingFileNamesUnique {
	
	public String[] getFolderNames(String[] names) {
		Map<String, Integer> namesMap = new HashMap<String, Integer>();
		for (int i = 0; i < names.length; i++) {
			names[i] = getName(names[i], namesMap);
		}
		
		return names;
    }
	
	private String getName(String name, Map<String, Integer> namesMap) {
		if (namesMap.containsKey(name)) {
			int n = namesMap.get(name) + 1; // get the latest number and increase n + 1, as we need to make next name
			while(namesMap.containsKey(name+"("+ n +")")) // it will increase the number, if next number exists
				n++;
			
			namesMap.put(name, n); // update the new the name in the map
			name = getName(name+"("+ n +")", namesMap); // by recursive call check it again if this new generated name exists, return otherwise
		}else 
			namesMap.put(name, 0);
		
		return name;
	}
	
	
	
    public String[] getFolderNames2(String[] names) {
        Map<String, Integer> map = new HashMap<>();        
        for (int i=0; i < names.length; i++){
            names[i] = getName(map, names[i]);
        }
        return names;
    }

    private String getName(Map<String, Integer> map, String name){
        if (map.containsKey(name)){                
            int n = map.get(name) + 1;

            while (map.containsKey(name + "(" + n + ")")){
                n++;
            }
            map.put(name, n);    
            name = getName(map, name + "(" + n + ")");
        } else {
            map.put(name, 0);
        }
        return name;
    }
	

	String oldName = "";
	public String[] getFolderNames1(String[] names) {
		String[] result = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			if(i==0) {
				result[i]= names[i];
				continue;
			}
			oldName = names[i];
			String newName = generateNewName(names[i], result, 1);
			result[i]= newName;
		}
		
		return result;
    }

	private String generateNewName(String name, String[] result, int p) {
		if(isThisNameExists(name, result)){
			name = getNewName(p, result);
		}
		
		return name;
	}

	private String getNewName(int p, String[] result) {
		
		String name = oldName+"("+ p +")";
		if(isThisNameExists(name, result)) {
			name = getNewName(++p, result);
		}
		
		return name;
	}

	private boolean isThisNameExists(String name, String[] result) {
		for (int i = 0; i < result.length; i++) { 
			if (name.equals(result[i])) 
				return true;
		}
		return false;
	}

}
