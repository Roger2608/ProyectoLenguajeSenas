package ProyectoLenguajeSenas.config.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import ProyectoLenguajeSenas.model.batch.lenguaSordo.LenguaSordoRecipient;
import ProyectoLenguajeSenas.model.batch.lenguaSordo.LssExecutionListener;
import ProyectoLenguajeSenas.model.batch.lenguaSordo.LssItemProcessor;
import ProyectoLenguajeSenas.model.batch.lenguaSordo.LssItemWriter;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	
	@Bean
	@StepScope
	public FlatFileItemReader<LenguaSordoRecipient> reader(@Value("#{jobParameters['inputfile']}") String inputFile){
		
		return new FlatFileItemReaderBuilder<LenguaSordoRecipient>()
			   .name("LssItemReader")
			   .resource(new FileSystemResource(inputFile))
			   .linesToSkip(1)
			   .delimited()
			   .delimiter("|")
			   .names(new String[] {"name", "short_description", "long_description", "category", "pais"})
			   .fieldSetMapper(new BeanWrapperFieldSetMapper<LenguaSordoRecipient>() {{
				   setTargetType(LenguaSordoRecipient.class);
			   }})
			   .build();
	}
	
	@Bean
	public LssItemProcessor processor() {
		return new LssItemProcessor();
	}
	
	@Bean
	public LssItemWriter writer() {
		return new LssItemWriter();
	}
	@Bean
	public Job importPersonaJob(LssExecutionListener listener,Step step1) {
		return jobBuilderFactory.get("ETL-Load")
				.incrementer(new RunIdIncrementer())
				.listener(listener)
				.flow(step1)
				.end()
				.build();
	}
	
	@Bean
	public Step step1() {
		
		return stepBuilderFactory.get("ETL-file-load")
				.<LenguaSordoRecipient, LenguaSordo> chunk(1)
				.reader(reader(null))
				.processor(processor())
				.writer(writer())
				.build();
	}
	
}
