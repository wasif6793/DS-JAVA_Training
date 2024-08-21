<html>
<body style="background-color:Grey">
<h2><font style="color:White">Hello World!</font></h2>
<%
out.print("My Name is M Wasif");
%>
<br>
<%
// Declaring the variable in JSP
    String college = "BBD";
    out.print("My college name is " + college);
    int a = 2;
    int b = 4;
    out.print("<br>" + "Output: " + (a + b));
%>
<br>
<br>

Get the request from HTML page.
<br>
<%
    String frnd = request.getParameter("fname");
    out.print("Name is " + frnd + "<br><br>");

    // Convert the string parameter "age" to an int
    int age = Integer.parseInt(request.getParameter("age"));
    String gender = request.getParameter("gender");
    String branch = request.getParameter("branch");


    // Applying the condition
    if ((age > 18 && gender.equalsIgnoreCase("Male")) ||
        (age > 16 && gender.equalsIgnoreCase("Female"))) {
        out.print("You can apply");
        response.sendRedirect("https://www.facebook.com/");
    } else {
        out.print("You cannot apply");
        response.sendRedirect("https://wcd.nic.in/hi/");
    }
%>

</body>
</html>
