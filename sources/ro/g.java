package ro;

import qn.o1;
import wn.a;

abstract class g {
    static a a(String str) {
        if (str.equals("SHA-1")) {
            return new a(un.a.f32237i, o1.f30967f);
        }
        if (str.equals("SHA-224")) {
            return new a(tn.a.f31694f);
        }
        if (str.equals("SHA-256")) {
            return new a(tn.a.f31688c);
        }
        if (str.equals("SHA-384")) {
            return new a(tn.a.f31690d);
        }
        if (str.equals("SHA-512")) {
            return new a(tn.a.f31692e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    static xn.a b(a aVar) {
        if (aVar.y().Y(un.a.f32237i)) {
            return ao.a.b();
        }
        if (aVar.y().Y(tn.a.f31694f)) {
            return ao.a.c();
        }
        if (aVar.y().Y(tn.a.f31688c)) {
            return ao.a.d();
        }
        if (aVar.y().Y(tn.a.f31690d)) {
            return ao.a.e();
        }
        if (aVar.y().Y(tn.a.f31692e)) {
            return ao.a.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + aVar.y());
    }
}
