package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<T, E> {

	private T data;
	private E number;
}
