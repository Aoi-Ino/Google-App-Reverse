package xo;

import qn.u;
import tn.a;

abstract class e {
    static u a(String str) {
        if (str.equals("SHA-256")) {
            return a.f31688c;
        }
        if (str.equals("SHA-512")) {
            return a.f31692e;
        }
        if (str.equals("SHAKE128")) {
            return a.f31708m;
        }
        if (str.equals("SHAKE256")) {
            return a.f31710n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
