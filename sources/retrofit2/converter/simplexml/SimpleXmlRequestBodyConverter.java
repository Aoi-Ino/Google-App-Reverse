package retrofit2.converter.simplexml;

import dp.o;
import in.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import retrofit2.Converter;
import um.c0;
import um.x;

final class SimpleXmlRequestBodyConverter<T> implements Converter<T, c0> {
    private static final String CHARSET = "UTF-8";
    private static final x MEDIA_TYPE = x.g("application/xml; charset=UTF-8");
    private final o serializer;

    SimpleXmlRequestBodyConverter(o oVar) {
        this.serializer = oVar;
    }

    public c0 convert(T t10) throws IOException {
        e eVar = new e();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(eVar.c0(), CHARSET);
            this.serializer.b(t10, outputStreamWriter);
            outputStreamWriter.flush();
            return c0.create(MEDIA_TYPE, eVar.u());
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
