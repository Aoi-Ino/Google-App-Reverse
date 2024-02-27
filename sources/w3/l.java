package w3;

import java.util.regex.Pattern;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f17870a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
