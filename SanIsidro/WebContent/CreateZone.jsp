<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zonas</title>
</head>
<body>
<f:view>
	<h:form>
	<h:panelGrid border="1" columns="2">
		<h:outputText value="Nombre de Zona" />
		<h:inputText value="#{createZoneMB.zoneName}" required="true"/>
		<h:outputText value=""></h:outputText>
		<h:commandButton value="Registrar" action="#{createZoneMB.createZone}"/>
	</h:panelGrid>
	</h:form>
	<h:outputText style="color:red;" value="#{createZoneMB.message}"/>
</f:view>
</body>
</html>