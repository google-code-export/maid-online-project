<%-- 
    Document   : Pesan
    Created on : Nov 17, 2011, 12:17:36 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesanan Anda</title>
    </head>
    <body>
        
        <h1>Silahkan Pilih Pesanan</h1>
        
Nama=
        <%=request.getParameter("namaPelanggan") %>
  , Nomor Meja=
    <%=request.getParameter("select") %>

    
  </tr>
</table>&nbsp;</p>
<table width="535" border="1">
  <tr>
    <th width="520" scope="row">DAFTAR</th>
  </tr>
</table>

<table width="534" border="1">
  <tr>
    <th scope="row">PILIH</th>
    <th>MAKANAN</th>
    <td>JUMLAH</td>
    <td>HARGA</td>
    <td>KETERANGAN</td>
  </tr>
  <tr>
    <th width="68" scope="row"><form id="form1" name="form1" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox" id="checkbox" />
      </label>
    </form></th>
    <td width="164">Nasi Goreng</td>
    <td width="62"><form id="form21" name="form21" method="post" action="">
      <input name="textarea" type="text" id="textarea" value="" size="10" />
    </form></td>
    <td width="98">Rp 10.000</td>
    <td width="108"><form id="form6" name="form6" method="post" action="">
      <label>
        <input type="submit" name="GAMBAR" id="GAMBAR" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form2" name="form2" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox2" id="checkbox2" />
      </label>
    </form></th>
    <td>Bakmi Goreng</td>
    <td><form id="form22" name="form22" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 10.000</td>
    <td><form id="form7" name="form7" method="post" action="">
      <label>
        <input type="submit" name="GAMBAR2" id="GAMBAR2" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form3" name="form3" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox3" id="checkbox3" />
      </label>
    </form></th>
    <td>Gurame Bakar</td>
    <td><form id="form23" name="form23" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 25.000</td>
    <td><form id="form8" name="form8" method="post" action="">
      <label>
        <input type="submit" name="GAMBAR3" id="GAMBAR3" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form4" name="form4" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox4" id="checkbox4" />
      </label>
    </form></th>
    <td>Ayam Bakar</td>
    <td><form id="form24" name="form24" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 33.000</td>
    <td><form id="form9" name="form9" method="post" action="">
      <label>
        <input type="submit" name="GAMBAR4" id="GAMBAR4" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form10" name="form5" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox6" id="checkbox6" />
      </label>
    </form></th>
    <td>Nila Bakar</td>
    <td><form id="form25" name="form25" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 23.000</td>
    <td><form id="form11" name="form10" method="post" action="">
      <label>
        <input type="submit" name="GAMBAR5" id="GAMBAR6" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row">PILIH</th>
    <th>MINUMAN</th>
    <td>JUMLAH</td>
    <td>HAARGA</td>
    <td>KETERANGAN</td>
  </tr>
  <tr>
    <th scope="row"><form id="form12" name="form12" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox5" id="checkbox5" />
      </label>
    </form></th>
    <td>Soda Gembira</td>
    <td><form id="form26" name="form26" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 10.000</td>
    <td><form id="form16" name="form16" method="post" action="">
      <label>
        <input type="submit" name="button" id="button" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form13" name="form13" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox7" id="checkbox7" />
      </label>
    </form></th>
    <td>Es Teh</td>
    <td><form id="form27" name="form27" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 2.000</td>
    <td><form id="form17" name="form17" method="post" action="">
      <label>
        <input type="submit" name="button2" id="button2" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form14" name="form14" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox8" id="checkbox8" />
      </label>
    </form></th>
    <td>Es Jeruk</td>
    <td><form id="form28" name="form28" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 4.000</td>
    <td><form id="form18" name="form18" method="post" action="">
      <label>
        <input type="submit" name="button3" id="button3" value="DETAIL" />
      </label>
    </form></td>
  </tr>
  <tr>
    <th scope="row"><form id="form15" name="form15" method="post" action="">
      <label>
        <input type="checkbox" name="checkbox9" id="checkbox9" />
      </label>
    </form></th>
    <td>Es Dawet</td>
    <td><form id="form29" name="form29" method="post" action="">
      <label>
        <input name="textarea" type="text" id="textarea" value="" size="10" />
      </label>
    </form></td>
    <td>Rp 5.000</td>
    <td><form id="form19" name="form19" method="post" action="">
      <label>
        <input type="submit" name="button4" id="button4" value="DETAIL" />
      </label>
    </form></td>
  </tr>
</table>
<p>&nbsp;</p>
<form id="form20" name="form20" method="post" action="">
  <label>
    <input type="submit" name="button5" id="button5" value="Selesai" />
  </label>
</form>
<p>&nbsp;</p>
<table width="200" border="1">
  
</table>

</body>
</html>
    