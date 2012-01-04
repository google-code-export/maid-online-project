<%-- 
    Document   : bon_validasi
    Created on : Dec 1, 2011, 11:54:53 AM
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
            <form method='post' action="Dispatcher?page=terimakasih_telahpesan">    
                <div id="header">
                    <h1 id="logo2"><a>Persetujuan</a></h1>
                </div>
                <div id="content">
                    <table border=0>
                        <tr>
                            <td width="100">
                                Nama Anda
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
                            <td width="135"><strong>MAKANAN</strong></td>
                            <td width="66"><strong>JUMLAH</strong></td>
                            <td width="77"><strong>HARGA</strong></td>
                        </tr>
                        <tr align="center">
                            <td>Nasi Goreng</td>
                            <td> <%= request.getParameter("nasigoyeng")%> </td>
                            <td>Rp 10.000</td>
                        </tr>
                        <tr align="center">
                            <td>Bakmi Goreng</td>
                            <td> <%= request.getParameter("bakmigoyeng")%></td>
                            <td>Rp 10.000</td>
                        </tr>
                        <tr align="center">
                            <td>Gurame Bakar</td>
                            <td> <%= request.getParameter("guramebakar")%></td>
                            <td>Rp 25.000</td>
                        </tr>
                        <tr align="center">
                            <td>Ayam Bakar</td>
                            <td> <%= request.getParameter("ayambakar")%></td>
                            <td>Rp 33.000</td>
                        </tr>
                        <tr align="center">
                            <td>Nila Bakar</td>
                            <td> <%= request.getParameter("nilabakar")%></td>
                            <td>Rp 23.000</td>
                        </tr>
                        <tr align="center">
                            <td><strong>MINUMAN</strong></td>
                            <td><strong>JUMLAH</strong></td>
                            <td><strong>HARGA</strong></td>
                        </tr>
                        <tr align="center">
                            <td>Soda Gembira</td>
                            <td> <%= request.getParameter("odagembira")%></td>
                            <td>Rp 10.000</td>
                        </tr>
                        <tr align="center">
                            <td>Es Teh</td>
                            <td> <%= request.getParameter("esthe")%></td>
                            <td>Rp 2.000</td>
                        </tr>
                        <tr align="center">
                            <td>Es Jeruk</td>
                            <td> <%= request.getParameter("eseyuk")%></td>
                            <td>Rp 4.000</td>
                        </tr>
                        <tr align="center">
                            <td>Es Dawet</td>
                            <td> <%= request.getParameter("esawet")%></td>
                            <td>Rp 5.000</td>
                        </tr>
                    </table>
                    <table width="507" border="0">
                        <tr id="name">
                            <th width="497" scope="row">Apakah Anda Yakin Dengan Pesanan Anda ?</th>
                        </tr>
                    </table>
                    <blockquote>
                        <blockquote>
                            <blockquote>
                                <blockquote>
                                    <h1>
                                        <input type='submit' class="elipse" value='Ya' action='Dispatcher?page=terimakasih_telahpesan'/>
                                    </h1>
                                </blockquote>
                            </blockquote>
                        </blockquote>
                    </blockquote>
                </div>
            </form>
            <form method='post' action="Dispatcher?page=loginpelanggan">
                <blockquote>
                        <blockquote>
                <input type="submit" class="elipse" value="Tidak" action="Dispatcher?page=loginpelanggan"/>
            </blockquote>
                        </blockquote>
               </form>
            <div id="footer" align="center">
                <ul id="metaLink">
                    <li>&copy; copyright 2012 - <a>Kelompok 12 RBPL</a> Maid Online</li>
                </ul>
            </div>
        </div>
    </body>
</html>
