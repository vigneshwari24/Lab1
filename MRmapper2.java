package Lab1;

import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import java.io.IOException;

public class MRmapper2  extends Mapper <LongWritable,Text,Text,Text> {
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {

	// TODO: write (key, value) pair to context (hint: need to be clever here)
	}
}
