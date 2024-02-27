package retrofit2.converter.simplexml;

import dp.o;
import ep.o2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;
import um.c0;
import um.e0;

public final class SimpleXmlConverterFactory extends Converter.Factory {
    private final o serializer;
    private final boolean strict;

    private SimpleXmlConverterFactory(o oVar, boolean z10) {
        if (oVar != null) {
            this.serializer = oVar;
            this.strict = z10;
            return;
        }
        throw new NullPointerException("serializer == null");
    }

    public static SimpleXmlConverterFactory create() {
        return create(new o2());
    }

    public static SimpleXmlConverterFactory createNonStrict() {
        return createNonStrict(new o2());
    }

    public boolean isStrict() {
        return this.strict;
    }

    public Converter<?, c0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (!(type instanceof Class)) {
            return null;
        }
        return new SimpleXmlRequestBodyConverter(this.serializer);
    }

    public Converter<e0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (!(type instanceof Class)) {
            return null;
        }
        return new SimpleXmlResponseBodyConverter((Class) type, this.serializer, this.strict);
    }

    public static SimpleXmlConverterFactory create(o oVar) {
        return new SimpleXmlConverterFactory(oVar, true);
    }

    public static SimpleXmlConverterFactory createNonStrict(o oVar) {
        return new SimpleXmlConverterFactory(oVar, false);
    }
}
