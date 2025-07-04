package androidx.appcompat.view.menu;

import W3RZ2dTDKrKpS5Mxdk.Y43RdunnpKgpbny0lE;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public class KYHag8HRDlnO3X9zmZ {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA f2600Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final boolean f2601HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f2602IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public View f2603KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f2604TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2605Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f2606e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f2607husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f2608lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f2609pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f2610s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f2611zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements PopupWindow.OnDismissListener {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            KYHag8HRDlnO3X9zmZ.this.husNiw3snxdgZPAGJm();
        }
    }

    public KYHag8HRDlnO3X9zmZ(Context context, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, View view, boolean z, int i) {
        this(context, zzkhbgvufsk4aex3r0, view, z, i, 0);
    }

    public void Acstmh57AKoSEkEFNJ(TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2609pbVGzGjWvY2LDXC8vo = leer5kfoer4xu5yhh7;
        TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f2600Acstmh57AKoSEkEFNJ;
        if (s3fjydxwouexjjvgya != null) {
            s3fjydxwouexjjvgya.pbVGzGjWvY2LDXC8vo(leer5kfoer4xu5yhh7);
        }
    }

    public TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA HJFh0TGMpafqLE9haL() {
        if (this.f2600Acstmh57AKoSEkEFNJ == null) {
            this.f2600Acstmh57AKoSEkEFNJ = lEeR5KfoEr4xU5yHH7();
        }
        return this.f2600Acstmh57AKoSEkEFNJ;
    }

    public void IPyIQcaNa8aB7drBED(int i) {
        this.f2604TCyPEKSzIyweCN5yp1 = i;
    }

    public void KYHag8HRDlnO3X9zmZ(View view) {
        this.f2603KYHag8HRDlnO3X9zmZ = view;
    }

    public boolean T9PhQIpGRhE4yZDm1C() {
        if (zZKhbgvUfsK4AEX3r0()) {
            return true;
        }
        if (this.f2603KYHag8HRDlnO3X9zmZ == null) {
            return false;
        }
        e54J8UWNHWALQNixXM(0, 0, false, false);
        return true;
    }

    public void TCyPEKSzIyweCN5yp1(boolean z) {
        this.f2602IPyIQcaNa8aB7drBED = z;
        TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f2600Acstmh57AKoSEkEFNJ;
        if (s3fjydxwouexjjvgya != null) {
            s3fjydxwouexjjvgya.sTkWmhpZ5b1ArQIw4K(z);
        }
    }

    public void Z9WdNiOsPR0y54zHW4() {
        if (!T9PhQIpGRhE4yZDm1C()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void e54J8UWNHWALQNixXM(int i, int i2, boolean z, boolean z2) {
        TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL();
        s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL.xHA29AmDt6y96AnB3t(z2);
        if (z) {
            if ((Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(this.f2604TCyPEKSzIyweCN5yp1, this.f2603KYHag8HRDlnO3X9zmZ.getLayoutDirection()) & 7) == 5) {
                i -= this.f2603KYHag8HRDlnO3X9zmZ.getWidth();
            }
            s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL.R9SAhYMerGybF9OAjL(i);
            s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL.LIMtzhnLwQyigzK0KO(i2);
            int i3 = (int) ((this.f2608lEeR5KfoEr4xU5yHH7.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
    }

    public boolean hoXrIDAFrSwfShk8da(int i, int i2) {
        if (zZKhbgvUfsK4AEX3r0()) {
            return true;
        }
        if (this.f2603KYHag8HRDlnO3X9zmZ == null) {
            return false;
        }
        e54J8UWNHWALQNixXM(i, i2, true, true);
        return true;
    }

    public void husNiw3snxdgZPAGJm() {
        this.f2600Acstmh57AKoSEkEFNJ = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2605Z9WdNiOsPR0y54zHW4;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7() {
        Display defaultDisplay = ((WindowManager) this.f2608lEeR5KfoEr4xU5yHH7.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = Math.min(point.x, point.y) >= this.f2608lEeR5KfoEr4xU5yHH7.getResources().getDimensionPixelSize(lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6222lEeR5KfoEr4xU5yHH7) ? new s3fjYDxWOUexjjVgyA(this.f2608lEeR5KfoEr4xU5yHH7, this.f2603KYHag8HRDlnO3X9zmZ, this.f2611zZKhbgvUfsK4AEX3r0, this.f2607husNiw3snxdgZPAGJm, this.f2601HJFh0TGMpafqLE9haL) : new pbVGzGjWvY2LDXC8vo(this.f2608lEeR5KfoEr4xU5yHH7, this.f2610s3fjYDxWOUexjjVgyA, this.f2603KYHag8HRDlnO3X9zmZ, this.f2611zZKhbgvUfsK4AEX3r0, this.f2607husNiw3snxdgZPAGJm, this.f2601HJFh0TGMpafqLE9haL);
        s3fjydxwouexjjvgya.e54J8UWNHWALQNixXM(this.f2610s3fjYDxWOUexjjVgyA);
        s3fjydxwouexjjvgya.G7AC3DWIx9i9fdanjk(this.f2606e54J8UWNHWALQNixXM);
        s3fjydxwouexjjvgya.OANkd3mP6AYvwbNLJM(this.f2603KYHag8HRDlnO3X9zmZ);
        s3fjydxwouexjjvgya.pbVGzGjWvY2LDXC8vo(this.f2609pbVGzGjWvY2LDXC8vo);
        s3fjydxwouexjjvgya.sTkWmhpZ5b1ArQIw4K(this.f2602IPyIQcaNa8aB7drBED);
        s3fjydxwouexjjvgya.Y43RdunnpKgpbny0lE(this.f2604TCyPEKSzIyweCN5yp1);
        return s3fjydxwouexjjvgya;
    }

    public void pbVGzGjWvY2LDXC8vo(PopupWindow.OnDismissListener onDismissListener) {
        this.f2605Z9WdNiOsPR0y54zHW4 = onDismissListener;
    }

    public void s3fjYDxWOUexjjVgyA() {
        if (zZKhbgvUfsK4AEX3r0()) {
            this.f2600Acstmh57AKoSEkEFNJ.dismiss();
        }
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f2600Acstmh57AKoSEkEFNJ;
        return s3fjydxwouexjjvgya != null && s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ();
    }

    public KYHag8HRDlnO3X9zmZ(Context context, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, View view, boolean z, int i, int i2) {
        this.f2604TCyPEKSzIyweCN5yp1 = 8388611;
        this.f2606e54J8UWNHWALQNixXM = new lEeR5KfoEr4xU5yHH7();
        this.f2608lEeR5KfoEr4xU5yHH7 = context;
        this.f2610s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0;
        this.f2603KYHag8HRDlnO3X9zmZ = view;
        this.f2601HJFh0TGMpafqLE9haL = z;
        this.f2611zZKhbgvUfsK4AEX3r0 = i;
        this.f2607husNiw3snxdgZPAGJm = i2;
    }
}
