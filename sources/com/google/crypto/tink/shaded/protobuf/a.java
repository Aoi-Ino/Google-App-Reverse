package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o0;
import java.io.IOException;

public abstract class a implements o0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0105a implements o0.a {
        protected static i1 j(o0 o0Var) {
            return new i1(o0Var);
        }

        /* access modifiers changed from: protected */
        public abstract C0105a h(a aVar);

        /* renamed from: i */
        public C0105a n(o0 o0Var) {
            if (b().getClass().isInstance(o0Var)) {
                return h((a) o0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String j(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public byte[] d() {
        try {
            byte[] bArr = new byte[a()];
            k U = k.U(bArr);
            e(U);
            U.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(j("byte array"), e10);
        }
    }

    public h g() {
        try {
            h.C0106h T = h.T(a());
            e(T.b());
            return T.a();
        } catch (IOException e10) {
            throw new RuntimeException(j("ByteString"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int h();

    /* access modifiers changed from: package-private */
    public int i(d1 d1Var) {
        int h10 = h();
        if (h10 != -1) {
            return h10;
        }
        int h11 = d1Var.h(this);
        l(h11);
        return h11;
    }

    /* access modifiers changed from: package-private */
    public i1 k() {
        return new i1(this);
    }

    /* access modifiers changed from: package-private */
    public abstract void l(int i10);
}
