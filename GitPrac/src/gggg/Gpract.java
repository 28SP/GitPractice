package gggg;

//import git.Prac;

public class Gpract {
	public void m1()
	{
		System.out.println("method 1 is here");
		
	}
	public void m2()
	{
		m1();
		System.out.println("method 2 is here");
	}
	public static void main(String[] args)
	{
		Gpract obj=new Gpract();
		obj.m2();
	}
}
