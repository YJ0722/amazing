package Proxy.example;

public class ClientWithProxy { 
    public static void main(String[] args) { 
        InterfaceService proxy = new Proxy(); // 프록시를 이용한 호출 
        System.out.println(proxy.runSomething()); 
    } 
}
