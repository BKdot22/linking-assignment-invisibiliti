package com.rutgers.pm2;

public class ProblemFour {
	
	String myString = null;
	
	public String ProblemFourA(String tmpString) {
		
		if (tmpString == null || tmpString.equals(""))
			return tmpString;
    	
    	// create a temporary character array of same size as that of string
    	char[] temp = new char[tmpString.length()];
        for (int i = 0, n = tmpString.length(); i < n; i++)
            temp[n - i - 1] = tmpString.charAt(i);
		
        myString = String.copyValueOf(temp);
		return myString;
    }
	
	public void ProblemFourB(int[][] arr, int sum) {
		
		int totalSize = 0;
        // calculate the total size for a single array 
        for (int idx = 0; idx < arr.length; idx++){
        	totalSize += arr[idx].length;
        }
        System.out.println("totalSize:" + totalSize);
        int [] newArr = new int[totalSize];
        
        // converting 2 dimensional array to 1 dimensional array
        int counter = 0;
        for (int idx = 0; idx < arr.length; idx++){
        	for (int idxj = 0; idxj < arr[idx].length; idxj++) {
        		newArr[counter] = arr[idx][idxj];
        		//System.out.print("newArr: " + newArr[counter] + ", ");
        		counter++;
        	}
        }
        //System.out.println("");
        int[] dupArr = newArr;
        for (int i = 0; i < newArr.length; i++) {
        	for (int j = i+1; j < dupArr.length; j++) {
        		if (sum == newArr[i] + dupArr[j]) {
        			System.out.println("(" + newArr[i] +", " + dupArr[j] + ")");
        		}
        	}
        }
	}
	
}