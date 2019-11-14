/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Treinos;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WingedWarlock
 */
public class TreinosDao {
    private Connection con;
    private Statement stmt;
    private Statement stmtNavegar;
    private ResultSet rsNavegar;
    
    public TreinosDao() throws ClassNotFoundException, SQLException{        
         
             con = ConexaoFactory.getConnection();
             stmt = con.createStatement();
             stmtNavegar = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE );
             rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.TREINOS" );        
    
    }
    
    public Treinos primeiro() throws SQLException {
        
            if (rsNavegar.first() ) {            
                Treinos treinos = new Treinos();
                treinos.setCod(rsNavegar.getInt("cod"));
                treinos.setNome(rsNavegar.getString("nome"));
                treinos.setCategoria(rsNavegar.getString("categoria"));
                return treinos;
                
            } else {
                return null;
            }
        
    }
    public boolean salvarRegistro( Treinos treinos ) throws SQLException{
          
          int cod = treinos.getCod();  
          String nome = treinos.getNome(); 
          String categoria = treinos.getCategoria(); 
          
           
        
        try {
            stmt.executeUpdate( "insert into ROOT.TREINOS values ( "+cod+", '"+nome+"','"+categoria+"' )");
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.TREINOS" );
            return true;
            
        } catch ( SQLException e) {
            
                stmt.executeUpdate( "update ROOT.TREINOS set  nome = '"+nome+"', categoria = '"+categoria+"' where cod = " + cod );
                rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.TREINOS" );
                return true;                        
        }
          
      }
     public boolean excluirRegistro( int cod ) throws SQLException {
      
            stmt.executeUpdate( "delete from ROOT.TREINOS where cod = "+cod );
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.TREINOS" );
            return true;        
      }
     public Treinos pesquisarTreinos( int cod ) throws SQLException{               

                ResultSet rs = stmt.executeQuery( "select * from ROOT.TREINOS where cod = " + cod );
                
              
              if ( rs.next() ) {      
                  Treinos treinos = new Treinos();
                  treinos.setCod( rs.getInt( "cod" ) );
                  treinos.setNome( rs.getString( "nome" ) );
                  treinos.setCategoria( rs.getString( "categoria" ) );
                  return treinos;                 
              } else {
                  return null;
              } 
      }
     public ArrayList listarTreinos() throws SQLException {
          
          Statement stmtListar = con.createStatement();
          ResultSet rsListar = stmtListar.executeQuery( "select * from ROOT.TREINOS");
          
          ArrayList<Treinos> retorno = new ArrayList<Treinos>();
            
            while ( rsListar.next() ) {
                int cod = rsListar.getInt( "cod" );
                String nome = rsListar.getString( "nome" );
                String categoria = rsListar.getString( "categoria" );

                Treinos treinos = new Treinos();
                treinos.setCod( cod );
                treinos.setNome( nome );
                treinos.setCategoria( categoria );

                retorno.add( treinos );
            }
            
            return retorno;
      }
      public  List<Treinos> montarListaTreinos() throws SQLException {          
          
            ArrayList<Treinos> lista = new ArrayList<Treinos>();       
        
            ResultSet rsTreinos = stmt.executeQuery( "select * from ROOT.TREINOS" );

            while ( rsTreinos.next() ) {
                Treinos treinos = new Treinos();
                treinos.setCod( rsTreinos.getInt( "cod" ) );
                treinos.setNome( rsTreinos.getString( "nome" ) );
                treinos.setCategoria( rsTreinos.getString( "categoria" ) );           
                lista.add( treinos );
            }
            
            return lista;
        
        
      }
      public int getCodTreinosByNome( String nome) throws SQLException{
        
        
            ResultSet rsTreinos = stmt.executeQuery( "select * from ROOT.TREINOS where nome = '" + nome + "'");
            
            if ( rsTreinos.next() ) {
                return rsTreinos.getInt( "cod" );                
            } else {
                return -1;
            }
        
    }
    
    public String getNomeTreinosByCod( int cod) throws SQLException{
        
        
            ResultSet rsTreinos = stmt.executeQuery( "select * from ROOT.TREINOS where cod = " + cod );
            
            if ( rsTreinos.next() ) {
                return rsTreinos.getString( "nome" );                
            } else {
                return "";
            }
        
    }
}
