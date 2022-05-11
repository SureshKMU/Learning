package MyPackage;

public class PrintingChar {

	    public static void main(String[] args) {
	        String s = "Java world"+"#@%"+"";
	        char[] ch = s.toCharArray();
	        for(int i=0; i <ch.length;i++){
	            System.out.println(ch[i]);
	        }

	    }
	

}
