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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method='post' action="Dispatcher?page=pesan">
            
            <fieldset>
                <table border=0>
                    <tr>
                        <td>
            Masukkan Nama:
                        </td>
                        <td>
            <input type=text name="namaPelanggan" value="" />
                        </td>
                    </tr>
                    <tr>

                    <td>
            Nomor Meja:
                    </td>
                    <td>
                        <select type="dropdown" name="select" id="nomor meja" value="" />
                            <option  id="1">1</option>
                            <option  id="2">2</option>
                            <option  id="2">3</option>
                            <option  id="2">4</option>
                            <option  id="2">5</option>
                            <option  id="2">6</option>
                            <option  id="2">7</option>
                            <option  id="2">8</option>
            </td>
            </table>
            </fieldset>
            <form method='post' >
            <input type='submit' value='Pesan Makanan' action='Dispatcher?page=pesan'/>
            
            </form>
              
  
</body><br/br>
    <br/br>
        <br/br>
            <br/br>
                <br/br>
                    <br/br>           
        <h2>

  <div align="right"><table><tr><td><a href="Dispatcher?page=pagekoki">Koki</a></td><td>&nbsp;</td><td>
<a href="Dispatcher?page=pagekasir">Kasir</a></td></tr></table></div>
                 
      </h2>
                    
                    
</body>            
</html>
