package ym;

import cm.l;
import cm.x;
import java.util.Arrays;
import java.util.logging.Logger;

public abstract class b {
    public static final String b(long j10) {
        StringBuilder sb2;
        long j11;
        StringBuilder sb3;
        long j12;
        StringBuilder sb4;
        long j13;
        if (j10 <= ((long) -999500000)) {
            sb2 = new StringBuilder();
            j11 = j10 - ((long) 500000000);
        } else {
            if (j10 <= ((long) -999500)) {
                sb3 = new StringBuilder();
                j12 = j10 - ((long) 500000);
            } else {
                if (j10 <= 0) {
                    sb4 = new StringBuilder();
                    j13 = j10 - ((long) 500);
                } else if (j10 < ((long) 999500)) {
                    sb4 = new StringBuilder();
                    j13 = j10 + ((long) 500);
                } else if (j10 < ((long) 999500000)) {
                    sb3 = new StringBuilder();
                    j12 = j10 + ((long) 500000);
                } else {
                    sb2 = new StringBuilder();
                    j11 = j10 + ((long) 500000000);
                }
                sb4.append(j13 / ((long) 1000));
                sb4.append(" µs");
                String sb5 = sb4.toString();
                x xVar = x.f20237a;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb5}, 1));
                l.e(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb4.append(j12 / ((long) 1000000));
            sb4.append(" ms");
            String sb52 = sb4.toString();
            x xVar2 = x.f20237a;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb52}, 1));
            l.e(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb4.append(j11 / ((long) 1000000000));
        sb4.append(" s ");
        String sb522 = sb4.toString();
        x xVar22 = x.f20237a;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb522}, 1));
        l.e(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger a10 = e.f33075j.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        x xVar = x.f20237a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        l.e(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a10.fine(sb2.toString());
    }
}
