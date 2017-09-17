<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cssRegistrationProject.css">                                
        <title>Confirmation Page</title>
    </head>
    <body>
    <header>
        <h1>Confirmation Page</h1>
    </header>

    
  <% String  firstName
          , lastName
          , addr1
          , addr2
          , city
          , state
          , zipCode
          , country
          , result
          , errmsg
          ;
  
     firstName = request.getParameter("firstName");
     lastName  = request.getParameter("lastName");
     addr1     = request.getParameter("addr1");
     addr2     = request.getParameter("addr2");
     city      = request.getParameter("city");
     state     = request.getParameter("state");
     zipCode   = request.getParameter("zipCode");
     country   = request.getParameter("country");
     result = (String) request.getAttribute("result");
     errmsg = (String) request.getAttribute("errmsg");
     
     if (firstName==null) firstName = "";
     if (lastName==null)  lastName  = ""; 
     if (addr1==null)     addr1     = "";
     if (addr2==null)     addr2     = ""; 
     if (city==null)      city      = "";
     if (state==null)     state     = ""; 
     if (zipCode==null)   zipCode   = "";
     if (country==null)   country   = ""; 
     if (result==null)    result    = " ";
     if (errmsg==null)    errmsg    = " "; 
   %>
   <h2>Thank you for your submission!</h2>

    <table>
    	<tr>
            <td class="leftSide">First Name:</td>
            <td class="rightSide"><%=firstName%></td>
        </tr>
    	<tr>
            <td class="leftSide">Last Name:</td>
            <td class="rightSide"><%=lastName%></td>
        </tr>
    	<tr>
            <td class="leftSide">Address Line 1:</td>
            <td class="rightSide"><%=addr1%></td>
        </tr>
    	<tr>
            <td class="leftSide">Address Line 2:</td>
            <td class="rightSide"><%=addr2%></td>
        </tr>
    	<tr>
            <td class="leftSide">City:</td>
            <td class="rightSide"><%=city%></td>
        </tr>
    	<tr>
            <td class="leftSide">State:</td>
            <td class="rightSide"><%=state%></td>
        </tr>
    	<tr>
            <td class="leftSide">Pincode:</td>
            <td class="rightSide"><%=zipCode%></td>
        </tr>
    	<tr>
            <td class="leftSide">Country:</td>
            <td class="rightSide"><%=country%></td>
        </tr>
        </tr>
    </table>

             

    </body>
</html>
