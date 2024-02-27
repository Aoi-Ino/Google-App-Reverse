package a8;

import java.io.PrintStream;
import java.io.PrintWriter;

public class j extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private Exception f282e;

    /* renamed from: f  reason: collision with root package name */
    private String f283f;

    public j(Exception exc) {
        super(exc);
        this.f282e = exc;
        this.f283f = exc instanceof RuntimeException ? "" : "ExceptionConverter: ";
    }

    public static final RuntimeException a(Exception exc) {
        return exc instanceof RuntimeException ? (RuntimeException) exc : new j(exc);
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getLocalizedMessage() {
        return this.f282e.getLocalizedMessage();
    }

    public String getMessage() {
        return this.f282e.getMessage();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public String toString() {
        return this.f283f + this.f282e;
    }

    public void printStackTrace(PrintStream printStream) {
        synchronized (printStream) {
            printStream.print(this.f283f);
            this.f282e.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        synchronized (printWriter) {
            printWriter.print(this.f283f);
            this.f282e.printStackTrace(printWriter);
        }
    }
}
