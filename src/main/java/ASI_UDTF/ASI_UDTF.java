package ASI_UDTF;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.table.functions.TableFunction;

public class ASI_UDTF extends TableFunction<Tuple2<String,String>> {
    public void eval(String str){
        String[] split = str.split("\\|");
        String name = split[0];
        String place = split[1];
        Tuple2<String,String> tuple2 = Tuple2.of(name,place);
        collect(tuple2);
    }
}