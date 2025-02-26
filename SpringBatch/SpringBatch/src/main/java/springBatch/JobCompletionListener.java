package springBatch;


import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Batch job started...");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Batch job completed with status: " + jobExecution.getStatus());
    }
}
