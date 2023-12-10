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
        <h1>Set-CsPhoneNumberAssignment  -Identity</h1>
        <%=l.getUpn()%> 
        <h1> -PhoneNumber +</h1>
        <%=l.getDid()%>
        <h1> -PhoneNumberType DirectRouting</h1>
                
        <br><br>
        
        <h1>Enable VoiceRoute: </h1>
        <br>
        <h1>Grant-CsOnlineVoiceRoutingPolicy </h1>
        <%=l.getUpn()%> 
        <h1> -PolicyName Unrestricted</h1>
        
        <br><br>
        
        <h1>Confirm: </h1>
        <br>
        <h1>Get-CsOnlineUser</h1>
        <%=l.getUpn()%> 
        <h1> | Format-List -Property DisplayName, EnterpriseVoiceEnabled, LineURI, UserPrincipalName, SipAddress, OnlineVoiceRoutingPolicy</h1>
        
    </body>
=======
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
>>>>>>> origin/main
</html>