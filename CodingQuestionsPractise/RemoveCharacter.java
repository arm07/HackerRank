
public class RemoveCharacter {

	//Write a method that will remove given character from the String
	    public static void main (String [] t) {       
	    	 System.out.println (removeCharInString ("My nameE is Raeshmietha Maery Alleam",  'e'));    
	       }

	      public static String removeCharInString (String string, char charToBeRemoved) {
	        if (string == null)
	             return "";      
	    	    StringBuilder strBuild = new StringBuilder ();

	        for (int i = 0; i < string.length (); i++) {
	            char chr = string.charAt (i);
	            if (chr == charToBeRemoved)
	                continue;
	            strBuild.append (chr);
	        }
	        return strBuild.toString ();
	    }
	}