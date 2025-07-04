package W3RZ2dTDKrKpS5Mxdk;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class VItLRw50eXTZeEfGl0 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final View f1839HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int[] f1840husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public ViewParent f1841lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public ViewParent f1842s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f1843zZKhbgvUfsK4AEX3r0;

    public VItLRw50eXTZeEfGl0(View view) {
        this.f1839HJFh0TGMpafqLE9haL = view;
    }

    public boolean Acstmh57AKoSEkEFNJ() {
        return Z9WdNiOsPR0y54zHW4(0);
    }

    public boolean HJFh0TGMpafqLE9haL(int i, int i2, int[] iArr, int[] iArr2) {
        return zZKhbgvUfsK4AEX3r0(i, i2, iArr, iArr2, 0);
    }

    public final ViewParent IPyIQcaNa8aB7drBED(int i) {
        if (i == 0) {
            return this.f1841lEeR5KfoEr4xU5yHH7;
        }
        if (i != 1) {
            return null;
        }
        return this.f1842s3fjYDxWOUexjjVgyA;
    }

    public boolean KYHag8HRDlnO3X9zmZ(int i, int i2, int i3, int i4, int[] iArr) {
        return TCyPEKSzIyweCN5yp1(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean OANkd3mP6AYvwbNLJM(int i, int i2) {
        if (Z9WdNiOsPR0y54zHW4(i2)) {
            return true;
        }
        if (!e54J8UWNHWALQNixXM()) {
            return false;
        }
        View view = this.f1839HJFh0TGMpafqLE9haL;
        for (ViewParent parent = this.f1839HJFh0TGMpafqLE9haL.getParent(); parent != null; parent = parent.getParent()) {
            if (oocVJL811qFf0j0XXZ.KYHag8HRDlnO3X9zmZ(parent, view, this.f1839HJFh0TGMpafqLE9haL, i, i2)) {
                hoXrIDAFrSwfShk8da(i2, parent);
                oocVJL811qFf0j0XXZ.husNiw3snxdgZPAGJm(parent, view, this.f1839HJFh0TGMpafqLE9haL, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void T9PhQIpGRhE4yZDm1C(boolean z) {
        if (this.f1843zZKhbgvUfsK4AEX3r0) {
            lLKzvdU99Iw80uVD5I.HR5vAalpgOKVm2T0Gq(this.f1839HJFh0TGMpafqLE9haL);
        }
        this.f1843zZKhbgvUfsK4AEX3r0 = z;
    }

    public final boolean TCyPEKSzIyweCN5yp1(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentIPyIQcaNa8aB7drBED;
        int i6;
        int i7;
        int[] iArr3;
        if (!e54J8UWNHWALQNixXM() || (viewParentIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1839HJFh0TGMpafqLE9haL.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo();
            iArrPbVGzGjWvY2LDXC8vo[0] = 0;
            iArrPbVGzGjWvY2LDXC8vo[1] = 0;
            iArr3 = iArrPbVGzGjWvY2LDXC8vo;
        } else {
            iArr3 = iArr2;
        }
        oocVJL811qFf0j0XXZ.zZKhbgvUfsK4AEX3r0(viewParentIPyIQcaNa8aB7drBED, this.f1839HJFh0TGMpafqLE9haL, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f1839HJFh0TGMpafqLE9haL.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean Z9WdNiOsPR0y54zHW4(int i) {
        return IPyIQcaNa8aB7drBED(i) != null;
    }

    public boolean aPyGSIylzVNKPT1Bls(int i) {
        return OANkd3mP6AYvwbNLJM(i, 0);
    }

    public boolean e54J8UWNHWALQNixXM() {
        return this.f1843zZKhbgvUfsK4AEX3r0;
    }

    public final void hoXrIDAFrSwfShk8da(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f1841lEeR5KfoEr4xU5yHH7 = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f1842s3fjYDxWOUexjjVgyA = viewParent;
        }
    }

    public void husNiw3snxdgZPAGJm(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        TCyPEKSzIyweCN5yp1(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean lEeR5KfoEr4xU5yHH7(float f, float f2, boolean z) {
        ViewParent viewParentIPyIQcaNa8aB7drBED;
        if (!e54J8UWNHWALQNixXM() || (viewParentIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(0)) == null) {
            return false;
        }
        return oocVJL811qFf0j0XXZ.lEeR5KfoEr4xU5yHH7(viewParentIPyIQcaNa8aB7drBED, this.f1839HJFh0TGMpafqLE9haL, f, f2, z);
    }

    public final int[] pbVGzGjWvY2LDXC8vo() {
        if (this.f1840husNiw3snxdgZPAGJm == null) {
            this.f1840husNiw3snxdgZPAGJm = new int[2];
        }
        return this.f1840husNiw3snxdgZPAGJm;
    }

    public boolean s3fjYDxWOUexjjVgyA(float f, float f2) {
        ViewParent viewParentIPyIQcaNa8aB7drBED;
        if (!e54J8UWNHWALQNixXM() || (viewParentIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(0)) == null) {
            return false;
        }
        return oocVJL811qFf0j0XXZ.s3fjYDxWOUexjjVgyA(viewParentIPyIQcaNa8aB7drBED, this.f1839HJFh0TGMpafqLE9haL, f, f2);
    }

    public void sTkWmhpZ5b1ArQIw4K(int i) {
        ViewParent viewParentIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i);
        if (viewParentIPyIQcaNa8aB7drBED != null) {
            oocVJL811qFf0j0XXZ.TCyPEKSzIyweCN5yp1(viewParentIPyIQcaNa8aB7drBED, this.f1839HJFh0TGMpafqLE9haL, i);
            hoXrIDAFrSwfShk8da(i, null);
        }
    }

    public boolean zZKhbgvUfsK4AEX3r0(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentIPyIQcaNa8aB7drBED;
        int i4;
        int i5;
        if (!e54J8UWNHWALQNixXM() || (viewParentIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1839HJFh0TGMpafqLE9haL.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = pbVGzGjWvY2LDXC8vo();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        oocVJL811qFf0j0XXZ.HJFh0TGMpafqLE9haL(viewParentIPyIQcaNa8aB7drBED, this.f1839HJFh0TGMpafqLE9haL, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f1839HJFh0TGMpafqLE9haL.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void zaq8hOURtfwbcX17cG() {
        sTkWmhpZ5b1ArQIw4K(0);
    }
}
