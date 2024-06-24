package telran.java52.pulse.service;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java52.pulse.dto.PulseDto;

@Configuration
public class PulseService {
	
	@Bean
	Consumer<PulseDto> log(){
		return t -> {
		try {
			Thread.sleep(3000); //делаем задержку 3 сек
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long delay = System.currentTimeMillis() - t.getTimestamp();
		System.out.println("delay: " + delay + ", id: " + t.getId() + ", pulse: " + t.getPayload()); //время задержки + наши данные
		};
	}
}
