import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        
        String prev = folder[0];
        result.add(prev);
        
        for (int i = 1; i < folder.length; i++) {
            if (!folder[i].startsWith(prev + "/")) {
                prev = folder[i];
                result.add(prev);
            }
        }
        
        return result;
    }
}
