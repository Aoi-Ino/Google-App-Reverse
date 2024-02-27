package e4;

import java.util.NoSuchElementException;

abstract class h0 extends o0 {

    /* renamed from: e  reason: collision with root package name */
    private final int f10059e;

    /* renamed from: f  reason: collision with root package name */
    private int f10060f;

    protected h0(int i10, int i11) {
        f0.b(i11, i10, "index");
        this.f10059e = i10;
        this.f10060f = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f10060f < this.f10059e;
    }

    public final boolean hasPrevious() {
        return this.f10060f > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f10060f;
            this.f10060f = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f10060f;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f10060f - 1;
            this.f10060f = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f10060f - 1;
    }
}
