package javaTest;

public class Encapsulation {

	public static void main(String[] args)
	{
		Solution sl = new Solution();
		sl.setName("Rahul");
		System.out.println(sl.getName());
		sl.setAge(28);
		System.out.println(sl.getAge());
	}
}

class Solution
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age= age;
	}
}
