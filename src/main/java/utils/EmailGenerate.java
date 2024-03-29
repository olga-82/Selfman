package utils;

public class EmailGenerate {
    public static void main(String[] args) {
        System.out.println( generateEmail(6,4,3));
    }

    public static String generateEmail(int a,int b,int c){
        if(a<0 ||b<0 ||c<0){

           throw new IllegalArgumentException
                   ("Invalid email address"+ a+"or"+b+"or"+c+" Lenght must be positive");
        }

   StringBuilder email = new StringBuilder();
        for(int i=0; i<a; i++){

            email.append(randomChar());
        }

        email.append("@");
        for(int i=0; i<b; i++){
            email.append(randomChar());
        }
        email.append(".");
        for(int i=0; i<c; i++){
            email.append(randomChar());
        }
        return email.toString();
    }

    private static char randomChar() {

        return (char)('a'+Math.random()*('z'-'a'));

    }
}
