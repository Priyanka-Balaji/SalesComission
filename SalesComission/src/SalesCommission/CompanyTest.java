package SalesCommission;
import java.util.Scanner;
public class CompanyTest {

	public static void main(String[] args) {
		int n;
		Company c=new Company();
		Scanner input=new Scanner(System.in);
		System.out.println("\nEnter the number of sales persons : ");
		n=input.nextInt();
		c.createList(n);
		c.getSalary();
		c.print();
	}

}
