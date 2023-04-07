class que25 {
    public static void main(String[] args) {
        
        float flt=11.2f;
        Float f=new Float(flt);

        
        byte b= f.byteValue();
        short shr=f.shortValue();
        int i=f.intValue();
        long l=f.longValue();
        float f2=(float)f;
       
        double d=(double)f;

        System.out.println(""+b+"\n "+shr+"\n "+i+" \n"+f2+" \n"+l+"\n "+d);
    
    }    
}
