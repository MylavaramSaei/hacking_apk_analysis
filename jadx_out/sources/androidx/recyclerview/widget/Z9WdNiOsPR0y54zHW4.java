package androidx.recyclerview.widget;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import OqIo5QF00RDxUQb4qq.VItLRw50eXTZeEfGl0;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f4282husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final RecyclerView f4283zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public Map f4284husNiw3snxdgZPAGJm = new WeakHashMap();

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final Z9WdNiOsPR0y54zHW4 f4285zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            this.f4285zZKhbgvUfsK4AEX3r0 = z9WdNiOsPR0y54zHW4;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public boolean Acstmh57AKoSEkEFNJ(View view, int i, Bundle bundle) {
            if (this.f4285zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls() || this.f4285zZKhbgvUfsK4AEX3r0.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager() == null) {
                return super.Acstmh57AKoSEkEFNJ(view, i, bundle);
            }
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            if (leer5kfoer4xu5yhh7 != null) {
                if (leer5kfoer4xu5yhh7.Acstmh57AKoSEkEFNJ(view, i, bundle)) {
                    return true;
                }
            } else if (super.Acstmh57AKoSEkEFNJ(view, i, bundle)) {
                return true;
            }
            return this.f4285zZKhbgvUfsK4AEX3r0.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager().R6kEk3zZuOluTikhN3(view, i, bundle);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void IPyIQcaNa8aB7drBED(View view, AccessibilityEvent accessibilityEvent) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.IPyIQcaNa8aB7drBED(view, accessibilityEvent);
            } else {
                super.IPyIQcaNa8aB7drBED(view, accessibilityEvent);
            }
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void KYHag8HRDlnO3X9zmZ(View view, AccessibilityEvent accessibilityEvent) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.KYHag8HRDlnO3X9zmZ(view, accessibilityEvent);
            } else {
                super.KYHag8HRDlnO3X9zmZ(view, accessibilityEvent);
            }
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void T9PhQIpGRhE4yZDm1C(View view, AccessibilityEvent accessibilityEvent) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.T9PhQIpGRhE4yZDm1C(view, accessibilityEvent);
            } else {
                super.T9PhQIpGRhE4yZDm1C(view, accessibilityEvent);
            }
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            if (!this.f4285zZKhbgvUfsK4AEX3r0.aPyGSIylzVNKPT1Bls() && this.f4285zZKhbgvUfsK4AEX3r0.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager() != null) {
                this.f4285zZKhbgvUfsK4AEX3r0.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager().tmIBXGVvBsrJ7i63G2(view, a49QRPHynYLCBN0SqP);
                W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
                if (leer5kfoer4xu5yhh7 != null) {
                    leer5kfoer4xu5yhh7.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
                    return;
                }
            }
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
        }

        public void aPyGSIylzVNKPT1Bls(View view) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo = lLKzvdU99Iw80uVD5I.pbVGzGjWvY2LDXC8vo(view);
            if (leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo == null || leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo == this) {
                return;
            }
            this.f4284husNiw3snxdgZPAGJm.put(view, leer5kfoer4xu5yhh7PbVGzGjWvY2LDXC8vo);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void e54J8UWNHWALQNixXM(View view, int i) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            if (leer5kfoer4xu5yhh7 != null) {
                leer5kfoer4xu5yhh7.e54J8UWNHWALQNixXM(view, i);
            } else {
                super.e54J8UWNHWALQNixXM(view, i);
            }
        }

        public W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 hoXrIDAFrSwfShk8da(View view) {
            return (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.remove(view);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public boolean lEeR5KfoEr4xU5yHH7(View view, AccessibilityEvent accessibilityEvent) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            return leer5kfoer4xu5yhh7 != null ? leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(view, accessibilityEvent) : super.lEeR5KfoEr4xU5yHH7(view, accessibilityEvent);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public boolean pbVGzGjWvY2LDXC8vo(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(viewGroup);
            return leer5kfoer4xu5yhh7 != null ? leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo(viewGroup, view, accessibilityEvent) : super.pbVGzGjWvY2LDXC8vo(viewGroup, view, accessibilityEvent);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public VItLRw50eXTZeEfGl0 s3fjYDxWOUexjjVgyA(View view) {
            W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7) this.f4284husNiw3snxdgZPAGJm.get(view);
            return leer5kfoer4xu5yhh7 != null ? leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(view) : super.s3fjYDxWOUexjjVgyA(view);
        }
    }

    public Z9WdNiOsPR0y54zHW4(RecyclerView recyclerView) {
        this.f4283zZKhbgvUfsK4AEX3r0 = recyclerView;
        W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da();
        this.f4282husNiw3snxdgZPAGJm = (leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da == null || !(leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da instanceof lEeR5KfoEr4xU5yHH7)) ? new lEeR5KfoEr4xU5yHH7(this) : (lEeR5KfoEr4xU5yHH7) leer5kfoer4xu5yhh7HoXrIDAFrSwfShk8da;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
    public boolean Acstmh57AKoSEkEFNJ(View view, int i, Bundle bundle) {
        if (super.Acstmh57AKoSEkEFNJ(view, i, bundle)) {
            return true;
        }
        if (aPyGSIylzVNKPT1Bls() || this.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager() == null) {
            return false;
        }
        return this.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager().lBAL39rPf03qYLFNNP(i, bundle);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
    public void KYHag8HRDlnO3X9zmZ(View view, AccessibilityEvent accessibilityEvent) {
        super.KYHag8HRDlnO3X9zmZ(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || aPyGSIylzVNKPT1Bls()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().QW0Trt6m3nVBNaYFnP(accessibilityEvent);
        }
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
    public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
        super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
        if (aPyGSIylzVNKPT1Bls() || this.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager() == null) {
            return;
        }
        this.f4283zZKhbgvUfsK4AEX3r0.getLayoutManager().e5tXAuLbtMC3XyEoX9(a49QRPHynYLCBN0SqP);
    }

    public boolean aPyGSIylzVNKPT1Bls() {
        return this.f4283zZKhbgvUfsK4AEX3r0.eWK41qw3g36LVd4UnS();
    }

    public W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 hoXrIDAFrSwfShk8da() {
        return this.f4282husNiw3snxdgZPAGJm;
    }
}
