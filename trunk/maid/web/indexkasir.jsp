<%-- 
    Document   : index
    Created on : Nov 16, 2011, 11:45:31 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Kasir</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method='post' action='Dispatcher?page=indexkasir'>
            </form>
            <fieldset>
                <table border=0>
                    <tr>
                        <td>
            Password:
                        </td>
                        <td>
            <input type=text name="passwordKoki" value="" />
                        </td>
            </table>
            </fieldset>
        </form>
            <br>
            <form name="pagekasir" method='post'>
              <input type='submit' value='Masuk Halaman Kasir' action='Dispatcher?page=pagekasir'/> </form>
              

       
    </body>
</html>
