package en;

import cm.l;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public final class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final f f23060a = new f();

    private f() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        l.f(logRecord, "record");
        e eVar = e.f23059c;
        String loggerName = logRecord.getLoggerName();
        l.e(loggerName, "record.loggerName");
        int a10 = g.b(logRecord);
        String message = logRecord.getMessage();
        l.e(message, "record.message");
        eVar.a(loggerName, a10, message, logRecord.getThrown());
    }
}
