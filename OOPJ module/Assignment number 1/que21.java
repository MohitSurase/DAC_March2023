class que21 {
    public static void main(String[] args) {
        long lng=112;

        Long l=new Long(lng);;

        byte b= l.byteValue();
        Short shr=l.shortValue();
        int i=l.intValue();
        float f=(float)l;
        long l2=(long)l;
        double d=(double)l;

        System.out.println(""+b+"\n "+shr+"\n "+i+" \n"+f+" \n"+l2+"\n "+d);
    
    }    
}
