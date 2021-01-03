package com.datastructure;


class function
{
	int[] stack = new int[5];
	int top = 0;
	int large;
	int current;
	void push(int element)
	{
		stack[top] = element;
		top++;
		
	}
	
	void maximum()
	{
		current = stack[0];
		System.out.println(current);
		for(int i=0; i<stack.length; i++)
		{
			
			if(stack[i]>current)
			{
				large = stack[i];
			}
			
		}
		
		System.out.println("Maximum value is: " + large);
	}
	
	void minimum()
	{
		current = stack[0];
		System.out.println(current);
		for(int i=0; i<stack.length; i++)
		{
			
			if(stack[i]<current)
			{
				large = stack[i];
			}
			
		}
		
		System.out.println("Manimum value is: " + large);
	}
	
	void show()
	{
		for(int n: stack)
			System.out.println( n);
		
	}
}



public class Stack {

	public static void main(String[] args) 
	{
		function obj = new function();
		obj.push(32);
		obj.push(42);
		obj.push(12);
		obj.push(62);
		obj.push(11);
		
		obj.maximum();
		obj.minimum();
		obj.show();

	}
	

}
