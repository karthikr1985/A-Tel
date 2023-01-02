<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<f:loadBundle basename="th.co.ais.ipfm.resource.confirm_message" var="mes"/>

<rich:modalPanel id="confirmSendForApproveURModal" width="350" minHeight="100" autosized="true">			
	<f:facet name="header">
		<h:panelGroup>
			<h:outputText value="Confirm Send For Approve UR"></h:outputText>
		</h:panelGroup>
   	</f:facet>
   	<h:panelGroup style="width:100%;">
   		<a4j:form>
			<h:panelGrid columns="1" styleClass="contentlabelform" style="text-align:center;" width="100%">
				<h:panelGroup style="font-weight:bold;"><h:outputText value="#{mes.CF0004}" /></h:panelGroup>
				<rich:spacer height="5"/>
				<h:panelGroup>
					<a4j:commandButton value="Yes" onclick="confirmSendForApproveUR();" styleClass="rich-button" style="width:50px;" reRender="errorMsg">
						<rich:componentControl for="confirmSendForApproveURModal" operation="hide" event="oncomplete" />
					</a4j:commandButton>
					<rich:spacer width="10" />
					<a4j:commandButton value="No" styleClass="rich-button" ajaxSingle="true" style="width:50px;" status="#{rich:component('wait')}.hide();">
					    <rich:componentControl for="confirmSendForApproveURModal" operation="hide" event="onclick" />
					</a4j:commandButton>
				</h:panelGroup>
			</h:panelGrid>
		</a4j:form>
	</h:panelGroup>
</rich:modalPanel>