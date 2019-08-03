<%@ page import="com.ptam.ejb.OrderBusiness" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: pault
  Date: 8/3/2019
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1> HelloWorld Web Application Module
    JSP </h1>

  <% out.print("<h3> My Addition Application from out.print </h3>"); %>
  <%
    javax.naming.InitialContext ic = new javax.naming.InitialContext();
    OrderBusiness orderbusiness = (OrderBusiness) ic.lookup("java:module/OrderBusinessSessionEJB!com.ptam.ejb.OrderBusiness");
    List<String> productList = orderbusiness.getProducts();

    out.print("<Table>");
    for ( int i = 0; i < productList.size(); i++ )  {
      String name = productList.get(i);
      out.print("<TR><td>"+name+"</td></TR>");
    }
    out.print("</Table>");
  %>

  $END$
  </body>
</html>
