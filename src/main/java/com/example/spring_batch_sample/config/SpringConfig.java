package com.example.spring_batch_sample.config;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration // バッチの設定クラス
public class SpringConfig {

    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager platformTransactionManager;

    @Autowired
    @Qualifier("SampleTasklet")
    private Tasklet SampleTasklet;

    public SpringConfig(JobLauncher jobLauncher, JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {
        this.jobLauncher = jobLauncher;
        this.jobRepository = jobRepository;
        this.platformTransactionManager = platformTransactionManager;
    }
}
