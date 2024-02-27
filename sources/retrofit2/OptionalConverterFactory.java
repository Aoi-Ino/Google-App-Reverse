package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.Converter;
import um.e0;

@IgnoreJRERequirement
final class OptionalConverterFactory extends Converter.Factory {
    static final Converter.Factory INSTANCE = new OptionalConverterFactory();

    @IgnoreJRERequirement
    static final class OptionalConverter<T> implements Converter<e0, Optional<T>> {
        final Converter<e0, T> delegate;

        OptionalConverter(Converter<e0, T> converter) {
            this.delegate = converter;
        }

        public Optional<T> convert(e0 e0Var) throws IOException {
            return Optional.ofNullable(this.delegate.convert(e0Var));
        }
    }

    OptionalConverterFactory() {
    }

    @Nullable
    public Converter<e0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
