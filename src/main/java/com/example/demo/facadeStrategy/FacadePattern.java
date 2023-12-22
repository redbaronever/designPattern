package com.example.demo.facadeStrategy;

public class FacadePattern {
    private OldServiceA oldServiceA;
    private OldServiceB oldServiceB;
    private OldServiceC oldServiceC;
    public static final FacadePattern instance = new FacadePattern();
    private FacadePattern() {
        oldServiceA = new OldServiceA();
        oldServiceB = new OldServiceB();
        oldServiceC = new OldServiceC();
    }
    public static FacadePattern getInstance() {
        return instance;
    }

    public void someblatantLogic() {
        oldServiceA.doLogicA();
        oldServiceC.doLogicC();
    }

    public void someblatantLogic2() {
        oldServiceB.doLogicB();
        oldServiceC.doLogicC();
    }
}
