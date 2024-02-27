package j$.time;

import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import j$.util.DesugarTimeZone;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public abstract class ZoneId implements Serializable {
    public static final Map SHORT_IDS = ZoneId$$ExternalSyntheticBackport2.m(new Map.Entry[]{ZoneId$$ExternalSyntheticBackport1.m("ACT", "Australia/Darwin"), ZoneId$$ExternalSyntheticBackport1.m("AET", "Australia/Sydney"), ZoneId$$ExternalSyntheticBackport1.m("AGT", "America/Argentina/Buenos_Aires"), ZoneId$$ExternalSyntheticBackport1.m("ART", "Africa/Cairo"), ZoneId$$ExternalSyntheticBackport1.m("AST", "America/Anchorage"), ZoneId$$ExternalSyntheticBackport1.m("BET", "America/Sao_Paulo"), ZoneId$$ExternalSyntheticBackport1.m("BST", "Asia/Dhaka"), ZoneId$$ExternalSyntheticBackport1.m("CAT", "Africa/Harare"), ZoneId$$ExternalSyntheticBackport1.m("CNT", "America/St_Johns"), ZoneId$$ExternalSyntheticBackport1.m("CST", "America/Chicago"), ZoneId$$ExternalSyntheticBackport1.m("CTT", "Asia/Shanghai"), ZoneId$$ExternalSyntheticBackport1.m("EAT", "Africa/Addis_Ababa"), ZoneId$$ExternalSyntheticBackport1.m("ECT", "Europe/Paris"), ZoneId$$ExternalSyntheticBackport1.m("IET", "America/Indiana/Indianapolis"), ZoneId$$ExternalSyntheticBackport1.m("IST", "Asia/Kolkata"), ZoneId$$ExternalSyntheticBackport1.m("JST", "Asia/Tokyo"), ZoneId$$ExternalSyntheticBackport1.m("MIT", "Pacific/Apia"), ZoneId$$ExternalSyntheticBackport1.m("NET", "Asia/Yerevan"), ZoneId$$ExternalSyntheticBackport1.m("NST", "Pacific/Auckland"), ZoneId$$ExternalSyntheticBackport1.m("PLT", "Asia/Karachi"), ZoneId$$ExternalSyntheticBackport1.m("PNT", "America/Phoenix"), ZoneId$$ExternalSyntheticBackport1.m("PRT", "America/Puerto_Rico"), ZoneId$$ExternalSyntheticBackport1.m("PST", "America/Los_Angeles"), ZoneId$$ExternalSyntheticBackport1.m("SST", "Pacific/Guadalcanal"), ZoneId$$ExternalSyntheticBackport1.m("VST", "Asia/Ho_Chi_Minh"), ZoneId$$ExternalSyntheticBackport1.m("EST", "-05:00"), ZoneId$$ExternalSyntheticBackport1.m("MST", "-07:00"), ZoneId$$ExternalSyntheticBackport1.m("HST", "-10:00")});
    private static final long serialVersionUID = 8352817235686L;

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId of(String str) {
        return of(str, true);
    }

    public static ZoneId of(String str, Map map) {
        Objects.requireNonNull(str, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        return of((String) ZoneId$$ExternalSyntheticBackport0.m((String) map.get(str), str));
    }

    static ZoneId of(String str, boolean z10) {
        int i10;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i10 = 3;
        } else if (!str.startsWith("UT")) {
            return ZoneRegion.ofId(str, z10);
        } else {
            i10 = 2;
        }
        return ofWithPrefix(str, i10, z10);
    }

    public static ZoneId ofOffset(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.getTotalSeconds() != 0) {
                str = str.concat(zoneOffset.getId());
            }
            return new ZoneRegion(str, zoneOffset.getRules());
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static ZoneId ofWithPrefix(String str, int i10, boolean z10) {
        String substring = str.substring(0, i10);
        if (str.length() == i10) {
            return ofOffset(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return ZoneRegion.ofId(str, z10);
        }
        try {
            ZoneOffset of2 = ZoneOffset.of(str.substring(i10));
            return of2 == ZoneOffset.UTC ? ofOffset(substring, of2) : ofOffset(substring, of2);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: " + str, e10);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        return DesugarTimeZone.toZoneId(TimeZone.getDefault());
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(Instant.EPOCH);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }

    /* access modifiers changed from: package-private */
    public abstract void write(DataOutput dataOutput);
}
