package sut.quickcheck;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

/**
 * Generate strings with regex [a-zA-Z0-9\.\-\\;\:\_\@\[\]\^/\|\}\{]* 
 * and length 40
 * 
 * ref: https://stackoverflow.com/questions/30211147/
 */
public class MyCharacterGenerator extends Generator<String> {
	
    private int min =  5;
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
    private static final String ALL_MY_CHARS = LOWERCASE_CHARS
            + UPPERCASE_CHARS + NUMBERS + SPECIAL_CHARS;

    public MyCharacterGenerator () {
        super(String.class);
    }

    @Override
    public String generate(SourceOfRandomness random, GenerationStatus status) {
    	int size = random.nextInt(min, max);
    	
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(ALL_MY_CHARS.length());
            sb.append(ALL_MY_CHARS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
