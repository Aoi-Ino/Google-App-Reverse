package hp;

import java.io.Writer;

class d0 {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f24230a = new StringBuilder();

    public void a(char c10) {
        this.f24230a.append(c10);
    }

    public void b(String str) {
        this.f24230a.append(str);
    }

    public void c(char[] cArr) {
        this.f24230a.append(cArr, 0, cArr.length);
    }

    public void d() {
        this.f24230a.setLength(0);
    }

    public void e(Writer writer) {
        writer.append(this.f24230a);
    }
}
