package com.google.android.material.chip;

import WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da;
import WaWv1mJ1ya3uoEaKqz.pbVGzGjWvY2LDXC8vo;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;
import dCumDqZdWZ8NLrsgb7.s3fjYDxWOUexjjVgyA;
import h6NrAcYSuIyiU1qV6F.husNiw3snxdgZPAGJm;
import hgxXdWVkE1CPHCTwpz.zZKhbgvUfsK4AEX3r0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jsjSYEu4NPZjZxcfmI.HJFh0TGMpafqLE9haL;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 extends TCyPEKSzIyweCN5yp1 implements Drawable.Callback, pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA {

    /* renamed from: i8aHOwH04efS6lZ3Oa, reason: collision with root package name */
    public static final int[] f5024i8aHOwH04efS6lZ3Oa = {R.attr.state_enabled};

    /* renamed from: owCQzRKpGarpL4247z, reason: collision with root package name */
    public static final ShapeDrawable f5025owCQzRKpGarpL4247z = new ShapeDrawable(new OvalShape());

    /* renamed from: Bc5OTyAfOKVCQb8CEz, reason: collision with root package name */
    public TextUtils.TruncateAt f5026Bc5OTyAfOKVCQb8CEz;

    /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
    public float f5027CSih7GetOUab1dYQjM;

    /* renamed from: DFYiVi7zXozAjRciKa, reason: collision with root package name */
    public final Path f5028DFYiVi7zXozAjRciKa;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public ColorStateList f5029DfpieXfdYs58yZAiXY;

    /* renamed from: Er40JrQbOM51vCQI8w, reason: collision with root package name */
    public PorterDuffColorFilter f5030Er40JrQbOM51vCQI8w;

    /* renamed from: Fo9071MN8vwEWamAUX, reason: collision with root package name */
    public ColorFilter f5031Fo9071MN8vwEWamAUX;

    /* renamed from: FtYx4GXtxwA8al5hBy, reason: collision with root package name */
    public final pbVGzGjWvY2LDXC8vo f5032FtYx4GXtxwA8al5hBy;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public Drawable f5033GyWRxpdt1T8mEJXPoD;

    /* renamed from: HR5vAalpgOKVm2T0Gq, reason: collision with root package name */
    public ColorStateList f5034HR5vAalpgOKVm2T0Gq;

    /* renamed from: HZ4bptRS9XIcK1CV95, reason: collision with root package name */
    public int[] f5035HZ4bptRS9XIcK1CV95;

    /* renamed from: Jsouc4ileb8SxQhxbX, reason: collision with root package name */
    public int f5036Jsouc4ileb8SxQhxbX;

    /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
    public float f5037Kh0uC90qEEhuLdpgB9;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public boolean f5038KqgKJKIWne3kz1AdHk;

    /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
    public CharSequence f5039LU0fFDMACqnfIfA1AZ;

    /* renamed from: O1furmptfI76BGfN0d, reason: collision with root package name */
    public boolean f5040O1furmptfI76BGfN0d;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public float f5041OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public boolean f5042OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public boolean f5043PPkm9uUfOJHHYveeLT;

    /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
    public final Context f5044Pum9NZyDBKoCnecvlx;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public ColorStateList f5045THTDvPxsHqMeGb512f;

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public ColorStateList f5046ToH8yzk8U1nKT0PUfY;

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public float f5047Tu4WCh2gEwj8E4oHbP;

    /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
    public float f5048Uj8rPa1EWADtk6Oe0S;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public CharSequence f5049W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public ColorStateList f5050WWC27LAMFqFFBzfbNw;

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public float f5051XdzLv4NdAtTYoEzVzB;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public float f5052XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public boolean f5053YlLW4G6OV9TFyuw5ix;

    /* renamed from: Ywqw2A0s86HeuFkDt0, reason: collision with root package name */
    public ColorStateList f5054Ywqw2A0s86HeuFkDt0;

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public float f5055ZJNyOIPL0usMs2xSAn;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public Drawable f5056aAp6BD79BhftLCnuvf;

    /* renamed from: aRQ2M7vtRaPDEyvpdv, reason: collision with root package name */
    public boolean f5057aRQ2M7vtRaPDEyvpdv;

    /* renamed from: aUn6Hqsqw2PVM8685Z, reason: collision with root package name */
    public boolean f5058aUn6Hqsqw2PVM8685Z;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public float f5059ao3wqKm5CXFuvC0q47;

    /* renamed from: ayduHasC7VpxsVXE0T, reason: collision with root package name */
    public int f5060ayduHasC7VpxsVXE0T;

    /* renamed from: bBVlTkqEpHW053CjWL, reason: collision with root package name */
    public int f5061bBVlTkqEpHW053CjWL;

    /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
    public float f5062bMSdooljgH14Jgudph;

    /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f5063cT5Hs3CQpLK8NvlZAw;

    /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
    public final Paint f5064ctWLFN70QQINH1kyYo;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public float f5065e2F9F6h8YJxTHwLCa0;

    /* renamed from: eWK41qw3g36LVd4UnS, reason: collision with root package name */
    public final RectF f5066eWK41qw3g36LVd4UnS;

    /* renamed from: evSiTWao80SbJUZk9E, reason: collision with root package name */
    public final PointF f5067evSiTWao80SbJUZk9E;

    /* renamed from: f2zPq7MOnQrtOlZ1Zg, reason: collision with root package name */
    public PorterDuff.Mode f5068f2zPq7MOnQrtOlZ1Zg;

    /* renamed from: fDXXEWvhMVO3O8mnuS, reason: collision with root package name */
    public int f5069fDXXEWvhMVO3O8mnuS;

    /* renamed from: fLSSbwbzFBVpwBH5FM, reason: collision with root package name */
    public int f5070fLSSbwbzFBVpwBH5FM;

    /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f5071hUNBy66ZO1wVLJGW3l;

    /* renamed from: iQCvttGuB7nx4r7kMP, reason: collision with root package name */
    public int f5072iQCvttGuB7nx4r7kMP;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public ColorStateList f5073jCtUeU2YI1poCxWcjm;

    /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
    public final Paint f5074jocVUfxESVhVJU8LoH;

    /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
    public float f5075k0CbjZvfUz23r8IN6W;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public Drawable f5076lLKzvdU99Iw80uVD5I;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public Drawable f5077oocVJL811qFf0j0XXZ;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public float f5078osrHU7fvDp2EgxZPfM;

    /* renamed from: pgB7Gmjz55y9NQYnAD, reason: collision with root package name */
    public WeakReference f5079pgB7Gmjz55y9NQYnAD;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public ColorStateList f5080tXWeW0sqVddf7ZBflq;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public ColorStateList f5081udcVtCzLTM1Loe9KrX;

    /* renamed from: vlBaBOcZ1q1ndWVoXn, reason: collision with root package name */
    public boolean f5082vlBaBOcZ1q1ndWVoXn;

    /* renamed from: xMfAHy6F7qK0zhxhKG, reason: collision with root package name */
    public int f5083xMfAHy6F7qK0zhxhKG;

    /* renamed from: yL2E9nlEZpg8ZZx8XE, reason: collision with root package name */
    public int f5084yL2E9nlEZpg8ZZx8XE;

    /* renamed from: yvdWWG9COQQotjfedH, reason: collision with root package name */
    public int f5085yvdWWG9COQQotjfedH;

    /* renamed from: zXY7dgnTfw9Pd9RXel, reason: collision with root package name */
    public final Paint.FontMetrics f5086zXY7dgnTfw9Pd9RXel;

    /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
    public boolean f5087zcy2NNbtVXgoGQbfuq;

    /* renamed from: com.google.android.material.chip.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public interface InterfaceC0079lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7();
    }

    public lEeR5KfoEr4xU5yHH7(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5041OUd9THiLjZndMj0qdF = -1.0f;
        this.f5064ctWLFN70QQINH1kyYo = new Paint(1);
        this.f5086zXY7dgnTfw9Pd9RXel = new Paint.FontMetrics();
        this.f5066eWK41qw3g36LVd4UnS = new RectF();
        this.f5067evSiTWao80SbJUZk9E = new PointF();
        this.f5028DFYiVi7zXozAjRciKa = new Path();
        this.f5084yL2E9nlEZpg8ZZx8XE = 255;
        this.f5068f2zPq7MOnQrtOlZ1Zg = PorterDuff.Mode.SRC_IN;
        this.f5079pgB7Gmjz55y9NQYnAD = new WeakReference(null);
        DfpieXfdYs58yZAiXY(context);
        this.f5044Pum9NZyDBKoCnecvlx = context;
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = new pbVGzGjWvY2LDXC8vo(this);
        this.f5032FtYx4GXtxwA8al5hBy = pbvgzgjwvy2ldxc8vo;
        this.f5049W3RZ2dTDKrKpS5Mxdk = "";
        pbvgzgjwvy2ldxc8vo.KYHag8HRDlnO3X9zmZ().density = context.getResources().getDisplayMetrics().density;
        this.f5074jocVUfxESVhVJU8LoH = null;
        int[] iArr = f5024i8aHOwH04efS6lZ3Oa;
        setState(iArr);
        pjij9fAFhRRn230kOs(iArr);
        this.f5058aUn6Hqsqw2PVM8685Z = true;
        if (s3fjYDxWOUexjjVgyA.f5620lEeR5KfoEr4xU5yHH7) {
            f5025owCQzRKpGarpL4247z.setTint(-1);
        }
    }

    public static boolean WaWv1mJ1ya3uoEaKqz(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean ayaSAlBnO403UB0TMR(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return (zzkhbgvufsk4aex3r0 == null || zzkhbgvufsk4aex3r0.pbVGzGjWvY2LDXC8vo() == null || !zzkhbgvufsk4aex3r0.pbVGzGjWvY2LDXC8vo().isStateful()) ? false : true;
    }

    public static boolean dCumDqZdWZ8NLrsgb7(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean lBAL39rPf03qYLFNNP(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static lEeR5KfoEr4xU5yHH7 xMfAHy6F7qK0zhxhKG(Context context, AttributeSet attributeSet, int i, int i2) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(context, attributeSet, i, i2);
        leer5kfoer4xu5yhh7.R6kEk3zZuOluTikhN3(attributeSet, i, i2);
        return leer5kfoer4xu5yhh7;
    }

    public void ADbagDwlO3sAb2p0ry(ColorStateList colorStateList) {
        if (this.f5046ToH8yzk8U1nKT0PUfY != colorStateList) {
            this.f5046ToH8yzk8U1nKT0PUfY = colorStateList;
            if (tf0nfuAZUJWo4SN5He()) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this.f5056aAp6BD79BhftLCnuvf, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void BGBL3rAlNaaPWRbRlF(int i) {
        TZ2u8Z18RnXun7OSW0(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public float Bc5OTyAfOKVCQb8CEz() {
        return this.f5065e2F9F6h8YJxTHwLCa0;
    }

    public final void BzLnH9Ew63rlrNW23o() {
        this.f5034HR5vAalpgOKVm2T0Gq = this.f5057aRQ2M7vtRaPDEyvpdv ? s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f5080tXWeW0sqVddf7ZBflq) : null;
    }

    public void CPvkPRvSu1JpqPqzvl(float f) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0Cr99CPXhoiknALiHbq = cr99CPXhoiknALiHbq();
        if (zzkhbgvufsk4aex3r0Cr99CPXhoiknALiHbq != null) {
            zzkhbgvufsk4aex3r0Cr99CPXhoiknALiHbq.e54J8UWNHWALQNixXM(f);
            this.f5032FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ().setTextSize(f);
            lEeR5KfoEr4xU5yHH7();
        }
    }

    public void D3qEI0j1Bvj6FYKAih(int i) {
        ZH7ZBRiZvcOTI9arA2(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public final float DFYiVi7zXozAjRciKa() {
        this.f5032FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ().getFontMetrics(this.f5086zXY7dgnTfw9Pd9RXel);
        Paint.FontMetrics fontMetrics = this.f5086zXY7dgnTfw9Pd9RXel;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void DkHm7hVHmkyvDHXSjR(ColorStateList colorStateList) {
        if (this.f5080tXWeW0sqVddf7ZBflq != colorStateList) {
            this.f5080tXWeW0sqVddf7ZBflq = colorStateList;
            BzLnH9Ew63rlrNW23o();
            onStateChange(getState());
        }
    }

    public void EgmJdc4h5OU4spuEKW(InterfaceC0079lEeR5KfoEr4xU5yHH7 interfaceC0079lEeR5KfoEr4xU5yHH7) {
        this.f5079pgB7Gmjz55y9NQYnAD = new WeakReference(interfaceC0079lEeR5KfoEr4xU5yHH7);
    }

    public final void Er40JrQbOM51vCQI8w(Canvas canvas, Rect rect) {
        if (this.f5049W3RZ2dTDKrKpS5Mxdk != null) {
            Paint.Align alignFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(rect, this.f5067evSiTWao80SbJUZk9E);
            evSiTWao80SbJUZk9E(rect, this.f5066eWK41qw3g36LVd4UnS);
            if (this.f5032FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm() != null) {
                this.f5032FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ().drawableState = getState();
                this.f5032FtYx4GXtxwA8al5hBy.e54J8UWNHWALQNixXM(this.f5044Pum9NZyDBKoCnecvlx);
            }
            this.f5032FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ().setTextAlign(alignFtYx4GXtxwA8al5hBy);
            int iSave = 0;
            boolean z = Math.round(this.f5032FtYx4GXtxwA8al5hBy.TCyPEKSzIyweCN5yp1(vExXQwwMm8C1aKdGdj().toString())) > Math.round(this.f5066eWK41qw3g36LVd4UnS.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.f5066eWK41qw3g36LVd4UnS);
            }
            CharSequence charSequenceEllipsize = this.f5049W3RZ2dTDKrKpS5Mxdk;
            if (z && this.f5026Bc5OTyAfOKVCQb8CEz != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f5032FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ(), this.f5066eWK41qw3g36LVd4UnS.width(), this.f5026Bc5OTyAfOKVCQb8CEz);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f5067evSiTWao80SbJUZk9E;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f5032FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public HJFh0TGMpafqLE9haL EscIOBqRhG6irG5q11() {
        return this.f5071hUNBy66ZO1wVLJGW3l;
    }

    public void F8je6vTkTMHm5WbjEC(float f) {
        if (this.f5052XzJ1BS7H9Ilbkv4eVM != f) {
            this.f5052XzJ1BS7H9Ilbkv4eVM = f;
            this.f5064ctWLFN70QQINH1kyYo.setStrokeWidth(f);
            if (this.f5082vlBaBOcZ1q1ndWVoXn) {
                super.CSih7GetOUab1dYQjM(f);
            }
            invalidateSelf();
        }
    }

    public float FI7jQXEuEg1AdcOOw7() {
        return this.f5055ZJNyOIPL0usMs2xSAn;
    }

    public void FK1mYOUHT5iEQP3ZJ1(int i) {
        UViYrxCuj6kEgG2Mva(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void FXtjrf53D5B1cLsLFG(int i) {
        sKw6Jz5uGcQ479KwIW(this.f5044Pum9NZyDBKoCnecvlx.getResources().getBoolean(i));
    }

    public final void Fo9071MN8vwEWamAUX(Canvas canvas, Rect rect) {
        Paint paint = this.f5074jocVUfxESVhVJU8LoH;
        if (paint != null) {
            paint.setColor(VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(-16777216, 127));
            canvas.drawRect(rect, this.f5074jocVUfxESVhVJU8LoH);
            if (K3DzFKxpDGIqdlGY4t() || Kf6IFvVH2efp6249v2()) {
                Kh0uC90qEEhuLdpgB9(rect, this.f5066eWK41qw3g36LVd4UnS);
                canvas.drawRect(this.f5066eWK41qw3g36LVd4UnS, this.f5074jocVUfxESVhVJU8LoH);
            }
            if (this.f5049W3RZ2dTDKrKpS5Mxdk != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f5074jocVUfxESVhVJU8LoH);
            }
            if (tf0nfuAZUJWo4SN5He()) {
                jocVUfxESVhVJU8LoH(rect, this.f5066eWK41qw3g36LVd4UnS);
                canvas.drawRect(this.f5066eWK41qw3g36LVd4UnS, this.f5074jocVUfxESVhVJU8LoH);
            }
            this.f5074jocVUfxESVhVJU8LoH.setColor(VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(-65536, 127));
            ctWLFN70QQINH1kyYo(rect, this.f5066eWK41qw3g36LVd4UnS);
            canvas.drawRect(this.f5066eWK41qw3g36LVd4UnS, this.f5074jocVUfxESVhVJU8LoH);
            this.f5074jocVUfxESVhVJU8LoH.setColor(VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(-16711936, 127));
            zXY7dgnTfw9Pd9RXel(rect, this.f5066eWK41qw3g36LVd4UnS);
            canvas.drawRect(this.f5066eWK41qw3g36LVd4UnS, this.f5074jocVUfxESVhVJU8LoH);
        }
    }

    public Paint.Align FtYx4GXtxwA8al5hBy(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f5049W3RZ2dTDKrKpS5Mxdk != null) {
            float fPum9NZyDBKoCnecvlx = this.f5062bMSdooljgH14Jgudph + Pum9NZyDBKoCnecvlx() + this.f5078osrHU7fvDp2EgxZPfM;
            if (WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this) == 0) {
                pointF.x = rect.left + fPum9NZyDBKoCnecvlx;
            } else {
                pointF.x = rect.right - fPum9NZyDBKoCnecvlx;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - DFYiVi7zXozAjRciKa();
        }
        return align;
    }

    public boolean GeBgWLiG3rAOvStVF8() {
        return this.f5057aRQ2M7vtRaPDEyvpdv;
    }

    public void GraqRgO5nDZP94CSeH(int i) {
        w9kKjxxNBwNcD4xB6O(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public float HR5vAalpgOKVm2T0Gq() {
        return this.f5037Kh0uC90qEEhuLdpgB9;
    }

    public ColorStateList HZ4bptRS9XIcK1CV95() {
        return this.f5045THTDvPxsHqMeGb512f;
    }

    public void JIhXU7AcR3dXyMdSM6(int i) {
        XfvA8xAblLUDzfjNL9(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void JRgQbcjdTfLJPT0BU7(float f) {
        if (this.f5041OUd9THiLjZndMj0qdF != f) {
            this.f5041OUd9THiLjZndMj0qdF = f;
            setShapeAppearanceModel(THTDvPxsHqMeGb512f().LIMtzhnLwQyigzK0KO(f));
        }
    }

    public final float JXsqbvi9UKxeF3HXpU() {
        Drawable drawable = this.f5040O1furmptfI76BGfN0d ? this.f5077oocVJL811qFf0j0XXZ : this.f5033GyWRxpdt1T8mEJXPoD;
        float fCeil = this.f5065e2F9F6h8YJxTHwLCa0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(hoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this.f5044Pum9NZyDBKoCnecvlx, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public final void Jsouc4ileb8SxQhxbX(Canvas canvas, Rect rect) {
        if (Kf6IFvVH2efp6249v2()) {
            Kh0uC90qEEhuLdpgB9(rect, this.f5066eWK41qw3g36LVd4UnS);
            RectF rectF = this.f5066eWK41qw3g36LVd4UnS;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f5077oocVJL811qFf0j0XXZ.setBounds(0, 0, (int) this.f5066eWK41qw3g36LVd4UnS.width(), (int) this.f5066eWK41qw3g36LVd4UnS.height());
            this.f5077oocVJL811qFf0j0XXZ.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean K3DzFKxpDGIqdlGY4t() {
        return this.f5042OqIo5QF00RDxUQb4qq && this.f5033GyWRxpdt1T8mEJXPoD != null;
    }

    public void KWpkmWKCm3jeG4AjIM(int i) {
        F8je6vTkTMHm5WbjEC(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public final void KYIcm5hlxje4bqExkp() {
        this.f5076lLKzvdU99Iw80uVD5I = new RippleDrawable(s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(h7m69eGbRk1hyaVt28()), this.f5056aAp6BD79BhftLCnuvf, f5025owCQzRKpGarpL4247z);
    }

    public final boolean Kf6IFvVH2efp6249v2() {
        return this.f5053YlLW4G6OV9TFyuw5ix && this.f5077oocVJL811qFf0j0XXZ != null && this.f5040O1furmptfI76BGfN0d;
    }

    public final void Kh0uC90qEEhuLdpgB9(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K3DzFKxpDGIqdlGY4t() || Kf6IFvVH2efp6249v2()) {
            float f = this.f5062bMSdooljgH14Jgudph + this.f5048Uj8rPa1EWADtk6Oe0S;
            float fTmIBXGVvBsrJ7i63G2 = tmIBXGVvBsrJ7i63G2();
            if (WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fTmIBXGVvBsrJ7i63G2;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fTmIBXGVvBsrJ7i63G2;
            }
            float fJXsqbvi9UKxeF3HXpU = JXsqbvi9UKxeF3HXpU();
            float fExactCenterY = rect.exactCenterY() - (fJXsqbvi9UKxeF3HXpU / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fJXsqbvi9UKxeF3HXpU;
        }
    }

    public HJFh0TGMpafqLE9haL LFGi8lLul9XOP250o9() {
        return this.f5063cT5Hs3CQpLK8NvlZAw;
    }

    public void LjVYrU4NjguFeQ2fwa(int i) {
        hUNDUI3oB5uci3ylnY(this.f5044Pum9NZyDBKoCnecvlx.getResources().getBoolean(i));
    }

    public final ColorFilter MHebQjnRowM60e3HDn() {
        ColorFilter colorFilter = this.f5031Fo9071MN8vwEWamAUX;
        return colorFilter != null ? colorFilter : this.f5030Er40JrQbOM51vCQI8w;
    }

    public void MecTLhJ95ynyqeEob1(ColorStateList colorStateList) {
        if (this.f5045THTDvPxsHqMeGb512f != colorStateList) {
            this.f5045THTDvPxsHqMeGb512f = colorStateList;
            onStateChange(getState());
        }
    }

    public void N1vPC7A5f7Unhsdkgr(int i) {
        oyZAo7y5frVexNxTMd(HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public void Nm04cZudeGY9NQf1y2(int i) {
        MecTLhJ95ynyqeEob1(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public final void O1furmptfI76BGfN0d(Canvas canvas, Rect rect) {
        if (this.f5082vlBaBOcZ1q1ndWVoXn) {
            return;
        }
        this.f5064ctWLFN70QQINH1kyYo.setColor(this.f5060ayduHasC7VpxsVXE0T);
        this.f5064ctWLFN70QQINH1kyYo.setStyle(Paint.Style.FILL);
        this.f5066eWK41qw3g36LVd4UnS.set(rect);
        canvas.drawRoundRect(this.f5066eWK41qw3g36LVd4UnS, aRQ2M7vtRaPDEyvpdv(), aRQ2M7vtRaPDEyvpdv(), this.f5064ctWLFN70QQINH1kyYo);
    }

    public float OWyIJu8lIXxQlvLhaC() {
        return this.f5051XdzLv4NdAtTYoEzVzB;
    }

    public float PDw1hXOtArGjUqFgpT() {
        return this.f5048Uj8rPa1EWADtk6Oe0S;
    }

    public float Pum9NZyDBKoCnecvlx() {
        if (K3DzFKxpDGIqdlGY4t() || Kf6IFvVH2efp6249v2()) {
            return this.f5048Uj8rPa1EWADtk6Oe0S + tmIBXGVvBsrJ7i63G2() + this.f5027CSih7GetOUab1dYQjM;
        }
        return 0.0f;
    }

    public int[] QW0Trt6m3nVBNaYFnP() {
        return this.f5035HZ4bptRS9XIcK1CV95;
    }

    public void Qqql9aLAyQK9tLp8QF(int i) {
        DkHm7hVHmkyvDHXSjR(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6kEk3zZuOluTikhN3(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.lEeR5KfoEr4xU5yHH7.R6kEk3zZuOluTikhN3(android.util.AttributeSet, int, int):void");
    }

    public void RkBK3rbmyPvWiHUrac(int i) {
        t1ob1jctq87uSyCpeM(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public void SF66oTSCsXABfwyWiU(int i) {
        jguN4azZtOjukyvhIL(this.f5044Pum9NZyDBKoCnecvlx.getResources().getBoolean(i));
    }

    public void TToLdubKjN4ASlJwWv(float f) {
        if (this.f5078osrHU7fvDp2EgxZPfM != f) {
            this.f5078osrHU7fvDp2EgxZPfM = f;
            invalidateSelf();
            auvQiDfBN48eRz3fFq();
        }
    }

    public void TZ2u8Z18RnXun7OSW0(ColorStateList colorStateList) {
        if (this.f5081udcVtCzLTM1Loe9KrX != colorStateList) {
            this.f5081udcVtCzLTM1Loe9KrX = colorStateList;
            if (ayduHasC7VpxsVXE0T()) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this.f5077oocVJL811qFf0j0XXZ, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Tn7MuV14fPMb1UrB5h(int i) {
        X3J0rTi7qZISiATDQK(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void UViYrxCuj6kEgG2Mva(float f) {
        if (this.f5055ZJNyOIPL0usMs2xSAn != f) {
            this.f5055ZJNyOIPL0usMs2xSAn = f;
            invalidateSelf();
            auvQiDfBN48eRz3fFq();
        }
    }

    public void X3J0rTi7qZISiATDQK(float f) {
        if (this.f5059ao3wqKm5CXFuvC0q47 != f) {
            this.f5059ao3wqKm5CXFuvC0q47 = f;
            invalidateSelf();
            auvQiDfBN48eRz3fFq();
        }
    }

    public void X3sgW3wH5gs9BRlOWB(int i) {
        yuvys90eVmNOCmVGXw(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void XfvA8xAblLUDzfjNL9(float f) {
        if (this.f5048Uj8rPa1EWADtk6Oe0S != f) {
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            this.f5048Uj8rPa1EWADtk6Oe0S = f;
            float fPum9NZyDBKoCnecvlx2 = Pum9NZyDBKoCnecvlx();
            invalidateSelf();
            if (fPum9NZyDBKoCnecvlx != fPum9NZyDBKoCnecvlx2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public boolean YIIWDMF3jHAs3E0PkN() {
        return this.f5087zcy2NNbtVXgoGQbfuq;
    }

    public void YUDx3zHgOZWWxq2Qgs(int i) {
        ndQwlXNek6Yo5ZBYrV(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void YiiZd9BUnxc5tLzouk(int i) {
        TToLdubKjN4ASlJwWv(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public Drawable Ywqw2A0s86HeuFkDt0() {
        return this.f5077oocVJL811qFf0j0XXZ;
    }

    public void ZH7ZBRiZvcOTI9arA2(ColorStateList colorStateList) {
        this.f5038KqgKJKIWne3kz1AdHk = true;
        if (this.f5029DfpieXfdYs58yZAiXY != colorStateList) {
            this.f5029DfpieXfdYs58yZAiXY = colorStateList;
            if (K3DzFKxpDGIqdlGY4t()) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this.f5033GyWRxpdt1T8mEJXPoD, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float aRQ2M7vtRaPDEyvpdv() {
        return this.f5082vlBaBOcZ1q1ndWVoXn ? OUd9THiLjZndMj0qdF() : this.f5041OUd9THiLjZndMj0qdF;
    }

    public ColorStateList aUn6Hqsqw2PVM8685Z() {
        return this.f5029DfpieXfdYs58yZAiXY;
    }

    public void auvQiDfBN48eRz3fFq() {
        InterfaceC0079lEeR5KfoEr4xU5yHH7 interfaceC0079lEeR5KfoEr4xU5yHH7 = (InterfaceC0079lEeR5KfoEr4xU5yHH7) this.f5079pgB7Gmjz55y9NQYnAD.get();
        if (interfaceC0079lEeR5KfoEr4xU5yHH7 != null) {
            interfaceC0079lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
        }
    }

    public final boolean ayduHasC7VpxsVXE0T() {
        return this.f5053YlLW4G6OV9TFyuw5ix && this.f5077oocVJL811qFf0j0XXZ != null && this.f5087zcy2NNbtVXgoGQbfuq;
    }

    public final void bBVlTkqEpHW053CjWL(Canvas canvas, Rect rect) {
        if (K3DzFKxpDGIqdlGY4t()) {
            Kh0uC90qEEhuLdpgB9(rect, this.f5066eWK41qw3g36LVd4UnS);
            RectF rectF = this.f5066eWK41qw3g36LVd4UnS;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f5033GyWRxpdt1T8mEJXPoD.setBounds(0, 0, (int) this.f5066eWK41qw3g36LVd4UnS.width(), (int) this.f5066eWK41qw3g36LVd4UnS.height());
            this.f5033GyWRxpdt1T8mEJXPoD.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void cni9M1Tt0N7bwq7oSh(int i) {
        jpEZy3U5wFkT2e9PKQ(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public zZKhbgvUfsK4AEX3r0 cr99CPXhoiknALiHbq() {
        return this.f5032FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm();
    }

    public final void ctWLFN70QQINH1kyYo(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (tf0nfuAZUJWo4SN5He()) {
            float f = this.f5037Kh0uC90qEEhuLdpgB9 + this.f5075k0CbjZvfUz23r8IN6W + this.f5051XdzLv4NdAtTYoEzVzB + this.f5047Tu4WCh2gEwj8E4oHbP + this.f5055ZJNyOIPL0usMs2xSAn;
            if (WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public ColorStateList d4ZdBAtGyjVWTQYsYn() {
        return this.f5046ToH8yzk8U1nKT0PUfY;
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.f5084yL2E9nlEZpg8ZZx8XE;
        int iLEeR5KfoEr4xU5yHH7 = i < 255 ? h7m69eGbRk1hyaVt28.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        O1furmptfI76BGfN0d(canvas, bounds);
        fLSSbwbzFBVpwBH5FM(canvas, bounds);
        if (this.f5082vlBaBOcZ1q1ndWVoXn) {
            super.draw(canvas);
        }
        yvdWWG9COQQotjfedH(canvas, bounds);
        yL2E9nlEZpg8ZZx8XE(canvas, bounds);
        bBVlTkqEpHW053CjWL(canvas, bounds);
        Jsouc4ileb8SxQhxbX(canvas, bounds);
        if (this.f5058aUn6Hqsqw2PVM8685Z) {
            Er40JrQbOM51vCQI8w(canvas, bounds);
        }
        iQCvttGuB7nx4r7kMP(canvas, bounds);
        Fo9071MN8vwEWamAUX(canvas, bounds);
        if (this.f5084yL2E9nlEZpg8ZZx8XE < 255) {
            canvas.restoreToCount(iLEeR5KfoEr4xU5yHH7);
        }
    }

    public void dvmHGYHwlE2ean7ktb(Drawable drawable) {
        if (this.f5077oocVJL811qFf0j0XXZ != drawable) {
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            this.f5077oocVJL811qFf0j0XXZ = drawable;
            float fPum9NZyDBKoCnecvlx2 = Pum9NZyDBKoCnecvlx();
            qKqI9idaJHL0sOqyD4(this.f5077oocVJL811qFf0j0XXZ);
            k0CbjZvfUz23r8IN6W(this.f5077oocVJL811qFf0j0XXZ);
            invalidateSelf();
            if (fPum9NZyDBKoCnecvlx != fPum9NZyDBKoCnecvlx2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public void e5tXAuLbtMC3XyEoX9(RectF rectF) {
        zXY7dgnTfw9Pd9RXel(getBounds(), rectF);
    }

    public float eWK41qw3g36LVd4UnS() {
        if (tf0nfuAZUJWo4SN5He()) {
            return this.f5047Tu4WCh2gEwj8E4oHbP + this.f5051XdzLv4NdAtTYoEzVzB + this.f5075k0CbjZvfUz23r8IN6W;
        }
        return 0.0f;
    }

    public final void evSiTWao80SbJUZk9E(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f5049W3RZ2dTDKrKpS5Mxdk != null) {
            float fPum9NZyDBKoCnecvlx = this.f5062bMSdooljgH14Jgudph + Pum9NZyDBKoCnecvlx() + this.f5078osrHU7fvDp2EgxZPfM;
            float fEWK41qw3g36LVd4UnS = this.f5037Kh0uC90qEEhuLdpgB9 + eWK41qw3g36LVd4UnS() + this.f5055ZJNyOIPL0usMs2xSAn;
            if (WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this) == 0) {
                rectF.left = rect.left + fPum9NZyDBKoCnecvlx;
                rectF.right = rect.right - fEWK41qw3g36LVd4UnS;
            } else {
                rectF.left = rect.left + fEWK41qw3g36LVd4UnS;
                rectF.right = rect.right - fPum9NZyDBKoCnecvlx;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void exhPLopOJ5QWEzRjTU(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        this.f5032FtYx4GXtxwA8al5hBy.Acstmh57AKoSEkEFNJ(zzkhbgvufsk4aex3r0, this.f5044Pum9NZyDBKoCnecvlx);
    }

    public ColorStateList f2zPq7MOnQrtOlZ1Zg() {
        return this.f5081udcVtCzLTM1Loe9KrX;
    }

    public void fB1XGht2x9XoIgekQ8(int i) {
        sKvjC8bExN3ISwwWsb(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public boolean fBZDmBPlAHk1Liuf1T() {
        return lBAL39rPf03qYLFNNP(this.f5056aAp6BD79BhftLCnuvf);
    }

    public float fDXXEWvhMVO3O8mnuS() {
        return this.f5059ao3wqKm5CXFuvC0q47;
    }

    public final void fLSSbwbzFBVpwBH5FM(Canvas canvas, Rect rect) {
        if (this.f5082vlBaBOcZ1q1ndWVoXn) {
            return;
        }
        this.f5064ctWLFN70QQINH1kyYo.setColor(this.f5083xMfAHy6F7qK0zhxhKG);
        this.f5064ctWLFN70QQINH1kyYo.setStyle(Paint.Style.FILL);
        this.f5064ctWLFN70QQINH1kyYo.setColorFilter(MHebQjnRowM60e3HDn());
        this.f5066eWK41qw3g36LVd4UnS.set(rect);
        canvas.drawRoundRect(this.f5066eWK41qw3g36LVd4UnS, aRQ2M7vtRaPDEyvpdv(), aRQ2M7vtRaPDEyvpdv(), this.f5064ctWLFN70QQINH1kyYo);
    }

    public float g0OBkYSIvp0JYnHPjC() {
        return this.f5027CSih7GetOUab1dYQjM;
    }

    public final void gS59iOkCM8TpW4A2ew(ColorStateList colorStateList) {
        if (this.f5050WWC27LAMFqFFBzfbNw != colorStateList) {
            this.f5050WWC27LAMFqFFBzfbNw = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5084yL2E9nlEZpg8ZZx8XE;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5031Fo9071MN8vwEWamAUX;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f5059ao3wqKm5CXFuvC0q47;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f5062bMSdooljgH14Jgudph + Pum9NZyDBKoCnecvlx() + this.f5078osrHU7fvDp2EgxZPfM + this.f5032FtYx4GXtxwA8al5hBy.TCyPEKSzIyweCN5yp1(vExXQwwMm8C1aKdGdj().toString()) + this.f5055ZJNyOIPL0usMs2xSAn + eWK41qw3g36LVd4UnS() + this.f5037Kh0uC90qEEhuLdpgB9), this.f5069fDXXEWvhMVO3O8mnuS);
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5082vlBaBOcZ1q1ndWVoXn) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f5041OUd9THiLjZndMj0qdF);
        } else {
            outline.setRoundRect(bounds, this.f5041OUd9THiLjZndMj0qdF);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public final boolean gpnYwZkFpQwu7zi2gb(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f5050WWC27LAMFqFFBzfbNw;
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(colorStateList != null ? colorStateList.getColorForState(iArr, this.f5060ayduHasC7VpxsVXE0T) : 0);
        boolean state = true;
        if (this.f5060ayduHasC7VpxsVXE0T != iE54J8UWNHWALQNixXM) {
            this.f5060ayduHasC7VpxsVXE0T = iE54J8UWNHWALQNixXM;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f5045THTDvPxsHqMeGb512f;
        int iE54J8UWNHWALQNixXM2 = e54J8UWNHWALQNixXM(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5083xMfAHy6F7qK0zhxhKG) : 0);
        if (this.f5083xMfAHy6F7qK0zhxhKG != iE54J8UWNHWALQNixXM2) {
            this.f5083xMfAHy6F7qK0zhxhKG = iE54J8UWNHWALQNixXM2;
            zOnStateChange = true;
        }
        int iPbVGzGjWvY2LDXC8vo = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(iE54J8UWNHWALQNixXM, iE54J8UWNHWALQNixXM2);
        if ((this.f5036Jsouc4ileb8SxQhxbX != iPbVGzGjWvY2LDXC8vo) | (xHA29AmDt6y96AnB3t() == null)) {
            this.f5036Jsouc4ileb8SxQhxbX = iPbVGzGjWvY2LDXC8vo;
            YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(iPbVGzGjWvY2LDXC8vo));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f5073jCtUeU2YI1poCxWcjm;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5070fLSSbwbzFBVpwBH5FM) : 0;
        if (this.f5070fLSSbwbzFBVpwBH5FM != colorForState) {
            this.f5070fLSSbwbzFBVpwBH5FM = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f5034HR5vAalpgOKVm2T0Gq == null || !s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(iArr)) ? 0 : this.f5034HR5vAalpgOKVm2T0Gq.getColorForState(iArr, this.f5061bBVlTkqEpHW053CjWL);
        if (this.f5061bBVlTkqEpHW053CjWL != colorForState2) {
            this.f5061bBVlTkqEpHW053CjWL = colorForState2;
            if (this.f5057aRQ2M7vtRaPDEyvpdv) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f5032FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm() == null || this.f5032FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm().pbVGzGjWvY2LDXC8vo() == null) ? 0 : this.f5032FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm().pbVGzGjWvY2LDXC8vo().getColorForState(iArr, this.f5085yvdWWG9COQQotjfedH);
        if (this.f5085yvdWWG9COQQotjfedH != colorForState3) {
            this.f5085yvdWWG9COQQotjfedH = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = WaWv1mJ1ya3uoEaKqz(getState(), R.attr.state_checked) && this.f5087zcy2NNbtVXgoGQbfuq;
        if (this.f5040O1furmptfI76BGfN0d == z2 || this.f5077oocVJL811qFf0j0XXZ == null) {
            z = false;
        } else {
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            this.f5040O1furmptfI76BGfN0d = z2;
            if (fPum9NZyDBKoCnecvlx != Pum9NZyDBKoCnecvlx()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f5054Ywqw2A0s86HeuFkDt0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f5072iQCvttGuB7nx4r7kMP) : 0;
        if (this.f5072iQCvttGuB7nx4r7kMP != colorForState4) {
            this.f5072iQCvttGuB7nx4r7kMP = colorForState4;
            this.f5030Er40JrQbOM51vCQI8w = husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(this, this.f5054Ywqw2A0s86HeuFkDt0, this.f5068f2zPq7MOnQrtOlZ1Zg);
        } else {
            state = zOnStateChange;
        }
        if (lBAL39rPf03qYLFNNP(this.f5033GyWRxpdt1T8mEJXPoD)) {
            state |= this.f5033GyWRxpdt1T8mEJXPoD.setState(iArr);
        }
        if (lBAL39rPf03qYLFNNP(this.f5077oocVJL811qFf0j0XXZ)) {
            state |= this.f5077oocVJL811qFf0j0XXZ.setState(iArr);
        }
        if (lBAL39rPf03qYLFNNP(this.f5056aAp6BD79BhftLCnuvf)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f5056aAp6BD79BhftLCnuvf.setState(iArr3);
        }
        if (s3fjYDxWOUexjjVgyA.f5620lEeR5KfoEr4xU5yHH7 && lBAL39rPf03qYLFNNP(this.f5076lLKzvdU99Iw80uVD5I)) {
            state |= this.f5076lLKzvdU99Iw80uVD5I.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            auvQiDfBN48eRz3fFq();
        }
        return state;
    }

    public void h3D8MhcyLuC2SOP1fB(float f) {
        if (this.f5075k0CbjZvfUz23r8IN6W != f) {
            this.f5075k0CbjZvfUz23r8IN6W = f;
            invalidateSelf();
            if (tf0nfuAZUJWo4SN5He()) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public float h6NrAcYSuIyiU1qV6F() {
        return this.f5078osrHU7fvDp2EgxZPfM;
    }

    public ColorStateList h7m69eGbRk1hyaVt28() {
        return this.f5080tXWeW0sqVddf7ZBflq;
    }

    public boolean hNwHJdfN8Sg5H67aR5() {
        return this.f5058aUn6Hqsqw2PVM8685Z;
    }

    public void hUNDUI3oB5uci3ylnY(boolean z) {
        if (this.f5053YlLW4G6OV9TFyuw5ix != z) {
            boolean zKf6IFvVH2efp6249v2 = Kf6IFvVH2efp6249v2();
            this.f5053YlLW4G6OV9TFyuw5ix = z;
            boolean zKf6IFvVH2efp6249v22 = Kf6IFvVH2efp6249v2();
            if (zKf6IFvVH2efp6249v2 != zKf6IFvVH2efp6249v22) {
                if (zKf6IFvVH2efp6249v22) {
                    k0CbjZvfUz23r8IN6W(this.f5077oocVJL811qFf0j0XXZ);
                } else {
                    qKqI9idaJHL0sOqyD4(this.f5077oocVJL811qFf0j0XXZ);
                }
                invalidateSelf();
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public boolean hgxXdWVkE1CPHCTwpz() {
        return this.f5043PPkm9uUfOJHHYveeLT;
    }

    public ColorStateList i8aHOwH04efS6lZ3Oa() {
        return this.f5073jCtUeU2YI1poCxWcjm;
    }

    public final void iQCvttGuB7nx4r7kMP(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (tf0nfuAZUJWo4SN5He()) {
            jocVUfxESVhVJU8LoH(rect, this.f5066eWK41qw3g36LVd4UnS);
            RectF rectF = this.f5066eWK41qw3g36LVd4UnS;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f5056aAp6BD79BhftLCnuvf.setBounds(0, 0, (int) this.f5066eWK41qw3g36LVd4UnS.width(), (int) this.f5066eWK41qw3g36LVd4UnS.height());
            if (s3fjYDxWOUexjjVgyA.f5620lEeR5KfoEr4xU5yHH7) {
                this.f5076lLKzvdU99Iw80uVD5I.setBounds(this.f5056aAp6BD79BhftLCnuvf.getBounds());
                this.f5076lLKzvdU99Iw80uVD5I.jumpToCurrentState();
                drawable = this.f5076lLKzvdU99Iw80uVD5I;
            } else {
                drawable = this.f5056aAp6BD79BhftLCnuvf;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void iiJlEZjcw2pMDvSjYw(int i) {
        exhPLopOJ5QWEzRjTU(new zZKhbgvUfsK4AEX3r0(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return dCumDqZdWZ8NLrsgb7(this.f5050WWC27LAMFqFFBzfbNw) || dCumDqZdWZ8NLrsgb7(this.f5045THTDvPxsHqMeGb512f) || dCumDqZdWZ8NLrsgb7(this.f5073jCtUeU2YI1poCxWcjm) || (this.f5057aRQ2M7vtRaPDEyvpdv && dCumDqZdWZ8NLrsgb7(this.f5034HR5vAalpgOKVm2T0Gq)) || ayaSAlBnO403UB0TMR(this.f5032FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm()) || ayduHasC7VpxsVXE0T() || lBAL39rPf03qYLFNNP(this.f5033GyWRxpdt1T8mEJXPoD) || lBAL39rPf03qYLFNNP(this.f5077oocVJL811qFf0j0XXZ) || dCumDqZdWZ8NLrsgb7(this.f5054Ywqw2A0s86HeuFkDt0);
    }

    public void jLObTZifvCGJKb1uVO(boolean z) {
        if (this.f5057aRQ2M7vtRaPDEyvpdv != z) {
            this.f5057aRQ2M7vtRaPDEyvpdv = z;
            BzLnH9Ew63rlrNW23o();
            onStateChange(getState());
        }
    }

    public void jguN4azZtOjukyvhIL(boolean z) {
        if (this.f5042OqIo5QF00RDxUQb4qq != z) {
            boolean zK3DzFKxpDGIqdlGY4t = K3DzFKxpDGIqdlGY4t();
            this.f5042OqIo5QF00RDxUQb4qq = z;
            boolean zK3DzFKxpDGIqdlGY4t2 = K3DzFKxpDGIqdlGY4t();
            if (zK3DzFKxpDGIqdlGY4t != zK3DzFKxpDGIqdlGY4t2) {
                if (zK3DzFKxpDGIqdlGY4t2) {
                    k0CbjZvfUz23r8IN6W(this.f5033GyWRxpdt1T8mEJXPoD);
                } else {
                    qKqI9idaJHL0sOqyD4(this.f5033GyWRxpdt1T8mEJXPoD);
                }
                invalidateSelf();
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public final void jocVUfxESVhVJU8LoH(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (tf0nfuAZUJWo4SN5He()) {
            float f = this.f5037Kh0uC90qEEhuLdpgB9 + this.f5075k0CbjZvfUz23r8IN6W;
            if (WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f5051XdzLv4NdAtTYoEzVzB;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f5051XdzLv4NdAtTYoEzVzB;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.f5051XdzLv4NdAtTYoEzVzB;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public void jpEZy3U5wFkT2e9PKQ(float f) {
        if (this.f5051XdzLv4NdAtTYoEzVzB != f) {
            this.f5051XdzLv4NdAtTYoEzVzB = f;
            invalidateSelf();
            if (tf0nfuAZUJWo4SN5He()) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public TextUtils.TruncateAt jsjSYEu4NPZjZxcfmI() {
        return this.f5026Bc5OTyAfOKVCQb8CEz;
    }

    public final void k0CbjZvfUz23r8IN6W(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(drawable, WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5056aAp6BD79BhftLCnuvf) {
            if (drawable.isStateful()) {
                drawable.setState(QW0Trt6m3nVBNaYFnP());
            }
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, this.f5046ToH8yzk8U1nKT0PUfY);
            return;
        }
        Drawable drawable2 = this.f5033GyWRxpdt1T8mEJXPoD;
        if (drawable == drawable2 && this.f5038KqgKJKIWne3kz1AdHk) {
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable2, this.f5029DfpieXfdYs58yZAiXY);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // WaWv1mJ1ya3uoEaKqz.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA
    public void lEeR5KfoEr4xU5yHH7() {
        auvQiDfBN48eRz3fFq();
        invalidateSelf();
    }

    public void mhQSzVvPFnByVGnwX9(boolean z) {
        if (this.f5043PPkm9uUfOJHHYveeLT != z) {
            boolean zTf0nfuAZUJWo4SN5He = tf0nfuAZUJWo4SN5He();
            this.f5043PPkm9uUfOJHHYveeLT = z;
            boolean zTf0nfuAZUJWo4SN5He2 = tf0nfuAZUJWo4SN5He();
            if (zTf0nfuAZUJWo4SN5He != zTf0nfuAZUJWo4SN5He2) {
                if (zTf0nfuAZUJWo4SN5He2) {
                    k0CbjZvfUz23r8IN6W(this.f5056aAp6BD79BhftLCnuvf);
                } else {
                    qKqI9idaJHL0sOqyD4(this.f5056aAp6BD79BhftLCnuvf);
                }
                invalidateSelf();
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public void msljfiu2GA8S2iWtz0(int i) {
        this.f5069fDXXEWvhMVO3O8mnuS = i;
    }

    public void nZURNaK44ts4XNCkYr(int i) {
        q0O8WPjPHflNoINQ2T(HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public void ndQwlXNek6Yo5ZBYrV(float f) {
        if (this.f5047Tu4WCh2gEwj8E4oHbP != f) {
            this.f5047Tu4WCh2gEwj8E4oHbP = f;
            invalidateSelf();
            if (tf0nfuAZUJWo4SN5He()) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public void njV42vQJoqlfw05NNQ(int i) {
        ADbagDwlO3sAb2p0ry(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public float oOMFI1Dcqcg1BSVNty() {
        return this.f5047Tu4WCh2gEwj8E4oHbP;
    }

    public CharSequence oXIAAdret8ERrYfuyf() {
        return this.f5039LU0fFDMACqnfIfA1AZ;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (K3DzFKxpDGIqdlGY4t()) {
            zOnLayoutDirectionChanged |= WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f5033GyWRxpdt1T8mEJXPoD, i);
        }
        if (Kf6IFvVH2efp6249v2()) {
            zOnLayoutDirectionChanged |= WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f5077oocVJL811qFf0j0XXZ, i);
        }
        if (tf0nfuAZUJWo4SN5He()) {
            zOnLayoutDirectionChanged |= WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f5056aAp6BD79BhftLCnuvf, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (K3DzFKxpDGIqdlGY4t()) {
            zOnLevelChange |= this.f5033GyWRxpdt1T8mEJXPoD.setLevel(i);
        }
        if (Kf6IFvVH2efp6249v2()) {
            zOnLevelChange |= this.f5077oocVJL811qFf0j0XXZ.setLevel(i);
        }
        if (tf0nfuAZUJWo4SN5He()) {
            zOnLevelChange |= this.f5056aAp6BD79BhftLCnuvf.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f5082vlBaBOcZ1q1ndWVoXn) {
            super.onStateChange(iArr);
        }
        return gpnYwZkFpQwu7zi2gb(iArr, QW0Trt6m3nVBNaYFnP());
    }

    public float owCQzRKpGarpL4247z() {
        return this.f5052XzJ1BS7H9Ilbkv4eVM;
    }

    public void oyZAo7y5frVexNxTMd(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f5071hUNBy66ZO1wVLJGW3l = hJFh0TGMpafqLE9haL;
    }

    public Drawable pgB7Gmjz55y9NQYnAD() {
        Drawable drawable = this.f5033GyWRxpdt1T8mEJXPoD;
        if (drawable != null) {
            return WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(drawable);
        }
        return null;
    }

    public void pifLUtPYGKkyBx85TF(CharSequence charSequence) {
        if (this.f5039LU0fFDMACqnfIfA1AZ != charSequence) {
            this.f5039LU0fFDMACqnfIfA1AZ = XzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL().IPyIQcaNa8aB7drBED(charSequence);
            invalidateSelf();
        }
    }

    public boolean pjij9fAFhRRn230kOs(int[] iArr) {
        if (Arrays.equals(this.f5035HZ4bptRS9XIcK1CV95, iArr)) {
            return false;
        }
        this.f5035HZ4bptRS9XIcK1CV95 = iArr;
        if (tf0nfuAZUJWo4SN5He()) {
            return gpnYwZkFpQwu7zi2gb(getState(), iArr);
        }
        return false;
    }

    public void q0O8WPjPHflNoINQ2T(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f5063cT5Hs3CQpLK8NvlZAw = hJFh0TGMpafqLE9haL;
    }

    public final void qKqI9idaJHL0sOqyD4(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void qnb0B0kp1U5mzuoCqH(int i) {
        xtQ8QaNqF3hKvhL94g(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void sKvjC8bExN3ISwwWsb(float f) {
        if (this.f5065e2F9F6h8YJxTHwLCa0 != f) {
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            this.f5065e2F9F6h8YJxTHwLCa0 = f;
            float fPum9NZyDBKoCnecvlx2 = Pum9NZyDBKoCnecvlx();
            invalidateSelf();
            if (fPum9NZyDBKoCnecvlx != fPum9NZyDBKoCnecvlx2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public void sKw6Jz5uGcQ479KwIW(boolean z) {
        if (this.f5087zcy2NNbtVXgoGQbfuq != z) {
            this.f5087zcy2NNbtVXgoGQbfuq = z;
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            if (!z && this.f5040O1furmptfI76BGfN0d) {
                this.f5040O1furmptfI76BGfN0d = false;
            }
            float fPum9NZyDBKoCnecvlx2 = Pum9NZyDBKoCnecvlx();
            invalidateSelf();
            if (fPum9NZyDBKoCnecvlx != fPum9NZyDBKoCnecvlx2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f5084yL2E9nlEZpg8ZZx8XE != i) {
            this.f5084yL2E9nlEZpg8ZZx8XE = i;
            invalidateSelf();
        }
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5031Fo9071MN8vwEWamAUX != colorFilter) {
            this.f5031Fo9071MN8vwEWamAUX = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f5054Ywqw2A0s86HeuFkDt0 != colorStateList) {
            this.f5054Ywqw2A0s86HeuFkDt0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f5068f2zPq7MOnQrtOlZ1Zg != mode) {
            this.f5068f2zPq7MOnQrtOlZ1Zg = mode;
            this.f5030Er40JrQbOM51vCQI8w = husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(this, this.f5054Ywqw2A0s86HeuFkDt0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (K3DzFKxpDGIqdlGY4t()) {
            visible |= this.f5033GyWRxpdt1T8mEJXPoD.setVisible(z, z2);
        }
        if (Kf6IFvVH2efp6249v2()) {
            visible |= this.f5077oocVJL811qFf0j0XXZ.setVisible(z, z2);
        }
        if (tf0nfuAZUJWo4SN5He()) {
            visible |= this.f5056aAp6BD79BhftLCnuvf.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void suHivzALoCSfNps0XP(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f5049W3RZ2dTDKrKpS5Mxdk, charSequence)) {
            return;
        }
        this.f5049W3RZ2dTDKrKpS5Mxdk = charSequence;
        this.f5032FtYx4GXtxwA8al5hBy.Z9WdNiOsPR0y54zHW4(true);
        invalidateSelf();
        auvQiDfBN48eRz3fFq();
    }

    public void t1ob1jctq87uSyCpeM(Drawable drawable) {
        Drawable drawableUAIIhSQWhOmxUb3Bqo = uAIIhSQWhOmxUb3Bqo();
        if (drawableUAIIhSQWhOmxUb3Bqo != drawable) {
            float fEWK41qw3g36LVd4UnS = eWK41qw3g36LVd4UnS();
            this.f5056aAp6BD79BhftLCnuvf = drawable != null ? WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate() : null;
            if (s3fjYDxWOUexjjVgyA.f5620lEeR5KfoEr4xU5yHH7) {
                KYIcm5hlxje4bqExkp();
            }
            float fEWK41qw3g36LVd4UnS2 = eWK41qw3g36LVd4UnS();
            qKqI9idaJHL0sOqyD4(drawableUAIIhSQWhOmxUb3Bqo);
            if (tf0nfuAZUJWo4SN5He()) {
                k0CbjZvfUz23r8IN6W(this.f5056aAp6BD79BhftLCnuvf);
            }
            invalidateSelf();
            if (fEWK41qw3g36LVd4UnS != fEWK41qw3g36LVd4UnS2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public void tGGjvtdOhUewv2twsg(int i) {
        JRgQbcjdTfLJPT0BU7(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public final boolean tf0nfuAZUJWo4SN5He() {
        return this.f5043PPkm9uUfOJHHYveeLT && this.f5056aAp6BD79BhftLCnuvf != null;
    }

    public final float tmIBXGVvBsrJ7i63G2() {
        Drawable drawable = this.f5040O1furmptfI76BGfN0d ? this.f5077oocVJL811qFf0j0XXZ : this.f5033GyWRxpdt1T8mEJXPoD;
        float f = this.f5065e2F9F6h8YJxTHwLCa0;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public Drawable uAIIhSQWhOmxUb3Bqo() {
        Drawable drawable = this.f5056aAp6BD79BhftLCnuvf;
        if (drawable != null) {
            return WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(drawable);
        }
        return null;
    }

    public void uWxB7TH05HzXzGqLIZ(TextUtils.TruncateAt truncateAt) {
        this.f5026Bc5OTyAfOKVCQb8CEz = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public CharSequence vExXQwwMm8C1aKdGdj() {
        return this.f5049W3RZ2dTDKrKpS5Mxdk;
    }

    public void vcruDMeiXYQeTlT3OI(int i) {
        h3D8MhcyLuC2SOP1fB(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public float vlBaBOcZ1q1ndWVoXn() {
        return this.f5062bMSdooljgH14Jgudph;
    }

    public void vzXHdKiCTh4zilt9z1(boolean z) {
        this.f5058aUn6Hqsqw2PVM8685Z = z;
    }

    public void w859GrF8FXGM1qrYSH(int i) {
        xt9LcS8xZRgoStfDrh(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public void w9kKjxxNBwNcD4xB6O(ColorStateList colorStateList) {
        if (this.f5073jCtUeU2YI1poCxWcjm != colorStateList) {
            this.f5073jCtUeU2YI1poCxWcjm = colorStateList;
            if (this.f5082vlBaBOcZ1q1ndWVoXn) {
                Uj8rPa1EWADtk6Oe0S(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void wUKf1mNArSjssthGmN(int i) {
        zQjb36M22TWHJmh54i(this.f5044Pum9NZyDBKoCnecvlx.getResources().getDimension(i));
    }

    public void xt9LcS8xZRgoStfDrh(Drawable drawable) {
        Drawable drawablePgB7Gmjz55y9NQYnAD = pgB7Gmjz55y9NQYnAD();
        if (drawablePgB7Gmjz55y9NQYnAD != drawable) {
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            this.f5033GyWRxpdt1T8mEJXPoD = drawable != null ? WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate() : null;
            float fPum9NZyDBKoCnecvlx2 = Pum9NZyDBKoCnecvlx();
            qKqI9idaJHL0sOqyD4(drawablePgB7Gmjz55y9NQYnAD);
            if (K3DzFKxpDGIqdlGY4t()) {
                k0CbjZvfUz23r8IN6W(this.f5033GyWRxpdt1T8mEJXPoD);
            }
            invalidateSelf();
            if (fPum9NZyDBKoCnecvlx != fPum9NZyDBKoCnecvlx2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public void xtQ8QaNqF3hKvhL94g(float f) {
        if (this.f5027CSih7GetOUab1dYQjM != f) {
            float fPum9NZyDBKoCnecvlx = Pum9NZyDBKoCnecvlx();
            this.f5027CSih7GetOUab1dYQjM = f;
            float fPum9NZyDBKoCnecvlx2 = Pum9NZyDBKoCnecvlx();
            invalidateSelf();
            if (fPum9NZyDBKoCnecvlx != fPum9NZyDBKoCnecvlx2) {
                auvQiDfBN48eRz3fFq();
            }
        }
    }

    public final void yL2E9nlEZpg8ZZx8XE(Canvas canvas, Rect rect) {
        this.f5064ctWLFN70QQINH1kyYo.setColor(this.f5061bBVlTkqEpHW053CjWL);
        this.f5064ctWLFN70QQINH1kyYo.setStyle(Paint.Style.FILL);
        this.f5066eWK41qw3g36LVd4UnS.set(rect);
        if (!this.f5082vlBaBOcZ1q1ndWVoXn) {
            canvas.drawRoundRect(this.f5066eWK41qw3g36LVd4UnS, aRQ2M7vtRaPDEyvpdv(), aRQ2M7vtRaPDEyvpdv(), this.f5064ctWLFN70QQINH1kyYo);
        } else {
            IPyIQcaNa8aB7drBED(new RectF(rect), this.f5028DFYiVi7zXozAjRciKa);
            super.OANkd3mP6AYvwbNLJM(canvas, this.f5064ctWLFN70QQINH1kyYo, this.f5028DFYiVi7zXozAjRciKa, Y43RdunnpKgpbny0lE());
        }
    }

    public float yXUWiIShOcfJRNCmU8() {
        return this.f5075k0CbjZvfUz23r8IN6W;
    }

    public void yuvys90eVmNOCmVGXw(float f) {
        if (this.f5062bMSdooljgH14Jgudph != f) {
            this.f5062bMSdooljgH14Jgudph = f;
            invalidateSelf();
            auvQiDfBN48eRz3fFq();
        }
    }

    public final void yvdWWG9COQQotjfedH(Canvas canvas, Rect rect) {
        if (this.f5052XzJ1BS7H9Ilbkv4eVM <= 0.0f || this.f5082vlBaBOcZ1q1ndWVoXn) {
            return;
        }
        this.f5064ctWLFN70QQINH1kyYo.setColor(this.f5070fLSSbwbzFBVpwBH5FM);
        this.f5064ctWLFN70QQINH1kyYo.setStyle(Paint.Style.STROKE);
        if (!this.f5082vlBaBOcZ1q1ndWVoXn) {
            this.f5064ctWLFN70QQINH1kyYo.setColorFilter(MHebQjnRowM60e3HDn());
        }
        RectF rectF = this.f5066eWK41qw3g36LVd4UnS;
        float f = rect.left;
        float f2 = this.f5052XzJ1BS7H9Ilbkv4eVM;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.f5041OUd9THiLjZndMj0qdF - (this.f5052XzJ1BS7H9Ilbkv4eVM / 2.0f);
        canvas.drawRoundRect(this.f5066eWK41qw3g36LVd4UnS, f3, f3, this.f5064ctWLFN70QQINH1kyYo);
    }

    public void zQjb36M22TWHJmh54i(float f) {
        if (this.f5037Kh0uC90qEEhuLdpgB9 != f) {
            this.f5037Kh0uC90qEEhuLdpgB9 = f;
            invalidateSelf();
            auvQiDfBN48eRz3fFq();
        }
    }

    public void zWzrlx9vIdLp7FoEMD(int i) {
        dvmHGYHwlE2ean7ktb(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f5044Pum9NZyDBKoCnecvlx, i));
    }

    public final void zXY7dgnTfw9Pd9RXel(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (tf0nfuAZUJWo4SN5He()) {
            float f = this.f5037Kh0uC90qEEhuLdpgB9 + this.f5075k0CbjZvfUz23r8IN6W + this.f5051XdzLv4NdAtTYoEzVzB + this.f5047Tu4WCh2gEwj8E4oHbP + this.f5055ZJNyOIPL0usMs2xSAn;
            if (WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }
}
