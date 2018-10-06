import java.util.*;
class number
{
	private int value;
	number()
	{
		value=-999;
	}
	number(int value)
	{
		this.value=value;
	}
	void setValue(int value)
	{
		this.value=value;
	}
	int getValue()
	{
		return this.value;
	}
	public int hashCode()
	{
		return (10*value)+10;
	}
	public boolean equals(Object o)
	{
		number n=(number)o;
		if(n.getValue()==this.value)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class compareSet
{
	public static void main(String[] args)
	{
		int n1,n2,i;
		Set <number> s1=new HashSet<>();
		Set <number> s2=new HashSet<>();
		Scanner s=new Scanner(System.in);
		System.out.println("FOR SET 1 :- ");
		System.out.print("Enter the number of elements :- ");
		n1=s.nextInt();
		System.out.println("Start entering the elements :- ");
		for(i=0;i<n1;i++)
		{
			s1.add(new number(s.nextInt()));
		}
		System.out.print("\nSet 1 :- ");
		for(number num:s1)
		{
			System.out.print(num.getValue()+" ");
		}
		System.out.println("\n");
		System.out.println("FOR SET 2 :- ");
		System.out.print("Enter the number of elements :- ");
		n2=s.nextInt();
		System.out.println("Start entering the elements :- ");
		for(i=0;i<n2;i++)
		{
			s2.add(new number(s.nextInt()));
		}
		System.out.print("\nSet 2 :- ");
		for(number num:s2)
		{
			System.out.print(num.getValue()+" ");
		}
		System.out.println("\n");
		System.out.println("Removing elements from s1 that are not in s2...");
		s1.retainAll(s2);
		System.out.println("Removing elements from s2 that are not in s1...");
		s2.retainAll(s1);
		System.out.println("DONE");
		System.out.println("\nSet 1 :-");
		for(number num:s1)
		{
			System.out.print(num.getValue()+" ");
		}
		System.out.println("\n");
		System.out.println("\nSet 2 :- ");
		for(number num:s2)
		{
			System.out.print(num.getValue()+" ");
		}
		System.out.println("\n");
		s.close();
	}
}