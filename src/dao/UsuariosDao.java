/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Usuarios;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WingedWarlock
 */
public class UsuariosDao {
    private Connection con;
    private Statement stmt;
    private Statement stmtNavegar;
    private ResultSet rsNavegar;
    
    public UsuariosDao() throws ClassNotFoundException, SQLException{        
         
             con = ConexaoFactory.getConnection();
             stmt = con.createStatement();
             stmtNavegar = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE );
             rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.USUARIOS" );        
    
    }
    
    public Usuarios primeiro() throws SQLException {
        
            if (rsNavegar.first() ) {            
                Usuarios usuarios = new Usuarios();
                usuarios.setCpf(rsNavegar.getInt("cpf"));
                usuarios.setNome(rsNavegar.getString("nome"));
                usuarios.setTelefone(rsNavegar.getString("Telefone"));
                usuarios.setData(rsNavegar.getString("data"));
                usuarios.setHora(rsNavegar.getString("hora"));
                return usuarios;
                
            } else {
                return null;
            }
        
    }
    public boolean salvarRegistro( Usuarios usuarios ) throws SQLException{
          
          int cpf = usuarios.getCpf();  
          String nome = usuarios.getNome(); 
          String telefone = usuarios.getTelefone(); 
          String data = usuarios.getData(); 
          String hora  = usuarios.getHora(); 
          String login = usuarios.getLogin(); 
          String senha = usuarios.getSenha(); 
          
           
        
        try {
            stmt.executeUpdate( "insert into ROOT.USUARIOS values ( "+cpf+", '"+nome+"', '"+telefone+"', '"+data+"',"
            + "'"+hora+"','"+login+"','"+senha+"' )");
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.USUARIOS" );
            return true;
            
        } catch ( SQLException e) {
            
                stmt.executeUpdate( "update ROOT.USUARIOS set  nome = '"+nome+"', telefone = '"+telefone+"',"
                        + " data = '"+data+"', hora = '"+hora+"', login = '"+login+"',"
                                + " senha = '"+senha+"' where cpf = " + cpf );
                rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.USUARIOS" );
                return true;                        
        }
          
      }
     public boolean excluirRegistro( int cpf ) throws SQLException {
      
            stmt.executeUpdate( "delete from ROOT.USUARIOS where cpf = "+cpf );
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.USUARIOS" );
            return true;        
      }
     public Usuarios pesquisarUsuarios( int cpf ) throws SQLException{               

                ResultSet rs = stmt.executeQuery( "select * from ROOT.USUARIOS where cpf = " + cpf );
                
              
              if ( rs.next() ) {      
                  Usuarios usuarios = new Usuarios();
                  usuarios.setCpf( rs.getInt( "cpf" ) );
                  usuarios.setNome( rs.getString( "nome" ) );
                  usuarios.setTelefone( rs.getString( "telefone" ) );
                  usuarios.setData( rs.getString( "data" ) );
                  usuarios.setHora( rs.getString( "hora" ) );
                  return usuarios;                 
              } else {
                  return null;
              } 
      }
     public ArrayList listarUsuarios() throws SQLException {
          
          Statement stmtListar = con.createStatement();
          ResultSet rsListar = stmtListar.executeQuery( "select * from ROOT.USUARIOS");
          
          ArrayList<Usuarios> retorno = new ArrayList<Usuarios>();
            
            while ( rsListar.next() ) {
                int cpf = rsListar.getInt( "cpf" );
                String nome = rsListar.getString( "nome" );
                String telefone = rsListar.getString( "telefone" );
                String data = rsListar.getString( "data" );
                String hora = rsListar.getString( "hora" );

                Usuarios usuarios = new Usuarios();
                usuarios.setCpf( cpf );
                usuarios.setNome( nome );
                usuarios.setTelefone( telefone );
                usuarios.setData( data );
                usuarios.setHora( hora );

                
                retorno.add( usuarios );
            }
            
            return retorno;
      }
      public boolean checkLogin(String login, String senha) throws SQLException, ClassNotFoundException {

        Connection con = ConexaoFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM ROOT.USUARIOS WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return check;

    }

}
