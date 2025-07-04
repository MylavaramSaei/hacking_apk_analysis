package IPyIQcaNa8aB7drBED;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public class YlLW4G6OV9TFyuw5ix implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static YlLW4G6OV9TFyuw5ix f643Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static YlLW4G6OV9TFyuw5ix f644e54J8UWNHWALQNixXM;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f645Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f646HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public oocVJL811qFf0j0XXZ f647IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f648KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f649TCyPEKSzIyweCN5yp1;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final View f651lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f652pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final CharSequence f653s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final Runnable f654zZKhbgvUfsK4AEX3r0 = new Runnable() { // from class: IPyIQcaNa8aB7drBED.LU0fFDMACqnfIfA1AZ
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f518lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm();
        }
    };

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Runnable f650husNiw3snxdgZPAGJm = new Runnable() { // from class: IPyIQcaNa8aB7drBED.zcy2NNbtVXgoGQbfuq
        @Override // java.lang.Runnable
        public final void run() {
            this.f730lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
        }
    };

    public YlLW4G6OV9TFyuw5ix(View view, CharSequence charSequence) {
        this.f651lEeR5KfoEr4xU5yHH7 = view;
        this.f653s3fjYDxWOUexjjVgyA = charSequence;
        this.f646HJFh0TGMpafqLE9haL = W3RZ2dTDKrKpS5Mxdk.zcy2NNbtVXgoGQbfuq.TCyPEKSzIyweCN5yp1(ViewConfiguration.get(view.getContext()));
        HJFh0TGMpafqLE9haL();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void IPyIQcaNa8aB7drBED(View view, CharSequence charSequence) {
        YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix = f643Z9WdNiOsPR0y54zHW4;
        if (ylLW4G6OV9TFyuw5ix != null && ylLW4G6OV9TFyuw5ix.f651lEeR5KfoEr4xU5yHH7 == view) {
            TCyPEKSzIyweCN5yp1(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new YlLW4G6OV9TFyuw5ix(view, charSequence);
            return;
        }
        YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix2 = f644e54J8UWNHWALQNixXM;
        if (ylLW4G6OV9TFyuw5ix2 != null && ylLW4G6OV9TFyuw5ix2.f651lEeR5KfoEr4xU5yHH7 == view) {
            ylLW4G6OV9TFyuw5ix2.zZKhbgvUfsK4AEX3r0();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void TCyPEKSzIyweCN5yp1(YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix) {
        YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix2 = f643Z9WdNiOsPR0y54zHW4;
        if (ylLW4G6OV9TFyuw5ix2 != null) {
            ylLW4G6OV9TFyuw5ix2.s3fjYDxWOUexjjVgyA();
        }
        f643Z9WdNiOsPR0y54zHW4 = ylLW4G6OV9TFyuw5ix;
        if (ylLW4G6OV9TFyuw5ix != null) {
            ylLW4G6OV9TFyuw5ix.KYHag8HRDlnO3X9zmZ();
        }
    }

    public final boolean Acstmh57AKoSEkEFNJ(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f645Acstmh57AKoSEkEFNJ && Math.abs(x - this.f648KYHag8HRDlnO3X9zmZ) <= this.f646HJFh0TGMpafqLE9haL && Math.abs(y - this.f649TCyPEKSzIyweCN5yp1) <= this.f646HJFh0TGMpafqLE9haL) {
            return false;
        }
        this.f648KYHag8HRDlnO3X9zmZ = x;
        this.f649TCyPEKSzIyweCN5yp1 = y;
        this.f645Acstmh57AKoSEkEFNJ = false;
        return true;
    }

    public final void HJFh0TGMpafqLE9haL() {
        this.f645Acstmh57AKoSEkEFNJ = true;
    }

    public final void KYHag8HRDlnO3X9zmZ() {
        this.f651lEeR5KfoEr4xU5yHH7.postDelayed(this.f654zZKhbgvUfsK4AEX3r0, ViewConfiguration.getLongPressTimeout());
    }

    public final /* synthetic */ void husNiw3snxdgZPAGJm() throws Resources.NotFoundException {
        pbVGzGjWvY2LDXC8vo(false);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f647IPyIQcaNa8aB7drBED != null && this.f652pbVGzGjWvY2LDXC8vo) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f651lEeR5KfoEr4xU5yHH7.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                HJFh0TGMpafqLE9haL();
                zZKhbgvUfsK4AEX3r0();
            }
        } else if (this.f651lEeR5KfoEr4xU5yHH7.isEnabled() && this.f647IPyIQcaNa8aB7drBED == null && Acstmh57AKoSEkEFNJ(motionEvent)) {
            TCyPEKSzIyweCN5yp1(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f648KYHag8HRDlnO3X9zmZ = view.getWidth() / 2;
        this.f649TCyPEKSzIyweCN5yp1 = view.getHeight() / 2;
        pbVGzGjWvY2LDXC8vo(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        zZKhbgvUfsK4AEX3r0();
    }

    public void pbVGzGjWvY2LDXC8vo(boolean z) throws Resources.NotFoundException {
        long longPressTimeout;
        long j;
        long j2;
        if (this.f651lEeR5KfoEr4xU5yHH7.isAttachedToWindow()) {
            TCyPEKSzIyweCN5yp1(null);
            YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix = f644e54J8UWNHWALQNixXM;
            if (ylLW4G6OV9TFyuw5ix != null) {
                ylLW4G6OV9TFyuw5ix.zZKhbgvUfsK4AEX3r0();
            }
            f644e54J8UWNHWALQNixXM = this;
            this.f652pbVGzGjWvY2LDXC8vo = z;
            oocVJL811qFf0j0XXZ oocvjl811qff0j0xxz = new oocVJL811qFf0j0XXZ(this.f651lEeR5KfoEr4xU5yHH7.getContext());
            this.f647IPyIQcaNa8aB7drBED = oocvjl811qff0j0xxz;
            oocvjl811qff0j0xxz.husNiw3snxdgZPAGJm(this.f651lEeR5KfoEr4xU5yHH7, this.f648KYHag8HRDlnO3X9zmZ, this.f649TCyPEKSzIyweCN5yp1, this.f652pbVGzGjWvY2LDXC8vo, this.f653s3fjYDxWOUexjjVgyA);
            this.f651lEeR5KfoEr4xU5yHH7.addOnAttachStateChangeListener(this);
            if (this.f652pbVGzGjWvY2LDXC8vo) {
                j2 = 2500;
            } else {
                if ((W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.OqIo5QF00RDxUQb4qq(this.f651lEeR5KfoEr4xU5yHH7) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.f651lEeR5KfoEr4xU5yHH7.removeCallbacks(this.f650husNiw3snxdgZPAGJm);
            this.f651lEeR5KfoEr4xU5yHH7.postDelayed(this.f650husNiw3snxdgZPAGJm, j2);
        }
    }

    public final void s3fjYDxWOUexjjVgyA() {
        this.f651lEeR5KfoEr4xU5yHH7.removeCallbacks(this.f654zZKhbgvUfsK4AEX3r0);
    }

    public void zZKhbgvUfsK4AEX3r0() {
        if (f644e54J8UWNHWALQNixXM == this) {
            f644e54J8UWNHWALQNixXM = null;
            oocVJL811qFf0j0XXZ oocvjl811qff0j0xxz = this.f647IPyIQcaNa8aB7drBED;
            if (oocvjl811qff0j0xxz != null) {
                oocvjl811qff0j0xxz.HJFh0TGMpafqLE9haL();
                this.f647IPyIQcaNa8aB7drBED = null;
                HJFh0TGMpafqLE9haL();
                this.f651lEeR5KfoEr4xU5yHH7.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f643Z9WdNiOsPR0y54zHW4 == this) {
            TCyPEKSzIyweCN5yp1(null);
        }
        this.f651lEeR5KfoEr4xU5yHH7.removeCallbacks(this.f650husNiw3snxdgZPAGJm);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
