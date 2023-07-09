import java.util.*;

public class TestTree2
{
	public static void main(String[] args) 
	{
		System.out.println("Tree Set Example!\n");
		TreeSet <Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(23);
		tree.add(34);
		tree.add(45);
		System.out.println(tree);
		Iterator i = tree.iterator();
		System.out.print("Tree set data: ");
		while (i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
		System.out.println();
		if (tree.isEmpty())
		{
			System.out.print("Tree Set is empty.");
		}
		else
		{
			System.out.println("Tree Set size: " + tree.size());
		}
		System.out.println("First data: " + tree.first());
		System.out.println("Last data: " + tree.last());
		if (tree.remove(34))
		{
			System.out.println("Data is removed from tree set");
		}
		else
		{
			System.out.println("Data doesn't exist!");
		}
		System.out.print("Now the tree set contain: ");
		i = tree.iterator();
		while (i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
		System.out.println();
		System.out.println("Now the size of tree set: " + tree.size());
		tree.clear();
		if (tree.isEmpty())
		{
			System.out.print("Tree Set is empty.");
		}
		else
		{
			System.out.println("Tree Set size: " + tree.size());
		}
	}
}