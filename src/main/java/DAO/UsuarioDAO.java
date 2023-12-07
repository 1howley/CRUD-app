package DAO;

import connection.Connect;
import entity.Usuario;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UsuarioDAO {
    
    PreparedStatement ps = null;
    
    public void cadastrarUsuario(Usuario usuario) {
        
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";
        
        try {
            
            ps = Connect.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            System.out.println("erro no cadastrar usuario!");
            
        }
        
    }
    
    public boolean VerificaLogin(String login, String pass) {
        //String sql = "SELECT login, senha FROM loginbd.usuario WHERE login = ?";
        String sql = "SELECT * FROM loginbd.usuario WHERE login = ?";
        Usuario UserLogin = new Usuario();
        
        try {
            
            ps = Connect.getConexao().prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                UserLogin.setLogin(rs.getString("login"));
                UserLogin.setSenha(rs.getString("senha"));
                
                return UserLogin.getLogin().equals(login) && UserLogin.getSenha().equals(pass);
                
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            System.out.println("erro no verificar login!");
            
            return false;
            
        }
        
    }
    
    public boolean existeLogin(String login) {
        
        String sql = "SELECT * FROM loginbd.usuario WHERE login = ?";
        Usuario UserLogin = new Usuario();
        
        try {
            
            ps = Connect.getConexao().prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                UserLogin.setLogin(rs.getString("login"));
                
                return UserLogin.getLogin().equals(login);
                
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            System.out.println("erro no existir login!");
            
            return false;
            
        }
    }
    public List<Usuario> getUsuario() {
        ArrayList<Usuario> listaUser = new ArrayList<>();
        String sql = "SELECT nome, login, email FROM loginbd.usuario;";

        try {
            
            PreparedStatement ps = Connect.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario user = new Usuario();

                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setEmail(rs.getString("email"));

                listaUser.add(user);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }       

        return listaUser;
    }
     public void deleteUser(String login) {
        String sql = "DELETE FROM usuario WHERE login=?";

        try {
            PreparedStatement ps = Connect.getConexao().prepareStatement(sql);
            ps.setString(1, login);

            ps.execute();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
