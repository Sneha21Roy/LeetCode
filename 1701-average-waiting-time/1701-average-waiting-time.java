class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        long currentTime = 0;
        long totalWaitingTime = 0;
        
        for (int[] customer : customers) {
            
            int arrivalTime = customer[0];
            int cookingTime = customer[1];
            
            // Agar chef customer ke aane ke time tak free hai
            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            } else {
                // Chef already busy hai
                currentTime = currentTime;
            }
            
            currentTime = currentTime + cookingTime;
            
            totalWaitingTime = totalWaitingTime + 
                               (currentTime - arrivalTime);
        }
        
        return (double) totalWaitingTime / customers.length;
    }
}