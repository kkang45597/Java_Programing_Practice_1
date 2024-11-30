package Quiz01;

public class StringToLengthTransformer implements Transformer<Integer, String> {

	@Override
	public Integer transFormer(String from) {
		return from.length();
	}

	// 제너릭 인터페이스 Transformer 을 구현할때 사용할 데이터 타입을 정한다.
}
