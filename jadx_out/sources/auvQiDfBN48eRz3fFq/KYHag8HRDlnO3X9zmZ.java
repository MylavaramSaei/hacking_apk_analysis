package auvQiDfBN48eRz3fFq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public class KYHag8HRDlnO3X9zmZ extends Y43RdunnpKgpbny0lE {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final View.OnClickListener f4423Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final TimeInterpolator f4424IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int f4425KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public ValueAnimator f4426T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final TimeInterpolator f4427TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final View.OnFocusChangeListener f4428Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public AnimatorSet f4429e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f4430husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public EditText f4431pbVGzGjWvY2LDXC8vo;

    public class lEeR5KfoEr4xU5yHH7 extends AnimatorListenerAdapter {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            KYHag8HRDlnO3X9zmZ.this.f4449s3fjYDxWOUexjjVgyA.CSih7GetOUab1dYQjM(true);
        }
    }

    public class s3fjYDxWOUexjjVgyA extends AnimatorListenerAdapter {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            KYHag8HRDlnO3X9zmZ.this.f4449s3fjYDxWOUexjjVgyA.CSih7GetOUab1dYQjM(false);
        }
    }

    public KYHag8HRDlnO3X9zmZ(com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        super(leer5kfoer4xu5yhh7);
        this.f4423Acstmh57AKoSEkEFNJ = new View.OnClickListener() { // from class: auvQiDfBN48eRz3fFq.lEeR5KfoEr4xU5yHH7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4456lEeR5KfoEr4xU5yHH7.W3RZ2dTDKrKpS5Mxdk(view);
            }
        };
        this.f4428Z9WdNiOsPR0y54zHW4 = new View.OnFocusChangeListener() { // from class: auvQiDfBN48eRz3fFq.s3fjYDxWOUexjjVgyA
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f4457lEeR5KfoEr4xU5yHH7.OqIo5QF00RDxUQb4qq(view, z);
            }
        };
        this.f4430husNiw3snxdgZPAGJm = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7132LIMtzhnLwQyigzK0KO, 100);
        this.f4425KYHag8HRDlnO3X9zmZ = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7132LIMtzhnLwQyigzK0KO, 150);
        this.f4427TCyPEKSzIyweCN5yp1 = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7138THTDvPxsHqMeGb512f, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6197lEeR5KfoEr4xU5yHH7);
        this.f4424IPyIQcaNa8aB7drBED = fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(leer5kfoer4xu5yhh7.getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7141WWC27LAMFqFFBzfbNw, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6199zZKhbgvUfsK4AEX3r0);
    }

    public final boolean DfpieXfdYs58yZAiXY() {
        EditText editText = this.f4431pbVGzGjWvY2LDXC8vo;
        return editText != null && (editText.hasFocus() || this.f4450zZKhbgvUfsK4AEX3r0.hasFocus()) && this.f4431pbVGzGjWvY2LDXC8vo.getText().length() > 0;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void G7AC3DWIx9i9fdanjk() {
        EditText editText = this.f4431pbVGzGjWvY2LDXC8vo;
        if (editText != null) {
            editText.post(new Runnable() { // from class: auvQiDfBN48eRz3fFq.zZKhbgvUfsK4AEX3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4459lEeR5KfoEr4xU5yHH7.GyWRxpdt1T8mEJXPoD();
                }
            });
        }
    }

    public final /* synthetic */ void GyWRxpdt1T8mEJXPoD() {
        THTDvPxsHqMeGb512f(true);
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public int HJFh0TGMpafqLE9haL() {
        return tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED.f7062husNiw3snxdgZPAGJm;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public View.OnClickListener KYHag8HRDlnO3X9zmZ() {
        return this.f4423Acstmh57AKoSEkEFNJ;
    }

    public final ValueAnimator OUd9THiLjZndMj0qdF() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f4424IPyIQcaNa8aB7drBED);
        valueAnimatorOfFloat.setDuration(this.f4425KYHag8HRDlnO3X9zmZ);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: auvQiDfBN48eRz3fFq.husNiw3snxdgZPAGJm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4455lEeR5KfoEr4xU5yHH7.tXWeW0sqVddf7ZBflq(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final /* synthetic */ void OqIo5QF00RDxUQb4qq(View view, boolean z) {
        THTDvPxsHqMeGb512f(DfpieXfdYs58yZAiXY());
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public View.OnFocusChangeListener TCyPEKSzIyweCN5yp1() {
        return this.f4428Z9WdNiOsPR0y54zHW4;
    }

    public final void THTDvPxsHqMeGb512f(boolean z) {
        boolean z2 = this.f4449s3fjYDxWOUexjjVgyA.tXWeW0sqVddf7ZBflq() == z;
        if (z && !this.f4429e54J8UWNHWALQNixXM.isRunning()) {
            this.f4426T9PhQIpGRhE4yZDm1C.cancel();
            this.f4429e54J8UWNHWALQNixXM.start();
            if (z2) {
                this.f4429e54J8UWNHWALQNixXM.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f4429e54J8UWNHWALQNixXM.cancel();
        this.f4426T9PhQIpGRhE4yZDm1C.start();
        if (z2) {
            this.f4426T9PhQIpGRhE4yZDm1C.end();
        }
    }

    public final /* synthetic */ void W3RZ2dTDKrKpS5Mxdk(View view) {
        EditText editText = this.f4431pbVGzGjWvY2LDXC8vo;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        sTkWmhpZ5b1ArQIw4K();
    }

    public final /* synthetic */ void XzJ1BS7H9Ilbkv4eVM(ValueAnimator valueAnimator) {
        this.f4450zZKhbgvUfsK4AEX3r0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void Y43RdunnpKgpbny0lE() {
        jCtUeU2YI1poCxWcjm();
    }

    public final ValueAnimator ao3wqKm5CXFuvC0q47(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f4427TCyPEKSzIyweCN5yp1);
        valueAnimatorOfFloat.setDuration(this.f4430husNiw3snxdgZPAGJm);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: auvQiDfBN48eRz3fFq.HJFh0TGMpafqLE9haL
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4420lEeR5KfoEr4xU5yHH7.XzJ1BS7H9Ilbkv4eVM(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void hoXrIDAFrSwfShk8da(EditText editText) {
        this.f4431pbVGzGjWvY2LDXC8vo = editText;
        this.f4448lEeR5KfoEr4xU5yHH7.setEndIconVisible(DfpieXfdYs58yZAiXY());
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public View.OnFocusChangeListener husNiw3snxdgZPAGJm() {
        return this.f4428Z9WdNiOsPR0y54zHW4;
    }

    public final void jCtUeU2YI1poCxWcjm() {
        ValueAnimator valueAnimatorOUd9THiLjZndMj0qdF = OUd9THiLjZndMj0qdF();
        ValueAnimator valueAnimatorAo3wqKm5CXFuvC0q47 = ao3wqKm5CXFuvC0q47(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4429e54J8UWNHWALQNixXM = animatorSet;
        animatorSet.playTogether(valueAnimatorOUd9THiLjZndMj0qdF, valueAnimatorAo3wqKm5CXFuvC0q47);
        this.f4429e54J8UWNHWALQNixXM.addListener(new lEeR5KfoEr4xU5yHH7());
        ValueAnimator valueAnimatorAo3wqKm5CXFuvC0q472 = ao3wqKm5CXFuvC0q47(1.0f, 0.0f);
        this.f4426T9PhQIpGRhE4yZDm1C = valueAnimatorAo3wqKm5CXFuvC0q472;
        valueAnimatorAo3wqKm5CXFuvC0q472.addListener(new s3fjYDxWOUexjjVgyA());
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void lEeR5KfoEr4xU5yHH7(Editable editable) {
        if (this.f4449s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO() != null) {
            return;
        }
        THTDvPxsHqMeGb512f(DfpieXfdYs58yZAiXY());
    }

    public final /* synthetic */ void tXWeW0sqVddf7ZBflq(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f4450zZKhbgvUfsK4AEX3r0.setScaleX(fFloatValue);
        this.f4450zZKhbgvUfsK4AEX3r0.setScaleY(fFloatValue);
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public int zZKhbgvUfsK4AEX3r0() {
        return tmIBXGVvBsrJ7i63G2.zZKhbgvUfsK4AEX3r0.f7178KYHag8HRDlnO3X9zmZ;
    }

    @Override // auvQiDfBN48eRz3fFq.Y43RdunnpKgpbny0lE
    public void zaq8hOURtfwbcX17cG(boolean z) {
        if (this.f4449s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO() == null) {
            return;
        }
        THTDvPxsHqMeGb512f(z);
    }
}
