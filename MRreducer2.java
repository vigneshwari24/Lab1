package Lab1;

import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MRreducer2  extends Reducer <Text,Text,Text,DoubleWritable> {
   public void reduce(Text key, Iterable<Text> values, Context context) 
		   throws IOException, InterruptedException {
	// TODO: parse out (key, values) (based on hint of cleverness mapper)

	// TODO: calculate mean_failed_login_attempts and write to context

	// TODO: calculate sigma_failed_login_attempts and write to context

	// TODO: calculate num_sigmas_for:<user> and write to context

	   }
   }
}
