package ol;

public class a extends Error {

    /* renamed from: e  reason: collision with root package name */
    Exception f30142e;

    public a(String str, Exception exc) {
        super(str);
        this.f30142e = exc;
    }

    public String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.f30142e) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.f30142e.getClass().toString() : message2;
    }
}
