package Proxy.example;

public class Proxy implements InterfaceService { 
    InterfaceService interfaceService01; 
    
    // Proxy : runSomething() 메서드를 호출
    // InterfaceService의 메소드를 구현하지만 
    // 실제로는 Service 클래스의 runSomething() 메서드도 호출한다.
    // runSomething()을 수행하기 이전에 필요 기능을 추가할 수 있음
    @Override 
    public String runSomething() { 
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달"); 
        interfaceService01 = new Service(); 
        return interfaceService01.runSomething(); 
    } 
}
