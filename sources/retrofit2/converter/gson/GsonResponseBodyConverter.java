package retrofit2.converter.gson;

import i7.d;
import i7.h;
import i7.r;
import java.io.IOException;
import p7.a;
import p7.b;
import retrofit2.Converter;
import um.e0;

final class GsonResponseBodyConverter<T> implements Converter<e0, T> {
    private final r adapter;
    private final d gson;

    GsonResponseBodyConverter(d dVar, r rVar) {
        this.gson = dVar;
        this.adapter = rVar;
    }

    public T convert(e0 e0Var) throws IOException {
        a q10 = this.gson.q(e0Var.charStream());
        try {
            T b10 = this.adapter.b(q10);
            if (q10.D0() == b.END_DOCUMENT) {
                return b10;
            }
            throw new h("JSON document was not fully consumed.");
        } finally {
            e0Var.close();
        }
    }
}
