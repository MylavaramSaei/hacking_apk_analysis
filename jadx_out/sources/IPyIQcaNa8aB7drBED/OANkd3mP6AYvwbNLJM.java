package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class OANkd3mP6AYvwbNLJM extends PopupWindow {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final boolean f519s3fjYDxWOUexjjVgyA = false;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f520lEeR5KfoEr4xU5yHH7;

    public OANkd3mP6AYvwbNLJM(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        lEeR5KfoEr4xU5yHH7(context, attributeSet, i, i2);
    }

    public final void lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet, int i, int i2) {
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(context, attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6377dvmHGYHwlE2ean7ktb, i, i2);
        if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6340TZ2u8Z18RnXun7OSW0)) {
            s3fjYDxWOUexjjVgyA(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6340TZ2u8Z18RnXun7OSW0, false));
        }
        setBackgroundDrawable(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6445zWzrlx9vIdLp7FoEMD));
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
    }

    public final void s3fjYDxWOUexjjVgyA(boolean z) {
        if (f519s3fjYDxWOUexjjVgyA) {
            this.f520lEeR5KfoEr4xU5yHH7 = z;
        } else {
            PPkm9uUfOJHHYveeLT.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f519s3fjYDxWOUexjjVgyA && this.f520lEeR5KfoEr4xU5yHH7) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f519s3fjYDxWOUexjjVgyA && this.f520lEeR5KfoEr4xU5yHH7) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f519s3fjYDxWOUexjjVgyA && this.f520lEeR5KfoEr4xU5yHH7) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
