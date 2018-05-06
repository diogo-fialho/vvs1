package sut.quickcheck;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import sut.TST;

public class TSTGenerator extends Generator<TST<Integer>> {

	private int min = 5;
	private int max = 40;

	// generator respects `@InRange` annotation, defining the size of string
	public void configure(InRange range) {
		min = range.minInt();
		max = range.maxInt();
	}

	private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
	private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String NUMBERS = "0123456789";
	private static final String SPECIAL_CHARS = ".-\\;:_@[]^/|}{";
	private static final String ALL_MY_CHARS = LOWERCASE_CHARS + UPPERCASE_CHARS + NUMBERS + SPECIAL_CHARS;

	public TSTGenerator(Class<TST<Integer>> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TST<Integer> generate(SourceOfRandomness random, GenerationStatus status) {

		TST<Integer> result = new TST<Integer>();
		int strSize = random.nextInt(min, max);
		int tstSize = random.nextInt(min, max);

		StringBuilder sb; 

		for(int j = 0; j<tstSize; j++){

			sb = new StringBuilder(strSize);

			for (int i = 0; i < strSize; i++) {
				int randomIndex = random.nextInt(ALL_MY_CHARS.length());
				sb.append(ALL_MY_CHARS.charAt(randomIndex));

			}

			result.put(sb.toString(), j+1);
			
		}
		return result;

	}

}
