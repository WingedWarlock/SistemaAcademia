/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Clientes;
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
public class ClientesDao {
    private Connection con;
    private Statement stmt;
    private Statement stmtNavegar;
    private ResultSet rsNavegar;
    
    public ClientesDao() throws ClassNotFoundException, SQLException{        
         
             con = ConexaoFactory.getConnection();
             stmt = con.createStatement();
             stmtNavegar = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE );
             rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.CLIENTES" );        
    
    }
    
    public Clientes primeiro() throws SQLException {
        
            if (rsNavegar.first() ) {            
                Clientes clientes = new Clientes();
                clientes.setCpf(rsNavegar.getInt("cpf"));
                clientes.setNome(rsNavegar.getString("nome"));
                clientes.setTelefone(rsNavegar.getString("Telefone"));
                clientes.setData(rsNavegar.getString("data"));
                clientes.setHora(rsNavegar.getString("hora"));
                clientes.setPeso(rsNavegar.getFloat("peso"));
                clientes.setGordura(rsNavegar.getFloat("gordura"));
                clientes.setMassa(rsNavegar.getFloat("massa"));
                return clientes;
                
            } else {
                return null;
            }
        
    }
    public boolean salvarRegistro( Clientes clientes ) throws SQLException{
          
          int cpf = clientes.getCpf();  
          String nome = clientes.getNome(); 
          String telefone = clientes.getTelefone(); 
          String data = clientes.getData(); 
          String hora  = clientes.getHora(); 
          float peso = clientes.getPeso(); 
          float gordura = clientes.getGordura(); 
          float massa = clientes.getMassa(); 
          
           
        
        try {
            stmt.executeUpdate( "insert into ROOT.CLIENTES values ( "+cpf+", '"+nome+"', '"+telefone+"', '"+data+"',"
            + "'"+hora+"',"+peso+","+gordura+","+massa+" )");
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.CLIENTES" );
            return true;
            
        } catch ( SQLException e) {
            
                stmt.executeUpdate( "update ROOT.CLIENTES set  nome = '"+nome+"', telefone = '"+telefone+"',"
                        + " data = '"+data+"', hora = '"+hora+"', peso = "+peso+","
                                + " gordura = "+gordura+", massa = "+massa+" where cpf = " + cpf );
                rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.CLIENTES" );
                return true;                        
        }
          
      }
     public boolean excluirRegistro( int cpf ) throws SQLException {
      
            stmt.executeUpdate( "delete from ROOT.CLIENTES where cpf = "+cpf );
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.CLIENTES" );
            return true;        
      }
     public Clientes pesquisarClientes( int cpf ) throws SQLException{               

                ResultSet rs = stmt.executeQuery( "select * from ROOT.CLIENTES where cpf = " + cpf );
                
              
              if ( rs.next() ) {      
                  Clientes clientes = new Clientes();
                  clientes.setCpf( rs.getInt( "cpf" ) );
                  clientes.setNome( rs.getString( "nome" ) );
                  clientes.setTelefone( rs.getString( "telefone" ) );
                  clientes.setData( rs.getString( "data" ) );
                  clientes.setHora( rs.getString( "hora" ) );
                  clientes.setPeso( rs.getFloat( "peso" ) );
                  clientes.setGordura( rs.getFloat( "gordura" ) );
                  clientes.setMassa( rs.getFloat( "massa" ) );
                  return clientes;                 
              } else {
                  return null;
              } 
      }
     public ArrayList listarClientes() throws SQLException {
          
          Statement stmtListar = con.createStatement();
          ResultSet rsListar = stmtListar.executeQuery( "select * from ROOT.CLIENTES");
          
          ArrayList<Clientes> retorno = new ArrayList<Clientes>();
            
            while ( rsListar.next() ) {
                int cpf = rsListar.getInt( "cpf" );
                String nome = rsListar.getString( "nome" );
                String telefone = rsListar.getString( "telefone" );
                String data = rsListar.getString( "data" );
                String hora = rsListar.getString( "hora" );
                float peso = rsListar.getFloat( "peso" );
                float gordura = rsListar.getFloat( "gordura" );
                float massa = rsListar.getFloat( "massa" );

                Clientes clientes = new Clientes();
                clientes.setCpf( cpf );
                clientes.setNome( nome );
                clientes.setTelefone( telefone );
                clientes.setData( data );
                clientes.setHora( hora );
                clientes.setPeso( peso );
                clientes.setGordura( gordura );
                clientes.setMassa( massa );

                retorno.add( clientes );
            }
            
            return retorno;
      }
}
