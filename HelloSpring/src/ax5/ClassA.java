package ax5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class ClassA {
	@Autowired
	@Lazy
	private ClassB classB;

	public ClassA() {
		System.out.println("Constructor of ClassA");
	}

	public void someOtherMethod() {
		classB.someOtherMethod();

	}
}
