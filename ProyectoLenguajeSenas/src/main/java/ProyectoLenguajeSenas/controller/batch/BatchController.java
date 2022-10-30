package ProyectoLenguajeSenas.controller.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lenguaSenas/upload")
public class BatchController {

	@Autowired
	JobLauncher jobLoteMovimientosLauncher;

	@Autowired
	Job procesarLoteMovimientosJob;

	@PostMapping
	public Long demoJob() throws Exception {

		JobExecution jobExecution = (JobExecution) jobLoteMovimientosLauncher.run(procesarLoteMovimientosJob,
				new JobParametersBuilder()
				.addLong("idInicio", System.nanoTime())
				.addString("inputfile", "src/main/resources/LssFileLoadData.csv")
				.toJobParameters());
		return jobExecution.getId();
	}

}
