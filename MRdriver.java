package Lab1; 

import org.apache.hadoop.conf.Configured;
import java.io.BufferedReader;
import java.io.FileReader;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;

public class MRdriver extends Configured implements Tool {

   public int run(String[] args) throws Exception {

      // TODO: configure first MR job 

      // TODO: setup input and output paths for first MR job

      // TODO: run first MR job syncronously with verbose output set to true

      // TODO: configure the second MR job 

      // TODO: setup input and output paths for second MR job

      // TODO: run second MR job syncronously with verbose output set to true
      
      // TODO: detect anomaly based on sigma_threshold provided by user

      // TODO: for each user with score higher than threshold, print to screen:

      // detected anomaly for user: <username>  with score: <numSigmas>

   }

   public static void main(String[] args) throws Exception { 
	   if(args.length != 4) {
		   System.err.println("usage: MRdriver <input-path> <output1-path> <output2-path> <sigma_int_threshold>");
		   System.exit(1);
	   }
	   // check sigma_int_threshold is an int
	  try {
		  Integer.parseInt(args[3]);
	  }
	  catch (NumberFormatException e) {
		  System.err.println(e.getMessage());
		  System.exit(1);
	  }
      Configuration conf = new Configuration();
      System.exit(ToolRunner.run(conf, new MRdriver(), args));
   } 
}
