class que204{
    public static void main(String[] args) {
        
        //long value into binary, octal and hexadecimal string.

        
        long l=100;

        String s1= Long.toBinaryString(l);
        String s2= Long.toHexString(l);
        String s3= Long.toOctalString(l);

        System.out.println("Binary: "+s1+"\nHexadecimal :"+s2+"\nOctal:"+s3);
    }    
}




