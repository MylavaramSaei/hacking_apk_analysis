package Tu4WCh2gEwj8E4oHbP;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 extends aAp6BD79BhftLCnuvf {

    public class lEeR5KfoEr4xU5yHH7 extends T9PhQIpGRhE4yZDm1C {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ View f1789lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(View view) {
            this.f1789lEeR5KfoEr4xU5yHH7 = view;
        }

        @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ
        public void lEeR5KfoEr4xU5yHH7(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
            THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1(this.f1789lEeR5KfoEr4xU5yHH7, 1.0f);
            THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7(this.f1789lEeR5KfoEr4xU5yHH7);
            e54j8uwnhwalqnixxm.ToH8yzk8U1nKT0PUfY(this);
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends AnimatorListenerAdapter {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final View f1791lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f1792s3fjYDxWOUexjjVgyA = false;

        public s3fjYDxWOUexjjVgyA(View view) {
            this.f1791lEeR5KfoEr4xU5yHH7 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1(this.f1791lEeR5KfoEr4xU5yHH7, 1.0f);
            if (this.f1792s3fjYDxWOUexjjVgyA) {
                this.f1791lEeR5KfoEr4xU5yHH7.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.e2F9F6h8YJxTHwLCa0(this.f1791lEeR5KfoEr4xU5yHH7) && this.f1791lEeR5KfoEr4xU5yHH7.getLayerType() == 0) {
                this.f1792s3fjYDxWOUexjjVgyA = true;
                this.f1791lEeR5KfoEr4xU5yHH7.setLayerType(2, null);
            }
        }
    }

    public zZKhbgvUfsK4AEX3r0() {
    }

    public static float eWK41qw3g36LVd4UnS(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, float f) {
        Float f2;
        return (y43RdunnpKgpbny0lE == null || (f2 = (Float) y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // Tu4WCh2gEwj8E4oHbP.aAp6BD79BhftLCnuvf, Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM
    public void Acstmh57AKoSEkEFNJ(Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        super.Acstmh57AKoSEkEFNJ(y43RdunnpKgpbny0lE);
        y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7.put("android:fade:transitionAlpha", Float.valueOf(THTDvPxsHqMeGb512f.HJFh0TGMpafqLE9haL(y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA)));
    }

    @Override // Tu4WCh2gEwj8E4oHbP.aAp6BD79BhftLCnuvf
    public Animator Kh0uC90qEEhuLdpgB9(ViewGroup viewGroup, View view, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2) {
        float fEWK41qw3g36LVd4UnS = eWK41qw3g36LVd4UnS(y43RdunnpKgpbny0lE, 0.0f);
        return zXY7dgnTfw9Pd9RXel(view, fEWK41qw3g36LVd4UnS != 1.0f ? fEWK41qw3g36LVd4UnS : 0.0f, 1.0f);
    }

    @Override // Tu4WCh2gEwj8E4oHbP.aAp6BD79BhftLCnuvf
    public Animator ctWLFN70QQINH1kyYo(ViewGroup viewGroup, View view, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE2) {
        THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm(view);
        return zXY7dgnTfw9Pd9RXel(view, eWK41qw3g36LVd4UnS(y43RdunnpKgpbny0lE, 1.0f), 0.0f);
    }

    public final Animator zXY7dgnTfw9Pd9RXel(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        THTDvPxsHqMeGb512f.TCyPEKSzIyweCN5yp1(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) THTDvPxsHqMeGb512f.f1692s3fjYDxWOUexjjVgyA, f2);
        objectAnimatorOfFloat.addListener(new s3fjYDxWOUexjjVgyA(view));
        lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7(view));
        return objectAnimatorOfFloat;
    }

    public zZKhbgvUfsK4AEX3r0(int i) {
        jocVUfxESVhVJU8LoH(i);
    }
}
