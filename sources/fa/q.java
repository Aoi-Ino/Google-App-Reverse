package fa;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.DPTNotice.NoticeSearchList;

public final /* synthetic */ class q implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NoticeSearchList f11576a;

    public /* synthetic */ q(NoticeSearchList noticeSearchList) {
        this.f11576a = noticeSearchList;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return NoticeSearchList.w1(this.f11576a, textView, i10, keyEvent);
    }
}
