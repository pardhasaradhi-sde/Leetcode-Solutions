import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
       Arrays.sort(folder);
       List<String> l1=new ArrayList<>();
       String prev=folder[0];
       l1.add(prev);
       for(int i=1;i<folder.length;i++)
       {
        if(!folder[i].startsWith(prev+"/"))
        {
            prev=folder[i];
            l1.add(prev);
        }
       }
       return l1;
    }
}
