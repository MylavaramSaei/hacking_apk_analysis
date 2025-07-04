package EscIOBqRhG6irG5q11;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL extends CoordinatorLayout.s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f105HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f106lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f107s3fjYDxWOUexjjVgyA;

    public HJFh0TGMpafqLE9haL() {
        this.f107s3fjYDxWOUexjjVgyA = 0;
        this.f105HJFh0TGMpafqLE9haL = 0;
    }

    public int XzJ1BS7H9Ilbkv4eVM() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f106lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean e54J8UWNHWALQNixXM(CoordinatorLayout coordinatorLayout, View view, int i) {
        tXWeW0sqVddf7ZBflq(coordinatorLayout, view, i);
        if (this.f106lEeR5KfoEr4xU5yHH7 == null) {
            this.f106lEeR5KfoEr4xU5yHH7 = new zZKhbgvUfsK4AEX3r0(view);
        }
        this.f106lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
        this.f106lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
        int i2 = this.f107s3fjYDxWOUexjjVgyA;
        if (i2 != 0) {
            this.f106lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(i2);
            this.f107s3fjYDxWOUexjjVgyA = 0;
        }
        int i3 = this.f105HJFh0TGMpafqLE9haL;
        if (i3 == 0) {
            return true;
        }
        this.f106lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(i3);
        this.f105HJFh0TGMpafqLE9haL = 0;
        return true;
    }

    public void tXWeW0sqVddf7ZBflq(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.W3RZ2dTDKrKpS5Mxdk(view, i);
    }

    public HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f107s3fjYDxWOUexjjVgyA = 0;
        this.f105HJFh0TGMpafqLE9haL = 0;
    }
}
