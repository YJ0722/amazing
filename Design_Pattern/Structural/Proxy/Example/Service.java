package Proxy.example;

public class Service implements InterfaceService { 
    // Service: InterfaceService Overriding → 실제 구현 부분
    @Override
    public String runSomething() { 
        return "TEST PAGE"; 
    }
}
