package ASI_UDF;

import org.apache.flink.table.functions.ScalarFunction;

public class ASI_UDF extends ScalarFunction {
    public String eval(String s, Integer begin, Integer end) {
        return s.substring(begin, end);
    }
}
