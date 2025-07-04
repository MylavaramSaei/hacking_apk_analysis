package FI7jQXEuEg1AdcOOw7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 implements View.OnTouchListener {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f139HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Dialog f140lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f141s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f142zZKhbgvUfsK4AEX3r0;

    public lEeR5KfoEr4xU5yHH7(Dialog dialog, Rect rect) {
        this.f140lEeR5KfoEr4xU5yHH7 = dialog;
        this.f141s3fjYDxWOUexjjVgyA = rect.left;
        this.f139HJFh0TGMpafqLE9haL = rect.top;
        this.f142zZKhbgvUfsK4AEX3r0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f141s3fjYDxWOUexjjVgyA + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f139HJFh0TGMpafqLE9haL + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f142zZKhbgvUfsK4AEX3r0;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f140lEeR5KfoEr4xU5yHH7.onTouchEvent(motionEventObtain);
    }
}
