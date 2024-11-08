package Revision;

class   A {
    public void run(){
        System.out.println("I am running");
    }
}

class StaticRevision {
    static A obj = new A(){};

    public static void main(String []args){
//        A obj = new A(){};
        obj.run();
    }
}
