package AutoWiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {
    @Autowired
    @Qualifier("b")
    private B ob;

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public A(B ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "A{" +
                "ob=" + ob +
                '}';
    }
    public A()
    {
        super();
    }
}
