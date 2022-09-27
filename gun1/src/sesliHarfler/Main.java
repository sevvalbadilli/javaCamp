package sesliHarfler;

public class Main {

	public static void main(String[] args) {

        char harf = 'j';
        
        switch(harf) {
               case 'A':
               case 'I':	   
               case 'O':
               case 'U':	 
            	   System.out.println("kaın sesli harf");
            	   break;
               default:
                   System.out.println("ince sesli harf");
        }
		
	}

}
