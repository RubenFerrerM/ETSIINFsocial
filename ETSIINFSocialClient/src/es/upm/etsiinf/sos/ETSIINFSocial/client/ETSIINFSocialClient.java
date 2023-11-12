package es.upm.etsiinf.sos.ETSIINFSocial.client;

import java.rmi.RemoteException;

import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.AddFriendResponse;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.AddUser;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.AddFriend;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.AddUserResponseE;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.ChangePassword;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.ChangePasswordResponse;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.Login;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.Logout;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.LoginResponse;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.PasswordPair;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.RemoveUser;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.RemoveUserResponse;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.Response;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.User;
import es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.Username;

public class ETSIINFSocialClient {
	static ETSIINFSocialStub stub;
	
	public static String addUser(String username)throws RemoteException{
		Username usnm=new Username();
		usnm.setUsername(username);
		AddUser addUser=new AddUser();
		addUser.setArgs0(usnm);
		AddUserResponseE response=stub.addUser(addUser);
		String pwd=response.get_return().getPwd();
		System.out.println("ADD USER RESPONSE: "+response.get_return().getResponse());
		System.out.println("ADD USER PWD: "+pwd);
		return pwd;
		
	}
	
	public static void login(String name, String password) throws RemoteException{
		User user=new User();
		user.setName(name);
		user.setPwd(password);
		Login login=new Login();
		login.setArgs0(user);
		LoginResponse respuesta=stub.login(login);
		System.out.println("RESPUESTA A LOGIN: "+respuesta.get_return().getResponse());
	}
	
	public static void logout() throws RemoteException{
		Logout logout=new Logout();
		stub.logout(logout);
	}
	public static void removeUser(String username) throws RemoteException{
		Username usnm=new Username();
		usnm.setUsername(username);
		RemoveUser rmv=new RemoveUser();
		rmv.setArgs0(usnm);
		RemoveUserResponse response=stub.removeUser(rmv);
		System.out.println("REMOVE USER RESPONSE: "+response.get_return().getResponse());
	}
	public static void changePassword(String oldPwd, String newPwd) throws RemoteException{
		ChangePassword cp=new ChangePassword();
		PasswordPair pp=new PasswordPair();
		pp.setOldpwd(oldPwd);
		pp.setNewpwd(newPwd);
		cp.setArgs0(pp);
		ChangePasswordResponse respuesta=stub.changePassword(cp);
		System.out.println("RESPUESTA A CHANGE PASSWORD: "+respuesta.get_return().getResponse());
	}
	public static void addFriend(String name) throws RemoteException{
		AddFriend aF=new AddFriend();
		Username usnm=new Username();
		usnm.setUsername(name);
		aF.setArgs0(usnm);
		AddFriendResponse respuesta=stub.addFriend(aF);
		System.out.println("RESPUESTA A ADD FRIEND: "+respuesta.get_return().getResponse());
	}
	
	public static void main(String[] args){
		try{
			stub=new ETSIINFSocialStub();
			stub._getServiceClient().getOptions().setManageSession(true);
			stub._getServiceClient().engageModule("addressing");
			
//			addUser("Probandoaadasdas"); //false
//			login("AdrianRomVLOL","AdrianRomVLOL1151"); //true
//			login("AdrianRomVLOL","xxx"); //true
//			login("Probandoaadasdas","Probandoaadasdas5314"); //false
//			logout();
//			login("AdrianRomVLOL","xxx"); //false
//			login("AdrianRomVLOL","AdrianRomVLOL1151"); //true
			
//			addUser("PabloSanchez123");
			login("admin","admin");
			String pwdRuben=addUser("USruben1231");
			login("USruben1231",pwdRuben);
			logout();
			login("admin","admin");
			String pwdMiguel=addUser("USMig231");
			login("USMig231",pwdMiguel);
			addFriend("USruben1231"); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
