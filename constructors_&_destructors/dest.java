package Pinaki;

class dest
{
    int roll;
    String name;
    dest(int r, String s)
    {
        roll=r;
        name=s;
    }
    void show()
    {
        System.out.println("roll="+roll+"name="+name);
    }
    protected void finalize()
    {
        System.out.println("Object destroyed");
    }
    public static void main(String[] args) {
        dest s1=new dest(1,"A");
        s1.show();
        s1=null;
        System.gc();        
    }
}
