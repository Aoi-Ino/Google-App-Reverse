package retrofit2.converter.simplexml;

import dp.o;
import java.io.IOException;
import retrofit2.Converter;
import um.e0;

final class SimpleXmlResponseBodyConverter<T> implements Converter<e0, T> {
    private final Class<T> cls;
    private final o serializer;
    private final boolean strict;

    SimpleXmlResponseBodyConverter(Class<T> cls2, o oVar, boolean z10) {
        this.cls = cls2;
        this.serializer = oVar;
        this.strict = z10;
    }

    public T convert(e0 e0Var) throws IOException {
        try {
            T a10 = this.serializer.a(this.cls, e0Var.charStream(), this.strict);
            if (a10 != null) {
                e0Var.close();
                return a10;
            }
            throw new IllegalStateException("Could not deserialize body as " + this.cls);
        } catch (IOException | RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        } catch (Throwable th2) {
            e0Var.close();
            throw th2;
        }
    }
}
