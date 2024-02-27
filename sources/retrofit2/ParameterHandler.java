package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import um.c0;
import um.u;
import um.y;

abstract class ParameterHandler<T> {

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, c0> converter;
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31037p;

        Body(Method method2, int i10, Converter<T, c0> converter2) {
            this.method = method2;
            this.f31037p = i10;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) {
            if (t10 != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t10));
                } catch (IOException e10) {
                    Method method2 = this.method;
                    int i10 = this.f31037p;
                    throw Utils.parameterError(method2, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw Utils.parameterError(this.method, this.f31037p, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) throws IOException {
            String convert;
            if (t10 != null && (convert = this.valueConverter.convert(t10)) != null) {
                requestBuilder.addFormField(this.name, convert, this.encoded);
            }
        }
    }

    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31038p;
        private final Converter<T, String> valueConverter;

        FieldMap(Method method2, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method2;
            this.f31038p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(str, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i10 = this.f31038p;
                                throw Utils.parameterError(method2, i10, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i11 = this.f31038p;
                            throw Utils.parameterError(method3, i11, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f31038p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f31038p, "Field map was null.", new Object[0]);
        }
    }

    static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) throws IOException {
            String convert;
            if (t10 != null && (convert = this.valueConverter.convert(t10)) != null) {
                requestBuilder.addHeader(this.name, convert);
            }
        }
    }

    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31039p;
        private final Converter<T, String> valueConverter;

        HeaderMap(Method method2, int i10, Converter<T, String> converter) {
            this.method = method2;
            this.f31039p = i10;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(str, this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i10 = this.f31039p;
                            throw Utils.parameterError(method2, i10, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f31039p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f31039p, "Header map was null.", new Object[0]);
        }
    }

    static final class Headers extends ParameterHandler<u> {
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31040p;

        Headers(Method method2, int i10) {
            this.method = method2;
            this.f31040p = i10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable u uVar) {
            if (uVar != null) {
                requestBuilder.addHeaders(uVar);
                return;
            }
            throw Utils.parameterError(this.method, this.f31040p, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, c0> converter;
        private final u headers;
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31041p;

        Part(Method method2, int i10, u uVar, Converter<T, c0> converter2) {
            this.method = method2;
            this.f31041p = i10;
            this.headers = uVar;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) {
            if (t10 != null) {
                try {
                    requestBuilder.addPart(this.headers, this.converter.convert(t10));
                } catch (IOException e10) {
                    Method method2 = this.method;
                    int i10 = this.f31041p;
                    throw Utils.parameterError(method2, i10, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31042p;
        private final String transferEncoding;
        private final Converter<T, c0> valueConverter;

        PartMap(Method method2, int i10, Converter<T, c0> converter, String str) {
            this.method = method2;
            this.f31042p = i10;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            requestBuilder.addPart(u.r("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i10 = this.f31042p;
                            throw Utils.parameterError(method2, i10, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f31042p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f31042p, "Part map was null.", new Object[0]);
        }
    }

    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p  reason: collision with root package name */
        private final int f31043p;
        private final Converter<T, String> valueConverter;

        Path(Method method2, int i10, String str, Converter<T, String> converter, boolean z10) {
            this.method = method2;
            this.f31043p = i10;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) throws IOException {
            if (t10 != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t10), this.encoded);
                return;
            }
            Method method2 = this.method;
            int i10 = this.f31043p;
            throw Utils.parameterError(method2, i10, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) throws IOException {
            String convert;
            if (t10 != null && (convert = this.valueConverter.convert(t10)) != null) {
                requestBuilder.addQueryParam(this.name, convert, this.encoded);
            }
        }
    }

    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31044p;
        private final Converter<T, String> valueConverter;

        QueryMap(Method method2, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method2;
            this.f31044p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(str, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i10 = this.f31044p;
                                throw Utils.parameterError(method2, i10, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i11 = this.f31044p;
                            throw Utils.parameterError(method3, i11, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f31044p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f31044p, "Query map was null", new Object[0]);
        }
    }

    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z10) {
            this.nameConverter = converter;
            this.encoded = z10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) throws IOException {
            if (t10 != null) {
                requestBuilder.addQueryParam(this.nameConverter.convert(t10), (String) null, this.encoded);
            }
        }
    }

    static final class RawPart extends ParameterHandler<y.c> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable y.c cVar) {
            if (cVar != null) {
                requestBuilder.addPart(cVar);
            }
        }
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p  reason: collision with root package name */
        private final int f31045p;

        RelativeUrl(Method method2, int i10) {
            this.method = method2;
            this.f31045p = i10;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
                return;
            }
            throw Utils.parameterError(this.method, this.f31045p, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls2) {
            this.cls = cls2;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, @Nullable T t10) {
            requestBuilder.addTag(this.cls, t10);
        }
    }

    ParameterHandler() {
    }

    /* access modifiers changed from: package-private */
    public abstract void apply(RequestBuilder requestBuilder, @Nullable T t10) throws IOException;

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() {
            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, @Nullable Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i10 = 0; i10 < length; i10++) {
                        ParameterHandler.this.apply(requestBuilder, Array.get(obj, i10));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() {
            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, @Nullable Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T apply : iterable) {
                        ParameterHandler.this.apply(requestBuilder, apply);
                    }
                }
            }
        };
    }
}
