class Gen<T>
{
    T a1;
    Gen(T temp)
    { 
      a1=temp;
    }

    void show()
    {
        System.out.println(a1 + " " + a1.getClass());
    }
}

class Test1
{
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<String>("Hello");
        Gen<Integer> g2 = new Gen<Integer>(100);
        g1.show();
        g2.show();
    }
}