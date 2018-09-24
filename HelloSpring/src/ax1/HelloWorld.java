package ax1;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("hi")
public class HelloWorld {

private String name;
	public HelloWorld() {
		System.out.println("Default Constructor");
	}
	public HelloWorld(String name) {
		this.name = name;

		System.out.println("Param Constructor");
	}
	public String getName() {
		return name;
	}
	
	@Value("Annotated Zubair")
	public void setName(String name) {
		this.name = name;
	}

}
