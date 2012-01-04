<%-- 
    Document   : halamankasirnota
    Created on : Nov 30, 2011, 11:51:03 PM
    Author     : Fahrian09
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
        ${namaPelanggan}
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
        ${select}
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
            <td>${nasigoyeng}</td>
            <td>Rp 10.000</td>
            <td>${(nasigoyeng)*10000}</td>
          </tr>
          <tr align="center">
            <td>Bakmi Goreng</td>
            <td>${bakmigoyeng}</td>
            <td>Rp 10.000</td>
            <td>${(bakmigoyeng)*10000}</td>
          </tr>
          <tr align="center">
            <td>Gurame Bakar</td>
            <td>${guramebakar}</td>
            <td>Rp 25.000</td>
            <td>${(guramebakar)*25000}</td>
          </tr>
          <tr align="center">
            <td>Ayam Bakar</td>
            <td>${ayambakar}</td>
            <td>Rp.33.000</td>
            <td>${(ayambakar)*33000}</td>
          </tr>
          <tr align="center">
            <td>Nila Bakar</td>
            <td>${nilabakar}</td>
            <td>23000</td>
            <td>${(nilabakar)*23000}</td>
          </tr>
          <tr align="center">
            <th><strong>MINUMAN</strong></th>
            <th>JUMLAH</th>
            <th>HARGA</th>
            <th>TOTAL</th>
          </tr>
          <tr align="center">
            <td>Soda Gembira</td>
            <td>${odagembira}</td>
            <td>Rp 10.000</td>
            <td>${(odagembira)*10000}</td>
          </tr>
          <tr align="center">
            <td>Es Teh</td>
            <td>${esthe}</td>
            <td>Rp 2.000</td>
            <td>${(esthe)*2000}</td>
          </tr>
          <tr align="center">
            <td>Es Jeruk</td>
            <td>${eseyuk}</td>
            <td>Rp.4.000</td>
            <td>${(eseyuk)*4000}</td>
          </tr>
          <tr align="center">
            <td>Es Dawet</td>
            <td>${esawet}</td>
            <td>Rp.5000</td>
            <td>${(esawet)*5000}</td>
          </tr>
          <tr align="center">
            <th>Total Harga </th>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <th></th>
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
