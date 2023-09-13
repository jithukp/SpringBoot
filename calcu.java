interface calc
{
	int add(int a,int b);
}

class add implements calc
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class sub implements calc
{
	public int sub(int a,int b)
	{
		return a-b;
	}
}