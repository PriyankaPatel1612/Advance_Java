//AutoBoxing
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

class Test4
{
    public static void main(String[] args) {
        int n=100;
        Gen<Integer> g1 = new Gen<Integer>(n);
    }
}
