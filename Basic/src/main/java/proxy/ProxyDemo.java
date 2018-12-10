package proxy;

/**
 * Created by tony on 2018/6/5.
 */
public class ProxyDemo {

    public static void main(String args[]){

        BaseImpl impl = new BaseImpl(10);
        Proxy p = new Proxy(impl);
        p.print();
    }
}

interface Base{

    void print();
}

/**
 * 委托类
 */
class BaseImpl implements Base {

    private int x;

    public BaseImpl(int x) {
        this.x = x;
    }

    public void print(){
        System.out.println(x);
    }
}

class Proxy implements Base {

    private Base b;

    public Proxy(Base base){
        this.b = base;
    }
    public void print(){

        b.print();
    }
}