package stringsDemo;

public class Main {

	public static void main(String[] args) {

        String mesaj = "Bügün hava çok güzel.";
        System.out.println(mesaj);
        
        
        System.out.println("eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" yaşasın "));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(mesaj);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
        
        String yeniMesaj = mesaj.replace(' ', '-') ;
        System.out.println(yeniMesaj);
        
        for ( String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
        
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
         		
	}

}