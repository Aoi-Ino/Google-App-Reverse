package i7;

import java.io.IOException;
import java.io.StringWriter;
import k7.m;
import p7.c;

public abstract class g {
    public f l() {
        if (r()) {
            return (f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public j n() {
        if (v()) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public l o() {
        if (y()) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean r() {
        return this instanceof f;
    }

    public boolean s() {
        return this instanceof i;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.s0(true);
            m.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean v() {
        return this instanceof j;
    }

    public boolean y() {
        return this instanceof l;
    }
}
