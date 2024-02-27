package retrofit2;

import in.e;
import in.f;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import um.b0;
import um.c0;
import um.s;
import um.u;
import um.v;
import um.x;
import um.y;

final class RequestBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final v baseUrl;
    @Nullable
    private c0 body;
    @Nullable
    private x contentType;
    @Nullable
    private s.a formBuilder;
    private final boolean hasBody;
    private final u.a headersBuilder;
    private final String method;
    @Nullable
    private y.a multipartBuilder;
    @Nullable
    private String relativeUrl;
    private final b0.a requestBuilder = new b0.a();
    @Nullable
    private v.a urlBuilder;

    private static class ContentTypeOverridingRequestBody extends c0 {
        private final x contentType;
        private final c0 delegate;

        ContentTypeOverridingRequestBody(c0 c0Var, x xVar) {
            this.delegate = c0Var;
            this.contentType = xVar;
        }

        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        public x contentType() {
            return this.contentType;
        }

        public void writeTo(f fVar) throws IOException {
            this.delegate.writeTo(fVar);
        }
    }

    RequestBuilder(String str, v vVar, @Nullable String str2, @Nullable u uVar, @Nullable x xVar, boolean z10, boolean z11, boolean z12) {
        this.method = str;
        this.baseUrl = vVar;
        this.relativeUrl = str2;
        this.contentType = xVar;
        this.hasBody = z10;
        this.headersBuilder = uVar != null ? uVar.o() : new u.a();
        if (z11) {
            this.formBuilder = new s.a();
        } else if (z12) {
            y.a aVar = new y.a();
            this.multipartBuilder = aVar;
            aVar.d(y.f32165j);
        }
    }

    private static String canonicalizeForPath(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                e eVar = new e();
                eVar.W0(str, 0, i10);
                canonicalizeForPath(eVar, str, i10, length, z10);
                return eVar.D0();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public void addFormField(String str, String str2, boolean z10) {
        if (z10) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void addHeader(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = x.e(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        } else {
            this.headersBuilder.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void addHeaders(u uVar) {
        this.headersBuilder.b(uVar);
    }

    /* access modifiers changed from: package-private */
    public void addPart(u uVar, c0 c0Var) {
        this.multipartBuilder.a(uVar, c0Var);
    }

    /* access modifiers changed from: package-private */
    public void addPathParam(String str, String str2, boolean z10) {
        if (this.relativeUrl != null) {
            String canonicalizeForPath = canonicalizeForPath(str2, z10);
            String str3 = this.relativeUrl;
            String replace = str3.replace("{" + str + "}", canonicalizeForPath);
            if (!PATH_TRAVERSAL.matcher(replace).matches()) {
                this.relativeUrl = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void addQueryParam(String str, @Nullable String str2, boolean z10) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            v.a l10 = this.baseUrl.l(str3);
            this.urlBuilder = l10;
            if (l10 != null) {
                this.relativeUrl = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        if (z10) {
            this.urlBuilder.a(str, str2);
        } else {
            this.urlBuilder.b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public <T> void addTag(Class<T> cls, @Nullable T t10) {
        this.requestBuilder.g(cls, t10);
    }

    /* access modifiers changed from: package-private */
    public b0.a get() {
        v vVar;
        v.a aVar = this.urlBuilder;
        if (aVar != null) {
            vVar = aVar.c();
        } else {
            vVar = this.baseUrl.q(this.relativeUrl);
            if (vVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            s.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.c();
            } else {
                y.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.c();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = c0.create((x) null, new byte[0]);
                }
            }
        }
        x xVar = this.contentType;
        if (xVar != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, xVar);
            } else {
                this.headersBuilder.a("Content-Type", xVar.toString());
            }
        }
        return this.requestBuilder.i(vVar).d(this.headersBuilder.e()).e(this.method, contentTypeOverridingRequestBody);
    }

    /* access modifiers changed from: package-private */
    public void setBody(c0 c0Var) {
        this.body = c0Var;
    }

    /* access modifiers changed from: package-private */
    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    private static void canonicalizeForPath(e eVar, String str, int i10, int i11, boolean z10) {
        e eVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new e();
                    }
                    eVar2.X0(codePointAt);
                    while (!eVar2.P()) {
                        byte readByte = eVar2.readByte();
                        eVar.Q(37);
                        char[] cArr = HEX_DIGITS;
                        eVar.Q(cArr[((readByte & 255) >> 4) & 15]);
                        eVar.Q(cArr[readByte & 15]);
                    }
                } else {
                    eVar.X0(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void addPart(y.c cVar) {
        this.multipartBuilder.b(cVar);
    }
}
