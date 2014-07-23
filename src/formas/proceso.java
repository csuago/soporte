/*
 * proceso.java
 *
 * Created on 31 de julio de 2008, 12:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package formas;


import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class proceso {
    public static Connection conn1;
    public static java.sql.Statement sql;
    private static ResultSet  rs;
    public  String devuelve;
    public Date Regreso;     
    private String Vusuario;
    private String Vforma;
    public static String Vopi,Vopm,Vope,Vpri;
    private String error;
    Date date = new Date();   
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private String fechaBD;
    
    
public String meses(int valor){
    String Dmes = "";
    if(valor == 1){
       Dmes = "Enero";
    }
    if(valor == 2){
       Dmes = "Febrero";
    }
    if(valor == 3){
       Dmes = "Marzo";
    }
    if(valor == 4){
       Dmes = "Abril";
    }
    if(valor == 5){
       Dmes = "Mayo";
    }
    if(valor == 6){
       Dmes = "Junio";
    }
    if(valor == 7){
       Dmes = "Julio";
    }
    if(valor == 8){
       Dmes = "Agosto";
    }
    if(valor == 9){
       Dmes = "Septiembre";
    }if(valor == 10){
       Dmes = "Octubre";
    }
    if(valor == 11){
       Dmes = "Noviembre";
    }
    if(valor == 12){
       Dmes = "Diciembre";
    }
       return Dmes;
 }

public int Dmeses(String Dmes){
    int nromes = 0;
    if(Dmes.equals("Enero")){
       nromes = 1;
    }
    if(Dmes.equals("Febrero")){
       nromes = 2;
    }
    if(Dmes.equals("Marzo")){
       nromes = 3;
    }
    if(Dmes.equals("Abril")){
       nromes = 4;
    }
    if(Dmes.equals("Mayo")){
       nromes = 5;
    }
    if(Dmes.equals("Junio")){
       nromes = 6;
    }
    if(Dmes.equals("Julio")){
       nromes = 7;
    }
    if(Dmes.equals("Agosto")){
       nromes = 8;
    }
    if(Dmes.equals("Septiembre")){
       nromes = 9;
    if(Dmes.equals("Octubre")){
       nromes = 10;
    }
    if(Dmes.equals("Noviembre")){
       nromes = 11;
    }
    if(Dmes.equals("Diciembre")){
       nromes = 12;
    }else {
           nromes = 0;
       }
    }
       return nromes;
}


public Date  Vfecha(Date fechaE) throws ParseException{
      java.text.SimpleDateFormat sdfD = new java.text.SimpleDateFormat("yyyy-MM-dd");
      String Efecha = sdfD.format(fechaE);
      java.util.Date fecha = null;
       if(Efecha.toString().equals("0001-01-01")){
           fecha = null;
         }else {
          fecha = sdfD.parse(Efecha);
         }
          return fecha;
 }
public Date  Vfecha2(String fechaE) throws ParseException{
       java.text.SimpleDateFormat sdfD = new java.text.SimpleDateFormat("yyyy-MM-dd");
       String Efecha = sdfD.format(fechaE);
       java.util.Date fecha = null;
       if(Efecha.toString().equals("0001-01-01")){
           fecha = null;
         }else {
          fecha = sdfD.parse(Efecha);
         }
          return fecha;
 }


public String Verfecha(Date f2){
       String fechaS = null;
       Date fecha = f2;
       java.text.SimpleDateFormat sdfD = new java.text.SimpleDateFormat("yyyy-MM-dd");
       
       String Efecha = sdfD.format(fecha);
       if(Efecha.toString().equals("0001-01-01")){
           fecha = null;
            }else {
              SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              fechaS = sdf.format(fecha);          
       }      
         return fechaS;
    }

public String Gfecha(Date f2){
       String fechaS;
       Date fecha = f2;
       if (fecha == null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            try {
                fecha  = sdf.parse("0001/01/01");
            } catch (ParseException ex) {
                Logger.getLogger(proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechaS = sdf.format(fecha);
            }else {
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
              fechaS = sdf.format(fecha);
       }       
       return fechaS;
    }

//public String Gfecha(Date f2){
//       String fechaS;
//       Date fecha = f2;
//       if (fecha == null){
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//            try {
//                fecha = sdf.parse("0001/01/01");
//                fechaS = sdf.format(fecha);
//            } catch (ParseException ex) {
//                Logger.getLogger(proceso.class.getName()).log(Level.SEVERE, null, ex);
//            }
//       }
//       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//       fechaS = sdf.format(fecha);
//       return fechaS;
//    }

// PARA GRABAR EL FORMATO DE FECHA
public String FormatFecha1(String f2,Date f3){
//       Date fecha = txtdesde1.getDate();
       Date fecha = f3;
       if (fecha == null){
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            try {
                fecha = sdf.parse("0001/01/01");               
                f2 = sdf.format(fecha);
            } catch (ParseException ex) {
                Logger.getLogger(proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
       f2 = sdf.format(fecha);
       return f2;
    }



// PARA GRABAR EL FORMATO DE FECHA

   public  String Grabafecha(String fechaN){
    // Revisa la Fecha si viene en Blanco
     if(fechaN.equals(""))
    {
        devuelve = "0001-01-01";
    }else{
        SimpleDateFormat sdfD=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfG=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            devuelve= sdfG.format(sdfD.parse(fechaN));
        } catch (ParseException ex) {
        }
    }
        return devuelve;
}

// PARA TRANSFORMAR EL FORMATO DE FECHA
public String verfecha(String fechaM){

        SimpleDateFormat sdfD=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfG=new SimpleDateFormat("yyyy-MM-dd");

        try {
            devuelve= sdfD.format(sdfG.parse(fechaM));
        } catch (ParseException ex) {
        }
        // Verifica si la Fecha viene en Blanco
        if(devuelve.compareTo("01/01/0001") ==0){ devuelve = "";}
        return devuelve;
}

//public static String  ENCRIPTAR2(String lsdato_entrada)
public static String ENCRIPTAR(String lsdato_entrada){
  /*String vencripta;
  //Variables utilizadas
  String lsdato_salida ="";
  char lc_comodin;
  //Aquï empieza la encriptacion por metodo ASCII, al valor de cada letra
  //Le suma el valor de su posicion y lo va concatenando en una nueva variable
  for (int i=0;i<=lsdato_entrada.length()-1;i++)
  {
     lc_comodin=lsdato_entrada.charAt(i);
     for (int i2=0;i2<=lsdato_salida.length();i2++)
     {
     	lc_comodin++;
     }
        lsdato_salida=lsdato_salida+lc_comodin;
  }
        vencripta=lsdato_salida;
        return vencripta;*/
    return lsdato_entrada;
}

 // METODO PARA DESENCRIPTAR
 public String DESENCRIPTAR(String lsdato_entrada){
   /*String vdesencripta;
   //Variables utilizadas
   String lsdato_salida ="";
   char lc_comodin;
   //Aquï empieza la encriptacion por metodo ASCII, al valor de cada letra
   //Le suma el valor de su posicion y lo va concatenando en una nueva variable
   for (int i=0;i<=lsdato_entrada.length()-1;i++)
   {
     lc_comodin=lsdato_entrada.charAt(i);
     for (int i2=0;i2<=lsdato_salida.length();i2++)
     {
	lc_comodin--;
     }
	lsdato_salida=lsdato_salida+lc_comodin;
     }
        vdesencripta=lsdato_salida;
        return vdesencripta;*/
     return lsdato_entrada;
    }

@SuppressWarnings("static-access")
public void  seguridadFormas(String Vusuario, String Vforma) throws SQLException    {
  try
  {
//    conn1 = (Connection) MiConexionBD.Enlace(conn1);
//    sql   = conn1.createStatement();
  } catch(Exception e){}

         rs = sql.executeQuery("select cod_usr,cod_prg,opi,opm,ope  from admg03  "+
                        "where cod_usr = '"+Vusuario+"' AND cod_prg = '"+Vforma+"'  ");

         if (rs.next()){
             menu.Vopi = (rs.getString("opi"));
             menu.Vopm = (rs.getString("opm"));
             menu.Vope = (rs.getString("ope"));
  }
}
public  String fechasys(String fechaS){
    // La Fecha del sistema
    {
        SimpleDateFormat sdfD=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        SimpleDateFormat sdfG=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            devuelve= sdfG.format(sdfD.parse(fechaS));
        } catch (ParseException ex) {
        }
    }
        return devuelve;
}



} // Fin de Proceso

