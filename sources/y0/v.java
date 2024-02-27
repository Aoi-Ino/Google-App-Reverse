package y0;

import cm.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f18432a = new v();

    private v() {
    }

    public static final String a(String str) {
        l.f(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
