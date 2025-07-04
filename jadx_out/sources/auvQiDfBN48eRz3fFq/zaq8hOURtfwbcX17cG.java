package auvQiDfBN48eRz3fFq;

import OqIo5QF00RDxUQb4qq.HJFh0TGMpafqLE9haL;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* loaded from: classes.dex */
public class zaq8hOURtfwbcX17cG extends Y43RdunnpKgpbny0lE {

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public static final boolean f4460Y43RdunnpKgpbny0lE = true;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final View.OnFocusChangeListener f4461Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public AutoCompleteTextView f4462IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int f4463KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public AccessibilityManager f4464OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f4465T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final TimeInterpolator f4466TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7 f4467Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public long f4468aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f4469e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public boolean f4470hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f4471husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final View.OnClickListener f4472pbVGzGjWvY2LDXC8vo;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public ValueAnimator f4473sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public ValueAnimator f4474zaq8hOURtfwbcX17cG;

    public class lEeR5KfoEr4xU5yHH7 extends AnimatorListenerAdapter {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zaq8hOURtfwbcX17cG.this.sTkWmhpZ5b1ArQIw4K();
            zaq8hOURtfwbcX17cG.this.f4473sTkWmhpZ5b1ArQIw4K.start();
        }
    }

    public zaq8hOURtfwbcX17cG(com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        super(leer5kfoer4xu5yhh7);
        this.f4472pbVGzGjWvY2LDXC8vo = new View.OnClickListener() { // from class: auvQiDfBN48eRz3fFq.T9PhQIpGRhE4yZDm1C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4436lEeR5KfoEr4xU5yHH7.DfpieXfdYs58yZAiXY(view);
            }
        };
        this.f4461Acstmh57AKoSEkEFNJ = new View.OnFocusChangeListener() { // from class: auvQiDfBN48eRz3fFq.hoXrIDAFrSwfShk8da
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f4454lEeR5KfoEr4xU5yHH7.e2F9F6h8YJxTHwLCa0(view, z);
            }
        };
        this.f4467Z9WdNiOsPR0y54zHW4 = new HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7() { // from class: auvQiDfBN48eRz3fFq.aPyGSIylzVNKPT1Bls
            @Override // OqIo5QF00RDxUQb4qq.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f4452lEeR5KfoEr4xU5yHH7.KqgKJKIWne3kz1AdHk(z);
            }
        };
        this.f4468aPyGSIylzVNKPT1Bls = Long.MAX_VALUE;
        this.f4463KYHag8HRDlnO3X9zmZ = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7132LIMtzhnLwQyigzK0KO, 67);
        this.f4471husNiw3snxdgZPAGJm = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7132LIMtzhnLwQyigzK0KO, 50);
        this.f4466TCyPEKSzIyweCN5yp1 = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7138THTDvPxsHqMeGb512f, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6197lEeR5KfoEr4xU5yHH7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void DfpieXfdYs58yZAiXY(View view) {
        XdzLv4NdAtTYoEzVzB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2F9F6h8YJxTHwLCa0(View view, boolean z) {
        this.f4469e54J8UWNHWALQNixXM = z;
        sTkWmhpZ5b1ArQIw4K();
        if (z) {
            return;
        }
        lLKzvdU99Iw80uVD5I(false);
        this.f4465T9PhQIpGRhE4yZDm1C = false;
    }

    public static AutoCompleteTextView jCtUeU2YI1poCxWcjm(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void tXWeW0sqVddf7ZBflq() {
        this.f4473sTkWmhpZ5b1ArQIw4K = XzJ1BS7H9Ilbkv4eVM(this.f4463KYHag8HRDlnO3X9zmZ, 0.0f, 1.0f);
        ValueAnimator valueAnimatorXzJ1BS7H9Ilbkv4eVM = XzJ1BS7H9Ilbkv4eVM(this.f4471husNiw3snxdgZPAGJm, 1.0f, 0.0f);
        this.f4474zaq8hOURtfwbcX17cG = valueAnimatorXzJ1BS7H9Ilbkv4eVM;
        valueAnimatorXzJ1BS7H9Ilbkv4eVM.addListener(new lEeR5KfoEr4xU5yHH7());
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean Acstmh57AKoSEkEFNJ() {
        return true;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void G7AC3DWIx9i9fdanjk() {
        AutoCompleteTextView autoCompleteTextView = this.f4462IPyIQcaNa8aB7drBED;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f4460Y43RdunnpKgpbny0lE) {
                this.f4462IPyIQcaNa8aB7drBED.setOnDismissListener(null);
            }
        }
    }

    public final /* synthetic */ void GyWRxpdt1T8mEJXPoD(ValueAnimator valueAnimator) {
        this.f4450zZKhbgvUfsK4AEX3r0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public int HJFh0TGMpafqLE9haL() {
        return tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7056TCyPEKSzIyweCN5yp1;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7 IPyIQcaNa8aB7drBED() {
        return this.f4467Z9WdNiOsPR0y54zHW4;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public View.OnClickListener KYHag8HRDlnO3X9zmZ() {
        return this.f4472pbVGzGjWvY2LDXC8vo;
    }

    public final /* synthetic */ void KqgKJKIWne3kz1AdHk(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.f4462IPyIQcaNa8aB7drBED;
        if (autoCompleteTextView == null || sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(autoCompleteTextView)) {
            return;
        }
        lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this.f4450zZKhbgvUfsK4AEX3r0, z ? 2 : 1);
    }

    public final void LU0fFDMACqnfIfA1AZ() {
        this.f4465T9PhQIpGRhE4yZDm1C = true;
        this.f4468aPyGSIylzVNKPT1Bls = System.currentTimeMillis();
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void OANkd3mP6AYvwbNLJM(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f4464OANkd3mP6AYvwbNLJM.isEnabled() || sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(this.f4462IPyIQcaNa8aB7drBED)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.f4470hoXrIDAFrSwfShk8da && !this.f4462IPyIQcaNa8aB7drBED.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            XdzLv4NdAtTYoEzVzB();
            LU0fFDMACqnfIfA1AZ();
        }
    }

    public final /* synthetic */ void OqIo5QF00RDxUQb4qq() {
        boolean zIsPopupShowing = this.f4462IPyIQcaNa8aB7drBED.isPopupShowing();
        lLKzvdU99Iw80uVD5I(zIsPopupShowing);
        this.f4465T9PhQIpGRhE4yZDm1C = zIsPopupShowing;
    }

    public final /* synthetic */ boolean PPkm9uUfOJHHYveeLT(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (W3RZ2dTDKrKpS5Mxdk()) {
                this.f4465T9PhQIpGRhE4yZDm1C = false;
            }
            XdzLv4NdAtTYoEzVzB();
            LU0fFDMACqnfIfA1AZ();
        }
        return false;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean R9SAhYMerGybF9OAjL() {
        return true;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean T9PhQIpGRhE4yZDm1C() {
        return this.f4470hoXrIDAFrSwfShk8da;
    }

    public final void ToH8yzk8U1nKT0PUfY() {
        this.f4462IPyIQcaNa8aB7drBED.setOnTouchListener(new View.OnTouchListener() { // from class: auvQiDfBN48eRz3fFq.Z9WdNiOsPR0y54zHW4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f4451lEeR5KfoEr4xU5yHH7.PPkm9uUfOJHHYveeLT(view, motionEvent);
            }
        });
        if (f4460Y43RdunnpKgpbny0lE) {
            this.f4462IPyIQcaNa8aB7drBED.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: auvQiDfBN48eRz3fFq.e54J8UWNHWALQNixXM
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.f4453lEeR5KfoEr4xU5yHH7.aAp6BD79BhftLCnuvf();
                }
            });
        }
        this.f4462IPyIQcaNa8aB7drBED.setThreshold(0);
    }

    public final boolean W3RZ2dTDKrKpS5Mxdk() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4468aPyGSIylzVNKPT1Bls;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void XdzLv4NdAtTYoEzVzB() {
        if (this.f4462IPyIQcaNa8aB7drBED == null) {
            return;
        }
        if (W3RZ2dTDKrKpS5Mxdk()) {
            this.f4465T9PhQIpGRhE4yZDm1C = false;
        }
        if (this.f4465T9PhQIpGRhE4yZDm1C) {
            this.f4465T9PhQIpGRhE4yZDm1C = false;
            return;
        }
        if (f4460Y43RdunnpKgpbny0lE) {
            lLKzvdU99Iw80uVD5I(!this.f4470hoXrIDAFrSwfShk8da);
        } else {
            this.f4470hoXrIDAFrSwfShk8da = !this.f4470hoXrIDAFrSwfShk8da;
            sTkWmhpZ5b1ArQIw4K();
        }
        if (!this.f4470hoXrIDAFrSwfShk8da) {
            this.f4462IPyIQcaNa8aB7drBED.dismissDropDown();
        } else {
            this.f4462IPyIQcaNa8aB7drBED.requestFocus();
            this.f4462IPyIQcaNa8aB7drBED.showDropDown();
        }
    }

    public final ValueAnimator XzJ1BS7H9Ilbkv4eVM(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f4466TCyPEKSzIyweCN5yp1);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: auvQiDfBN48eRz3fFq.Acstmh57AKoSEkEFNJ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4385lEeR5KfoEr4xU5yHH7.GyWRxpdt1T8mEJXPoD(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void Y43RdunnpKgpbny0lE() {
        tXWeW0sqVddf7ZBflq();
        this.f4464OANkd3mP6AYvwbNLJM = (AccessibilityManager) this.f4447HJFh0TGMpafqLE9haL.getSystemService("accessibility");
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean Z9WdNiOsPR0y54zHW4() {
        return this.f4469e54J8UWNHWALQNixXM;
    }

    public final /* synthetic */ void aAp6BD79BhftLCnuvf() {
        LU0fFDMACqnfIfA1AZ();
        lLKzvdU99Iw80uVD5I(false);
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void aPyGSIylzVNKPT1Bls(View view, OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
        if (!sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(this.f4462IPyIQcaNa8aB7drBED)) {
            a49QRPHynYLCBN0SqP.zXY7dgnTfw9Pd9RXel(Spinner.class.getName());
        }
        if (a49QRPHynYLCBN0SqP.oocVJL811qFf0j0XXZ()) {
            a49QRPHynYLCBN0SqP.yvdWWG9COQQotjfedH(null);
        }
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean e54J8UWNHWALQNixXM() {
        return true;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void hoXrIDAFrSwfShk8da(EditText editText) {
        this.f4462IPyIQcaNa8aB7drBED = jCtUeU2YI1poCxWcjm(editText);
        ToH8yzk8U1nKT0PUfY();
        this.f4448lEeR5KfoEr4xU5yHH7.setErrorIconDrawable((Drawable) null);
        if (!sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(editText) && this.f4464OANkd3mP6AYvwbNLJM.isTouchExplorationEnabled()) {
            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this.f4450zZKhbgvUfsK4AEX3r0, 2);
        }
        this.f4448lEeR5KfoEr4xU5yHH7.setEndIconVisible(true);
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public View.OnFocusChangeListener husNiw3snxdgZPAGJm() {
        return this.f4461Acstmh57AKoSEkEFNJ;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void lEeR5KfoEr4xU5yHH7(Editable editable) {
        if (this.f4464OANkd3mP6AYvwbNLJM.isTouchExplorationEnabled() && sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(this.f4462IPyIQcaNa8aB7drBED) && !this.f4450zZKhbgvUfsK4AEX3r0.hasFocus()) {
            this.f4462IPyIQcaNa8aB7drBED.dismissDropDown();
        }
        this.f4462IPyIQcaNa8aB7drBED.post(new Runnable() { // from class: auvQiDfBN48eRz3fFq.OANkd3mP6AYvwbNLJM
            @Override // java.lang.Runnable
            public final void run() {
                this.f4435lEeR5KfoEr4xU5yHH7.OqIo5QF00RDxUQb4qq();
            }
        });
    }

    public final void lLKzvdU99Iw80uVD5I(boolean z) {
        if (this.f4470hoXrIDAFrSwfShk8da != z) {
            this.f4470hoXrIDAFrSwfShk8da = z;
            this.f4473sTkWmhpZ5b1ArQIw4K.cancel();
            this.f4474zaq8hOURtfwbcX17cG.start();
        }
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public boolean pbVGzGjWvY2LDXC8vo(int i) {
        return i != 0;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public int zZKhbgvUfsK4AEX3r0() {
        return f4460Y43RdunnpKgpbny0lE ? tmIBXGVvBsrJ7i63G2.zZKhbgvUfsK4AEX3r0.f7183zZKhbgvUfsK4AEX3r0 : tmIBXGVvBsrJ7i63G2.zZKhbgvUfsK4AEX3r0.f7180husNiw3snxdgZPAGJm;
    }
}
