class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> s_p = new ArrayList<Character> ();
        ArrayList<Character> t_p = new ArrayList<Character> ();
        
        int s_size = 0;
        int t_size = 0;

        for(char w : s.toCharArray()){
                if (w == '#') {
                    if (s_size == 0){
                        break;
                    }
                     s_size--;
                    s_p.remove(s_size);
                   
                }else{
                    s_size++;
                    s_p.add(w);                     
                }
                
        }

        for(char w : t.toCharArray()){
                
                if (w == '#') {
                    if (t_size == 0){
                        break;
                    }
                    t_size--;
                    t_p.remove(t_size);
                    
                }else{
                    t_p.add(w); 
                    t_size++;
                }
        }
        System.out.println(t_p +"dsf"+ s_p);
        if (s_p.equals(t_p)){
            return true;
        }
        return false;

    }
}