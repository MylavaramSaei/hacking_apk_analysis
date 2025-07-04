package W3RZ2dTDKrKpS5Mxdk;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class tXWeW0sqVddf7ZBflq implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Runnable f1910HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final View f1911lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public ViewTreeObserver f1912s3fjYDxWOUexjjVgyA;

    public tXWeW0sqVddf7ZBflq(View view, Runnable runnable) {
        this.f1911lEeR5KfoEr4xU5yHH7 = view;
        this.f1912s3fjYDxWOUexjjVgyA = view.getViewTreeObserver();
        this.f1910HJFh0TGMpafqLE9haL = runnable;
    }

    public static tXWeW0sqVddf7ZBflq lEeR5KfoEr4xU5yHH7(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq = new tXWeW0sqVddf7ZBflq(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(txwew0sqvddf7zbflq);
        view.addOnAttachStateChangeListener(txwew0sqvddf7zbflq);
        return txwew0sqvddf7zbflq;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        s3fjYDxWOUexjjVgyA();
        this.f1910HJFh0TGMpafqLE9haL.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1912s3fjYDxWOUexjjVgyA = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        s3fjYDxWOUexjjVgyA();
    }

    public void s3fjYDxWOUexjjVgyA() {
        (this.f1912s3fjYDxWOUexjjVgyA.isAlive() ? this.f1912s3fjYDxWOUexjjVgyA : this.f1911lEeR5KfoEr4xU5yHH7.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1911lEeR5KfoEr4xU5yHH7.removeOnAttachStateChangeListener(this);
    }
}
