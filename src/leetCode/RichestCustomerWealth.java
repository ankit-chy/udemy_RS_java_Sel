package leetCode;

public class RichestCustomerWealth {
	
	   public static int maximumWealth(int[][] accounts) {
	        
	        
	         int maxSum = 0;

	        for(int i=0; i<accounts.length; i++){
	        	int sum = 0;
	            for(int j=0; j<accounts[i].length; j++){
	                sum = sum + accounts[i][j];
	            }
	            if(sum > maxSum){
	                maxSum = sum;
	            }
	            
	        }

	        return maxSum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] accounts = {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(accounts));

	}

}
