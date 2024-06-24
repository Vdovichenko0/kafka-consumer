package telran.java52;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

//	@Bean
//	Consumer<PulseDto> log(){
//		return t -> System.out.println(t);
////		return new Consumer<String>() {
////			
////			@Override
////			public void accept(String t) {
////				System.out.println(t);
////				
////			}
////		};
//	}
}
