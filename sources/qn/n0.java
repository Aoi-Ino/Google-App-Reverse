package qn;

public abstract class n0 {
    public static String a(int i10, int i11) {
        StringBuilder sb2;
        String str;
        if (i10 == 64) {
            sb2 = new StringBuilder();
            str = "[APPLICATION ";
        } else if (i10 == 128) {
            sb2 = new StringBuilder();
            str = "[CONTEXT ";
        } else if (i10 != 192) {
            sb2 = new StringBuilder();
            str = "[UNIVERSAL ";
        } else {
            sb2 = new StringBuilder();
            str = "[PRIVATE ";
        }
        sb2.append(str);
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }
}
