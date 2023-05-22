//import java.io.File;  // Import the File class
//import java.io.FileNotFoundException;  // Import this class to handle errors
//import java.util.Scanner; // Import the Scanner class to read text files

public class RamrodGenerator {
    public static void main(String[] args) {
	String data ="ABCDEFGHIJ";
        System.out.println(isRamrodWord(data));
            
    }
    
    static String isRamrodWord(String data){
	char[] ch = data.toCharArray();
	if (ch.length==10){
	    System.out.println(data); 
	    for (int i=0;i<ch.length;i++){
		for (int j=i+1;j<ch.length;j++){
		    if (ch[i]==ch[j]){
			System.out.println("duplikat");
			return "Inget RAMROD-ord";
		    }
		    else {
			System.out.println("i:"+i+":"+ch[i]);
			System.out.println("j:"+j+":"+ch[j]);
		    }
		    
		}
	    }
	}
	return "Är ett RAMROD-ord";

    }    
}

