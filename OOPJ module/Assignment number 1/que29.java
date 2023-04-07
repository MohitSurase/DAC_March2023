class que29 {
    public static void main(String[] args) {
        
        double dbl = 10.12345;

        Double d=new Double(dbl);        
        
        byte b=d.byteValue();
        short s=d.shortValue();
        int i=d.intValue();
        float f= d.floatValue();
        double d2=d; 
        long l= d.longValue();


        System.out.println(""+b+"\n "+s+"\n "+i+" \n"+f+" \n"+d2+"\n "+l);

       
    }    
}
