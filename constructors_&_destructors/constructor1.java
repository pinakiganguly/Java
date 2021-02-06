package Pinaki;

class A2{
    A2(){
        System.out.println("Inside A's constructor");
    }
}

class B2 extends A2{
    B2(){
        System.out.println("Inside B's constructor");
    }
}
class C1 extends B2{
    C1(){
        System.out.println("Inside C's constructor");
    }
}
class constructor1{
    public static void main(String args[]) {
        C1 c=new C1();
        
    }
}
