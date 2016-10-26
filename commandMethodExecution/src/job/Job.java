package job;

import java.io.Serializable;

public class Job implements Serializable {
	public String str= "empty";
	public Job job = null;
	public void run(){
		System.out.println(str);
		if (job != null) job.run();
	}

}

/*Job job1,job2;
job1 = new Job(); job1.str="job1";
job2 = new Job(); job1.str="job2";

job1.job = job2;

send(job1);*/