<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="model.invLog" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scripts</title>
    </head>
    
    <body>
        <%
            invLog l = (invLog) request.getAttribute("invLog");
        %>
        
        <h1>Enable user: </h1>
        <br>
        <p>Set-CsPhoneNumberAssignment  -Identity        <%=l.getUpn()%>          -PhoneNumber +
        <%=l.getDid()%>         -PhoneNumberType DirectRouting</p>
                
        <br><br>
        
        <h1>Enable VoiceRoute: </h1>
        <br>
        <p>Grant-CsOnlineVoiceRoutingPolicy         <%=l.getUpn()%>          -PolicyName Unrestricted</p>
        
        <br><br>
        
        <h1>Confirm: </h1>
        <br>
        <p>Get-CsOnlineUser        <%=l.getUpn()%>          | Format-List -Property DisplayName, EnterpriseVoiceEnabled, LineURI, UserPrincipalName, SipAddress, OnlineVoiceRoutingPolicy</p>
        
    </body>

</html>