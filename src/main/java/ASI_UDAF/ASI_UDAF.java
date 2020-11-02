package ASI_UDAF;

import org.apache.flink.table.functions.AggregateFunction;
public class ASI_UDAF{
    public static class AcSum {
        public long sum;
    }

    public static class WeightedSum extends AggregateFunction<Long, AcSum> {


        @Override
        public Long getValue(AcSum acSum) {

            return acSum.sum;
        }
        @Override
        public AcSum createAccumulator() {
            AcSum acCount = new AcSum();
            acCount.sum = 0;
            return acCount;
        }
        public void accumulate(AcSum acc, long acSum) {
            acc.sum += acSum;
        }
    }
}
