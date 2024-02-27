package ip;

class j implements g0 {
    j() {
    }

    /* renamed from: c */
    public Character b(String str) {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new w("Cannot convert '%s' to a character", str);
    }

    /* renamed from: d */
    public String a(Character ch2) {
        return ch2.toString();
    }
}
