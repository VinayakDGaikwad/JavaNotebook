class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        
         int[] sector_counter = new int[n];
        
        boolean first_run_flag = true;

        for(int r = 1; r <= (rounds.length); r++){ // for each element in rounds
            
            System.out.println(r);
            int currentPosition = 0;
           
            if (first_run_flag == true){
                System.out.print("first run");
                currentPosition = rounds[r-1]-1;
                first_run_flag = false;
            }else{
                currentPosition = rounds[r-1]-1;
            }
            
            
            System.out.print("\nloop starts:" + currentPosition + "should end at" + (rounds[r]-1));
            
            for (int w = currentPosition; w <= 100; w++){
               
                if (currentPosition == (rounds[r])) break; //stopping condition 
              
                currentPosition = (currentPosition + 1) % (n);
                System.out.print("\n sector incremented " + currentPosition );
               
                sector_counter[currentPosition]++; // remmber this sector was travesered
                           
          }
        
        }      

        
        int max =0;
         for (int i = 1; i < sector_counter.length; i++) {
            if (sector_counter[i] > max) {
                max = sector_counter[i];
            }
        }
        
         List<Integer> indices = new ArrayList<>();
        
        // Iterate through the array to find indices with the target number
        for (int i = 1; i < sector_counter.length; i++) {
            if (sector_counter[i] == max) {
                indices.add(i);
            }
        }
                                    
        return indices;
         
    }
}