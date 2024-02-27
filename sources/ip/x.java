package ip;

import java.util.Locale;
import java.util.regex.Pattern;

class x implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f24541a = Pattern.compile("_");

    private Locale d(String[] strArr) {
        String[] strArr2 = {"", "", ""};
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 < strArr.length) {
                strArr2[i10] = strArr[i10];
            }
        }
        return new Locale(strArr2[0], strArr2[1], strArr2[2]);
    }

    /* renamed from: c */
    public Locale b(String str) {
        String[] split = this.f24541a.split(str);
        if (split.length >= 1) {
            return d(split);
        }
        throw new w("Invalid locale %s", str);
    }

    /* renamed from: e */
    public String a(Locale locale) {
        return locale.toString();
    }
}
