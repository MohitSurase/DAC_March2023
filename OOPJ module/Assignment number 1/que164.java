
class que164{
    public static void main(String[] args) {
        
        //int value into binary, octal and hexadecimal string.

        int i=10;

        String s1= Integer.toBinaryString(i);
        
        String s2= Integer.toHexString(i);
        
        String s3= Integer.toOctalString(i);
        
        System.out.println("Binary: "+s1+"\nHexadecimal :"+s2+"\nOctal:"+s3);
    }   
}




