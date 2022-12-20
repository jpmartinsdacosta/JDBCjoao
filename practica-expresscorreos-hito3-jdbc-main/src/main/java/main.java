import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import expresscorreos.model.*;

public class main {

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "correos";

    private static final String DB_USER = "root";

    private static final String DB_PASS = " ";

    private static Connection conn;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);
        // nuevo_cartero("22334455A","Pablo","García Hernández");     YA SE HA ADICIONADO
        List<Cartero> ej2 = carterosRepartoCochePeriodo(7);
        Iterator<Cartero> it2 = ej2.iterator();
        System.out.println("Ejercicio 2:");
        while (it2.hasNext()){
            Cartero cartero = it2.next();
            System.out.println(cartero.getDni_cartero()+"  "+cartero.getApellidos()+","+cartero.getNombre());
        }
        List<Oficina> ej3 = oficinasAsociadasCalle("C/Alcalá de Madrid");
        Iterator<Oficina> it3 = ej3.iterator();
        System.out.println("Ejercicio 3:");
        while (it3.hasNext()){
            Oficina oficina = it3.next();
            System.out.println(oficina.getCodigo_oficina()+" "+oficina.getNombre_municipio()+","+oficina.getCodigo_cc());
        }
        List<Coche> ej4 = cochesSinUtilizarPeriodo(30);
        Iterator<Coche> it4 = ej4.iterator();
        System.out.println("Ejercicio 4:");
        while (it4.hasNext()){
            Coche coche = it4.next();
            System.out.println(coche.getMatricula()+" "+coche.getCapacidad()+","+coche.getCodigo_oficina());
        }
        conn.close();
    }
    public static void nuevo_cartero(String dni_cartero, String nombre, String apellidos) throws SQLException {
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement("INSERT INTO cartero (dni_cartero,nombre,apellidos) VALUES (?,?,?)");
            statement.setString (1, dni_cartero);
            statement.setString(2, nombre);
            statement.setString(3, apellidos);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error en nuevo_cartero");
        }
    }

    public static List<Cartero> carterosRepartoCochePeriodo(int periodo) throws SQLException{
        List<Cartero> lista = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery("SELECT cartero.dni_cartero,cartero.nombre,cartero.apellidos FROM cartero \n"+
                    "INNER JOIN reparto ON reparto.dni_cartero = cartero.dni_cartero \n" +
                    "INNER JOIN coche ON coche.matricula = reparto.matricula \n" +
                    "WHERE reparto.fecha_creacion >= DATE_SUB(CURDATE(), INTERVAL "+ periodo +" DAY) ");
            while(rs.next()){
                Cartero cartero = new Cartero(rs.getString("dni_cartero"),rs.getString("nombre"),rs.getString("apellidos"));
                lista.add(cartero);
            }
        } catch (SQLException ex){
            System.out.println("Error en carterosRepartoCochePeriodo");
        }
        return lista;
    }

    public static List<Oficina> oficinasAsociadasCalle(String calle) throws SQLException{
        List<Oficina> lista = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery("SELECT oficina.codigo_oficina,oficina.nombre_municipio,oficina.codigo_cc \n" +
                        "FROM oficina \n" +
                        "INNER JOIN area_envio ON area_envio.codigo_oficina = oficina.codigo_oficina \n" +
                        "INNER JOIN puede_repartir ON puede_repartir.id_ae = area_envio.id_ae \n" +
                        "INNER JOIN reparto ON reparto.dni_cartero = puede_repartir.dni_cartero \n" +
                        "INNER JOIN ruta ON ruta.id_ruta = reparto.id_ruta \n" +
                        "INNER JOIN seg_incluye_ruta ON seg_incluye_ruta.id_ruta = ruta.id_ruta \n" +
                        "INNER JOIN segmento_calle ON segmento_calle.n_segmento =  seg_incluye_ruta.n_segmento \n" +
                        "WHERE nombre_calle = '"+ calle +"' GROUP BY codigo_oficina");
            while (rs.next()){
                Oficina oficina = new Oficina(rs.getString("codigo_oficina"),rs.getString("nombre_municipio"),rs.getString("codigo_cc"));
                lista.add(oficina);
            }
        } catch (SQLException ex){
            System.out.println("Error en oficinasAsociadasCalle");
        }
        return lista;
    }

    public static List<Coche> cochesSinUtilizarPeriodo(int periodo)throws SQLException{
        List<Coche> lista = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery("SELECT coche.matricula,coche.capacidad,coche.codigo_oficina\n" +
                                            "FROM coche \n" +
                                            "WHERE coche.matricula NOT IN ( \n" +
                                            "SELECT matricula \n" +
                                            "FROM reparto \n" +
                                            "WHERE reparto.fecha_creacion >= DATE_SUB(CURDATE(), INTERVAL "+ periodo +" DAY) )");
            while (rs.next()){
                Coche coche = new Coche(rs.getString("matricula"),rs.getInt("capacidad"),rs.getString("codigo_oficina"));
                lista.add(coche);
            }
        } catch (SQLException ex){
            System.out.println("Error en cochesSinUtilizarPeriodo");
        }
        return lista;
    }
}
