class que284 {
    public static void main(String[] args) {
        
        //double value to strings
        double d = 10.5;
        
        Long l=Double.doubleToLongBits(d);    

        String s1=Long.toBinaryString(l);
        String s2=Long.toHexString(l);
        String s3=Long.toOctalString(l);


        System.out.println("BinaryString:"+s1+"\nHexString:"+s2+"\nOctalString:"+s3);
    }    
}
