package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 extends ViewGroup {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public ActionMenuView f685HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f686KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f687TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f688husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final C0011lEeR5KfoEr4xU5yHH7 f689lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Context f690s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 f691zZKhbgvUfsK4AEX3r0;

    /* renamed from: IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public class C0011lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f692lEeR5KfoEr4xU5yHH7 = false;

        public C0011lEeR5KfoEr4xU5yHH7() {
        }
    }

    public lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f689lEeR5KfoEr4xU5yHH7 = new C0011lEeR5KfoEr4xU5yHH7();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6280lEeR5KfoEr4xU5yHH7, typedValue, true) || typedValue.resourceId == 0) {
            this.f690s3fjYDxWOUexjjVgyA = context;
        } else {
            this.f690s3fjYDxWOUexjjVgyA = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int s3fjYDxWOUexjjVgyA(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int HJFh0TGMpafqLE9haL(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f688husNiw3snxdgZPAGJm;
    }

    public int lEeR5KfoEr4xU5yHH7(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6408lEeR5KfoEr4xU5yHH7, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6269HJFh0TGMpafqLE9haL, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6417pbVGzGjWvY2LDXC8vo, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f691zZKhbgvUfsK4AEX3r0;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.OUd9THiLjZndMj0qdF(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f687TCyPEKSzIyweCN5yp1 = false;
        }
        if (!this.f687TCyPEKSzIyweCN5yp1) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f687TCyPEKSzIyweCN5yp1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f687TCyPEKSzIyweCN5yp1 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f686KYHag8HRDlnO3X9zmZ = false;
        }
        if (!this.f686KYHag8HRDlnO3X9zmZ) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f686KYHag8HRDlnO3X9zmZ = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f686KYHag8HRDlnO3X9zmZ = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }
}
