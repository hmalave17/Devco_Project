package co.com.Devco.certification.utils;

import java.util.List;
import java.util.Map;

public class SetDataTest {

    private SetDataTest(){}

    public static List<Map<String, String>> dePrueba(){
        List<Map<String, String>> datos;
        String ruta = "./src/test/resources/co/com/Devco/certification/data/DataFile.xlsx";
        datos = GetData.deExcel(ruta, "select * from " + "Devco_test" + " where ID_Prueba = 1");
        return datos;
    }

}
