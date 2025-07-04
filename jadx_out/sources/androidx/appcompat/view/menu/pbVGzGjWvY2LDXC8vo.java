package androidx.appcompat.view.menu;

import IPyIQcaNa8aB7drBED.XzJ1BS7H9Ilbkv4eVM;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class pbVGzGjWvY2LDXC8vo extends TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, TCyPEKSzIyweCN5yp1, View.OnKeyListener {

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public static final int f2669xHA29AmDt6y96AnB3t = lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6228Acstmh57AKoSEkEFNJ;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public boolean f2671G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f2672HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final int f2673IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int f2674KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public ViewTreeObserver f2675OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public View f2677T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int f2678TCyPEKSzIyweCN5yp1;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int f2679Y43RdunnpKgpbny0lE;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f2681aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2682e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public View f2683hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final boolean f2684husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final XzJ1BS7H9Ilbkv4eVM f2685pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Context f2686s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public boolean f2687sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f2688zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f2689zaq8hOURtfwbcX17cG;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2670Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2680Z9WdNiOsPR0y54zHW4 = new s3fjYDxWOUexjjVgyA();

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public int f2676R9SAhYMerGybF9OAjL = 0;

    public class lEeR5KfoEr4xU5yHH7 implements ViewTreeObserver.OnGlobalLayoutListener {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!pbVGzGjWvY2LDXC8vo.this.KYHag8HRDlnO3X9zmZ() || pbVGzGjWvY2LDXC8vo.this.f2685pbVGzGjWvY2LDXC8vo.hoXrIDAFrSwfShk8da()) {
                return;
            }
            View view = pbVGzGjWvY2LDXC8vo.this.f2683hoXrIDAFrSwfShk8da;
            if (view == null || !view.isShown()) {
                pbVGzGjWvY2LDXC8vo.this.dismiss();
            } else {
                pbVGzGjWvY2LDXC8vo.this.f2685pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA();
            }
        }
    }

    public class s3fjYDxWOUexjjVgyA implements View.OnAttachStateChangeListener {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = pbVGzGjWvY2LDXC8vo.this.f2675OANkd3mP6AYvwbNLJM;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    pbVGzGjWvY2LDXC8vo.this.f2675OANkd3mP6AYvwbNLJM = view.getViewTreeObserver();
                }
                pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = pbVGzGjWvY2LDXC8vo.this;
                pbvgzgjwvy2ldxc8vo.f2675OANkd3mP6AYvwbNLJM.removeGlobalOnLayoutListener(pbvgzgjwvy2ldxc8vo.f2670Acstmh57AKoSEkEFNJ);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public pbVGzGjWvY2LDXC8vo(Context context, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, View view, int i, int i2, boolean z) {
        this.f2686s3fjYDxWOUexjjVgyA = context;
        this.f2672HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0;
        this.f2684husNiw3snxdgZPAGJm = z;
        this.f2688zZKhbgvUfsK4AEX3r0 = new HJFh0TGMpafqLE9haL(zzkhbgvufsk4aex3r0, LayoutInflater.from(context), z, f2669xHA29AmDt6y96AnB3t);
        this.f2678TCyPEKSzIyweCN5yp1 = i;
        this.f2673IPyIQcaNa8aB7drBED = i2;
        Resources resources = context.getResources();
        this.f2674KYHag8HRDlnO3X9zmZ = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6224s3fjYDxWOUexjjVgyA));
        this.f2677T9PhQIpGRhE4yZDm1C = view;
        this.f2685pbVGzGjWvY2LDXC8vo = new XzJ1BS7H9Ilbkv4eVM(context, null, i, i2);
        zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(this, context);
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public boolean Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        if (acstmh57AKoSEkEFNJ.hasVisibleItems()) {
            KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = new KYHag8HRDlnO3X9zmZ(this.f2686s3fjYDxWOUexjjVgyA, acstmh57AKoSEkEFNJ, this.f2683hoXrIDAFrSwfShk8da, this.f2684husNiw3snxdgZPAGJm, this.f2678TCyPEKSzIyweCN5yp1, this.f2673IPyIQcaNa8aB7drBED);
            kYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ(this.f2681aPyGSIylzVNKPT1Bls);
            kYHag8HRDlnO3X9zmZ.TCyPEKSzIyweCN5yp1(TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(acstmh57AKoSEkEFNJ));
            kYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo(this.f2682e54J8UWNHWALQNixXM);
            this.f2682e54J8UWNHWALQNixXM = null;
            this.f2672HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(false);
            int iAcstmh57AKoSEkEFNJ = this.f2685pbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ();
            int iE54J8UWNHWALQNixXM = this.f2685pbVGzGjWvY2LDXC8vo.e54J8UWNHWALQNixXM();
            if ((Gravity.getAbsoluteGravity(this.f2676R9SAhYMerGybF9OAjL, this.f2677T9PhQIpGRhE4yZDm1C.getLayoutDirection()) & 7) == 5) {
                iAcstmh57AKoSEkEFNJ += this.f2677T9PhQIpGRhE4yZDm1C.getWidth();
            }
            if (kYHag8HRDlnO3X9zmZ.hoXrIDAFrSwfShk8da(iAcstmh57AKoSEkEFNJ, iE54J8UWNHWALQNixXM)) {
                TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2681aPyGSIylzVNKPT1Bls;
                if (leer5kfoer4xu5yhh7 == null) {
                    return true;
                }
                leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(acstmh57AKoSEkEFNJ);
                return true;
            }
        }
        return false;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void G7AC3DWIx9i9fdanjk(PopupWindow.OnDismissListener onDismissListener) {
        this.f2682e54J8UWNHWALQNixXM = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public boolean HJFh0TGMpafqLE9haL() {
        return false;
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public boolean KYHag8HRDlnO3X9zmZ() {
        return !this.f2689zaq8hOURtfwbcX17cG && this.f2685pbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ();
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void LIMtzhnLwQyigzK0KO(int i) {
        this.f2685pbVGzGjWvY2LDXC8vo.OUd9THiLjZndMj0qdF(i);
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void OANkd3mP6AYvwbNLJM(View view) {
        this.f2677T9PhQIpGRhE4yZDm1C = view;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void R9SAhYMerGybF9OAjL(int i) {
        this.f2685pbVGzGjWvY2LDXC8vo.xHA29AmDt6y96AnB3t(i);
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public ListView TCyPEKSzIyweCN5yp1() {
        return this.f2685pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1();
    }

    public final boolean WWC27LAMFqFFBzfbNw() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (KYHag8HRDlnO3X9zmZ()) {
            return true;
        }
        if (this.f2689zaq8hOURtfwbcX17cG || (view = this.f2677T9PhQIpGRhE4yZDm1C) == null) {
            return false;
        }
        this.f2683hoXrIDAFrSwfShk8da = view;
        this.f2685pbVGzGjWvY2LDXC8vo.VItLRw50eXTZeEfGl0(this);
        this.f2685pbVGzGjWvY2LDXC8vo.WWC27LAMFqFFBzfbNw(this);
        this.f2685pbVGzGjWvY2LDXC8vo.A49QRPHynYLCBN0SqP(true);
        View view2 = this.f2683hoXrIDAFrSwfShk8da;
        boolean z = this.f2675OANkd3mP6AYvwbNLJM == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2675OANkd3mP6AYvwbNLJM = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2670Acstmh57AKoSEkEFNJ);
        }
        view2.addOnAttachStateChangeListener(this.f2680Z9WdNiOsPR0y54zHW4);
        this.f2685pbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(view2);
        this.f2685pbVGzGjWvY2LDXC8vo.R9SAhYMerGybF9OAjL(this.f2676R9SAhYMerGybF9OAjL);
        if (!this.f2687sTkWmhpZ5b1ArQIw4K) {
            this.f2679Y43RdunnpKgpbny0lE = TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA.aPyGSIylzVNKPT1Bls(this.f2688zZKhbgvUfsK4AEX3r0, null, this.f2686s3fjYDxWOUexjjVgyA, this.f2674KYHag8HRDlnO3X9zmZ);
            this.f2687sTkWmhpZ5b1ArQIw4K = true;
        }
        this.f2685pbVGzGjWvY2LDXC8vo.Y43RdunnpKgpbny0lE(this.f2679Y43RdunnpKgpbny0lE);
        this.f2685pbVGzGjWvY2LDXC8vo.LIMtzhnLwQyigzK0KO(2);
        this.f2685pbVGzGjWvY2LDXC8vo.G7AC3DWIx9i9fdanjk(hoXrIDAFrSwfShk8da());
        this.f2685pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA();
        ListView listViewTCyPEKSzIyweCN5yp1 = this.f2685pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1();
        listViewTCyPEKSzIyweCN5yp1.setOnKeyListener(this);
        if (this.f2671G7AC3DWIx9i9fdanjk && this.f2672HJFh0TGMpafqLE9haL.G7AC3DWIx9i9fdanjk() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2686s3fjYDxWOUexjjVgyA).inflate(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6236pbVGzGjWvY2LDXC8vo, (ViewGroup) listViewTCyPEKSzIyweCN5yp1, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f2672HJFh0TGMpafqLE9haL.G7AC3DWIx9i9fdanjk());
            }
            frameLayout.setEnabled(false);
            listViewTCyPEKSzIyweCN5yp1.addHeaderView(frameLayout, null, false);
        }
        this.f2685pbVGzGjWvY2LDXC8vo.OANkd3mP6AYvwbNLJM(this.f2688zZKhbgvUfsK4AEX3r0);
        this.f2685pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA();
        return true;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void Y43RdunnpKgpbny0lE(int i) {
        this.f2676R9SAhYMerGybF9OAjL = i;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void Z9WdNiOsPR0y54zHW4(boolean z) {
        this.f2687sTkWmhpZ5b1ArQIw4K = false;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f2688zZKhbgvUfsK4AEX3r0;
        if (hJFh0TGMpafqLE9haL != null) {
            hJFh0TGMpafqLE9haL.notifyDataSetChanged();
        }
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public void dismiss() {
        if (KYHag8HRDlnO3X9zmZ()) {
            this.f2685pbVGzGjWvY2LDXC8vo.dismiss();
        }
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void e54J8UWNHWALQNixXM(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, boolean z) {
        if (zzkhbgvufsk4aex3r0 != this.f2672HJFh0TGMpafqLE9haL) {
            return;
        }
        dismiss();
        TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2681aPyGSIylzVNKPT1Bls;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2689zaq8hOURtfwbcX17cG = true;
        this.f2672HJFh0TGMpafqLE9haL.close();
        ViewTreeObserver viewTreeObserver = this.f2675OANkd3mP6AYvwbNLJM;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2675OANkd3mP6AYvwbNLJM = this.f2683hoXrIDAFrSwfShk8da.getViewTreeObserver();
            }
            this.f2675OANkd3mP6AYvwbNLJM.removeGlobalOnLayoutListener(this.f2670Acstmh57AKoSEkEFNJ);
            this.f2675OANkd3mP6AYvwbNLJM = null;
        }
        this.f2683hoXrIDAFrSwfShk8da.removeOnAttachStateChangeListener(this.f2680Z9WdNiOsPR0y54zHW4);
        PopupWindow.OnDismissListener onDismissListener = this.f2682e54J8UWNHWALQNixXM;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void pbVGzGjWvY2LDXC8vo(TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2681aPyGSIylzVNKPT1Bls = leer5kfoer4xu5yhh7;
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public void s3fjYDxWOUexjjVgyA() {
        if (!WWC27LAMFqFFBzfbNw()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void sTkWmhpZ5b1ArQIw4K(boolean z) {
        this.f2688zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0(z);
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void xHA29AmDt6y96AnB3t(boolean z) {
        this.f2671G7AC3DWIx9i9fdanjk = z;
    }
}
