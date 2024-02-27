package e8;

import a8.x;

public class m implements x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f10901a = new m();

    public boolean a(int i10, int i11, int i12, char[] cArr, e0[] e0VarArr) {
        char b10 = b(i11, cArr, e0VarArr);
        if (b10 <= ' ' || b10 == '-' || b10 == 8208) {
            return true;
        }
        if (b10 < 8194) {
            return false;
        }
        if (b10 >= 8194 && b10 <= 8203) {
            return true;
        }
        if (b10 >= 11904 && b10 < 55200) {
            return true;
        }
        if (b10 >= 63744 && b10 < 64256) {
            return true;
        }
        if (b10 < 65072 || b10 >= 65104) {
            return b10 >= 65377 && b10 < 65440;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public char b(int i10, char[] cArr, e0[] e0VarArr) {
        return e0VarArr == null ? cArr[i10] : (char) e0VarArr[Math.min(i10, e0VarArr.length - 1)].i(cArr[i10]);
    }
}
