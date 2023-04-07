class que17 {
    public static void main(String[] args) {
        int itr=112;
        Integer i=new Integer(itr);

        byte b= i.byteValue();
        Short shr=i.shortValue();
        int i2=(int)i;
        float f=(float)i;
        long l=(long)i;
        double d=(double)i;

        System.out.println(""+b+"\n "+shr+"\n "+i+" \n"+f+" \n"+l+"\n "+d);
    
    }    
}
