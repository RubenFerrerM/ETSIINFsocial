
/**
 * ETSIINFSocialCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package es.upm.etsiinf.sos.ETSIINFSocial.client;

    /**
     *  ETSIINFSocialCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ETSIINFSocialCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ETSIINFSocialCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ETSIINFSocialCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for addUser method
            * override this method for handling normal response from addUser operation
            */
           public void receiveResultaddUser(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.AddUserResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUser operation
           */
            public void receiveErroraddUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUser method
            * override this method for handling normal response from removeUser operation
            */
           public void receiveResultremoveUser(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.RemoveUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUser operation
           */
            public void receiveErrorremoveUser(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for addFriend method
            * override this method for handling normal response from addFriend operation
            */
           public void receiveResultaddFriend(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.AddFriendResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addFriend operation
           */
            public void receiveErroraddFriend(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyFriendStates method
            * override this method for handling normal response from getMyFriendStates operation
            */
           public void receiveResultgetMyFriendStates(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.GetMyFriendStatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyFriendStates operation
           */
            public void receiveErrorgetMyFriendStates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeFriend method
            * override this method for handling normal response from removeFriend operation
            */
           public void receiveResultremoveFriend(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.RemoveFriendResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeFriend operation
           */
            public void receiveErrorremoveFriend(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for publishState method
            * override this method for handling normal response from publishState operation
            */
           public void receiveResultpublishState(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.PublishStateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from publishState operation
           */
            public void receiveErrorpublishState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyFriends method
            * override this method for handling normal response from getMyFriends operation
            */
           public void receiveResultgetMyFriends(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.GetMyFriendsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyFriends operation
           */
            public void receiveErrorgetMyFriends(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changePassword method
            * override this method for handling normal response from changePassword operation
            */
           public void receiveResultchangePassword(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.ChangePasswordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changePassword operation
           */
            public void receiveErrorchangePassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyStates method
            * override this method for handling normal response from getMyStates operation
            */
           public void receiveResultgetMyStates(
                    es.upm.etsiinf.sos.ETSIINFSocial.client.ETSIINFSocialStub.GetMyStatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyStates operation
           */
            public void receiveErrorgetMyStates(java.lang.Exception e) {
            }
                


    }
    