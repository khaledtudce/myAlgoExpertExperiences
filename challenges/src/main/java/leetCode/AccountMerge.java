package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class AccountMerge {
	
	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		Map<String, List<String>> mergedAccountMap = new HashMap();
		List<List<String>> unmergedAccount = new ArrayList<List<String>>();
		for (List<String> account : accounts) {
			String name = "";
			List<String> emails = new ArrayList<String>();
			for (String item : account) {
				if(name=="") {
					name = item;
					continue;
				}
				emails.add(item);
			} 
			
			if(mergedAccountMap.size()==0 || !mergedAccountMap.containsKey(name))
				mergedAccountMap.put(name, emails);
			else{
				for (String accName : mergedAccountMap.keySet()) {
					List<String> existedEmails = mergedAccountMap.get(accName);
					
					if(isAtLeastOneSameValueExists(existedEmails, emails)) {
						for (String item : existedEmails) {
							if (!emails.contains(item))
								emails.add(item);
						}
						mergedAccountMap.put(name, emails);
						break;
					}else{
						List<String> accInfo = addAllItems(emails, name);
						unmergedAccount.add(accInfo);
						break;
					}
				}
			}
				
		}
		
		return mergeSortedAndUnsorted(mergedAccountMap, unmergedAccount);
	}

	private boolean isAtLeastOneSameValueExists(List<String> existedEmails, List<String> emails) {
		for (String item : emails) {
			for (String existedItem : existedEmails) {
				if(item.equals(existedItem))
					return true;
			}
		}
		return false;
	}

	private List<List<String>> mergeSortedAndUnsorted(Map<String, List<String>> mergedAccountMap,
			List<List<String>> unmergedAccount) {
		for (String name : mergedAccountMap.keySet()) {
			List<String> accInfo = addAllItems(mergedAccountMap.get(name), name);
			unmergedAccount.add(accInfo);
		}
		
		return unmergedAccount;
	}

	private List<String> addAllItems(List<String> accounts, String accName) {
		List<String> accInfo = new ArrayList<String>();
		accInfo.add(accName);
		for (String item : accounts) {
			accInfo.add(item);
		}
		return accInfo;
	}
	
	
	
	
	public List<List<String>> accountsMerge1(List<List<String>> accounts) {
		
        Map<String, String> emailToName = new HashMap();
        Map<String, ArrayList<String>> graph = new HashMap();
        for (List<String> account: accounts) {
            String name = "";
            for (String oneString: account) {
                if (name == "") {
                    name = oneString;
                    continue;
                }
                graph.computeIfAbsent(oneString, x-> new ArrayList<String>()).add(account.get(1));
                graph.computeIfAbsent(account.get(1), x-> new ArrayList<String>()).add(oneString);
                emailToName.put(oneString, name);
            }
        }

        Set<String> seen = new HashSet();
        List<List<String>> answer = new ArrayList();
        for (String email: graph.keySet()) {
            if (!seen.contains(email)) {
                seen.add(email);
                Stack<String> stack = new Stack();
                stack.push(email);
                List<String> component = new ArrayList();
                while (!stack.empty()) {
                    String node = stack.pop();
                    component.add(node);
                    for (String nei: graph.get(node)) {
                        if (!seen.contains(nei)) {
                            seen.add(nei);
                            stack.push(nei);
                        }
                    }
                }
                Collections.sort(component);
                component.add(0, emailToName.get(email));
                answer.add(component);
            }
        }
        return answer;
    }
}

