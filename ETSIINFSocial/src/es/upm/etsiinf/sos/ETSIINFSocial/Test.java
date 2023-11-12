package es.upm.etsiinf.sos.ETSIINFSocial;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.axis2.AxisFault;
import org.apache.axis2.util.Utils;

import es.upm.etsiinf.sos.UPMAuthenticationAuthorization.UPMAuthenticationAuthorizationWSSkeletonStub;
import es.upm.etsiinf.sos.UPMAuthenticationAuthorization.UPMAuthenticationAuthorizationWSSkeletonStub.ExistUser;
import es.upm.etsiinf.sos.UPMAuthenticationAuthorization.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd;
import es.upm.etsiinf.sos.model.xsd.*;
import es.upm.etsiinf.sos.*;
import es.upm.etsiinf.sos.AddUserResponse;

public class Test {
static ETSIINFSocialSkeleton stub;
	
	public static String addUser(String username){
		Username usnm=new Username();
		usnm.setUsername(username);
		AddUser addUser=new AddUser();
		addUser.setArgs0(usnm);
		AddUserResponse response=stub.addUser(addUser);
		String pwd=response.get_return().getPwd();
		System.out.println("ADD USER RESPONSE: "+response.get_return().getResponse());
		System.out.println("ADD USER PWD: "+pwd);
		return pwd;
		
	}
	
	public static void login(String name, String password) {
		User user=new User();
		user.setName(name);
		user.setPwd(password);
		Login login=new Login();
		login.setArgs0(user);
		LoginResponse respuesta=stub.login(login);
		System.out.println("RESPUESTA A LOGIN: "+respuesta.get_return().getResponse());
	}
	
	public static void logout() {
		Logout logout=new Logout();
		stub.logout(logout);
	}
	public static void removeUser(String username) {
		Username usnm=new Username();
		usnm.setUsername(username);
		RemoveUser rmv=new RemoveUser();
		rmv.setArgs0(usnm);
		RemoveUserResponse response=stub.removeUser(rmv);
		System.out.println("REMOVE USER RESPONSE: "+response.get_return().getResponse());
	}
	public static void changePassword(String oldPwd, String newPwd) {
		ChangePassword cp=new ChangePassword();
		PasswordPair pp=new PasswordPair();
		pp.setOldpwd(oldPwd);
		pp.setNewpwd(newPwd);
		cp.setArgs0(pp);
		ChangePasswordResponse respuesta=stub.changePassword(cp);
		System.out.println("RESPUESTA A CHANGE PASSWORD: "+respuesta.get_return().getResponse());
	}
	public static void addFriend(String name) {
		AddFriend aF=new AddFriend();
		Username usnm=new Username();
		usnm.setUsername(name);
		aF.setArgs0(usnm);
		AddFriendResponse respuesta=stub.addFriend(aF);
		System.out.println("RESPUESTA A ADD FRIEND: "+respuesta.get_return().getResponse());
	}
	public static void main(String args[]) {
		stub=new ETSIINFSocialSkeleton();
//		Login l=new Login();
//		User usr=new User();
//		usr.setName("MiguelC");
//		usr.setPwd("MiguelC3818");
//		l.setArgs0(usr);
//		
//		System.out.println("LOGIN DE ADMIN: "+sk.login(l).get_return().getResponse()); //TRUE
//		
//		sss
//		AddFriend aF=new AddFriend();
//		Username usnm=new Username();
//		usnm.setUsername("PabloSanchez123");
//		aF.setArgs0(usnm);
//		AddFriendResponse respuesta=sk.addFriend(aF);
//		System.out.println("RESPUESTA A ADD FRIEND: "+respuesta.get_return().getResponse());
		
		
//		login("MiguelC","MiguelC3818");
//		addFriend("PabloSanchez123");
		
//		System.out.println(stub.users);
		login("admin","admin");
		String pwdRuben=addUser("USruben1s");
		login("USruben1s",pwdRuben);
		logout();
		login("admin","admin");
		String pwdMiguel=addUser("USMigs");
		login("USMigs",pwdMiguel);
		addFriend("USruben1s"); 
		
	}
}
