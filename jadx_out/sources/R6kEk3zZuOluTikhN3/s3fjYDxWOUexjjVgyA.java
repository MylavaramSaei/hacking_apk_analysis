package R6kEk3zZuOluTikhN3;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SideSheetBehavior f1360lEeR5KfoEr4xU5yHH7;

    public s3fjYDxWOUexjjVgyA(SideSheetBehavior sideSheetBehavior) {
        this.f1360lEeR5KfoEr4xU5yHH7 = sideSheetBehavior;
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public boolean Acstmh57AKoSEkEFNJ(float f) {
        return f < 0.0f;
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int HJFh0TGMpafqLE9haL() {
        return Math.max(0, (zZKhbgvUfsK4AEX3r0() - this.f1360lEeR5KfoEr4xU5yHH7.bMSdooljgH14Jgudph()) - this.f1360lEeR5KfoEr4xU5yHH7.Tu4WCh2gEwj8E4oHbP());
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int KYHag8HRDlnO3X9zmZ() {
        return HJFh0TGMpafqLE9haL();
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public boolean T9PhQIpGRhE4yZDm1C(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.f1360lEeR5KfoEr4xU5yHH7.osrHU7fvDp2EgxZPfM())) > this.f1360lEeR5KfoEr4xU5yHH7.ZJNyOIPL0usMs2xSAn();
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int TCyPEKSzIyweCN5yp1(View view) {
        return view.getLeft() - this.f1360lEeR5KfoEr4xU5yHH7.Tu4WCh2gEwj8E4oHbP();
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public boolean Z9WdNiOsPR0y54zHW4(View view) {
        return view.getLeft() > (zZKhbgvUfsK4AEX3r0() + HJFh0TGMpafqLE9haL()) / 2;
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public boolean e54J8UWNHWALQNixXM(float f, float f2) {
        return zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(f, f2) && Math.abs(f) > ((float) this.f1360lEeR5KfoEr4xU5yHH7.ctWLFN70QQINH1kyYo());
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public void hoXrIDAFrSwfShk8da(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int iPum9NZyDBKoCnecvlx = this.f1360lEeR5KfoEr4xU5yHH7.Pum9NZyDBKoCnecvlx();
        if (i <= iPum9NZyDBKoCnecvlx) {
            marginLayoutParams.rightMargin = iPum9NZyDBKoCnecvlx - i;
        }
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int husNiw3snxdgZPAGJm() {
        return this.f1360lEeR5KfoEr4xU5yHH7.Pum9NZyDBKoCnecvlx();
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int lEeR5KfoEr4xU5yHH7(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int pbVGzGjWvY2LDXC8vo() {
        return 0;
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public float s3fjYDxWOUexjjVgyA(int i) {
        float fZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0();
        return (fZZKhbgvUfsK4AEX3r0 - i) / (fZZKhbgvUfsK4AEX3r0 - HJFh0TGMpafqLE9haL());
    }

    @Override // R6kEk3zZuOluTikhN3.HJFh0TGMpafqLE9haL
    public int zZKhbgvUfsK4AEX3r0() {
        return this.f1360lEeR5KfoEr4xU5yHH7.Pum9NZyDBKoCnecvlx();
    }
}
