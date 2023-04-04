package edu.es.eoi;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import edu.es.eoi.properties.Labels;
import edu.es.eoi.properties.LabelsEnglish;
import edu.es.eoi.properties.LabelsFrench;

@SpringBootApplication
@ComponentScan(basePackages ="edu.es.eoi")
@EnableAutoConfiguration
public class AppMultiLanguage implements CommandLineRunner {


	private static Logger LOG = LoggerFactory.getLogger(AppMultiLanguage.class);

	
	@Autowired
	Labels labelsEnglish;
	
	@Autowired
	Labels labelsFrench;
	
	Labels selectedLanguage;
	
	public static void main(String[] args) {
		
		 LOG.info("STARTING THE APPLICATION");
		 SpringApplication.run(AppMultiLanguage.class, args);
		 LOG.info("APPLICATION FINISHED");

	}

	@PostConstruct
	private void setDefaultLanguage() {
		
		selectedLanguage=labelsEnglish;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(selectedLanguage.getWelcome());
		System.out.println(selectedLanguage.getQuestion());
		System.out.println("1-".concat(selectedLanguage.getYes()));
		System.out.println("2-".concat(selectedLanguage.getNo()));
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int answer=scan.nextInt();
	
		if(answer==1&&selectedLanguage instanceof LabelsEnglish){
			selectedLanguage=labelsFrench;
		}
		else if(answer==1&&selectedLanguage instanceof LabelsFrench){
			selectedLanguage=labelsEnglish;
		}
		
		run(args);
	}

}
