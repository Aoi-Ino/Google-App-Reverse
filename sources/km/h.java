package km;

import bm.l;

abstract class h {
    public static void a(Appendable appendable, Object obj, l lVar) {
        CharSequence valueOf;
        cm.l.f(appendable, "<this>");
        if (lVar != null) {
            obj = lVar.invoke(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            }
            valueOf = String.valueOf(obj);
            appendable.append(valueOf);
        }
        valueOf = (CharSequence) obj;
        appendable.append(valueOf);
    }
}
