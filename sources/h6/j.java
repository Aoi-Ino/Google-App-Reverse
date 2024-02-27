package h6;

import s3.o;

public abstract class j extends Exception {
    protected j() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        o.f(str, "Detail message must not be empty");
    }
}
