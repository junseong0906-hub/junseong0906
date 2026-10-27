class Hello{
    public String name;

    Hello(String name) { this.name = name; }    
    void setName(String n) { name = n; }    
    String getName() { return name; }    
    void sayHello() {
        System.out.println("hello " + name);
    }
}

class TestPublicHello {
    public static void main(String[] args){
        Hello h = new Hello("world");    
        h.sayHello();
        h.setName("jsl");
        h.sayHello();
        h.name = "Yongjoo Cho";
        h.sayHello();
    }
}

