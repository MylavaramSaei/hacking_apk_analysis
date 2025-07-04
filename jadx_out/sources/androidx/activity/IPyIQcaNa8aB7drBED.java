package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.jCtUeU2YI1poCxWcjm;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED extends Dialog implements androidx.lifecycle.Z9WdNiOsPR0y54zHW4, Z9WdNiOsPR0y54zHW4, CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final OnBackPressedDispatcher f2531HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public androidx.lifecycle.e54J8UWNHWALQNixXM f2532lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL f2533s3fjYDxWOUexjjVgyA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IPyIQcaNa8aB7drBED(Context context, int i) {
        super(context, i);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
        this.f2533s3fjYDxWOUexjjVgyA = CSih7GetOUab1dYQjM.HJFh0TGMpafqLE9haL.f74zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this);
        this.f2531HJFh0TGMpafqLE9haL = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.TCyPEKSzIyweCN5yp1
            @Override // java.lang.Runnable
            public final void run() {
                IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(this.f2564lEeR5KfoEr4xU5yHH7);
            }
        });
    }

    public static final void husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iPyIQcaNa8aB7drBED, "this$0");
        super.onBackPressed();
    }

    public final androidx.lifecycle.e54J8UWNHWALQNixXM HJFh0TGMpafqLE9haL() {
        androidx.lifecycle.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f2532lEeR5KfoEr4xU5yHH7;
        if (e54j8uwnhwalqnixxm != null) {
            return e54j8uwnhwalqnixxm;
        }
        androidx.lifecycle.e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm2 = new androidx.lifecycle.e54J8UWNHWALQNixXM(this);
        this.f2532lEeR5KfoEr4xU5yHH7 = e54j8uwnhwalqnixxm2;
        return e54j8uwnhwalqnixxm2;
    }

    @Override // androidx.lifecycle.Z9WdNiOsPR0y54zHW4
    public androidx.lifecycle.KYHag8HRDlnO3X9zmZ TCyPEKSzIyweCN5yp1() {
        return HJFh0TGMpafqLE9haL();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        zZKhbgvUfsK4AEX3r0();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f2531HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2531HJFh0TGMpafqLE9haL;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.T9PhQIpGRhE4yZDm1C(onBackInvokedDispatcher);
        }
        this.f2533s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(bundle);
        HJFh0TGMpafqLE9haL().IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f2533s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        HJFh0TGMpafqLE9haL().IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        HJFh0TGMpafqLE9haL().IPyIQcaNa8aB7drBED(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY);
        this.f2532lEeR5KfoEr4xU5yHH7 = null;
        super.onStop();
    }

    @Override // CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0
    public androidx.savedstate.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        return this.f2533s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        zZKhbgvUfsK4AEX3r0();
        super.setContentView(i);
    }

    public void zZKhbgvUfsK4AEX3r0() {
        Window window = getWindow();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(window);
        View decorView = window.getDecorView();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(decorView, "window!!.decorView");
        jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(decorView, this);
        Window window2 = getWindow();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(window2);
        View decorView2 = window2.getDecorView();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(decorView2, "window!!.decorView");
        T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(decorView2, this);
        Window window3 = getWindow();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(window3);
        View decorView3 = window3.getDecorView();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(decorView3, "window!!.decorView");
        CSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(decorView3, this);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        zZKhbgvUfsK4AEX3r0();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        zZKhbgvUfsK4AEX3r0();
        super.setContentView(view, layoutParams);
    }
}
