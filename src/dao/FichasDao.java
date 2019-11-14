/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Fichas;
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
public class FichasDao {
    private Connection con;
    private Statement stmt;
    private Statement stmtNavegar;
    private ResultSet rsNavegar;
    
    public FichasDao() throws ClassNotFoundException, SQLException{        
         
             con = ConexaoFactory.getConnection();
             stmt = con.createStatement();
             stmtNavegar = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_UPDATABLE );
             rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.FICHAS" );        
    
    }
    
    public Fichas primeiro() throws SQLException {
        
            if (rsNavegar.first() ) {            
                Fichas fichas = new Fichas();
                fichas.setCod(rsNavegar.getInt("cod"));
                fichas.setNome(rsNavegar.getInt("nome"));
                fichas.setPeso(rsNavegar.getFloat("peso"));
                fichas.setGordura(rsNavegar.getFloat("gordura"));
                fichas.setMassa(rsNavegar.getFloat("massa"));
                fichas.setInstrutor(rsNavegar.getInt("instrutor"));
                fichas.setData(rsNavegar.getString("data"));
                fichas.setT1(rsNavegar.getInt("t1"));
                fichas.setT2(rsNavegar.getInt("t2"));
                fichas.setT3(rsNavegar.getInt("t3"));
                fichas.setT4(rsNavegar.getInt("t4"));
                fichas.setT5(rsNavegar.getInt("t5"));
                fichas.setT6(rsNavegar.getInt("t6"));
                fichas.setT7(rsNavegar.getInt("t7"));
                fichas.setT8(rsNavegar.getInt("t8"));
                fichas.setT9(rsNavegar.getInt("t9"));
                fichas.setT10(rsNavegar.getInt("t10"));
                fichas.setT11(rsNavegar.getInt("t11"));
                fichas.setT12(rsNavegar.getInt("t12"));
                fichas.setT13(rsNavegar.getInt("t13"));
                fichas.setT14(rsNavegar.getInt("t14"));
                fichas.setT15(rsNavegar.getInt("t15"));
                fichas.setT16(rsNavegar.getInt("t16"));
                fichas.setT17(rsNavegar.getInt("t17"));
                fichas.setT18(rsNavegar.getInt("t18"));
                fichas.setT19(rsNavegar.getInt("t19"));
                fichas.setT20(rsNavegar.getInt("t20"));
                fichas.setT21(rsNavegar.getInt("t21"));
                fichas.setT22(rsNavegar.getInt("t22"));
                fichas.setT23(rsNavegar.getInt("t23"));
                fichas.setT24(rsNavegar.getInt("t24"));
                fichas.setT25(rsNavegar.getInt("t25"));
                fichas.setT26(rsNavegar.getInt("t26"));
                fichas.setT27(rsNavegar.getInt("t27"));
                fichas.setT28(rsNavegar.getInt("t28"));
                fichas.setT29(rsNavegar.getInt("t29"));
                fichas.setT30(rsNavegar.getInt("t30"));
                fichas.setT31(rsNavegar.getInt("t31"));
                fichas.setT32(rsNavegar.getInt("t32"));
                fichas.setT33(rsNavegar.getInt("t33"));
                fichas.setT34(rsNavegar.getInt("t34"));
                fichas.setT35(rsNavegar.getInt("t35"));
                fichas.setT36(rsNavegar.getInt("t36"));
                fichas.setT37(rsNavegar.getInt("t37"));
                fichas.setT38(rsNavegar.getInt("t38"));
                fichas.setT39(rsNavegar.getInt("t39"));
                fichas.setT40(rsNavegar.getInt("t40"));
                fichas.setT41(rsNavegar.getInt("t41"));
                fichas.setT42(rsNavegar.getInt("t42"));
                fichas.setR1(rsNavegar.getInt("r1"));
                fichas.setR2(rsNavegar.getInt("r2"));
                fichas.setR3(rsNavegar.getInt("r3"));
                fichas.setR4(rsNavegar.getInt("r4"));
                fichas.setR5(rsNavegar.getInt("r5"));
                fichas.setR6(rsNavegar.getInt("r6"));
                fichas.setR7(rsNavegar.getInt("r7"));
                fichas.setR8(rsNavegar.getInt("r8"));
                fichas.setR9(rsNavegar.getInt("r9"));
                fichas.setR10(rsNavegar.getInt("r10"));
                fichas.setR11(rsNavegar.getInt("r11"));
                fichas.setR12(rsNavegar.getInt("r12"));
                fichas.setR13(rsNavegar.getInt("r13"));
                fichas.setR14(rsNavegar.getInt("r14"));
                fichas.setR15(rsNavegar.getInt("r15"));
                fichas.setR16(rsNavegar.getInt("r16"));
                fichas.setR17(rsNavegar.getInt("r17"));
                fichas.setR18(rsNavegar.getInt("r18"));
                fichas.setR19(rsNavegar.getInt("r19"));
                fichas.setR20(rsNavegar.getInt("r20"));
                fichas.setR21(rsNavegar.getInt("r21"));
                fichas.setR22(rsNavegar.getInt("r22"));
                fichas.setR23(rsNavegar.getInt("r23"));
                fichas.setR24(rsNavegar.getInt("r24"));
                fichas.setR25(rsNavegar.getInt("r25"));
                fichas.setR26(rsNavegar.getInt("r26"));
                fichas.setR27(rsNavegar.getInt("r27"));
                fichas.setR28(rsNavegar.getInt("r28"));
                fichas.setR29(rsNavegar.getInt("r29"));
                fichas.setR30(rsNavegar.getInt("r30"));
                fichas.setR31(rsNavegar.getInt("r31"));
                fichas.setR32(rsNavegar.getInt("r32"));
                fichas.setR33(rsNavegar.getInt("r33"));
                fichas.setR34(rsNavegar.getInt("r34"));
                fichas.setR35(rsNavegar.getInt("r35"));
                fichas.setR36(rsNavegar.getInt("r36"));
                fichas.setR37(rsNavegar.getInt("r37"));
                fichas.setR38(rsNavegar.getInt("r38"));
                fichas.setR39(rsNavegar.getInt("r39"));
                fichas.setR40(rsNavegar.getInt("r40"));
                fichas.setR41(rsNavegar.getInt("r41"));
                fichas.setR42(rsNavegar.getInt("r42"));
                fichas.setS1(rsNavegar.getInt("s1"));
                fichas.setS2(rsNavegar.getInt("s2"));
                fichas.setS3(rsNavegar.getInt("s3"));
                fichas.setS4(rsNavegar.getInt("s4"));
                fichas.setS5(rsNavegar.getInt("s5"));
                fichas.setS6(rsNavegar.getInt("s6"));
                fichas.setS7(rsNavegar.getInt("s7"));
                fichas.setS8(rsNavegar.getInt("s8"));
                fichas.setS9(rsNavegar.getInt("s9"));
                fichas.setS10(rsNavegar.getInt("s10"));
                fichas.setS11(rsNavegar.getInt("s11"));
                fichas.setS12(rsNavegar.getInt("s12"));
                fichas.setS13(rsNavegar.getInt("s13"));
                fichas.setS14(rsNavegar.getInt("s14"));
                fichas.setS15(rsNavegar.getInt("s15"));
                fichas.setS16(rsNavegar.getInt("s16"));
                fichas.setS17(rsNavegar.getInt("s17"));
                fichas.setS18(rsNavegar.getInt("s18"));
                fichas.setS19(rsNavegar.getInt("s19"));
                fichas.setS20(rsNavegar.getInt("s20"));
                fichas.setS21(rsNavegar.getInt("s21"));
                fichas.setS22(rsNavegar.getInt("s22"));
                fichas.setS23(rsNavegar.getInt("s23"));
                fichas.setS24(rsNavegar.getInt("s24"));
                fichas.setS25(rsNavegar.getInt("s25"));
                fichas.setS26(rsNavegar.getInt("s26"));
                fichas.setS27(rsNavegar.getInt("s27"));
                fichas.setS28(rsNavegar.getInt("s28"));
                fichas.setS29(rsNavegar.getInt("s29"));
                fichas.setS30(rsNavegar.getInt("s30"));
                fichas.setS31(rsNavegar.getInt("s31"));
                fichas.setS32(rsNavegar.getInt("s32"));
                fichas.setS33(rsNavegar.getInt("s33"));
                fichas.setS34(rsNavegar.getInt("s34"));
                fichas.setS35(rsNavegar.getInt("s35"));
                fichas.setS36(rsNavegar.getInt("s36"));
                fichas.setS37(rsNavegar.getInt("s37"));
                fichas.setS38(rsNavegar.getInt("s38"));
                fichas.setS39(rsNavegar.getInt("s39"));
                fichas.setS40(rsNavegar.getInt("s40"));
                fichas.setS41(rsNavegar.getInt("s41"));
                fichas.setS42(rsNavegar.getInt("s42"));
                return fichas;
                
            } else {
                return null;
            }
        
    }
    public boolean salvarRegistro( Fichas fichas ) throws SQLException{
          
          int cod = fichas.getCod();  
          int nome = fichas.getNome();   
          float peso = fichas.getPeso(); 
          float gordura = fichas.getGordura(); 
          float massa = fichas.getMassa(); 
          int instrutor = fichas.getInstrutor(); 
          String data = fichas.getData();
          int t1 = fichas.getT1();
          int t2 = fichas.getT2();
          int t3 = fichas.getT3();
          int t4 = fichas.getT4();
          int t5 = fichas.getT5();
          int t6 = fichas.getT6();
          int t7 = fichas.getT7();
          int t8 = fichas.getT8();
          int t9 = fichas.getT9();
          int t10 = fichas.getT10();
          int t11 = fichas.getT11();
          int t12 = fichas.getT12();
          int t13 = fichas.getT13();
          int t14 = fichas.getT14();
          int t15 = fichas.getT15();
          int t16 = fichas.getT16();
          int t17 = fichas.getT17();
          int t18 = fichas.getT18();
          int t19 = fichas.getT19();
          int t20 = fichas.getT20();
          int t21 = fichas.getT21();
          int t22 = fichas.getT22();
          int t23 = fichas.getT23();
          int t24 = fichas.getT24();
          int t25 = fichas.getT25();
          int t26 = fichas.getT26();
          int t27 = fichas.getT27();
          int t28 = fichas.getT28();
          int t29 = fichas.getT29();
          int t30 = fichas.getT30();
          int t31 = fichas.getT31();
          int t32 = fichas.getT32();
          int t33 = fichas.getT33();
          int t34 = fichas.getT34();
          int t35 = fichas.getT35();
          int t36 = fichas.getT36();
          int t37 = fichas.getT37();
          int t38 = fichas.getT38();
          int t39 = fichas.getT39();
          int t40 = fichas.getT40();
          int t41 = fichas.getT41();
          int t42 = fichas.getT42();
          int r1 = fichas.getR1();
          int r2 = fichas.getR2();
          int r3 = fichas.getR3();
          int r4 = fichas.getR4();
          int r5 = fichas.getR5();
          int r6 = fichas.getR6();
          int r7 = fichas.getR7();
          int r8 = fichas.getR8();
          int r9 = fichas.getR9();
          int r10 = fichas.getR10();
          int r11 = fichas.getR11();
          int r12 = fichas.getR12();
          int r13 = fichas.getR13();
          int r14 = fichas.getR14();
          int r15 = fichas.getR15();
          int r16 = fichas.getR16();
          int r17 = fichas.getR17();
          int r18 = fichas.getR18();
          int r19 = fichas.getR19();
          int r20 = fichas.getR20();
          int r21 = fichas.getR21();
          int r22 = fichas.getR22();
          int r23 = fichas.getR23();
          int r24 = fichas.getR24();
          int r25 = fichas.getR25();
          int r26 = fichas.getR26();
          int r27 = fichas.getR27();
          int r28 = fichas.getR28();
          int r29 = fichas.getR29();
          int r30 = fichas.getR30();
          int r31 = fichas.getR31();
          int r32 = fichas.getR32();
          int r33 = fichas.getR33();
          int r34 = fichas.getR34();
          int r35 = fichas.getR35();
          int r36 = fichas.getR36();
          int r37 = fichas.getR37();
          int r38 = fichas.getR38();
          int r39 = fichas.getR39();
          int r40 = fichas.getR40();
          int r41 = fichas.getR41();
          int r42 = fichas.getR42();
          int s1 = fichas.getS1();
          int s2 = fichas.getS2();
          int s3 = fichas.getS3();
          int s4 = fichas.getS4();
          int s5 = fichas.getS5();
          int s6 = fichas.getS6();
          int s7 = fichas.getS7();
          int s8 = fichas.getS8();
          int s9 = fichas.getS9();
          int s10 = fichas.getS10();
          int s11 = fichas.getS11();
          int s12 = fichas.getS12();
          int s13 = fichas.getS13();
          int s14 = fichas.getS14();
          int s15 = fichas.getS15();
          int s16 = fichas.getS16();
          int s17 = fichas.getS17();
          int s18 = fichas.getS18();
          int s19 = fichas.getS19();
          int s20 = fichas.getS20();
          int s21 = fichas.getS21();
          int s22 = fichas.getS22();
          int s23 = fichas.getS23();
          int s24 = fichas.getS24();
          int s25 = fichas.getS25();
          int s26 = fichas.getS26();
          int s27 = fichas.getS27();
          int s28 = fichas.getS28();
          int s29 = fichas.getS29();
          int s30 = fichas.getS30();
          int s31 = fichas.getS31();
          int s32 = fichas.getS32();
          int s33 = fichas.getS33();
          int s34 = fichas.getS34();
          int s35 = fichas.getS35();
          int s36 = fichas.getS36();
          int s37 = fichas.getS37();
          int s38 = fichas.getS38();
          int s39 = fichas.getS39();
          int s40 = fichas.getS40();
          int s41 = fichas.getS41();
          int s42 = fichas.getS42();
          
           
        
        try {
            stmt.executeUpdate( "insert into ROOT.FICHAS values ( "+cod+", "+nome+","+peso+","+gordura+","+massa+","+instrutor+",'"+data+"',"
                    + ""+t1+","+t2+","+t3+","+t4+","+t5+","+t6+","+t7+","+t8+","+t9+","+t10+","+t11+","+t12+","+t13+","+t14+","+t15+","+t16+","+t17+","+t18+","+t19+","+t20+","+t21+","+t22+","+t23+","+t24+","+t25+","+t26+","+t27+","+t28+","+t29+","+t30+","+t31+","+t32+","+t33+","+t34+","+t35+","+t36+","+t37+","+t38+","+t39+","+t40+","+t41+","+t42+","+r1+","+r2+","+r3+","+r4+","+r5+","+r6+","+r7+","+r8+","+r9+","+r10+","+r11+","+r12+","+r13+","+r14+","+r15+","+r16+","+r17+","+r18+","+r19+","+r20+","+r21+","+r22+","+r23+","+r24+","+r25+","+r26+","+r27+","+r28+","+r29+","+r30+","+r31+","+r32+","+r33+","+r34+","+r35+","+r36+","+r37+","+r38+","+r39+","+r40+","+r41+","+r42+","+s1+","+s2+","+s3+","+s4+","+s5+","+s6+","+s7+","+s8+","+s9+","+s10+","+s11+","+s12+","+s13+","+s14+","+s15+","+s16+","+s17+","+s18+","+s19+","+s20+","+s21+","+s22+","+s23+","+s24+","+s25+","+s26+","+s27+","+s28+","+s29+","+s30+","+s31+","+s32+","+s33+","+s34+","+s35+","+s36+","+s37+","+s38+","+s39+","+s40+","+s41+","+s42+" )");
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.FICHAS" );
            return true;
            
        } catch ( SQLException e) {
            
                stmt.executeUpdate( "update ROOT.FICHAS set  nome = "+nome+", instrutor = "+instrutor+","
                        + " data = '"+data+"', peso = "+peso+","
           + " gordura = "+gordura+", massa = "+massa+",t1="+t1+",t2="+t2+",t3="+t3+",t4="+t4+""
          + ",t5="+t5+",t6="+t6+",t7="+t7+",t8="+t8+",t9="+t9+",t10="+t10+",t11="+t11+",t12="+t12+",t13="+t13+",t14="+t14+","
            + "t15="+t15+",t16="+t16+",t17="+t17+",t18="+t18+",t19="+t19+",t20="+t20+",t21="+t21+",t22="+t22+",t23="+t23+","
         + "t24="+t24+",t25="+t25+",t26="+t26+",t27="+t27+",t28="+t28+",t29="+t29+",t30="+t30+",t31="+t31+",t32="+t32+","
          + "t33="+t33+",t34="+t34+",t35="+t35+",t36="+t36+",t37="+t37+",t38="+t38+",t39="+t39+",t40="+t40+",t41="+t41+","
         + "t42="+t42+",r1="+r1+",r2="+r2+",r3="+r3+",r4="+r4+",r5="+r5+",r6="+r6+",r7="+r7+",r8="+r8+",r9="+r9+","
            + "r10="+r10+",r11="+r11+",r12="+r12+",r13="+r13+",r14="+r14+",r15="+r15+",r16="+r16+",r17="+r17+","
       + "r18="+r18+",r19="+r19+",r20="+r20+",r21="+r21+",r22="+r22+",r23="+r23+",r24="+r24+","
      + "r25="+r25+",r26="+r26+",r27="+r27+",r28="+r28+",r29="+r29+",r30="+r30+",r31="+r31+",r32="+r32+",r33="+r33+","
              + "r34="+r34+",r35="+r35+",r36="+r36+",r37="+r37+",r38="+r38+",r39="+r39+",r40="+r40+",r41="+r41+","
     + "r42="+r42+",s1="+s1+",s2="+s2+",s3="+s3+",s4="+s4+",s5="+s5+",s6="+s6+",s7="+s7+",s8="+s8+","
     + "s9="+s9+",s10="+s10+",s11="+s11+",s12="+s12+",s13="+s13+",s14="+s14+",s15="+s15+",s16="+s16+",s17="+s17+","
  + "s18="+s18+",s19="+s19+",s20="+s20+",s21="+s21+",s22="+s22+",s23="+s23+",s24="+s24+",s25="+s25+",s26="+s26+","
      + "s27="+s27+",s28="+s28+",s29="+s29+",s30="+s30+",s31="+s31+",s32="+s32+",s33="+s33+",s34="+s34+",s35="+s35+","
           + "s36="+s36+",s37="+s37+",s38="+s38+",s39="+s39+",s40="+s40+",s41="+s41+",s42="+s42+" where cod = " + cod );
                rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.FICHAS" );
                return true;                        
        }
          
      }
     public boolean excluirRegistro( int cod ) throws SQLException {
      
            stmt.executeUpdate( "delete from ROOT.FICHAS where cod = "+cod );
            rsNavegar = stmtNavegar.executeQuery( "select * from ROOT.FICHAS" );
            return true;        
      }
     public Fichas pesquisarFichas( int cod ) throws SQLException{               

                ResultSet rs = stmt.executeQuery( "select * from ROOT.FICHAS where cod = " + cod );
                
              
              if ( rs.next() ) {      
                  Fichas fichas = new Fichas();
                  fichas.setCod( rs.getInt( "cod" ) );
                  fichas.setNome( rs.getInt( "nome" ) );
                  fichas.setInstrutor( rs.getInt( "instrutor" ) );
                  fichas.setData( rs.getString( "data" ) );
                  fichas.setPeso( rs.getFloat( "peso" ) );
                  fichas.setGordura( rs.getFloat( "gordura" ) );
                  fichas.setMassa( rs.getFloat( "massa" ) );
                  fichas.setT1(rs.getInt("t1"));
                  fichas.setT2(rs.getInt("t2"));
                  fichas.setT3(rs.getInt("t3"));
                  fichas.setT4(rs.getInt("t4"));
                  fichas.setT5(rs.getInt("t5"));
                  fichas.setT6(rs.getInt("t6"));
                  fichas.setT7(rs.getInt("t7"));
                  fichas.setT8(rs.getInt("t8"));
                  fichas.setT9(rs.getInt("t9"));
                  fichas.setT10(rs.getInt("t10"));
                  fichas.setT11(rs.getInt("t11"));
                  fichas.setT12(rs.getInt("t12"));
                  fichas.setT13(rs.getInt("t13"));
                  fichas.setT14(rs.getInt("t14"));
                  fichas.setT15(rs.getInt("t15"));
                  fichas.setT16(rs.getInt("t16"));
                  fichas.setT17(rs.getInt("t17"));
                  fichas.setT18(rs.getInt("t18"));
                  fichas.setT19(rs.getInt("t19"));
                  fichas.setT20(rs.getInt("t20"));
                  fichas.setT21(rs.getInt("t21"));
                  fichas.setT22(rs.getInt("t22"));
                  fichas.setT23(rs.getInt("t23"));
                  fichas.setT24(rs.getInt("t24"));
                  fichas.setT25(rs.getInt("t25"));
                  fichas.setT26(rs.getInt("t26"));
                  fichas.setT27(rs.getInt("t27"));
                  fichas.setT28(rs.getInt("t28"));
                  fichas.setT29(rs.getInt("t29"));
                  fichas.setT30(rs.getInt("t30"));
                  fichas.setT31(rs.getInt("t31"));
                  fichas.setT32(rs.getInt("t32"));
                  fichas.setT33(rs.getInt("t33"));
                  fichas.setT34(rs.getInt("t34"));
                  fichas.setT35(rs.getInt("t35"));
                  fichas.setT36(rs.getInt("t36"));
                  fichas.setT37(rs.getInt("t37"));
                  fichas.setT38(rs.getInt("t38"));
                  fichas.setT39(rs.getInt("t39"));
                  fichas.setT40(rs.getInt("t40"));
                  fichas.setT41(rs.getInt("t41"));
                  fichas.setT42(rs.getInt("t42"));
                  fichas.setR1(rs.getInt("r1"));
                  fichas.setR2(rs.getInt("r2"));
                  fichas.setR3(rs.getInt("r3"));
                  fichas.setR4(rs.getInt("r4"));
                  fichas.setR5(rs.getInt("r5"));
                  fichas.setR6(rs.getInt("r6"));
                  fichas.setR7(rs.getInt("r7"));
                  fichas.setR8(rs.getInt("r8"));
                  fichas.setR9(rs.getInt("r9"));
                  fichas.setR10(rs.getInt("r10"));
                  fichas.setR11(rs.getInt("r11"));
                  fichas.setR12(rs.getInt("r12"));
                  fichas.setR13(rs.getInt("r13"));
                  fichas.setR14(rs.getInt("r14"));
                  fichas.setR15(rs.getInt("r15"));
                  fichas.setR16(rs.getInt("r16"));
                  fichas.setR17(rs.getInt("r17"));
                  fichas.setR18(rs.getInt("r18"));
                  fichas.setR19(rs.getInt("r19"));
                  fichas.setR20(rs.getInt("r20"));
                  fichas.setR21(rs.getInt("r21"));
                  fichas.setR22(rs.getInt("r22"));
                  fichas.setR23(rs.getInt("r23"));
                  fichas.setR24(rs.getInt("r24"));
                  fichas.setR25(rs.getInt("r25"));
                  fichas.setR26(rs.getInt("r26"));
                  fichas.setR27(rs.getInt("r27"));
                  fichas.setR28(rs.getInt("r28"));
                  fichas.setR29(rs.getInt("r29"));
                  fichas.setR30(rs.getInt("r30"));
                  fichas.setR31(rs.getInt("r31"));
                  fichas.setR32(rs.getInt("r32"));
                  fichas.setR33(rs.getInt("r33"));
                  fichas.setR34(rs.getInt("r34"));
                  fichas.setR35(rs.getInt("r35"));
                  fichas.setR36(rs.getInt("r36"));
                  fichas.setR37(rs.getInt("r37"));
                  fichas.setR38(rs.getInt("r38"));
                  fichas.setR39(rs.getInt("r39"));
                  fichas.setR40(rs.getInt("r40"));
                  fichas.setR41(rs.getInt("r41"));
                  fichas.setR42(rs.getInt("r42"));
                  fichas.setS1(rs.getInt("s1"));
                  fichas.setS2(rs.getInt("s2"));
                  fichas.setS3(rs.getInt("s3"));
                  fichas.setS4(rs.getInt("s4"));
                  fichas.setS5(rs.getInt("s5"));
                  fichas.setS6(rs.getInt("s6"));
                  fichas.setS7(rs.getInt("s7"));
                  fichas.setS8(rs.getInt("s8"));
                  fichas.setS9(rs.getInt("s9"));
                  fichas.setS10(rs.getInt("s10"));
                  fichas.setS11(rs.getInt("s11"));
                  fichas.setS12(rs.getInt("s12"));
                  fichas.setS13(rs.getInt("s13"));
                  fichas.setS14(rs.getInt("s14"));
                  fichas.setS15(rs.getInt("s15"));
                  fichas.setS16(rs.getInt("s16"));
                  fichas.setS17(rs.getInt("s17"));
                  fichas.setS18(rs.getInt("s18"));
                  fichas.setS19(rs.getInt("s19"));
                  fichas.setS20(rs.getInt("s20"));
                  fichas.setS21(rs.getInt("s21"));
                  fichas.setS22(rs.getInt("s22"));
                  fichas.setS23(rs.getInt("s23"));
                  fichas.setS24(rs.getInt("s24"));
                  fichas.setS25(rs.getInt("s25"));
                  fichas.setS26(rs.getInt("s26"));
                  fichas.setS27(rs.getInt("s27"));
                  fichas.setS28(rs.getInt("s28"));
                  fichas.setS29(rs.getInt("s29"));
                  fichas.setS30(rs.getInt("s30"));
                  fichas.setS31(rs.getInt("s31"));
                  fichas.setS32(rs.getInt("s32"));
                  fichas.setS33(rs.getInt("s33"));
                  fichas.setS34(rs.getInt("s34"));
                  fichas.setS35(rs.getInt("s35"));
                  fichas.setS36(rs.getInt("s36"));
                  fichas.setS37(rs.getInt("s37"));
                  fichas.setS38(rs.getInt("s38"));
                  fichas.setS39(rs.getInt("s39"));
                  fichas.setS40(rs.getInt("s40"));
                  fichas.setS41(rs.getInt("s41"));
                  fichas.setS42(rs.getInt("s42"));

                  return fichas;                 
              } else {
                  return null;
              } 
      }
     /*public ArrayList listarFichas() throws SQLException {
          
          Statement stmtListar = con.createStatement();
          ResultSet rsListar = stmtListar.executeQuery( "select * from ROOT.FICHAS");
          
          ArrayList<Fichas> retorno = new ArrayList<Fichas>();
            
            while ( rsListar.next() ) {
                int cod = rsListar.getInt( "cod" );
                String nome = rsListar.getString( "nome" );
                String telefone = rsListar.getString( "telefone" );
                String data = rsListar.getString( "data" );
                String hora = rsListar.getString( "hora" );
                float peso = rsListar.getFloat( "peso" );
                float gordura = rsListar.getFloat( "gordura" );
                float massa = rsListar.getFloat( "massa" );

                Fichas fichas = new Fichas();
                fichas.setCod( cod );
                fichas.setNome( nome );
                fichas.setTelefone( telefone );
                fichas.setData( data );
                fichas.setHora( hora );
                fichas.setPeso( peso );
                fichas.setGordura( gordura );
                fichas.setMassa( massa );

                retorno.add( fichas );
            }
            
            return retorno;
      }*/
}
