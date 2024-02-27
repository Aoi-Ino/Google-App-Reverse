package k8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cm.l;
import j$.time.LocalDate;
import j$.time.YearMonth;

public abstract class a {
    public static final YearMonth a(YearMonth yearMonth) {
        l.f(yearMonth, "$this$next");
        YearMonth plusMonths = yearMonth.plusMonths(1);
        l.e(plusMonths, "this.plusMonths(1)");
        return plusMonths;
    }

    public static final YearMonth b(YearMonth yearMonth) {
        l.f(yearMonth, "$this$previous");
        YearMonth minusMonths = yearMonth.minusMonths(1);
        l.e(minusMonths, "this.minusMonths(1)");
        return minusMonths;
    }

    public static final int c(View view) {
        l.f(view, "$this$getVerticalMargins");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer valueOf = marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.topMargin) : null;
        int i10 = 0;
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (marginLayoutParams != null) {
            num = Integer.valueOf(marginLayoutParams.bottomMargin);
        }
        if (num != null) {
            i10 = num.intValue();
        }
        return intValue + i10;
    }

    public static final YearMonth d(LocalDate localDate) {
        l.f(localDate, "$this$yearMonth");
        YearMonth of2 = YearMonth.of(localDate.getYear(), localDate.getMonth());
        l.e(of2, "YearMonth.of(year, month)");
        return of2;
    }

    public static final View e(ViewGroup viewGroup, int i10, boolean z10) {
        l.f(viewGroup, "$this$inflate");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, z10);
        l.e(inflate, "LayoutInflater.from(cont…tRes, this, attachToRoot)");
        return inflate;
    }

    public static /* synthetic */ View f(ViewGroup viewGroup, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return e(viewGroup, i10, z10);
    }
}
