
//Write a program that computes your initials from your full name and displays them.

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "Rashmitha Mary Allam";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
        	char tmp=myName.charAt(i);
            if (Character.isUpperCase(tmp)) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("Initials are: " + myInitials);
    }
}
