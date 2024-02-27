package retrofit2.converter.scalars;

import java.io.IOException;
import retrofit2.Converter;
import um.c0;
import um.x;

final class ScalarRequestBodyConverter<T> implements Converter<T, c0> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final x MEDIA_TYPE = x.e("text/plain; charset=UTF-8");

    private ScalarRequestBodyConverter() {
    }

    public c0 convert(T t10) throws IOException {
        return c0.create(MEDIA_TYPE, String.valueOf(t10));
    }
}
