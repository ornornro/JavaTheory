package j19_익명클래스.람다식;

@FunctionalInterface // 람다식이다라는 어노테이션
public interface Math<T1, T2> {

	public double calc(T1 value, T2 value2);
	
}
