
/**
 * ETSIINFSocialMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.etsiinf.sos.ETSIINFSocial;

/**
 * ETSIINFSocialMessageReceiverInOnly message receiver
 */

public class ETSIINFSocialMessageReceiverInOnly extends
		org.apache.axis2.receivers.AbstractInMessageReceiver {

	public void invokeBusinessLogic(
			org.apache.axis2.context.MessageContext inMessage)
			throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(inMessage);

			ETSIINFSocialSkeleton skel = (ETSIINFSocialSkeleton) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = inMessage
					.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null)
					&& ((methodName = org.apache.axis2.util.JavaUtils
							.xmlNameToJavaIdentifier(op.getName()
									.getLocalPart())) != null)) {

				if ("logout".equals(methodName)) {

					es.upm.etsiinf.sos.Logout wrappedParam = (es.upm.etsiinf.sos.Logout) fromOM(
							inMessage.getEnvelope().getBody().getFirstElement(),
							es.upm.etsiinf.sos.Logout.class,
							getEnvelopeNamespaces(inMessage.getEnvelope()));

					skel.logout(wrappedParam);

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.AddUser param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.AddUser.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.AddUserResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.AddUserResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.RemoveUser param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.RemoveUser.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.RemoveUserResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.RemoveUserResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(es.upm.etsiinf.sos.Logout param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.Logout.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.AddFriend param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.AddFriend.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.AddFriendResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.AddFriendResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.GetMyFriendStates param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.GetMyFriendStates.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.GetMyFriendStatesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.GetMyFriendStatesResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.RemoveFriend param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.RemoveFriend.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.RemoveFriendResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.RemoveFriendResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.PublishState param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.PublishState.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.PublishStateResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.PublishStateResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.GetMyFriends param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.GetMyFriends.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.GetMyFriendsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.GetMyFriendsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.ChangePassword param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.ChangePassword.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.ChangePasswordResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.ChangePasswordResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(es.upm.etsiinf.sos.Login param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.Login.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.LoginResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.LoginResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.GetMyStates param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(es.upm.etsiinf.sos.GetMyStates.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			es.upm.etsiinf.sos.GetMyStatesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					es.upm.etsiinf.sos.GetMyStatesResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.AddUserResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.AddUserResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.AddUserResponse wrapaddUser() {
		es.upm.etsiinf.sos.AddUserResponse wrappedElement = new es.upm.etsiinf.sos.AddUserResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.RemoveUserResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.RemoveUserResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.RemoveUserResponse wrapremoveUser() {
		es.upm.etsiinf.sos.RemoveUserResponse wrappedElement = new es.upm.etsiinf.sos.RemoveUserResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.AddFriendResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.AddFriendResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.AddFriendResponse wrapaddFriend() {
		es.upm.etsiinf.sos.AddFriendResponse wrappedElement = new es.upm.etsiinf.sos.AddFriendResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.GetMyFriendStatesResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									es.upm.etsiinf.sos.GetMyFriendStatesResponse.MY_QNAME,
									factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.GetMyFriendStatesResponse wrapgetMyFriendStates() {
		es.upm.etsiinf.sos.GetMyFriendStatesResponse wrappedElement = new es.upm.etsiinf.sos.GetMyFriendStatesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.RemoveFriendResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.RemoveFriendResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.RemoveFriendResponse wrapremoveFriend() {
		es.upm.etsiinf.sos.RemoveFriendResponse wrappedElement = new es.upm.etsiinf.sos.RemoveFriendResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.PublishStateResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.PublishStateResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.PublishStateResponse wrappublishState() {
		es.upm.etsiinf.sos.PublishStateResponse wrappedElement = new es.upm.etsiinf.sos.PublishStateResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.GetMyFriendsResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.GetMyFriendsResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.GetMyFriendsResponse wrapgetMyFriends() {
		es.upm.etsiinf.sos.GetMyFriendsResponse wrappedElement = new es.upm.etsiinf.sos.GetMyFriendsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.ChangePasswordResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.ChangePasswordResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.ChangePasswordResponse wrapchangePassword() {
		es.upm.etsiinf.sos.ChangePasswordResponse wrappedElement = new es.upm.etsiinf.sos.ChangePasswordResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.LoginResponse param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody()
					.addChild(
							param.getOMElement(
									es.upm.etsiinf.sos.LoginResponse.MY_QNAME,
									factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.LoginResponse wraplogin() {
		es.upm.etsiinf.sos.LoginResponse wrappedElement = new es.upm.etsiinf.sos.LoginResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			es.upm.etsiinf.sos.GetMyStatesResponse param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							es.upm.etsiinf.sos.GetMyStatesResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private es.upm.etsiinf.sos.GetMyStatesResponse wrapgetMyStates() {
		es.upm.etsiinf.sos.GetMyStatesResponse wrappedElement = new es.upm.etsiinf.sos.GetMyStatesResponse();
		return wrappedElement;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
			java.lang.Class type, java.util.Map extraNamespaces)
			throws org.apache.axis2.AxisFault {

		try {

			if (es.upm.etsiinf.sos.AddUser.class.equals(type)) {

				return es.upm.etsiinf.sos.AddUser.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.AddUserResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.AddUserResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.RemoveUser.class.equals(type)) {

				return es.upm.etsiinf.sos.RemoveUser.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.RemoveUserResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.RemoveUserResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.Logout.class.equals(type)) {

				return es.upm.etsiinf.sos.Logout.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.AddFriend.class.equals(type)) {

				return es.upm.etsiinf.sos.AddFriend.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.AddFriendResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.AddFriendResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.GetMyFriendStates.class.equals(type)) {

				return es.upm.etsiinf.sos.GetMyFriendStates.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.GetMyFriendStatesResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.GetMyFriendStatesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.RemoveFriend.class.equals(type)) {

				return es.upm.etsiinf.sos.RemoveFriend.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.RemoveFriendResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.RemoveFriendResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.PublishState.class.equals(type)) {

				return es.upm.etsiinf.sos.PublishState.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.PublishStateResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.PublishStateResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.GetMyFriends.class.equals(type)) {

				return es.upm.etsiinf.sos.GetMyFriends.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.GetMyFriendsResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.GetMyFriendsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.ChangePassword.class.equals(type)) {

				return es.upm.etsiinf.sos.ChangePassword.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.ChangePasswordResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.ChangePasswordResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.Login.class.equals(type)) {

				return es.upm.etsiinf.sos.Login.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.LoginResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.LoginResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.GetMyStates.class.equals(type)) {

				return es.upm.etsiinf.sos.GetMyStates.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (es.upm.etsiinf.sos.GetMyStatesResponse.class.equals(type)) {

				return es.upm.etsiinf.sos.GetMyStatesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

}// end of class

