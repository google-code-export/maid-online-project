<%-- 
    Document   : halamankasirnota
    Created on : Nov 30, 2011, 11:51:03 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Maid Online</title>
  <link rel="stylesheet" href="css/mainStyle.css" type="text/css" media="screen" />
</head>
<body>
<div id="container">
  <form method='post' action="Dispatcher?page=halamankasir">
  <div id="header">
    <h1 id="logo2"><a>Pembayaran Pelanggan</a></h1>
  </div>
  <div id="content">
      
      <table width="200" border="0">
    <tr>
      <td width="100">
        Nama Pelanggan
      </td>
      <td width="5">
        :</td>
      <td width="100">
        <%= request.getParameter("namaPelanggan") %>
    </tr>
    <tr>   
    </tr>
    <tr>
      <td width="100">
        Nomor Meja
      </td>
      <td width="5">
        :</td>
      <td width="100">
        <%= request.getParameter("nomormeja") %>
    </tr>
    <tr>
      <td>&nbsp;</td>
    </tr>
  </table>
      
      <table width="500" border="1">
          <tr>
            <th align="center"  scope="row">DAFTAR YANG DIPESAN</th>
          </tr>
        </table>  
      </table>
      <table width="500" border="1">
          <tr align="center">
            <th width="135"><strong>MAKANAN</strong></th>
            <th width="66">JUMLAH</th>
            <th width="77">HARGA</th>
            <th width="91">TOTAL</th>
          </tr>
          <tr align="center">
            <td>Nasi Goreng</td>
            <td>2</td>
            <td>Rp 10.000</td>
            <td>Rp 20.000</td>
          </tr>
          <tr align="center">
            <td>Bakmi Goreng</td>
            <td>1</td>
            <td>Rp 10.000</td>
            <td>Rp 10.000</td>
          </tr>
          <tr align="center">
            <td>Gurame Bakar</td>
            <td>1</td>
            <td>Rp 25.000</td>
            <td>Rp 25.000</td>
          </tr>
          <tr align="center">
            <th><strong>MINUMAN</strong></th>
            <th>JUMLAH</th>
            <th>HARGA</th>
            <th>TOTAL</th>
          </tr>
          <tr align="center">
            <td>Soda Gembira</td>
            <td>1</td>
            <td>Rp 10.000</td>
            <td>Rp 10.000</td>
          </tr>
          <tr align="center">
            <td>Milk Shake</td>
            <td>1</td>
            <td>Rp 9.000</td>
            <td>Rp 9.000</td>
          </tr>
          <tr align="center">
            <th>Total Harga</th>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <th>Rp 74.000</th>
          </tr>
      </table>
        <p>&nbsp;</p>
        <form id="form1" name="form1" method="post" action="">
          <label>
            <input type="submit" class="elipse" id="button" value="LUNAS" action='Dispatcher?page=halamankasir'/>
          </label>
  </div>
  </form>
  <div id="footer" align="center">
  <ul id="metaLink">
      <li>&copy; copyright 2012 - <a>Kelompok 12 RBPL</a> Maid Online</li>
  </ul>
  </div>
</div>
    
    
    

</form>
</body>
</html>
    </body>
</html>
