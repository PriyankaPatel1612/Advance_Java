//multuple placeholders
class Gen<P,W>
{
    P a1;
    W a2;
    Gen(P temp1, W temp2)
    { 
      a1=temp1;
      a2=temp2;
    }

    void show()
    {
        System.out.println(a1 + " " + a1.getClass());
        System.out.println(a2 + " " + a2.getClass());
    }
}

class Test2
{
    public static void main(String[] args) {
        Gen<Integer,String> g1 = new Gen<Integer,String>(100,"Hello");
        Gen<Integer,Double> g2 = new Gen<Integer,Double>(100,235.456);
        g1.show();
        g2.show();
    }
}

