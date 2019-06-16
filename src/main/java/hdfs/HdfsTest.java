package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

public class HdfsTest {
    public static void main(String[] args) throws Exception{
        Configuration conf = new Configuration();
        String a[]=null;
        conf.set("fs.defaultFS", "hdfs://node-1:9000");
        FileSystem fs = FileSystem.get(new URI("hdfs://node-1:9000"), conf, "root");
//        new URI
        fs.mkdirs(new Path("/javaDir"));
       // fs.create(new Path("/javaDoc"));

        fs.close();
    }
}
