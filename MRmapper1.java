package Lab1;

import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;
import java.io.IOException;

public class MRmapper1  extends Mapper <LongWritable,Text,Text,IntWritable> {
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	// TODO: filter failed USER_LOGIN records, discard the rest

	// TODO: discard records with acct name that do NOT have ""

	// TODO: write (acctname, 1) to context
	}
}
