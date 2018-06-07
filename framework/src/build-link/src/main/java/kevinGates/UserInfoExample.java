package kevinGates;

import play.libs.openid.UserInfo;

public class UserInfoExample {

   public static void main(String args[]) {
	   
	   UserInfo userInfo= new UserInfo("billgates");
	   echo("data="+userInfo.id());
   }
	   
	public static void echo(String any) {
		System.out.println(any);
	}
}
