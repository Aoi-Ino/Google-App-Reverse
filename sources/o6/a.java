package o6;

public abstract class a {
    public static CharSequence a(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new IllegalArgumentException(str + " may not be null");
        } else if (!c.a(charSequence)) {
            return charSequence;
        } else {
            throw new IllegalArgumentException(str + " may not be empty");
        }
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }
}
