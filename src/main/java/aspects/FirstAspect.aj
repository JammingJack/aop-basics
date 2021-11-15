package aspects;

public aspect FirstAspect {
    // a point cut is a description of the list of join points targeted to insert a certain code
    pointcut pc1(): execution(* test.Application.main(..));

    before():pc1(){
        System.out.println("------------------------------------");
        System.out.println("Before method main from Aspect with AspectJ syntax ");
        System.out.println("------------------------------------");
    }
    after():pc1(){
        System.out.println("------------------------------------");
        System.out.println("After method main from Aspect with AspectJ syntax ");
        System.out.println("------------------------------------");
    }
}
