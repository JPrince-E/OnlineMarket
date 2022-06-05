<%@page import="project.ConnectionProviderClass"%>
<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String category=request.getParameter("category");
String price=request.getParameter("price");
String active=request.getParameter("active");

try{
    Connection con=ConnectionProviderClass.getCon();
    Statement st=con.createStatement();
    st.executeUpdate("update product set name='"+name+"',category='"+category+"',price='"+price+"',active='"+active+"' where id='"+id+"'");
    if(active.equals("No")){
        st.executeUpdate("delete from cart where product_id='"+id+"' and address is NULL");
    }
    response.sendRedirect("allProductEditProduct.jsp?msg=done");
    System.out.println(id);
}catch(Exception e){
    System.out.println(e);
    System.out.println(id);
    response.sendRedirect("allProductEditProduct.jsp?msg=wrong");
}
%>