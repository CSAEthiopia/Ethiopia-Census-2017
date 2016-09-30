
package et.csa;

import et.csa.bean.CsvRow;
import et.csa.bean.Record;
import et.csa.reader.DictionaryReader;
import et.csa.writer.SchemaWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use this class to create the schema script for the database
 * 
 * @author Istat Cooperation Unit
 */
public class SchemaEngine {

    public static void main(String[] args) throws Exception {
        /*
        CsvRow row = new CsvRow();
        row.addColumn("ID101","15");
        row.addColumn("ID102","01");
        row.addColumn("ID103","57");
        
        System.out.println(row.getColumn("ID103"));
        */
        String schema = "ethiopian_census";
        List<Record> records = DictionaryReader.read(schema,"Household.dcf");
        SchemaWriter.execute(schema, records, System.out);
    }
        
}
