/**
 * ETSIINFSocialSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
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


/**
 * ETSIINFSocialSkeleton java skeleton for the axisService
 */
public class ETSIINFSocialSkeleton {
	
	
	private User user;
	String adminPwd;
	private boolean logged;
	private static HashMap<String, ArrayList<String>> friends;
	private static HashMap<String, ArrayList<String>> states;
	public static ArrayList<String> users;
	
	static UPMAuthenticationAuthorizationWSSkeletonStub stub;

	
	public ETSIINFSocialSkeleton(){
		
		adminPwd="admin";
		user=new User();
		user.setName("");
		user.setPwd("");
		if(users==null || users.size()==0){
			users=new ArrayList<String>();			
		}
		if(friends==null || friends.size()==0){
			friends=new HashMap<String, ArrayList<String>> ();			
		}
		if(states==null || states.size()==0){
			states=new HashMap<String, ArrayList<String>> ();			
		}
		try {
			stub= new UPMAuthenticationAuthorizationWSSkeletonStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catcSh block
			e.printStackTrace();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addUser
	 * @return addUserResponse
	 */

	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) {
		System.out.println("Entramos en AddUser");
		AddUserResponse response= new AddUserResponse();
		
		es.upm.etsiinf.sos.model.xsd.AddUserResponse responseContent= new es.upm.etsiinf.sos.model.xsd.AddUserResponse();
		
		
		if(!user.getName().equals("admin")){
			//EN ESTE CASO, ESTA PROHIBIDO DAR DE ALTA
			responseContent.setResponse(false);
            response.set_return(responseContent);
            return response;
		}else{
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE respuestaExistUPM;
			ExistUser exUs=new ExistUser();
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.Username usnm=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
					UPMAuthenticationAuthorizationWSSkeletonStub.Username();
			usnm.setName(addUser.getArgs0().getUsername());
			exUs.setUsername(usnm);
			try {
				respuestaExistUPM= stub.existUser(exUs);
				if(respuestaExistUPM.get_return().getResult()){
					System.out.println("USUARIO YA REGISTRADO");
					responseContent.setResponse(false);
		            response.set_return(responseContent);
		            return response;
				}
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponse respuestaUPM;
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.AddUser opAdd=
				new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.AddUser();
			UserBackEnd usr=new UserBackEnd();
			usr.setName(addUser.getArgs0().getUsername());
			opAdd.setUser(usr);;
			try {
				
				respuestaUPM= stub.addUser(opAdd);
				
				User usuario=new User();
				usuario.setName(addUser.getArgs0().getUsername());
				String pswrd=respuestaUPM.get_return().getPassword();
				usuario.setPwd(pswrd);
				
				
				responseContent.setPwd(pswrd);
				responseContent.setResponse(true);
				
				response.set_return(responseContent);
				
				friends.put(addUser.getArgs0().getUsername(), new ArrayList<String>());
				states.put(addUser.getArgs0().getUsername(), new ArrayList<String>());
				users.add(addUser.getArgs0().getUsername());
				return response;
				
				
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				responseContent.setResponse(false);
				response.set_return(responseContent);
			}
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param removeUser
	 * @return removeUserResponse
	 */

	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) {
		RemoveUserResponse response=new RemoveUserResponse();
		Response responseContent=new Response();
		String userRmv=removeUser.getArgs0().getUsername();
		if(userRmv.equals("admin")){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}
		if(!userRmv.equals(user.getName()) && !user.getName().equals("admin")){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserResponseE respuestaUPM;
		
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE opRmv=
		new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE();
		
	es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
	UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser rmUs=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser();
	rmUs.setName(userRmv);
	if(!user.getName().equals("admin"))
		rmUs.setPassword(user.getPwd());
	
	opRmv.setRemoveUser(rmUs);
	try {
		
		respuestaUPM= stub.removeUser(opRmv);
		boolean res=respuestaUPM.get_return().getResult();
		if(res){
			ArrayList<String> amigos=friends.get(userRmv);
			for(String f: amigos){
				friends.get(f).remove(userRmv);
			}
			friends.remove(userRmv);
			states.remove(userRmv);
			user=new User();
			user.setName("");
			user.setPwd("");
			responseContent.setResponse(res);
			response.set_return(responseContent);
			return response;
		}else{
			responseContent.setResponse(res);
			response.set_return(responseContent);
			return response;
			
		}
		
		
		
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		responseContent.setResponse(false);
		response.set_return(responseContent);
	}
	return response;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param logout
	 * @return
	 */

	public void logout(es.upm.etsiinf.sos.Logout logout) {
		if(logged){
			System.out.println("Entramos en Logout");
			logged=false;
			User usr=new User();
			usr.setName("");
			usr.setPwd("");
			user=usr;
		}
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param addFriend
	 * @return addFriendResponse
	 */

	public es.upm.etsiinf.sos.AddFriendResponse addFriend(
			es.upm.etsiinf.sos.AddFriend addFriend) {
		AddFriendResponse response=new AddFriendResponse();
		Response responseContent=new Response();
		responseContent.setResponse(false);
		String friendName=addFriend.getArgs0().getUsername();
		if(!logged){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE respuestaExistUPM;
		ExistUser exUs=new ExistUser();
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.Username usnm=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.Username();
		usnm.setName(friendName);
		exUs.setUsername(usnm);
		try {
			respuestaExistUPM= stub.existUser(exUs);
			if(respuestaExistUPM.get_return().getResult()){
				//BIEN
				ArrayList<String> myFriends=friends.get(user.getName());
				if(myFriends.contains(friendName)){
					//YA LE TENGO AÑADIDO
					responseContent.setResponse(false);
					response.set_return(responseContent);
					return response;
				}
				myFriends.add(friendName);
				ArrayList<String> hisFriends=friends.get(friendName);
				hisFriends.add(user.getName());
				responseContent.setResponse(true);
				response.set_return(responseContent);
				return response;
			}else{
				//MAL
				responseContent.setResponse(false);
				response.set_return(responseContent);
				return response;
			}
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		return response;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getMyFriendStates
	 * @return getMyFriendStatesResponse
	 */

	public es.upm.etsiinf.sos.GetMyFriendStatesResponse getMyFriendStates(
			es.upm.etsiinf.sos.GetMyFriendStates getMyFriendStates) {
		GetMyFriendStatesResponse response=new GetMyFriendStatesResponse();
		StatesList stList=new StatesList();
		if(!logged){
			stList.setResult(false);
			response.set_return(stList);
			return response;
		}else{
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE respuestaExistUPM;
			ExistUser exUs=new ExistUser();
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.Username usnm=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
					UPMAuthenticationAuthorizationWSSkeletonStub.Username();
			usnm.setName(getMyFriendStates.getArgs0().getUsername());
			exUs.setUsername(usnm);
			try {
				respuestaExistUPM= stub.existUser(exUs);
				if(!respuestaExistUPM.get_return().getResult()){
					stList.setResult(false);
					response.set_return(stList);
					return response;
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(!friends.get(user.getName()).contains(getMyFriendStates.getArgs0().getUsername())){
				stList.setResult(false);
				response.set_return(stList);
				return response;
			}
			
			ArrayList<String> myStates=states.get(getMyFriendStates.getArgs0().getUsername());
			int i=0;
			int j=myStates.size()-1;
			while(i<10){
				stList.addStates(myStates.get(j));
				i++;
				j--;
			}
			stList.setResult(true);
			response.set_return(stList);
			return response;
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param removeFriend
	 * @return removeFriendResponse
	 */

	public es.upm.etsiinf.sos.RemoveFriendResponse removeFriend(
			es.upm.etsiinf.sos.RemoveFriend removeFriend) {
		RemoveFriendResponse response=new RemoveFriendResponse();
		Response responseContent=new Response();
		responseContent.setResponse(false);
		String friendName=removeFriend.getArgs0().getUsername();
		if(!logged){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE respuestaExistUPM;
		ExistUser exUs=new ExistUser();
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.Username usnm=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.Username();
		usnm.setName(friendName);
		exUs.setUsername(usnm);
		try {
			respuestaExistUPM= stub.existUser(exUs);
			if(respuestaExistUPM.get_return().getResult()){
				//BIEN
				ArrayList<String> myFriends=friends.get(user.getName());
				if(!myFriends.contains(friendName)){
					//NO LE TENGO AÑADIDO
					responseContent.setResponse(false);
					response.set_return(responseContent);
					return response;
				}
				myFriends.remove(friendName);
				ArrayList<String> hisFriends=friends.get(friendName);
				hisFriends.remove(user.getName());
			}else{
				//MAL
				responseContent.setResponse(false);
				response.set_return(responseContent);
				return response;
			}
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param publishState
	 * @return publishStateResponse
	 */

	public es.upm.etsiinf.sos.PublishStateResponse publishState(
			es.upm.etsiinf.sos.PublishState publishState) {
		PublishStateResponse response=new PublishStateResponse();
		Response responseContent=new Response();
		if(!logged){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}else{
			
			String msg=publishState.getArgs0().getMessage();
			states.get(user.getName()).add(msg);
			responseContent.setResponse(true);
			response.set_return(responseContent);
			return response;
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getMyFriends
	 * @return getMyFriendsResponse
	 */

	public es.upm.etsiinf.sos.GetMyFriendsResponse getMyFriends(
			es.upm.etsiinf.sos.GetMyFriends getMyFriends) {
		GetMyFriendsResponse response=new GetMyFriendsResponse();
		FriendList frList=new FriendList();
		frList.setResult(false);
		if(!logged){
			response.set_return(frList);
			return response;
		}else{
			String[] amigos=new String[friends.get(user.getName()).size()];
			friends.get(user.getName()).toArray(amigos);
			
			frList.setFriends(amigos);
			response.set_return(frList);
			return response;
		}
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param changePassword
	 * @return changePasswordResponse
	 */

	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) {
		ChangePasswordResponse response=new ChangePasswordResponse();
		es.upm.etsiinf.sos.model.xsd.Response responseContent=new es.upm.etsiinf.sos.model.xsd.Response();
		responseContent.setResponse(false);
		PasswordPair pwdpair=changePassword.getArgs0();
		if(!logged){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}
		if(user.getName().equals("admin")){
			if(pwdpair.getOldpwd().equals(adminPwd)){
				adminPwd=pwdpair.getNewpwd();
			}
			else{
				responseContent.setResponse(false);
				response.set_return(responseContent);
				return response;
			}
		}
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword opCP;
		opCP=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword();
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd cpBE = new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd();
		try {
			cpBE.setName(user.getName());
			cpBE.setOldpwd(pwdpair.getOldpwd());
			cpBE.setNewpwd(pwdpair.getNewpwd());
			
			opCP.setChangePassword(cpBE);;
			
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponseE cpRes;
			cpRes=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
					UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponseE();
			cpRes= stub.changePassword(opCP);
			
			es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
			UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponse cpResponse=cpRes.get_return();
			boolean res= cpResponse.getResult();
			if(res) user.setPwd(pwdpair.getNewpwd());
			responseContent.setResponse(res);
			response.set_return(responseContent);
			return response;
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.set_return(responseContent);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @return loginResponse
	 */

	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) {
		LoginResponse response=new LoginResponse();
		es.upm.etsiinf.sos.model.xsd.Response responseContent=new es.upm.etsiinf.sos.model.xsd.Response();
		responseContent.setResponse(false);
		User client=login.getArgs0();
		if(logged && client.getName().equals(user.getName())){
			responseContent.setResponse(true);
			response.set_return(responseContent);
			return response;
		}else if(logged && !client.getName().equals(user.getName())){
			responseContent.setResponse(false);
			response.set_return(responseContent);
			return response;
		}
		if(client.getName().equals("admin")){
			if(client.getPwd().equals(adminPwd)){
				user=new User();
				user.setName("admin");
				user.setPwd(adminPwd);
				responseContent.setResponse(true);
				response.set_return(responseContent);
				return response;
			}else{
				responseContent.setResponse(false);
				response.set_return(responseContent);
				return response;
			}
		}
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.ExistUserResponseE respuestaExistUPM;
		ExistUser exUs=new ExistUser();
		es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
		UPMAuthenticationAuthorizationWSSkeletonStub.Username usnm=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.Username();
		usnm.setName(client.getName());
		exUs.setUsername(usnm);
		try {
			respuestaExistUPM= stub.existUser(exUs);
			if(respuestaExistUPM.get_return().getResult()){
				es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponse lResp;
				lResp=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
						UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponse();
				es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.Login loginContent=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
						UPMAuthenticationAuthorizationWSSkeletonStub.Login();
				es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd loginBE=new es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
						UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd ();
				loginBE.setName(client.getName());
				loginBE.setPassword(client.getPwd());
				loginContent.setLogin(loginBE);
				lResp= stub.login(loginContent);
				es.upm.etsiinf.sos.UPMAuthenticationAuthorization.
				UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponseBackEnd respUPM=lResp.get_return();
				boolean successLoggingIn=respUPM.getResult();
				if(successLoggingIn){
					logged=true;
					user=client;
					responseContent.setResponse(true);
					response.set_return(responseContent);
					return response;
				}else{
					responseContent.setResponse(false);
					response.set_return(responseContent);
					return response;
				}
				
			}else{
				responseContent.setResponse(false);
				response.set_return(responseContent);
				return response;
			}
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getMyStates
	 * @return getMyStatesResponse
	 */

	public es.upm.etsiinf.sos.GetMyStatesResponse getMyStates(
			es.upm.etsiinf.sos.GetMyStates getMyStates) {
		GetMyStatesResponse response=new GetMyStatesResponse();
		StatesList stList=new StatesList();
		if(!logged){
			stList.setResult(false);
			response.set_return(stList);
			return response;
		}else{
			ArrayList<String> myStates=states.get(user.getName());
			int i=0;
			int j=myStates.size()-1;
			while(i<10){
				stList.addStates(myStates.get(j));
				i++;
				j--;
			}
			stList.setResult(true);
			response.set_return(stList);
			return response;
		}
	}

}
