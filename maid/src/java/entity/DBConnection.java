package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DBConnection {

    Connection conn = null;

    public DBConnection() {
        String URL = "jdbc:mysql://localhost:3306/maidonline";
        String USER = "root";
        String PASS = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void closeConnection() {
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (Exception ex) {
            }
        }
    }
   

    public DBConnection(Connection conn) {
        this.conn = conn;
    }

    public List<pengunjung> getAllUsers() throws Exception {
        List<pengunjung> users = new ArrayList<pengunjung>();
        String sql = "SELECT * FROM pengunjung";
        try {
            PreparedStatement st = this.conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                pengunjung user = new pengunjung();
                user.setIdPengunjung(rs.getInt(1));
                user.setNamaPeng(rs.getString(2));
                user.setPasswordPeng(rs.getString(3));
                user.setEmailPeng(rs.getString(4));
                user.setTeleponPeng(rs.getString(5));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public pengunjung getUser(String username) {
        pengunjung user = new pengunjung();
        String sql = "SELECT * FROM pengunjung WHERE EMAIL_PENG = ?";
        try {
            PreparedStatement st = this.conn.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs != null) {
                if (rs.next()) {
                user.setIdPengunjung(rs.getInt(1));
                user.setNamaPeng(rs.getString(2));
                user.setPasswordPeng(rs.getString(3));
                user.setEmailPeng(rs.getString(4));
                user.setTeleponPeng(rs.getString(5));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public void insertUser(String NamaPeng, String PasswordPeng, String EmailPeng, String TeleponPeng) throws Exception {
        String sql = "INSERT INTO pengunjung VALUES (NULL , ?, ?, ?, ?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, NamaPeng);
            st.setString(2, PasswordPeng);
            st.setString(3, EmailPeng);
            st.setString(4, TeleponPeng);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUser(String NamaPeng, String PasswordPeng, String TeleponPeng,String EmailPeng)throws Exception {
        String sql = "UPDATE pengunjung SET NAMA_PENGUNJUNG=?, PASSWORD_PENG=?, TELEPON_PENG=?  WHERE EMAIL_PENG=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, NamaPeng);
            st.setString(2, PasswordPeng);
            st.setString(3, TeleponPeng);
            st.setString(4, EmailPeng);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int idPengunjung) {

        String sql = "DELETE FROM pengunjung WHERE ID_PENGUNJUNG = ?";
        try {
            PreparedStatement st = this.conn.prepareStatement(sql);
            st.setInt(1, idPengunjung);

            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

