package retrofit2;

import java.io.IOException;
import um.b0;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    b0 request();

    in.b0 timeout();
}
