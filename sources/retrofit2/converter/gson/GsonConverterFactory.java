package retrofit2.converter.gson;

import com.google.gson.reflect.TypeToken;
import i7.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;
import um.c0;
import um.e0;

public final class GsonConverterFactory extends Converter.Factory {
    private final d gson;

    private GsonConverterFactory(d dVar) {
        this.gson = dVar;
    }

    public static GsonConverterFactory create() {
        return create(new d());
    }

    public Converter<?, c0> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.m(TypeToken.get(type)));
    }

    public Converter<e0, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.m(TypeToken.get(type)));
    }

    public static GsonConverterFactory create(d dVar) {
        if (dVar != null) {
            return new GsonConverterFactory(dVar);
        }
        throw new NullPointerException("gson == null");
    }
}
