package hm;

import java.util.NoSuchElementException;
import ql.e0;

public final class b extends e0 {

    /* renamed from: e  reason: collision with root package name */
    private final int f24175e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24176f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24177g;

    /* renamed from: h  reason: collision with root package name */
    private int f24178h;

    public b(int i10, int i11, int i12) {
        this.f24175e = i12;
        this.f24176f = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f24177g = z10;
        this.f24178h = !z10 ? i11 : i10;
    }

    public int a() {
        int i10 = this.f24178h;
        if (i10 != this.f24176f) {
            this.f24178h = this.f24175e + i10;
        } else if (this.f24177g) {
            this.f24177g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.f24177g;
    }
}
