//Boxing
class Gen<T>
{
    T a1;
    Gen(T temp)
    { 
      a1=temp;
    }

    T show()
    {
        return a1;
    }
}

class Test3
{
    public static void main(String[] args) {
        Gen<Integer> g1 = new Gen<Integer>(100);
    }
}