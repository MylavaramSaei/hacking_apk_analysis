package androidx.appcompat.widget;

import IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP;
import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 implements A49QRPHynYLCBN0SqP {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public CharSequence f2951Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public View f2952HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public CharSequence f2953IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Drawable f2954KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f2955T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f2956TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public Window.Callback f2957Z9WdNiOsPR0y54zHW4;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public Drawable f2958aPyGSIylzVNKPT1Bls;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public boolean f2959e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f2960hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public Drawable f2961husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Toolbar f2962lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public CharSequence f2963pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2964s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Drawable f2965zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements View.OnClickListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f2966lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7() {
            this.f2966lEeR5KfoEr4xU5yHH7 = new TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0.this.f2962lEeR5KfoEr4xU5yHH7.getContext(), 0, R.id.home, 0, 0, zZKhbgvUfsK4AEX3r0.this.f2953IPyIQcaNa8aB7drBED);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = zZKhbgvUfsK4AEX3r0.this;
            Window.Callback callback = zzkhbgvufsk4aex3r0.f2957Z9WdNiOsPR0y54zHW4;
            if (callback == null || !zzkhbgvufsk4aex3r0.f2959e54J8UWNHWALQNixXM) {
                return;
            }
            callback.onMenuItemSelected(0, this.f2966lEeR5KfoEr4xU5yHH7);
        }
    }

    public zZKhbgvUfsK4AEX3r0(Toolbar toolbar, boolean z) {
        this(toolbar, z, TCyPEKSzIyweCN5yp1.f6246lEeR5KfoEr4xU5yHH7, lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0.f6488hoXrIDAFrSwfShk8da);
    }

    public void Acstmh57AKoSEkEFNJ(int i) {
        Z9WdNiOsPR0y54zHW4(i == 0 ? null : husNiw3snxdgZPAGJm().getString(i));
    }

    @Override // IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP
    public void HJFh0TGMpafqLE9haL(Window.Callback callback) {
        this.f2957Z9WdNiOsPR0y54zHW4 = callback;
    }

    public void IPyIQcaNa8aB7drBED(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f2964s3fjYDxWOUexjjVgyA ^ i;
        this.f2964s3fjYDxWOUexjjVgyA = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    OANkd3mP6AYvwbNLJM();
                }
                zaq8hOURtfwbcX17cG();
            }
            if ((i2 & 3) != 0) {
                sTkWmhpZ5b1ArQIw4K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2962lEeR5KfoEr4xU5yHH7.setTitle(this.f2953IPyIQcaNa8aB7drBED);
                    toolbar = this.f2962lEeR5KfoEr4xU5yHH7;
                    charSequence = this.f2963pbVGzGjWvY2LDXC8vo;
                } else {
                    charSequence = null;
                    this.f2962lEeR5KfoEr4xU5yHH7.setTitle((CharSequence) null);
                    toolbar = this.f2962lEeR5KfoEr4xU5yHH7;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f2952HJFh0TGMpafqLE9haL) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f2962lEeR5KfoEr4xU5yHH7.addView(view);
            } else {
                this.f2962lEeR5KfoEr4xU5yHH7.removeView(view);
            }
        }
    }

    public void KYHag8HRDlnO3X9zmZ(View view) {
        View view2 = this.f2952HJFh0TGMpafqLE9haL;
        if (view2 != null && (this.f2964s3fjYDxWOUexjjVgyA & 16) != 0) {
            this.f2962lEeR5KfoEr4xU5yHH7.removeView(view2);
        }
        this.f2952HJFh0TGMpafqLE9haL = view;
        if (view == null || (this.f2964s3fjYDxWOUexjjVgyA & 16) == 0) {
            return;
        }
        this.f2962lEeR5KfoEr4xU5yHH7.addView(view);
    }

    public final void OANkd3mP6AYvwbNLJM() {
        if ((this.f2964s3fjYDxWOUexjjVgyA & 4) != 0) {
            if (TextUtils.isEmpty(this.f2951Acstmh57AKoSEkEFNJ)) {
                this.f2962lEeR5KfoEr4xU5yHH7.setNavigationContentDescription(this.f2960hoXrIDAFrSwfShk8da);
            } else {
                this.f2962lEeR5KfoEr4xU5yHH7.setNavigationContentDescription(this.f2951Acstmh57AKoSEkEFNJ);
            }
        }
    }

    public void T9PhQIpGRhE4yZDm1C(CharSequence charSequence) {
        this.f2963pbVGzGjWvY2LDXC8vo = charSequence;
        if ((this.f2964s3fjYDxWOUexjjVgyA & 8) != 0) {
            this.f2962lEeR5KfoEr4xU5yHH7.setSubtitle(charSequence);
        }
    }

    public void TCyPEKSzIyweCN5yp1(int i) {
        if (i == this.f2960hoXrIDAFrSwfShk8da) {
            return;
        }
        this.f2960hoXrIDAFrSwfShk8da = i;
        if (TextUtils.isEmpty(this.f2962lEeR5KfoEr4xU5yHH7.getNavigationContentDescription())) {
            Acstmh57AKoSEkEFNJ(this.f2960hoXrIDAFrSwfShk8da);
        }
    }

    public void Z9WdNiOsPR0y54zHW4(CharSequence charSequence) {
        this.f2951Acstmh57AKoSEkEFNJ = charSequence;
        OANkd3mP6AYvwbNLJM();
    }

    public final void aPyGSIylzVNKPT1Bls(CharSequence charSequence) {
        this.f2953IPyIQcaNa8aB7drBED = charSequence;
        if ((this.f2964s3fjYDxWOUexjjVgyA & 8) != 0) {
            this.f2962lEeR5KfoEr4xU5yHH7.setTitle(charSequence);
            if (this.f2956TCyPEKSzIyweCN5yp1) {
                lLKzvdU99Iw80uVD5I.FtYx4GXtxwA8al5hBy(this.f2962lEeR5KfoEr4xU5yHH7.getRootView(), charSequence);
            }
        }
    }

    public void e54J8UWNHWALQNixXM(Drawable drawable) {
        this.f2954KYHag8HRDlnO3X9zmZ = drawable;
        zaq8hOURtfwbcX17cG();
    }

    @Override // IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP
    public CharSequence getTitle() {
        return this.f2962lEeR5KfoEr4xU5yHH7.getTitle();
    }

    public void hoXrIDAFrSwfShk8da(CharSequence charSequence) {
        this.f2956TCyPEKSzIyweCN5yp1 = true;
        aPyGSIylzVNKPT1Bls(charSequence);
    }

    public Context husNiw3snxdgZPAGJm() {
        return this.f2962lEeR5KfoEr4xU5yHH7.getContext();
    }

    @Override // IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP
    public void lEeR5KfoEr4xU5yHH7(int i) {
        pbVGzGjWvY2LDXC8vo(i != 0 ? HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(husNiw3snxdgZPAGJm(), i) : null);
    }

    public void pbVGzGjWvY2LDXC8vo(Drawable drawable) {
        this.f2961husNiw3snxdgZPAGJm = drawable;
        sTkWmhpZ5b1ArQIw4K();
    }

    @Override // IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP
    public void s3fjYDxWOUexjjVgyA(CharSequence charSequence) {
        if (this.f2956TCyPEKSzIyweCN5yp1) {
            return;
        }
        aPyGSIylzVNKPT1Bls(charSequence);
    }

    public final void sTkWmhpZ5b1ArQIw4K() {
        Drawable drawable;
        int i = this.f2964s3fjYDxWOUexjjVgyA;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2961husNiw3snxdgZPAGJm) == null) {
            drawable = this.f2965zZKhbgvUfsK4AEX3r0;
        }
        this.f2962lEeR5KfoEr4xU5yHH7.setLogo(drawable);
    }

    @Override // IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP
    public void setIcon(int i) {
        setIcon(i != 0 ? HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(husNiw3snxdgZPAGJm(), i) : null);
    }

    public final int zZKhbgvUfsK4AEX3r0() {
        if (this.f2962lEeR5KfoEr4xU5yHH7.getNavigationIcon() == null) {
            return 11;
        }
        this.f2958aPyGSIylzVNKPT1Bls = this.f2962lEeR5KfoEr4xU5yHH7.getNavigationIcon();
        return 15;
    }

    public final void zaq8hOURtfwbcX17cG() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f2964s3fjYDxWOUexjjVgyA & 4) != 0) {
            toolbar = this.f2962lEeR5KfoEr4xU5yHH7;
            drawable = this.f2954KYHag8HRDlnO3X9zmZ;
            if (drawable == null) {
                drawable = this.f2958aPyGSIylzVNKPT1Bls;
            }
        } else {
            toolbar = this.f2962lEeR5KfoEr4xU5yHH7;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public zZKhbgvUfsK4AEX3r0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2955T9PhQIpGRhE4yZDm1C = 0;
        this.f2960hoXrIDAFrSwfShk8da = 0;
        this.f2962lEeR5KfoEr4xU5yHH7 = toolbar;
        this.f2953IPyIQcaNa8aB7drBED = toolbar.getTitle();
        this.f2963pbVGzGjWvY2LDXC8vo = toolbar.getSubtitle();
        this.f2956TCyPEKSzIyweCN5yp1 = this.f2953IPyIQcaNa8aB7drBED != null;
        this.f2954KYHag8HRDlnO3X9zmZ = toolbar.getNavigationIcon();
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(toolbar.getContext(), null, pbVGzGjWvY2LDXC8vo.f6408lEeR5KfoEr4xU5yHH7, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6269HJFh0TGMpafqLE9haL, 0);
        this.f2958aPyGSIylzVNKPT1Bls = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo.f6288Acstmh57AKoSEkEFNJ);
        if (z) {
            CharSequence charSequenceAPyGSIylzVNKPT1Bls = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.aPyGSIylzVNKPT1Bls(pbVGzGjWvY2LDXC8vo.f6325OANkd3mP6AYvwbNLJM);
            if (!TextUtils.isEmpty(charSequenceAPyGSIylzVNKPT1Bls)) {
                hoXrIDAFrSwfShk8da(charSequenceAPyGSIylzVNKPT1Bls);
            }
            CharSequence charSequenceAPyGSIylzVNKPT1Bls2 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.aPyGSIylzVNKPT1Bls(pbVGzGjWvY2LDXC8vo.f6397hoXrIDAFrSwfShk8da);
            if (!TextUtils.isEmpty(charSequenceAPyGSIylzVNKPT1Bls2)) {
                T9PhQIpGRhE4yZDm1C(charSequenceAPyGSIylzVNKPT1Bls2);
            }
            Drawable drawableTCyPEKSzIyweCN5yp1 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo.f6379e54J8UWNHWALQNixXM);
            if (drawableTCyPEKSzIyweCN5yp1 != null) {
                pbVGzGjWvY2LDXC8vo(drawableTCyPEKSzIyweCN5yp1);
            }
            Drawable drawableTCyPEKSzIyweCN5yp12 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(pbVGzGjWvY2LDXC8vo.f6358Z9WdNiOsPR0y54zHW4);
            if (drawableTCyPEKSzIyweCN5yp12 != null) {
                setIcon(drawableTCyPEKSzIyweCN5yp12);
            }
            if (this.f2954KYHag8HRDlnO3X9zmZ == null && (drawable = this.f2958aPyGSIylzVNKPT1Bls) != null) {
                e54J8UWNHWALQNixXM(drawable);
            }
            IPyIQcaNa8aB7drBED(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.Acstmh57AKoSEkEFNJ(pbVGzGjWvY2LDXC8vo.f6309IPyIQcaNa8aB7drBED, 0));
            int iT9PhQIpGRhE4yZDm1C = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6338TCyPEKSzIyweCN5yp1, 0);
            if (iT9PhQIpGRhE4yZDm1C != 0) {
                KYHag8HRDlnO3X9zmZ(LayoutInflater.from(this.f2962lEeR5KfoEr4xU5yHH7.getContext()).inflate(iT9PhQIpGRhE4yZDm1C, (ViewGroup) this.f2962lEeR5KfoEr4xU5yHH7, false));
                IPyIQcaNa8aB7drBED(this.f2964s3fjYDxWOUexjjVgyA | 16);
            }
            int iE54J8UWNHWALQNixXM = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.e54J8UWNHWALQNixXM(pbVGzGjWvY2LDXC8vo.f6417pbVGzGjWvY2LDXC8vo, 0);
            if (iE54J8UWNHWALQNixXM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2962lEeR5KfoEr4xU5yHH7.getLayoutParams();
                layoutParams.height = iE54J8UWNHWALQNixXM;
                this.f2962lEeR5KfoEr4xU5yHH7.setLayoutParams(layoutParams);
            }
            int iHusNiw3snxdgZPAGJm = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.husNiw3snxdgZPAGJm(pbVGzGjWvY2LDXC8vo.f6314KYHag8HRDlnO3X9zmZ, -1);
            int iHusNiw3snxdgZPAGJm2 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.husNiw3snxdgZPAGJm(pbVGzGjWvY2LDXC8vo.f6398husNiw3snxdgZPAGJm, -1);
            if (iHusNiw3snxdgZPAGJm >= 0 || iHusNiw3snxdgZPAGJm2 >= 0) {
                this.f2962lEeR5KfoEr4xU5yHH7.tXWeW0sqVddf7ZBflq(Math.max(iHusNiw3snxdgZPAGJm, 0), Math.max(iHusNiw3snxdgZPAGJm2, 0));
            }
            int iT9PhQIpGRhE4yZDm1C2 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6448zaq8hOURtfwbcX17cG, 0);
            if (iT9PhQIpGRhE4yZDm1C2 != 0) {
                Toolbar toolbar2 = this.f2962lEeR5KfoEr4xU5yHH7;
                toolbar2.OqIo5QF00RDxUQb4qq(toolbar2.getContext(), iT9PhQIpGRhE4yZDm1C2);
            }
            int iT9PhQIpGRhE4yZDm1C3 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6362aPyGSIylzVNKPT1Bls, 0);
            if (iT9PhQIpGRhE4yZDm1C3 != 0) {
                Toolbar toolbar3 = this.f2962lEeR5KfoEr4xU5yHH7;
                toolbar3.W3RZ2dTDKrKpS5Mxdk(toolbar3.getContext(), iT9PhQIpGRhE4yZDm1C3);
            }
            int iT9PhQIpGRhE4yZDm1C4 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(pbVGzGjWvY2LDXC8vo.f6337T9PhQIpGRhE4yZDm1C, 0);
            if (iT9PhQIpGRhE4yZDm1C4 != 0) {
                this.f2962lEeR5KfoEr4xU5yHH7.setPopupTheme(iT9PhQIpGRhE4yZDm1C4);
            }
        } else {
            this.f2964s3fjYDxWOUexjjVgyA = zZKhbgvUfsK4AEX3r0();
        }
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
        TCyPEKSzIyweCN5yp1(i);
        this.f2951Acstmh57AKoSEkEFNJ = this.f2962lEeR5KfoEr4xU5yHH7.getNavigationContentDescription();
        this.f2962lEeR5KfoEr4xU5yHH7.setNavigationOnClickListener(new lEeR5KfoEr4xU5yHH7());
    }

    @Override // IPyIQcaNa8aB7drBED.A49QRPHynYLCBN0SqP
    public void setIcon(Drawable drawable) {
        this.f2965zZKhbgvUfsK4AEX3r0 = drawable;
        sTkWmhpZ5b1ArQIw4K();
    }
}
