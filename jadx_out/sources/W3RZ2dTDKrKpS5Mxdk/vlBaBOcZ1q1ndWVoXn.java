package W3RZ2dTDKrKpS5Mxdk;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class vlBaBOcZ1q1ndWVoXn {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f1913lEeR5KfoEr4xU5yHH7;

    public static class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA {
        public HJFh0TGMpafqLE9haL(Window window, OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq) {
            super(window, oqIo5QF00RDxUQb4qq);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn.husNiw3snxdgZPAGJm
        public void lEeR5KfoEr4xU5yHH7(boolean z) {
            if (!z) {
                TCyPEKSzIyweCN5yp1(16);
                return;
            }
            IPyIQcaNa8aB7drBED(134217728);
            husNiw3snxdgZPAGJm(Integer.MIN_VALUE);
            zZKhbgvUfsK4AEX3r0(16);
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 extends husNiw3snxdgZPAGJm {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Window f1914lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final OqIo5QF00RDxUQb4qq f1915s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(Window window, OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq) {
            this.f1914lEeR5KfoEr4xU5yHH7 = window;
            this.f1915s3fjYDxWOUexjjVgyA = oqIo5QF00RDxUQb4qq;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn.husNiw3snxdgZPAGJm
        public void HJFh0TGMpafqLE9haL(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    KYHag8HRDlnO3X9zmZ(i2);
                }
            }
        }

        public void IPyIQcaNa8aB7drBED(int i) {
            this.f1914lEeR5KfoEr4xU5yHH7.clearFlags(i);
        }

        public final void KYHag8HRDlnO3X9zmZ(int i) {
            if (i == 1) {
                TCyPEKSzIyweCN5yp1(4);
                IPyIQcaNa8aB7drBED(1024);
            } else if (i == 2) {
                TCyPEKSzIyweCN5yp1(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f1915s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
            }
        }

        public void TCyPEKSzIyweCN5yp1(int i) {
            View decorView = this.f1914lEeR5KfoEr4xU5yHH7.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void husNiw3snxdgZPAGJm(int i) {
            this.f1914lEeR5KfoEr4xU5yHH7.addFlags(i);
        }

        public void zZKhbgvUfsK4AEX3r0(int i) {
            View decorView = this.f1914lEeR5KfoEr4xU5yHH7.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends lEeR5KfoEr4xU5yHH7 {
        public s3fjYDxWOUexjjVgyA(Window window, OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq) {
            super(window, oqIo5QF00RDxUQb4qq);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn.husNiw3snxdgZPAGJm
        public void s3fjYDxWOUexjjVgyA(boolean z) {
            if (!z) {
                TCyPEKSzIyweCN5yp1(8192);
                return;
            }
            IPyIQcaNa8aB7drBED(67108864);
            husNiw3snxdgZPAGJm(Integer.MIN_VALUE);
            zZKhbgvUfsK4AEX3r0(8192);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 extends husNiw3snxdgZPAGJm {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final OqIo5QF00RDxUQb4qq f1916HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public Window f1917husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final vlBaBOcZ1q1ndWVoXn f1918lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final WindowInsetsController f1919s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 f1920zZKhbgvUfsK4AEX3r0;

        public zZKhbgvUfsK4AEX3r0(Window window, vlBaBOcZ1q1ndWVoXn vlbabocz1q1ndwvoxn, OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq) {
            this(window.getInsetsController(), vlbabocz1q1ndwvoxn, oqIo5QF00RDxUQb4qq);
            this.f1917husNiw3snxdgZPAGJm = window;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn.husNiw3snxdgZPAGJm
        public void HJFh0TGMpafqLE9haL(int i) {
            if ((i & 8) != 0) {
                this.f1916HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            }
            this.f1919s3fjYDxWOUexjjVgyA.show(i & (-9));
        }

        public void husNiw3snxdgZPAGJm(int i) {
            View decorView = this.f1917husNiw3snxdgZPAGJm.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn.husNiw3snxdgZPAGJm
        public void lEeR5KfoEr4xU5yHH7(boolean z) {
            if (z) {
                if (this.f1917husNiw3snxdgZPAGJm != null) {
                    zZKhbgvUfsK4AEX3r0(16);
                }
                this.f1919s3fjYDxWOUexjjVgyA.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f1917husNiw3snxdgZPAGJm != null) {
                    husNiw3snxdgZPAGJm(16);
                }
                this.f1919s3fjYDxWOUexjjVgyA.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn.husNiw3snxdgZPAGJm
        public void s3fjYDxWOUexjjVgyA(boolean z) {
            if (z) {
                if (this.f1917husNiw3snxdgZPAGJm != null) {
                    zZKhbgvUfsK4AEX3r0(8192);
                }
                this.f1919s3fjYDxWOUexjjVgyA.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f1917husNiw3snxdgZPAGJm != null) {
                    husNiw3snxdgZPAGJm(8192);
                }
                this.f1919s3fjYDxWOUexjjVgyA.setSystemBarsAppearance(0, 8);
            }
        }

        public void zZKhbgvUfsK4AEX3r0(int i) {
            View decorView = this.f1917husNiw3snxdgZPAGJm.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public zZKhbgvUfsK4AEX3r0(WindowInsetsController windowInsetsController, vlBaBOcZ1q1ndWVoXn vlbabocz1q1ndwvoxn, OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq) {
            this.f1920zZKhbgvUfsK4AEX3r0 = new Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1();
            this.f1919s3fjYDxWOUexjjVgyA = windowInsetsController;
            this.f1918lEeR5KfoEr4xU5yHH7 = vlbabocz1q1ndwvoxn;
            this.f1916HJFh0TGMpafqLE9haL = oqIo5QF00RDxUQb4qq;
        }
    }

    public vlBaBOcZ1q1ndWVoXn(Window window, View view) {
        OqIo5QF00RDxUQb4qq oqIo5QF00RDxUQb4qq = new OqIo5QF00RDxUQb4qq(view);
        int i = Build.VERSION.SDK_INT;
        this.f1913lEeR5KfoEr4xU5yHH7 = i >= 30 ? new zZKhbgvUfsK4AEX3r0(window, this, oqIo5QF00RDxUQb4qq) : i >= 26 ? new HJFh0TGMpafqLE9haL(window, oqIo5QF00RDxUQb4qq) : new s3fjYDxWOUexjjVgyA(window, oqIo5QF00RDxUQb4qq);
    }

    public static vlBaBOcZ1q1ndWVoXn zZKhbgvUfsK4AEX3r0(WindowInsetsController windowInsetsController) {
        return new vlBaBOcZ1q1ndWVoXn(windowInsetsController);
    }

    public void HJFh0TGMpafqLE9haL(int i) {
        this.f1913lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(i);
    }

    public void lEeR5KfoEr4xU5yHH7(boolean z) {
        this.f1913lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(z);
    }

    public void s3fjYDxWOUexjjVgyA(boolean z) {
        this.f1913lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(z);
    }

    public vlBaBOcZ1q1ndWVoXn(WindowInsetsController windowInsetsController) {
        this.f1913lEeR5KfoEr4xU5yHH7 = new zZKhbgvUfsK4AEX3r0(windowInsetsController, this, new OqIo5QF00RDxUQb4qq(windowInsetsController));
    }

    public static class husNiw3snxdgZPAGJm {
        public abstract void HJFh0TGMpafqLE9haL(int i);

        public abstract void s3fjYDxWOUexjjVgyA(boolean z);

        public void lEeR5KfoEr4xU5yHH7(boolean z) {
        }
    }
}
