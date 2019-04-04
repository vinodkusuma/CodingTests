/**
 * 
 */
package com.pickyourtrail.test;

import java.util.Scanner;

/**
 * @author Vinod 
 *
 *
 */
public class MudWalls {

	public static int maxHeight(int[] stickPositions, int[] stickHeights) throws ArrayIndexOutOfBoundsException {
        int n = stickPositions.length;
        int m = stickHeights.length;
        int max = 0;
 
        for (int i=0; i<n-1; i++) {
            if (stickPositions[i]<stickPositions[i+1]-1) {
                // We have a gap
                int heightDiff =  Math.abs(stickHeights[i+1] - stickHeights[i]);
                int gapLen = stickPositions[i+1] - stickPositions[i] - 1;
                int localMax = 0;
                if (gapLen > heightDiff) {
                    int low = Math.max(stickHeights[i+1], stickHeights[i]) + 1;
                    int remainingGap = gapLen - heightDiff - 1;
                    localMax = low + remainingGap/2;
 
                } else {
                    localMax = Math.min(stickHeights[i+1], stickHeights[i]) + gapLen;
                }
 
                max = Math.max(max, localMax);
            }
        }
 
        return max;
    }
 
    public static void main(String[] args)  {
        try {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("please enter how many stickPositions");
        int n = scanner.nextInt();
        int[] stickPositions = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.println("please enter the stickPosition value at "+i);
            stickPositions[i] = scanner.nextInt();
        }
        System.out.println("please enter how many stickHeight");
        n = scanner.nextInt();
        int[] stickHeights = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.println("please enter the stickHeight value at "+i);
            stickHeights[i] = scanner.nextInt();
        }
 
 
        int result=maxHeight(stickPositions, stickHeights);
        System.out.println(result);
        }catch(ArrayIndexOutOfBoundsException ex) {
        	ex.printStackTrace();
        }catch (Exception e) {
			e.printStackTrace();
		}
    }
}
