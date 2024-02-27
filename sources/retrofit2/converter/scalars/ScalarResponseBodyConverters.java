package retrofit2.converter.scalars;

import java.io.IOException;
import retrofit2.Converter;
import um.e0;

final class ScalarResponseBodyConverters {

    static final class BooleanResponseBodyConverter implements Converter<e0, Boolean> {
        static final BooleanResponseBodyConverter INSTANCE = new BooleanResponseBodyConverter();

        BooleanResponseBodyConverter() {
        }

        public Boolean convert(e0 e0Var) throws IOException {
            return Boolean.valueOf(e0Var.string());
        }
    }

    static final class ByteResponseBodyConverter implements Converter<e0, Byte> {
        static final ByteResponseBodyConverter INSTANCE = new ByteResponseBodyConverter();

        ByteResponseBodyConverter() {
        }

        public Byte convert(e0 e0Var) throws IOException {
            return Byte.valueOf(e0Var.string());
        }
    }

    static final class CharacterResponseBodyConverter implements Converter<e0, Character> {
        static final CharacterResponseBodyConverter INSTANCE = new CharacterResponseBodyConverter();

        CharacterResponseBodyConverter() {
        }

        public Character convert(e0 e0Var) throws IOException {
            String string = e0Var.string();
            if (string.length() == 1) {
                return Character.valueOf(string.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
        }
    }

    static final class DoubleResponseBodyConverter implements Converter<e0, Double> {
        static final DoubleResponseBodyConverter INSTANCE = new DoubleResponseBodyConverter();

        DoubleResponseBodyConverter() {
        }

        public Double convert(e0 e0Var) throws IOException {
            return Double.valueOf(e0Var.string());
        }
    }

    static final class FloatResponseBodyConverter implements Converter<e0, Float> {
        static final FloatResponseBodyConverter INSTANCE = new FloatResponseBodyConverter();

        FloatResponseBodyConverter() {
        }

        public Float convert(e0 e0Var) throws IOException {
            return Float.valueOf(e0Var.string());
        }
    }

    static final class IntegerResponseBodyConverter implements Converter<e0, Integer> {
        static final IntegerResponseBodyConverter INSTANCE = new IntegerResponseBodyConverter();

        IntegerResponseBodyConverter() {
        }

        public Integer convert(e0 e0Var) throws IOException {
            return Integer.valueOf(e0Var.string());
        }
    }

    static final class LongResponseBodyConverter implements Converter<e0, Long> {
        static final LongResponseBodyConverter INSTANCE = new LongResponseBodyConverter();

        LongResponseBodyConverter() {
        }

        public Long convert(e0 e0Var) throws IOException {
            return Long.valueOf(e0Var.string());
        }
    }

    static final class ShortResponseBodyConverter implements Converter<e0, Short> {
        static final ShortResponseBodyConverter INSTANCE = new ShortResponseBodyConverter();

        ShortResponseBodyConverter() {
        }

        public Short convert(e0 e0Var) throws IOException {
            return Short.valueOf(e0Var.string());
        }
    }

    static final class StringResponseBodyConverter implements Converter<e0, String> {
        static final StringResponseBodyConverter INSTANCE = new StringResponseBodyConverter();

        StringResponseBodyConverter() {
        }

        public String convert(e0 e0Var) throws IOException {
            return e0Var.string();
        }
    }

    private ScalarResponseBodyConverters() {
    }
}
