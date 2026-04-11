/*Create a java application where we have class insta it Contains one private field like password then provide setter and getter methods for this variable and we have separate class user from here update the password and display the updated password to the user.*/
import java.util.*;
class Insta
{
	static Scanner in=new Scanner(System.in);
	private String password;
	void setter(String password)
	{
		this.password=password;
	}
	String getter()
	{
		return this.password;
	}
}
class User
{
	public static void main(String args[])
	{
		insta obj=new insta();
		System.out.print("Enter new password");
		obj.setter(insta.in.next());
		System.out.print("new password"+obj.getter());
	}
}