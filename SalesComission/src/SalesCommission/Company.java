package SalesCommission;
import java.util.Scanner;
public class Company {
	int [] companyList;
	int [] arr=new int[9];
	int n,sal;
	Scanner scan=new Scanner(System.in);
	public void createList(int n)
	{
		companyList=new int[n];
	}
	public void range(int s)
	{
		if(s>=200&&s<=299)
			arr[0]++;
		if(s>=300&&s<=399)
			arr[1]++;
		if(s>=400&&s<=499)
			arr[2]++;
		if(s>=500&&s<=599)
			arr[3]++;
		if(s>=600&&s<=699)
			arr[4]++;
		if(s>=700&&s<=799)
			arr[5]++;
		if(s>=800&&s<=899)
			arr[6]++;
		if(s>=900&&s<=999)
			arr[7]++;
		if(s>=1000)
			arr[8]++;
	}
	public void getSalary()
	{
		int i=1;
		for(int a:companyList)
		{
			System.out.printf("\nEnter the salary of %d salesperson : ",i);
			i++;
			sal=scan.nextInt();
			sal=200+((9*sal)/100);
			range(sal);
		}
	}
	public void print()
	{
		System.out.printf("\n200-299\t  \t%d"
				+ "\n300-399\t  \t%d"
				+ "\n400-499\t  \t%d"
				+ "\n500-599\t  \t%d"
				+ "\n600-699\t  \t%d"
				+ "\n700-799\t  \t%d"
				+ "\n800-899\t  \t%d"
				+ "\n900-999\t  \t%d"
				+ "\n1000 and more\t%d",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
	}

	
}
