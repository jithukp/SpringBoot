interface calc
{
	int add(int a,int b);
}

class add implements calc
{
public void add(int a,int b)
{
return a+b;
}
}