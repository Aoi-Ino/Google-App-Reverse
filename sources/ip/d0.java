package ip;

import java.util.regex.Pattern;

class d0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f24520a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24521b;

    public d0() {
        this(",");
    }

    private String[] d(String str, String str2) {
        String[] split = this.f24520a.split(str);
        for (int i10 = 0; i10 < split.length; i10++) {
            String str3 = split[i10];
            if (str3 != null) {
                split[i10] = str3.trim();
            }
        }
        return split;
    }

    private String f(String[] strArr, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                if (sb2.length() > 0) {
                    sb2.append(str);
                    sb2.append(' ');
                }
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public String[] b(String str) {
        return d(str, this.f24521b);
    }

    /* renamed from: e */
    public String a(String[] strArr) {
        return f(strArr, this.f24521b);
    }

    public d0(String str) {
        this.f24520a = Pattern.compile(str);
        this.f24521b = str;
    }
}
