package hackerrank;

import java.util.*;

class DataTypes {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int ii = 1; ii < t; ii++) {
			try {
				long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                int pow = 8;
                for(int jj = 0;jj<4;jj++) {
                	 String type = "";
                	 long min=0;
                	 long max=0;
                	 if (pow == 8) {
                         type = "byte";
                         min=Byte.MIN_VALUE;
                         max=Byte.MAX_VALUE;
                     } else if (pow == 16) {
                         type = "short";
                         min=Short.MIN_VALUE;
                         max=Short.MAX_VALUE;
                     } else if (pow == 32) {
                         type = "int";
                         min=Integer.MIN_VALUE;
                         max=Integer.MAX_VALUE;
                     } else if (pow == 64) {
                         type = "long";
                         min=Long.MIN_VALUE;
                         max=Long.MAX_VALUE;
                     } 
                     pow *=2;
                	 if(x >= min && x <= max) {
                         if(!type.equals("")){                 
                             System.out.println("* " + type); 
                         } else {
                             System.out.println(x+" can't be fitted anywhere.");
                         }                   
                     }
                }
                
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}
