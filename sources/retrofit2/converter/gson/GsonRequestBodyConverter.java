package retrofit2.converter.gson;

import i7.d;
import i7.r;
import in.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p7.c;
import retrofit2.Converter;
import um.c0;
import um.x;

final class GsonRequestBodyConverter<T> implements Converter<T, c0> {
    private static final x MEDIA_TYPE = x.e("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final r adapter;
    private final d gson;

    GsonRequestBodyConverter(d dVar, r rVar) {
        this.gson = dVar;
        this.adapter = rVar;
    }

    public c0 convert(T t10) throws IOException {
        e eVar = new e();
        c r10 = this.gson.r(new OutputStreamWriter(eVar.c0(), UTF_8));
        this.adapter.d(r10, t10);
        r10.close();
        return c0.create(MEDIA_TYPE, eVar.u());
    }
}
