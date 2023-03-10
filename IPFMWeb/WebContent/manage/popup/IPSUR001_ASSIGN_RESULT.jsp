<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<f:subview id="IPSUR001_ASSIGN_RESULT_POPUP"> 
<rich:modalPanel id="IPSUR001_ASSIGN_RESULT" autosized="true" styleClass="contentform" minWidth="500" height="#{not empty userReqIPBean.errorMsgList?'350':'150'}" >
	<f:facet name="header">
		<h:panelGroup>
			<h:outputText value="Assign Data"></h:outputText>
		</h:panelGroup>
	</f:facet>
	
	<f:facet name="controls">
    	<h:panelGroup>
        	<h:graphicImage value="../images/close.png" styleClass="hidelink" id="hidelink"/>
            <rich:componentControl for="IPSUR001_ASSIGN_RESULT" attachTo="hidelink" operation="hide" event="onclick"/>
        </h:panelGroup>
    </f:facet>
    <div id="container" style="overflow: auto; width: 100%;">
    <h:form>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="80%" align="center" valign="top"><img src="../images/blank.gif" width="10" height="5"><br>
						  	<table width="97%" border="0" cellspacing="0" cellpadding="0"  >
								<tr>
									<td>	
									   <rich:panel>
									   		<h:panelGrid rendered="#{(empty userReqIPBean.errorMsgList)}" columns="1" style="text-align:center;" cellpadding="0" cellspacing="0" width="100%">
									   			<rich:spacer height="10"></rich:spacer>
									   			<h:outputText value="Save Data Complete." style="font-size: 16px; color: blue; font-weight:bolder;"></h:outputText>
									   			<rich:spacer height="10"></rich:spacer>
									   		</h:panelGrid>
									   	  	<h:panelGrid rendered="#{not empty userReqIPBean.errorMsgList}" columns="1" style="text-align:center;" cellpadding="0" cellspacing="0" width="100%">
									   	  		<rich:spacer height="10"></rich:spacer>
									   			<h:outputText value="Expire Date ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????????????????? Expire date ??????????????????????????????" style="font-size: 10px; color: red;"></h:outputText>
									   			<h:outputText value="" style="font-size: 10px; color: red;"></h:outputText>
									   			<rich:spacer height="10"></rich:spacer>
												<rich:dataTable width="100%" id="resultTable" cellpadding="1" cellspacing="0" border="0"
													var="detail" value="#{userReqIPBean.errorMsgList}" reRender="scrollIPDetailTable" 
													rows="#{ipfmConfigBean.rowPerPage}"
													rowClasses="odd,even" styleClass="contentform" rowKeyVar="index" 
													headerClass="tableHeader">
													    <rich:column width="15%" style="vertical-align:top; text-align:center;">
													    	<f:facet name="header">
																<h:outputText value="Row No." styleClass="contentform tableHeaderText"></h:outputText>
															</f:facet>
															<h:outputText value="#{detail.rowNo}" escape="false" styleClass="contentform" />
														</rich:column>
														<rich:column width="85%" style="vertical-align:top;">
															<f:facet name="header">
																<h:outputText value="Error" styleClass="contentform tableHeaderText"></h:outputText>
															</f:facet>
							          						<h:outputText value="#{detail.errorMsg}" escape="false" styleClass="contentform" ></h:outputText>
														</rich:column>
														<f:facet name="footer">
															<rich:columnGroup >
																<rich:column colspan="2">
																	<h:panelGroup style="float:left;">
																		Total : <h:outputText value="#{fn:length(userReqIPBean.errorMsgList)}" /> records
																	</h:panelGroup>
																	<h:panelGroup style="float:right;">
																		<rich:datascroller immediate="true" rendered="true" align="right" for="resultTable"
																			maxPages="#{ipfmConfigBean.maxPage}" id="scrollIPDetailTable" selectedStyleClass="selectScroll"
																			stepControls="hide" fastControls="auto" boundaryControls="auto"  fastStep="#{ipfmConfigBean.fastStepPage}"
																			style="background-color: #cccccc;"/>
																	</h:panelGroup>
																</rich:column>
															</rich:columnGroup>												
														</f:facet>
												</rich:dataTable>	
												<rich:spacer height="10"></rich:spacer>
											</h:panelGrid>
										</rich:panel>
									</td>
								</tr>
								<tr>
							<td>
								<table width="100%" border="0" cellspacing="0" cellpadding="0" align="center" >
									<tr><td>&nbsp;</td></tr>
									<tr>
										<td align="center">
											<a4j:form rendered="#{!HOME}">	
												<a4j:commandButton value="OK" styleClass="rich-button"  ajaxSingle="true" status="#{rich:component('wait')}.hide();">
						    						<rich:componentControl for="IPSUR001_ASSIGN_RESULT" operation="hide" event="oncomplete" />
												</a4j:commandButton>	
											</a4j:form>
											<a4j:form rendered="#{HOME}">
												<a4j:commandButton id="btnClose" value="OK" onclick="reloadTree();javascript:gotoHomePage();"  ajaxSingle="true" styleClass="rich-button" />
											</a4j:form>			
										</td>
									</tr>
								</table>
							</td>
						</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</h:form>
	</div>
</rich:modalPanel>
</f:subview>
