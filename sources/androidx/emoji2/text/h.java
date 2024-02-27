package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.l;
import java.util.Arrays;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private final e.i f2885a;

    /* renamed from: b  reason: collision with root package name */
    private final l f2886b;

    /* renamed from: c  reason: collision with root package name */
    private e.d f2887c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2888d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f2889e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z10) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i11--;
                            i10 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i11--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z10 = true;
                        }
                    } else if (z10) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f2890a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f2891b;

        /* renamed from: c  reason: collision with root package name */
        private l.a f2892c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f2893d;

        /* renamed from: e  reason: collision with root package name */
        private int f2894e;

        /* renamed from: f  reason: collision with root package name */
        private int f2895f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f2896g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f2897h;

        b(l.a aVar, boolean z10, int[] iArr) {
            this.f2891b = aVar;
            this.f2892c = aVar;
            this.f2896g = z10;
            this.f2897h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f2890a = 1;
            this.f2892c = this.f2891b;
            this.f2895f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2892c.b().j() || d(this.f2894e)) {
                return true;
            }
            if (this.f2896g) {
                if (this.f2897h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2897h, this.f2892c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int a(int i10) {
            l.a a10 = this.f2892c.a(i10);
            int i11 = 2;
            if (this.f2890a == 2) {
                if (a10 != null) {
                    this.f2892c = a10;
                    this.f2895f++;
                } else if (!f(i10)) {
                    if (!d(i10)) {
                        if (this.f2892c.b() != null) {
                            i11 = 3;
                            if (this.f2895f != 1 || h()) {
                                this.f2893d = this.f2892c;
                                g();
                            }
                        }
                    }
                }
                this.f2894e = i10;
                return i11;
            } else if (a10 != null) {
                this.f2890a = 2;
                this.f2892c = a10;
                this.f2895f = 1;
                this.f2894e = i10;
                return i11;
            }
            i11 = g();
            this.f2894e = i10;
            return i11;
        }

        /* access modifiers changed from: package-private */
        public g b() {
            return this.f2892c.b();
        }

        /* access modifiers changed from: package-private */
        public g c() {
            return this.f2893d.b();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f2890a == 2 && this.f2892c.b() != null && (this.f2895f > 1 || h());
        }
    }

    h(l lVar, e.i iVar, e.d dVar, boolean z10, int[] iArr) {
        this.f2885a = iVar;
        this.f2886b = lVar;
        this.f2887c = dVar;
        this.f2888d = z10;
        this.f2889e = iArr;
    }

    private void a(Spannable spannable, g gVar, int i10, int i11) {
        spannable.setSpan(this.f2885a.a(gVar), i10, i11, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        i0.b[] bVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (bVarArr = (i0.b[]) editable.getSpans(selectionStart, selectionEnd, i0.b.class)) != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                i0.b bVar = bVarArr[i10];
                int spanStart = editable.getSpanStart(bVar);
                int spanEnd = editable.getSpanEnd(bVar);
                if ((!z10 || spanStart != selectionStart) && ((z10 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                i13 = a.a(editable, selectionStart, Math.max(i10, 0));
                i12 = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (i13 == -1 || i12 == -1) {
                    return false;
                }
            } else {
                i13 = Math.max(selectionStart - i10, 0);
                i12 = Math.min(selectionEnd + i11, editable.length());
            }
            i0.b[] bVarArr = (i0.b[]) editable.getSpans(i13, i12, i0.b.class);
            if (bVarArr != null && bVarArr.length > 0) {
                for (i0.b bVar : bVarArr) {
                    int spanStart = editable.getSpanStart(bVar);
                    int spanEnd = editable.getSpanEnd(bVar);
                    i13 = Math.min(spanStart, i13);
                    i12 = Math.max(spanEnd, i12);
                }
                int max = Math.max(i13, 0);
                int min = Math.min(i12, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 != 67) {
            if (i10 == 112) {
                z10 = b(editable, keyEvent, true);
            }
            return false;
        }
        z10 = b(editable, keyEvent, false);
        if (z10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean e(CharSequence charSequence, int i10, int i11, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f2887c.a(charSequence, i10, i11, gVar.h()));
        }
        return gVar.d() == 2;
    }

    private static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof i0.c
            if (r0 == 0) goto L_0x000a
            r1 = r11
            i0.c r1 = (i0.c) r1
            r1.a()
        L_0x000a:
            java.lang.Class<i0.b> r1 = i0.b.class
            if (r0 != 0) goto L_0x002f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x002d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x002a }
            int r3 = r12 + -1
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch:{ all -> 0x002a }
            if (r2 > r13) goto L_0x002d
            androidx.emoji2.text.m r2 = new androidx.emoji2.text.m     // Catch:{ all -> 0x002a }
            r2.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x002a }
            goto L_0x0037
        L_0x002a:
            r12 = move-exception
            goto L_0x012b
        L_0x002d:
            r2 = 0
            goto L_0x0037
        L_0x002f:
            androidx.emoji2.text.m r2 = new androidx.emoji2.text.m     // Catch:{ all -> 0x002a }
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x002a }
            r2.<init>((android.text.Spannable) r3)     // Catch:{ all -> 0x002a }
        L_0x0037:
            r3 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch:{ all -> 0x002a }
            i0.b[] r4 = (i0.b[]) r4     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            r6 = r3
        L_0x0047:
            if (r6 >= r5) goto L_0x0063
            r7 = r4[r6]     // Catch:{ all -> 0x002a }
            int r8 = r2.getSpanStart(r7)     // Catch:{ all -> 0x002a }
            int r9 = r2.getSpanEnd(r7)     // Catch:{ all -> 0x002a }
            if (r8 == r13) goto L_0x0058
            r2.removeSpan(r7)     // Catch:{ all -> 0x002a }
        L_0x0058:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x002a }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x002a }
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0063:
            if (r12 == r13) goto L_0x0122
            int r4 = r11.length()     // Catch:{ all -> 0x002a }
            if (r12 < r4) goto L_0x006d
            goto L_0x0122
        L_0x006d:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r4) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            int r4 = r2.length()     // Catch:{ all -> 0x002a }
            java.lang.Object[] r1 = r2.getSpans(r3, r4, r1)     // Catch:{ all -> 0x002a }
            i0.b[] r1 = (i0.b[]) r1     // Catch:{ all -> 0x002a }
            int r1 = r1.length     // Catch:{ all -> 0x002a }
            int r14 = r14 - r1
        L_0x0080:
            androidx.emoji2.text.h$b r1 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.l r4 = r10.f2886b     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.l$a r4 = r4.f()     // Catch:{ all -> 0x002a }
            boolean r5 = r10.f2888d     // Catch:{ all -> 0x002a }
            int[] r6 = r10.f2889e     // Catch:{ all -> 0x002a }
            r1.<init>(r4, r5, r6)     // Catch:{ all -> 0x002a }
            int r4 = java.lang.Character.codePointAt(r11, r12)     // Catch:{ all -> 0x002a }
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x0096:
            r2 = r12
        L_0x0097:
            if (r12 >= r13) goto L_0x00e9
            if (r4 >= r14) goto L_0x00e9
            int r6 = r1.a(r5)     // Catch:{ all -> 0x002a }
            r7 = 1
            if (r6 == r7) goto L_0x00d7
            r7 = 2
            if (r6 == r7) goto L_0x00cb
            r7 = 3
            if (r6 == r7) goto L_0x00a9
            goto L_0x0097
        L_0x00a9:
            if (r15 != 0) goto L_0x00b5
            androidx.emoji2.text.g r6 = r1.c()     // Catch:{ all -> 0x002a }
            boolean r6 = r10.e(r11, r2, r12, r6)     // Catch:{ all -> 0x002a }
            if (r6 != 0) goto L_0x0096
        L_0x00b5:
            if (r3 != 0) goto L_0x00c1
            androidx.emoji2.text.m r3 = new androidx.emoji2.text.m     // Catch:{ all -> 0x002a }
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x002a }
            r6.<init>(r11)     // Catch:{ all -> 0x002a }
            r3.<init>((android.text.Spannable) r6)     // Catch:{ all -> 0x002a }
        L_0x00c1:
            androidx.emoji2.text.g r6 = r1.c()     // Catch:{ all -> 0x002a }
            r10.a(r3, r6, r2, r12)     // Catch:{ all -> 0x002a }
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00cb:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x002a }
            int r12 = r12 + r6
            if (r12 >= r13) goto L_0x0097
            int r5 = java.lang.Character.codePointAt(r11, r12)     // Catch:{ all -> 0x002a }
            goto L_0x0097
        L_0x00d7:
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x002a }
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x002a }
            int r2 = r2 + r12
            if (r2 >= r13) goto L_0x00e7
            int r12 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x002a }
            r5 = r12
        L_0x00e7:
            r12 = r2
            goto L_0x0097
        L_0x00e9:
            boolean r13 = r1.e()     // Catch:{ all -> 0x002a }
            if (r13 == 0) goto L_0x010b
            if (r4 >= r14) goto L_0x010b
            if (r15 != 0) goto L_0x00fd
            androidx.emoji2.text.g r13 = r1.b()     // Catch:{ all -> 0x002a }
            boolean r13 = r10.e(r11, r2, r12, r13)     // Catch:{ all -> 0x002a }
            if (r13 != 0) goto L_0x010b
        L_0x00fd:
            if (r3 != 0) goto L_0x0104
            androidx.emoji2.text.m r3 = new androidx.emoji2.text.m     // Catch:{ all -> 0x002a }
            r3.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x002a }
        L_0x0104:
            androidx.emoji2.text.g r13 = r1.b()     // Catch:{ all -> 0x002a }
            r10.a(r3, r13, r2, r12)     // Catch:{ all -> 0x002a }
        L_0x010b:
            if (r3 == 0) goto L_0x0119
            android.text.Spannable r12 = r3.b()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0118
            i0.c r11 = (i0.c) r11
            r11.d()
        L_0x0118:
            return r12
        L_0x0119:
            if (r0 == 0) goto L_0x0121
            r12 = r11
            i0.c r12 = (i0.c) r12
            r12.d()
        L_0x0121:
            return r11
        L_0x0122:
            if (r0 == 0) goto L_0x012a
            r12 = r11
            i0.c r12 = (i0.c) r12
            r12.d()
        L_0x012a:
            return r11
        L_0x012b:
            if (r0 == 0) goto L_0x0132
            i0.c r11 = (i0.c) r11
            r11.d()
        L_0x0132:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
