package model.data.dao;

import model.Marca;
import model.data.DBConnector;
import model.data.DBGenerator;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;
import java.util.ArrayList;

import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;
public class MarcaDAO {
    // metodo para agregar una marca a la base de datos nombreMarca, idMarca
    public static void registrarMarca(DSLContext query, Marca marca){
        Table tablaMarca= table(name("Marca"));
        Field[] columnas = tablaMarca.fields("nombreMarca","idMarca");
        query.insertInto(tablaMarca, columnas[0], columnas[1])
                .values(marca.getNombreMarca(),marca.getIdMarca())
                .execute();
    }

    // metodo para validar si una marca ya existe en la base de datos
    public static boolean validarExistenciaMarca(DSLContext query,String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Marca")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        if(resultados.size()>=1){
            return true;
        }
        else{
            return false;
        }
    }

    // metodo para modificar una marca en la base de datos
    public void modificarMarca(DSLContext query, Marca   nombreMarca){
        query.update(DSL.table("Marca")).set(DSL.field("nombreMarca"),nombreMarca)
                .where(DSL.field("nombreMarca").eq(nombreMarca)).execute();
    }


    // metodo para eliminar una marca en la base de datos
    public void eliminarMarca(DSLContext query, String nombreMarca){
        Table tablaMarca= table(name("Marca"));
        query.delete(DSL.table("Marca")).where(DSL.field("nombreMarca").eq(nombreMarca)).execute();
    }

    // metodo para obtener una marca en la base de datos
    public List obtenerMarca(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Marca")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        return obtenerListaMarcas(resultados);
    }

    // metodo para obtener una lista de todas las marcas en la base de datos nombreMarca, idMarca
    private List obtenerListaMarcas(Result resultados){
        List<Marca> marcas= new ArrayList<>();
        for(int fila=0; fila<resultados.size();fila++){
            String nombreMarca = (String) resultados.getValue(fila,"nombreMarca");
            int idMarca = (int) resultados.getValue(fila,"idMarca");
            marcas.add(new Marca(nombreMarca,idMarca));
        }
        return marcas;
    }

    // metodo para exportar los datos de la base de datos  nombreMarca, idMarca
    public static String[][] exportarDatos(Result resultados){
        String[][] datosResultado=new String[resultados.size()][2];
        for(int registro = 0; registro < resultados.size(); registro ++){
            datosResultado[registro][0] = (String) resultados.getValue(registro,"nombreMarca");
            datosResultado[registro][1] = String.valueOf(resultados.getValue(registro,"idMarca"));
        }
        return datosResultado;
    }

    // metodo para obtener todos las marcas en la base de datos nombreMarca, idMarca
    public static String[][] obtenerMarcas(DSLContext query){
        Result resultados = query.select().from(DSL.table("Marca")).fetch();
        return exportarDatos(resultados);
    }

    // metodo para obtener una marca en la base de datos por id
    public static String[][] obtenerMarcaPorId(DSLContext query, int idMarca){
        Result resultados = query.select().from(DSL.table("Marca")).where(DSL.field("idMarca").eq(idMarca)).fetch();
        return exportarDatos(resultados);
    }

    // metodo para obtener una marca en la base de datos por nombre
    public static String[][] obtenerMarcaPorNombre(DSLContext query, String nombreMarca){
        Result resultados = query.select().from(DSL.table("Marca")).where(DSL.field("nombreMarca").eq(nombreMarca)).fetch();
        return exportarDatos(resultados);
    }

    // metodo getIDMarcas
    public static Object[] getIDMarcas(DSLContext query) {
        Table marca = DSL.table("Marca");
        Result resultados = query.select(marca.field("idMarca")).from(marca).fetch();
        if (resultados.size() == 0) {
            return new String[]{"Error no existen marcas"};
        } else {
            return resultados.getValues("idMarca").toArray();
        }
    }
}