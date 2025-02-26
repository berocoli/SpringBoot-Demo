package berkeoz.sbootapi.api.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {
	
	public Greeting() {
		this.id = -1;
		this.content = "";
	}

	private final long id;
	private final String content;
}