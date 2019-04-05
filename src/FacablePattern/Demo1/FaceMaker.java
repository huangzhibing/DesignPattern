package FacablePattern.Demo1;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class FaceMaker {
    private Shape A;
    private Shape B;
    private Shape C;

    public FaceMaker(){
        A = new A();
        B = new B();
        C = new C();
    }

    public void AA(){
        A.draw();
    }
    public void BB(){
        B.draw();
    }
    public void CC(){
        C.draw();
    }
}
