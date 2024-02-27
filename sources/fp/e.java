package fp;

import java.util.Stack;

public abstract class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private Stack f23688a = new Stack();

    public String a(String str) {
        String a10;
        int size = this.f23688a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            a10 = ((b) this.f23688a.get(size)).a(str);
        } while (a10 == null);
        return a10;
    }

    public void b(b bVar) {
        this.f23688a.push(bVar);
    }
}
