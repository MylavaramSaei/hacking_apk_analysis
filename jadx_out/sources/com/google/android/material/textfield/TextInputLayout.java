package com.google.android.material.textfield;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import Tu4WCh2gEwj8E4oHbP.hoXrIDAFrSwfShk8da;
import W3RZ2dTDKrKpS5Mxdk.R9SAhYMerGybF9OAjL;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import auvQiDfBN48eRz3fFq.G7AC3DWIx9i9fdanjk;
import auvQiDfBN48eRz3fFq.VItLRw50eXTZeEfGl0;
import auvQiDfBN48eRz3fFq.sTkWmhpZ5b1ArQIw4K;
import ayaSAlBnO403UB0TMR.Z9WdNiOsPR0y54zHW4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;
import tmIBXGVvBsrJ7i63G2.IPyIQcaNa8aB7drBED;
import tmIBXGVvBsrJ7i63G2.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Er40JrQbOM51vCQI8w, reason: collision with root package name */
    public static final int f5318Er40JrQbOM51vCQI8w = pbVGzGjWvY2LDXC8vo.f7170zZKhbgvUfsK4AEX3r0;

    /* renamed from: Ywqw2A0s86HeuFkDt0, reason: collision with root package name */
    public static final int[][] f5319Ywqw2A0s86HeuFkDt0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public Tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0 f5320A49QRPHynYLCBN0SqP;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final G7AC3DWIx9i9fdanjk f5321Acstmh57AKoSEkEFNJ;

    /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
    public int f5322CSih7GetOUab1dYQjM;

    /* renamed from: DFYiVi7zXozAjRciKa, reason: collision with root package name */
    public int f5323DFYiVi7zXozAjRciKa;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 f5324DfpieXfdYs58yZAiXY;

    /* renamed from: Fo9071MN8vwEWamAUX, reason: collision with root package name */
    public boolean f5325Fo9071MN8vwEWamAUX;

    /* renamed from: FtYx4GXtxwA8al5hBy, reason: collision with root package name */
    public int f5326FtYx4GXtxwA8al5hBy;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public ColorStateList f5327G7AC3DWIx9i9fdanjk;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public boolean f5328GyWRxpdt1T8mEJXPoD;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7 f5329HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public int f5330IPyIQcaNa8aB7drBED;

    /* renamed from: Jsouc4ileb8SxQhxbX, reason: collision with root package name */
    public boolean f5331Jsouc4ileb8SxQhxbX;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f5332KYHag8HRDlnO3X9zmZ;

    /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
    public ColorStateList f5333Kh0uC90qEEhuLdpgB9;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4 f5334KqgKJKIWne3kz1AdHk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public Tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0 f5335LIMtzhnLwQyigzK0KO;

    /* renamed from: LU0fFDMACqnfIfA1AZ, reason: collision with root package name */
    public int f5336LU0fFDMACqnfIfA1AZ;

    /* renamed from: O1furmptfI76BGfN0d, reason: collision with root package name */
    public ValueAnimator f5337O1furmptfI76BGfN0d;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public int f5338OANkd3mP6AYvwbNLJM;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public boolean f5339OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public StateListDrawable f5340OqIo5QF00RDxUQb4qq;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public boolean f5341PPkm9uUfOJHHYveeLT;

    /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
    public ColorStateList f5342Pum9NZyDBKoCnecvlx;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public TextView f5343R9SAhYMerGybF9OAjL;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f5344T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f5345TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public ColorStateList f5346THTDvPxsHqMeGb512f;

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public int f5347ToH8yzk8U1nKT0PUfY;

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public int f5348Tu4WCh2gEwj8E4oHbP;

    /* renamed from: Uj8rPa1EWADtk6Oe0S, reason: collision with root package name */
    public Drawable f5349Uj8rPa1EWADtk6Oe0S;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public ColorStateList f5350VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 f5351W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public ColorStateList f5352WWC27LAMFqFFBzfbNw;

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public int f5353XdzLv4NdAtTYoEzVzB;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public boolean f5354XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f5355Y43RdunnpKgpbny0lE;

    /* renamed from: YlLW4G6OV9TFyuw5ix, reason: collision with root package name */
    public int f5356YlLW4G6OV9TFyuw5ix;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f5357Z9WdNiOsPR0y54zHW4;

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public Drawable f5358ZJNyOIPL0usMs2xSAn;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public final int f5359aAp6BD79BhftLCnuvf;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public TextView f5360aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public ColorStateList f5361ao3wqKm5CXFuvC0q47;

    /* renamed from: ayduHasC7VpxsVXE0T, reason: collision with root package name */
    public int f5362ayduHasC7VpxsVXE0T;

    /* renamed from: bBVlTkqEpHW053CjWL, reason: collision with root package name */
    public boolean f5363bBVlTkqEpHW053CjWL;

    /* renamed from: bMSdooljgH14Jgudph, reason: collision with root package name */
    public Typeface f5364bMSdooljgH14Jgudph;

    /* renamed from: cT5Hs3CQpLK8NvlZAw, reason: collision with root package name */
    public final Rect f5365cT5Hs3CQpLK8NvlZAw;

    /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
    public int f5366ctWLFN70QQINH1kyYo;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 f5367e2F9F6h8YJxTHwLCa0;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f5368e54J8UWNHWALQNixXM;

    /* renamed from: eWK41qw3g36LVd4UnS, reason: collision with root package name */
    public ColorStateList f5369eWK41qw3g36LVd4UnS;

    /* renamed from: evSiTWao80SbJUZk9E, reason: collision with root package name */
    public int f5370evSiTWao80SbJUZk9E;

    /* renamed from: fLSSbwbzFBVpwBH5FM, reason: collision with root package name */
    public final WaWv1mJ1ya3uoEaKqz.lEeR5KfoEr4xU5yHH7 f5371fLSSbwbzFBVpwBH5FM;

    /* renamed from: hUNBy66ZO1wVLJGW3l, reason: collision with root package name */
    public final RectF f5372hUNBy66ZO1wVLJGW3l;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f5373hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public CharSequence f5374husNiw3snxdgZPAGJm;

    /* renamed from: iQCvttGuB7nx4r7kMP, reason: collision with root package name */
    public boolean f5375iQCvttGuB7nx4r7kMP;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public CharSequence f5376jCtUeU2YI1poCxWcjm;

    /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
    public int f5377jocVUfxESVhVJU8LoH;

    /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
    public Drawable f5378k0CbjZvfUz23r8IN6W;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final FrameLayout f5379lEeR5KfoEr4xU5yHH7;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public int f5380lLKzvdU99Iw80uVD5I;

    /* renamed from: oocVJL811qFf0j0XXZ, reason: collision with root package name */
    public int f5381oocVJL811qFf0j0XXZ;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public final LinkedHashSet f5382osrHU7fvDp2EgxZPfM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f5383pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final VItLRw50eXTZeEfGl0 f5384s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public CharSequence f5385sTkWmhpZ5b1ArQIw4K;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 f5386tXWeW0sqVddf7ZBflq;

    /* renamed from: udcVtCzLTM1Loe9KrX, reason: collision with root package name */
    public final Rect f5387udcVtCzLTM1Loe9KrX;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public int f5388xHA29AmDt6y96AnB3t;

    /* renamed from: xMfAHy6F7qK0zhxhKG, reason: collision with root package name */
    public int f5389xMfAHy6F7qK0zhxhKG;

    /* renamed from: yL2E9nlEZpg8ZZx8XE, reason: collision with root package name */
    public boolean f5390yL2E9nlEZpg8ZZx8XE;

    /* renamed from: yvdWWG9COQQotjfedH, reason: collision with root package name */
    public boolean f5391yvdWWG9COQQotjfedH;

    /* renamed from: zXY7dgnTfw9Pd9RXel, reason: collision with root package name */
    public int f5392zXY7dgnTfw9Pd9RXel;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public EditText f5393zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f5394zaq8hOURtfwbcX17cG;

    /* renamed from: zcy2NNbtVXgoGQbfuq, reason: collision with root package name */
    public int f5395zcy2NNbtVXgoGQbfuq;

    public class HJFh0TGMpafqLE9haL implements ValueAnimator.AnimatorUpdateListener {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f5371fLSSbwbzFBVpwBH5FM.ZJNyOIPL0usMs2xSAn(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface KYHag8HRDlnO3X9zmZ {
        void lEeR5KfoEr4xU5yHH7(TextInputLayout textInputLayout);
    }

    public static class TCyPEKSzIyweCN5yp1 extends aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7 {
        public static final Parcelable.Creator<TCyPEKSzIyweCN5yp1> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public CharSequence f5397HJFh0TGMpafqLE9haL;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f5398zZKhbgvUfsK4AEX3r0;

        public class lEeR5KfoEr4xU5yHH7 implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1[] newArray(int i) {
                return new TCyPEKSzIyweCN5yp1[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1 createFromParcel(Parcel parcel) {
                return new TCyPEKSzIyweCN5yp1(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public TCyPEKSzIyweCN5yp1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new TCyPEKSzIyweCN5yp1(parcel, classLoader);
            }
        }

        public TCyPEKSzIyweCN5yp1(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5397HJFh0TGMpafqLE9haL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5398zZKhbgvUfsK4AEX3r0 = parcel.readInt() == 1;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5397HJFh0TGMpafqLE9haL) + "}";
        }

        @Override // aAp6BD79BhftLCnuvf.lEeR5KfoEr4xU5yHH7, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f5397HJFh0TGMpafqLE9haL, parcel, i);
            parcel.writeInt(this.f5398zZKhbgvUfsK4AEX3r0 ? 1 : 0);
        }

        public TCyPEKSzIyweCN5yp1(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface husNiw3snxdgZPAGJm {
        int lEeR5KfoEr4xU5yHH7(Editable editable);
    }

    public class lEeR5KfoEr4xU5yHH7 implements TextWatcher {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.O1furmptfI76BGfN0d(!r0.f5390yL2E9nlEZpg8ZZx8XE);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f5357Z9WdNiOsPR0y54zHW4) {
                textInputLayout.eWK41qw3g36LVd4UnS(editable);
            }
            if (TextInputLayout.this.f5355Y43RdunnpKgpbny0lE) {
                TextInputLayout.this.Er40JrQbOM51vCQI8w(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5329HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED();
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final TextInputLayout f5401zZKhbgvUfsK4AEX3r0;

        public zZKhbgvUfsK4AEX3r0(TextInputLayout textInputLayout) {
            this.f5401zZKhbgvUfsK4AEX3r0 = textInputLayout;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void IPyIQcaNa8aB7drBED(View view, AccessibilityEvent accessibilityEvent) {
            super.IPyIQcaNa8aB7drBED(view, accessibilityEvent);
            this.f5401zZKhbgvUfsK4AEX3r0.f5329HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C().OANkd3mP6AYvwbNLJM(view, accessibilityEvent);
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            EditText editText = this.f5401zZKhbgvUfsK4AEX3r0.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f5401zZKhbgvUfsK4AEX3r0.getHint();
            CharSequence error = this.f5401zZKhbgvUfsK4AEX3r0.getError();
            CharSequence placeholderText = this.f5401zZKhbgvUfsK4AEX3r0.getPlaceholderText();
            int counterMaxLength = this.f5401zZKhbgvUfsK4AEX3r0.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f5401zZKhbgvUfsK4AEX3r0.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z = !zIsEmpty;
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f5401zZKhbgvUfsK4AEX3r0.ToH8yzk8U1nKT0PUfY();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            }
            String string = z3 ? hint.toString() : "";
            this.f5401zZKhbgvUfsK4AEX3r0.f5384s3fjYDxWOUexjjVgyA.THTDvPxsHqMeGb512f(a49QRPHynYLCBN0SqP);
            if (z) {
                a49QRPHynYLCBN0SqP.Bc5OTyAfOKVCQb8CEz(text);
            } else if (!TextUtils.isEmpty(string)) {
                a49QRPHynYLCBN0SqP.Bc5OTyAfOKVCQb8CEz(string);
                if (z4 && placeholderText != null) {
                    placeholderText = string + ", " + ((Object) placeholderText);
                    a49QRPHynYLCBN0SqP.Bc5OTyAfOKVCQb8CEz(placeholderText);
                }
            } else if (placeholderText != null) {
                a49QRPHynYLCBN0SqP.Bc5OTyAfOKVCQb8CEz(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a49QRPHynYLCBN0SqP.yvdWWG9COQQotjfedH(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    a49QRPHynYLCBN0SqP.Bc5OTyAfOKVCQb8CEz(string);
                }
                a49QRPHynYLCBN0SqP.aRQ2M7vtRaPDEyvpdv(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            a49QRPHynYLCBN0SqP.iQCvttGuB7nx4r7kMP(counterMaxLength);
            if (z2) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                a49QRPHynYLCBN0SqP.xMfAHy6F7qK0zhxhKG(error);
            }
            View viewR9SAhYMerGybF9OAjL = this.f5401zZKhbgvUfsK4AEX3r0.f5321Acstmh57AKoSEkEFNJ.R9SAhYMerGybF9OAjL();
            if (viewR9SAhYMerGybF9OAjL != null) {
                a49QRPHynYLCBN0SqP.O1furmptfI76BGfN0d(viewR9SAhYMerGybF9OAjL);
            }
            this.f5401zZKhbgvUfsK4AEX3r0.f5329HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C().aPyGSIylzVNKPT1Bls(view, a49QRPHynYLCBN0SqP);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7142XzJ1BS7H9Ilbkv4eVM);
    }

    public static Drawable OqIo5QF00RDxUQb4qq(ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(i2, i, 0.1f), i}), tCyPEKSzIyweCN5yp1, tCyPEKSzIyweCN5yp1);
    }

    public static /* synthetic */ int YlLW4G6OV9TFyuw5ix(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public static void bMSdooljgH14Jgudph(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                bMSdooljgH14Jgudph((ViewGroup) childAt, z);
            }
        }
    }

    public static Drawable e2F9F6h8YJxTHwLCa0(Context context, ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, int i, int[][] iArr) {
        int iHJFh0TGMpafqLE9haL = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7130IPyIQcaNa8aB7drBED, "TextInputLayout");
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1(tCyPEKSzIyweCN5yp1.THTDvPxsHqMeGb512f());
        int iAcstmh57AKoSEkEFNJ = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(i, iHJFh0TGMpafqLE9haL, 0.1f);
        tCyPEKSzIyweCN5yp12.YlLW4G6OV9TFyuw5ix(new ColorStateList(iArr, new int[]{iAcstmh57AKoSEkEFNJ, 0}));
        tCyPEKSzIyweCN5yp12.setTint(iHJFh0TGMpafqLE9haL);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iAcstmh57AKoSEkEFNJ, iHJFh0TGMpafqLE9haL});
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp13 = new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1(tCyPEKSzIyweCN5yp1.THTDvPxsHqMeGb512f());
        tCyPEKSzIyweCN5yp13.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, tCyPEKSzIyweCN5yp12, tCyPEKSzIyweCN5yp13), tCyPEKSzIyweCN5yp1});
    }

    public static void evSiTWao80SbJUZk9E(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? IPyIQcaNa8aB7drBED.f7050HJFh0TGMpafqLE9haL : IPyIQcaNa8aB7drBED.f7065s3fjYDxWOUexjjVgyA, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (!(editText instanceof AutoCompleteTextView) || sTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(editText)) {
            return this.f5386tXWeW0sqVddf7ZBflq;
        }
        int iZZKhbgvUfsK4AEX3r0 = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f5393zZKhbgvUfsK4AEX3r0, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7157zZKhbgvUfsK4AEX3r0);
        int i = this.f5380lLKzvdU99Iw80uVD5I;
        if (i == 2) {
            return e2F9F6h8YJxTHwLCa0(getContext(), this.f5386tXWeW0sqVddf7ZBflq, iZZKhbgvUfsK4AEX3r0, f5319Ywqw2A0s86HeuFkDt0);
        }
        if (i == 1) {
            return OqIo5QF00RDxUQb4qq(this.f5386tXWeW0sqVddf7ZBflq, this.f5381oocVJL811qFf0j0XXZ, iZZKhbgvUfsK4AEX3r0, f5319Ywqw2A0s86HeuFkDt0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5340OqIo5QF00RDxUQb4qq == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5340OqIo5QF00RDxUQb4qq = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5340OqIo5QF00RDxUQb4qq.addState(new int[0], W3RZ2dTDKrKpS5Mxdk(false));
        }
        return this.f5340OqIo5QF00RDxUQb4qq;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5351W3RZ2dTDKrKpS5Mxdk == null) {
            this.f5351W3RZ2dTDKrKpS5Mxdk = W3RZ2dTDKrKpS5Mxdk(true);
        }
        return this.f5351W3RZ2dTDKrKpS5Mxdk;
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5393zZKhbgvUfsK4AEX3r0 = editText;
        int i = this.f5332KYHag8HRDlnO3X9zmZ;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f5330IPyIQcaNa8aB7drBED);
        }
        int i2 = this.f5345TCyPEKSzIyweCN5yp1;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f5383pbVGzGjWvY2LDXC8vo);
        }
        this.f5328GyWRxpdt1T8mEJXPoD = false;
        udcVtCzLTM1Loe9KrX();
        setTextInputAccessibilityDelegate(new zZKhbgvUfsK4AEX3r0(this));
        this.f5371fLSSbwbzFBVpwBH5FM.jocVUfxESVhVJU8LoH(this.f5393zZKhbgvUfsK4AEX3r0.getTypeface());
        this.f5371fLSSbwbzFBVpwBH5FM.CSih7GetOUab1dYQjM(this.f5393zZKhbgvUfsK4AEX3r0.getTextSize());
        int i3 = Build.VERSION.SDK_INT;
        this.f5371fLSSbwbzFBVpwBH5FM.hUNBy66ZO1wVLJGW3l(this.f5393zZKhbgvUfsK4AEX3r0.getLetterSpacing());
        int gravity = this.f5393zZKhbgvUfsK4AEX3r0.getGravity();
        this.f5371fLSSbwbzFBVpwBH5FM.zcy2NNbtVXgoGQbfuq((gravity & (-113)) | 48);
        this.f5371fLSSbwbzFBVpwBH5FM.Uj8rPa1EWADtk6Oe0S(gravity);
        this.f5393zZKhbgvUfsK4AEX3r0.addTextChangedListener(new lEeR5KfoEr4xU5yHH7());
        if (this.f5333Kh0uC90qEEhuLdpgB9 == null) {
            this.f5333Kh0uC90qEEhuLdpgB9 = this.f5393zZKhbgvUfsK4AEX3r0.getHintTextColors();
        }
        if (this.f5339OUd9THiLjZndMj0qdF) {
            if (TextUtils.isEmpty(this.f5376jCtUeU2YI1poCxWcjm)) {
                CharSequence hint = this.f5393zZKhbgvUfsK4AEX3r0.getHint();
                this.f5374husNiw3snxdgZPAGJm = hint;
                setHint(hint);
                this.f5393zZKhbgvUfsK4AEX3r0.setHint((CharSequence) null);
            }
            this.f5354XzJ1BS7H9Ilbkv4eVM = true;
        }
        if (i3 >= 29) {
            FtYx4GXtxwA8al5hBy();
        }
        if (this.f5360aPyGSIylzVNKPT1Bls != null) {
            eWK41qw3g36LVd4UnS(this.f5393zZKhbgvUfsK4AEX3r0.getText());
        }
        xMfAHy6F7qK0zhxhKG();
        this.f5321Acstmh57AKoSEkEFNJ.KYHag8HRDlnO3X9zmZ();
        this.f5384s3fjYDxWOUexjjVgyA.bringToFront();
        this.f5329HJFh0TGMpafqLE9haL.bringToFront();
        OUd9THiLjZndMj0qdF();
        this.f5329HJFh0TGMpafqLE9haL.Fo9071MN8vwEWamAUX();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        iQCvttGuB7nx4r7kMP(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5376jCtUeU2YI1poCxWcjm)) {
            return;
        }
        this.f5376jCtUeU2YI1poCxWcjm = charSequence;
        this.f5371fLSSbwbzFBVpwBH5FM.Pum9NZyDBKoCnecvlx(charSequence);
        if (this.f5331Jsouc4ileb8SxQhxbX) {
            return;
        }
        cT5Hs3CQpLK8NvlZAw();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f5355Y43RdunnpKgpbny0lE == z) {
            return;
        }
        if (z) {
            Acstmh57AKoSEkEFNJ();
        } else {
            CSih7GetOUab1dYQjM();
            this.f5343R9SAhYMerGybF9OAjL = null;
        }
        this.f5355Y43RdunnpKgpbny0lE = z;
    }

    public final boolean A49QRPHynYLCBN0SqP() {
        return this.f5353XdzLv4NdAtTYoEzVzB > -1 && this.f5356YlLW4G6OV9TFyuw5ix != 0;
    }

    public final void Acstmh57AKoSEkEFNJ() {
        TextView textView = this.f5343R9SAhYMerGybF9OAjL;
        if (textView != null) {
            this.f5379lEeR5KfoEr4xU5yHH7.addView(textView);
            this.f5343R9SAhYMerGybF9OAjL.setVisibility(0);
        }
    }

    public final void CSih7GetOUab1dYQjM() {
        TextView textView = this.f5343R9SAhYMerGybF9OAjL;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void DFYiVi7zXozAjRciKa() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f5360aPyGSIylzVNKPT1Bls;
        if (textView != null) {
            ZJNyOIPL0usMs2xSAn(textView, this.f5344T9PhQIpGRhE4yZDm1C ? this.f5338OANkd3mP6AYvwbNLJM : this.f5394zaq8hOURtfwbcX17cG);
            if (!this.f5344T9PhQIpGRhE4yZDm1C && (colorStateList2 = this.f5350VItLRw50eXTZeEfGl0) != null) {
                this.f5360aPyGSIylzVNKPT1Bls.setTextColor(colorStateList2);
            }
            if (!this.f5344T9PhQIpGRhE4yZDm1C || (colorStateList = this.f5352WWC27LAMFqFFBzfbNw) == null) {
                return;
            }
            this.f5360aPyGSIylzVNKPT1Bls.setTextColor(colorStateList);
        }
    }

    public final int DfpieXfdYs58yZAiXY(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingRight() : this.f5384s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL() : this.f5329HJFh0TGMpafqLE9haL.VItLRw50eXTZeEfGl0());
    }

    public final void Er40JrQbOM51vCQI8w(Editable editable) {
        if (this.f5373hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7(editable) != 0 || this.f5331Jsouc4ileb8SxQhxbX) {
            KqgKJKIWne3kz1AdHk();
        } else {
            Pum9NZyDBKoCnecvlx();
        }
    }

    public final void Fo9071MN8vwEWamAUX() {
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        Er40JrQbOM51vCQI8w(editText == null ? null : editText.getText());
    }

    public final void FtYx4GXtxwA8al5hBy() {
        ColorStateList colorStateList;
        ColorStateList colorStateListTCyPEKSzIyweCN5yp1 = this.f5346THTDvPxsHqMeGb512f;
        if (colorStateListTCyPEKSzIyweCN5yp1 == null) {
            colorStateListTCyPEKSzIyweCN5yp1 = cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7129HJFh0TGMpafqLE9haL);
        }
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(this.f5393zZKhbgvUfsK4AEX3r0.getTextCursorDrawable()).mutate();
        if (XdzLv4NdAtTYoEzVzB() && (colorStateList = this.f5361ao3wqKm5CXFuvC0q47) != null) {
            colorStateListTCyPEKSzIyweCN5yp1 = colorStateList;
        }
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableMutate, colorStateListTCyPEKSzIyweCN5yp1);
    }

    public final Rect G7AC3DWIx9i9fdanjk(Rect rect) {
        if (this.f5393zZKhbgvUfsK4AEX3r0 == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f5365cT5Hs3CQpLK8NvlZAw;
        float fLIMtzhnLwQyigzK0KO = this.f5371fLSSbwbzFBVpwBH5FM.LIMtzhnLwQyigzK0KO();
        rect2.left = rect.left + this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingLeft();
        rect2.top = R9SAhYMerGybF9OAjL(rect, fLIMtzhnLwQyigzK0KO);
        rect2.right = rect.right - this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingRight();
        rect2.bottom = Y43RdunnpKgpbny0lE(rect, rect2, fLIMtzhnLwQyigzK0KO);
        return rect2;
    }

    public final int GyWRxpdt1T8mEJXPoD(int i, boolean z) {
        return i + ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingLeft() : this.f5329HJFh0TGMpafqLE9haL.VItLRw50eXTZeEfGl0() : this.f5384s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL());
    }

    public final void Jsouc4ileb8SxQhxbX() {
        lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this.f5393zZKhbgvUfsK4AEX3r0, getEditTextBoxBackground());
    }

    public final boolean Kh0uC90qEEhuLdpgB9() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f5384s3fjYDxWOUexjjVgyA.getMeasuredWidth() > 0;
    }

    public final void KqgKJKIWne3kz1AdHk() {
        TextView textView = this.f5343R9SAhYMerGybF9OAjL;
        if (textView == null || !this.f5355Y43RdunnpKgpbny0lE) {
            return;
        }
        textView.setText((CharSequence) null);
        hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7(this.f5379lEeR5KfoEr4xU5yHH7, this.f5320A49QRPHynYLCBN0SqP);
        this.f5343R9SAhYMerGybF9OAjL.setVisibility(4);
    }

    public final boolean LIMtzhnLwQyigzK0KO() {
        return this.f5380lLKzvdU99Iw80uVD5I == 2 && A49QRPHynYLCBN0SqP();
    }

    public boolean LU0fFDMACqnfIfA1AZ() {
        return this.f5354XzJ1BS7H9Ilbkv4eVM;
    }

    public void O1furmptfI76BGfN0d(boolean z) {
        iQCvttGuB7nx4r7kMP(z, false);
    }

    public final void OANkd3mP6AYvwbNLJM() {
        int i = this.f5380lLKzvdU99Iw80uVD5I;
        if (i == 0) {
            this.f5386tXWeW0sqVddf7ZBflq = null;
        } else if (i == 1) {
            this.f5386tXWeW0sqVddf7ZBflq = new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1(this.f5334KqgKJKIWne3kz1AdHk);
            this.f5324DfpieXfdYs58yZAiXY = new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1();
            this.f5367e2F9F6h8YJxTHwLCa0 = new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1();
            return;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f5380lLKzvdU99Iw80uVD5I + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f5386tXWeW0sqVddf7ZBflq = (!this.f5339OUd9THiLjZndMj0qdF || (this.f5386tXWeW0sqVddf7ZBflq instanceof auvQiDfBN48eRz3fFq.IPyIQcaNa8aB7drBED)) ? new ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1(this.f5334KqgKJKIWne3kz1AdHk) : auvQiDfBN48eRz3fFq.IPyIQcaNa8aB7drBED.Pum9NZyDBKoCnecvlx(this.f5334KqgKJKIWne3kz1AdHk);
        }
        this.f5324DfpieXfdYs58yZAiXY = null;
        this.f5367e2F9F6h8YJxTHwLCa0 = null;
    }

    public final void OUd9THiLjZndMj0qdF() {
        Iterator it = this.f5382osrHU7fvDp2EgxZPfM.iterator();
        while (it.hasNext()) {
            ((KYHag8HRDlnO3X9zmZ) it.next()).lEeR5KfoEr4xU5yHH7(this);
        }
    }

    public boolean PPkm9uUfOJHHYveeLT() {
        return this.f5329HJFh0TGMpafqLE9haL.tXWeW0sqVddf7ZBflq();
    }

    public final void Pum9NZyDBKoCnecvlx() {
        if (this.f5343R9SAhYMerGybF9OAjL == null || !this.f5355Y43RdunnpKgpbny0lE || TextUtils.isEmpty(this.f5385sTkWmhpZ5b1ArQIw4K)) {
            return;
        }
        this.f5343R9SAhYMerGybF9OAjL.setText(this.f5385sTkWmhpZ5b1ArQIw4K);
        hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7(this.f5379lEeR5KfoEr4xU5yHH7, this.f5335LIMtzhnLwQyigzK0KO);
        this.f5343R9SAhYMerGybF9OAjL.setVisibility(0);
        this.f5343R9SAhYMerGybF9OAjL.bringToFront();
        announceForAccessibility(this.f5385sTkWmhpZ5b1ArQIw4K);
    }

    public final int R9SAhYMerGybF9OAjL(Rect rect, float f) {
        return zcy2NNbtVXgoGQbfuq() ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingTop();
    }

    public final void T9PhQIpGRhE4yZDm1C() {
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f5386tXWeW0sqVddf7ZBflq;
        if (tCyPEKSzIyweCN5yp1 == null) {
            return;
        }
        Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4THTDvPxsHqMeGb512f = tCyPEKSzIyweCN5yp1.THTDvPxsHqMeGb512f();
        Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = this.f5334KqgKJKIWne3kz1AdHk;
        if (z9WdNiOsPR0y54zHW4THTDvPxsHqMeGb512f != z9WdNiOsPR0y54zHW4) {
            this.f5386tXWeW0sqVddf7ZBflq.setShapeAppearanceModel(z9WdNiOsPR0y54zHW4);
        }
        if (LIMtzhnLwQyigzK0KO()) {
            this.f5386tXWeW0sqVddf7ZBflq.hUNBy66ZO1wVLJGW3l(this.f5353XdzLv4NdAtTYoEzVzB, this.f5356YlLW4G6OV9TFyuw5ix);
        }
        int iZaq8hOURtfwbcX17cG = zaq8hOURtfwbcX17cG();
        this.f5381oocVJL811qFf0j0XXZ = iZaq8hOURtfwbcX17cG;
        this.f5386tXWeW0sqVddf7ZBflq.YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(iZaq8hOURtfwbcX17cG));
        hoXrIDAFrSwfShk8da();
        fLSSbwbzFBVpwBH5FM();
    }

    public final Tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0 THTDvPxsHqMeGb512f() {
        Tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new Tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0();
        zzkhbgvufsk4aex3r0.oocVJL811qFf0j0XXZ(fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7156xHA29AmDt6y96AnB3t, 87));
        zzkhbgvufsk4aex3r0.cT5Hs3CQpLK8NvlZAw(fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7138THTDvPxsHqMeGb512f, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6197lEeR5KfoEr4xU5yHH7));
        return zzkhbgvufsk4aex3r0;
    }

    public final boolean ToH8yzk8U1nKT0PUfY() {
        return this.f5331Jsouc4ileb8SxQhxbX;
    }

    public boolean Tu4WCh2gEwj8E4oHbP() {
        return this.f5321Acstmh57AKoSEkEFNJ.e54J8UWNHWALQNixXM();
    }

    public void Uj8rPa1EWADtk6Oe0S() {
        this.f5384s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C();
    }

    public final void VItLRw50eXTZeEfGl0() {
        if (ao3wqKm5CXFuvC0q47()) {
            ((auvQiDfBN48eRz3fFq.IPyIQcaNa8aB7drBED) this.f5386tXWeW0sqVddf7ZBflq).jocVUfxESVhVJU8LoH();
        }
    }

    public final ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 W3RZ2dTDKrKpS5Mxdk(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7048zcy2NNbtVXgoGQbfuq);
        float f = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7028aPyGSIylzVNKPT1Bls);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7022XdzLv4NdAtTYoEzVzB);
        Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4T9PhQIpGRhE4yZDm1C = Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7().THTDvPxsHqMeGb512f(f).XzJ1BS7H9Ilbkv4eVM(f).Y43RdunnpKgpbny0lE(dimensionPixelOffset).LIMtzhnLwQyigzK0KO(dimensionPixelOffset).T9PhQIpGRhE4yZDm1C();
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1T9PhQIpGRhE4yZDm1C = ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1.T9PhQIpGRhE4yZDm1C(getContext(), dimensionPixelOffset2, null);
        tCyPEKSzIyweCN5yp1T9PhQIpGRhE4yZDm1C.setShapeAppearanceModel(z9WdNiOsPR0y54zHW4T9PhQIpGRhE4yZDm1C);
        tCyPEKSzIyweCN5yp1T9PhQIpGRhE4yZDm1C.udcVtCzLTM1Loe9KrX(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return tCyPEKSzIyweCN5yp1T9PhQIpGRhE4yZDm1C;
    }

    public final void WWC27LAMFqFFBzfbNw(boolean z) {
        ValueAnimator valueAnimator = this.f5337O1furmptfI76BGfN0d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5337O1furmptfI76BGfN0d.cancel();
        }
        if (z && this.f5391yvdWWG9COQQotjfedH) {
            e54J8UWNHWALQNixXM(1.0f);
        } else {
            this.f5371fLSSbwbzFBVpwBH5FM.ZJNyOIPL0usMs2xSAn(1.0f);
        }
        this.f5331Jsouc4ileb8SxQhxbX = false;
        if (ao3wqKm5CXFuvC0q47()) {
            cT5Hs3CQpLK8NvlZAw();
        }
        Fo9071MN8vwEWamAUX();
        this.f5384s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM(false);
        this.f5329HJFh0TGMpafqLE9haL.OqIo5QF00RDxUQb4qq(false);
    }

    public final boolean XdzLv4NdAtTYoEzVzB() {
        return Tu4WCh2gEwj8E4oHbP() || (this.f5360aPyGSIylzVNKPT1Bls != null && this.f5344T9PhQIpGRhE4yZDm1C);
    }

    public final void XzJ1BS7H9Ilbkv4eVM(Canvas canvas) {
        if (this.f5339OUd9THiLjZndMj0qdF) {
            this.f5371fLSSbwbzFBVpwBH5FM.e54J8UWNHWALQNixXM(canvas);
        }
    }

    public final int Y43RdunnpKgpbny0lE(Rect rect, Rect rect2, float f) {
        return zcy2NNbtVXgoGQbfuq() ? (int) (rect2.top + f) : rect.bottom - this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingBottom();
    }

    public final void Ywqw2A0s86HeuFkDt0(boolean z, boolean z2) {
        int defaultColor = this.f5369eWK41qw3g36LVd4UnS.getDefaultColor();
        int colorForState = this.f5369eWK41qw3g36LVd4UnS.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f5369eWK41qw3g36LVd4UnS.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f5356YlLW4G6OV9TFyuw5ix = colorForState2;
        } else if (z2) {
            this.f5356YlLW4G6OV9TFyuw5ix = colorForState;
        } else {
            this.f5356YlLW4G6OV9TFyuw5ix = defaultColor;
        }
    }

    public final void Z9WdNiOsPR0y54zHW4() throws Resources.NotFoundException {
        EditText editText;
        int iOUd9THiLjZndMj0qdF;
        int dimensionPixelSize;
        int iAo3wqKm5CXFuvC0q47;
        Resources resources;
        int i;
        if (this.f5393zZKhbgvUfsK4AEX3r0 == null || this.f5380lLKzvdU99Iw80uVD5I != 1) {
            return;
        }
        if (hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(getContext())) {
            editText = this.f5393zZKhbgvUfsK4AEX3r0;
            iOUd9THiLjZndMj0qdF = lLKzvdU99Iw80uVD5I.OUd9THiLjZndMj0qdF(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7008LIMtzhnLwQyigzK0KO);
            iAo3wqKm5CXFuvC0q47 = lLKzvdU99Iw80uVD5I.ao3wqKm5CXFuvC0q47(this.f5393zZKhbgvUfsK4AEX3r0);
            resources = getResources();
            i = tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7045xHA29AmDt6y96AnB3t;
        } else {
            if (!hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(getContext())) {
                return;
            }
            editText = this.f5393zZKhbgvUfsK4AEX3r0;
            iOUd9THiLjZndMj0qdF = lLKzvdU99Iw80uVD5I.OUd9THiLjZndMj0qdF(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7002G7AC3DWIx9i9fdanjk);
            iAo3wqKm5CXFuvC0q47 = lLKzvdU99Iw80uVD5I.ao3wqKm5CXFuvC0q47(this.f5393zZKhbgvUfsK4AEX3r0);
            resources = getResources();
            i = tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7014R9SAhYMerGybF9OAjL;
        }
        lLKzvdU99Iw80uVD5I.Ywqw2A0s86HeuFkDt0(editText, iOUd9THiLjZndMj0qdF, dimensionPixelSize, iAo3wqKm5CXFuvC0q47, resources.getDimensionPixelSize(i));
    }

    public void ZJNyOIPL0usMs2xSAn(TextView textView, int i) {
        try {
            PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.aPyGSIylzVNKPT1Bls(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.aPyGSIylzVNKPT1Bls(textView, pbVGzGjWvY2LDXC8vo.f7167lEeR5KfoEr4xU5yHH7);
        textView.setTextColor(LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(getContext(), tmIBXGVvBsrJ7i63G2.s3fjYDxWOUexjjVgyA.f7174lEeR5KfoEr4xU5yHH7));
    }

    public boolean aAp6BD79BhftLCnuvf() {
        return this.f5321Acstmh57AKoSEkEFNJ.THTDvPxsHqMeGb512f();
    }

    public final void aPyGSIylzVNKPT1Bls(RectF rectF) {
        float f = rectF.left;
        int i = this.f5359aAp6BD79BhftLCnuvf;
        rectF.left = f - i;
        rectF.right += i;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f5379lEeR5KfoEr4xU5yHH7.addView(view, layoutParams2);
        this.f5379lEeR5KfoEr4xU5yHH7.setLayoutParams(layoutParams);
        yvdWWG9COQQotjfedH();
        setEditText((EditText) view);
    }

    public final boolean ao3wqKm5CXFuvC0q47() {
        return this.f5339OUd9THiLjZndMj0qdF && !TextUtils.isEmpty(this.f5376jCtUeU2YI1poCxWcjm) && (this.f5386tXWeW0sqVddf7ZBflq instanceof auvQiDfBN48eRz3fFq.IPyIQcaNa8aB7drBED);
    }

    public boolean ayduHasC7VpxsVXE0T() {
        boolean z;
        Drawable drawable;
        EditText editText;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        if (this.f5393zZKhbgvUfsK4AEX3r0 == null) {
            return false;
        }
        boolean z2 = true;
        if (Kh0uC90qEEhuLdpgB9()) {
            int measuredWidth = this.f5384s3fjYDxWOUexjjVgyA.getMeasuredWidth() - this.f5393zZKhbgvUfsK4AEX3r0.getPaddingLeft();
            if (this.f5349Uj8rPa1EWADtk6Oe0S == null || this.f5322CSih7GetOUab1dYQjM != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f5349Uj8rPa1EWADtk6Oe0S = colorDrawable;
                this.f5322CSih7GetOUab1dYQjM = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrLEeR5KfoEr4xU5yHH7 = PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f5393zZKhbgvUfsK4AEX3r0);
            Drawable drawable5 = drawableArrLEeR5KfoEr4xU5yHH7[0];
            Drawable drawable6 = this.f5349Uj8rPa1EWADtk6Oe0S;
            if (drawable5 != drawable6) {
                PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this.f5393zZKhbgvUfsK4AEX3r0, drawable6, drawableArrLEeR5KfoEr4xU5yHH7[1], drawableArrLEeR5KfoEr4xU5yHH7[2], drawableArrLEeR5KfoEr4xU5yHH7[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f5349Uj8rPa1EWADtk6Oe0S != null) {
                Drawable[] drawableArrLEeR5KfoEr4xU5yHH72 = PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f5393zZKhbgvUfsK4AEX3r0);
                PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this.f5393zZKhbgvUfsK4AEX3r0, null, drawableArrLEeR5KfoEr4xU5yHH72[1], drawableArrLEeR5KfoEr4xU5yHH72[2], drawableArrLEeR5KfoEr4xU5yHH72[3]);
                this.f5349Uj8rPa1EWADtk6Oe0S = null;
                z = true;
            }
            z = false;
        }
        if (k0CbjZvfUz23r8IN6W()) {
            int measuredWidth2 = this.f5329HJFh0TGMpafqLE9haL.WWC27LAMFqFFBzfbNw().getMeasuredWidth() - this.f5393zZKhbgvUfsK4AEX3r0.getPaddingRight();
            CheckableImageButton checkableImageButtonZ9WdNiOsPR0y54zHW4 = this.f5329HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4();
            if (checkableImageButtonZ9WdNiOsPR0y54zHW4 != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonZ9WdNiOsPR0y54zHW4.getMeasuredWidth() + R9SAhYMerGybF9OAjL.s3fjYDxWOUexjjVgyA((ViewGroup.MarginLayoutParams) checkableImageButtonZ9WdNiOsPR0y54zHW4.getLayoutParams());
            }
            Drawable[] drawableArrLEeR5KfoEr4xU5yHH73 = PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f5393zZKhbgvUfsK4AEX3r0);
            Drawable drawable7 = this.f5358ZJNyOIPL0usMs2xSAn;
            if (drawable7 == null || this.f5348Tu4WCh2gEwj8E4oHbP == measuredWidth2) {
                if (drawable7 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f5358ZJNyOIPL0usMs2xSAn = colorDrawable2;
                    this.f5348Tu4WCh2gEwj8E4oHbP = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable8 = drawableArrLEeR5KfoEr4xU5yHH73[2];
                drawable = this.f5358ZJNyOIPL0usMs2xSAn;
                if (drawable8 != drawable) {
                    this.f5378k0CbjZvfUz23r8IN6W = drawable8;
                    editText = this.f5393zZKhbgvUfsK4AEX3r0;
                    drawable2 = drawableArrLEeR5KfoEr4xU5yHH73[0];
                    drawable3 = drawableArrLEeR5KfoEr4xU5yHH73[1];
                    drawable4 = drawableArrLEeR5KfoEr4xU5yHH73[3];
                } else {
                    z2 = z;
                }
            } else {
                this.f5348Tu4WCh2gEwj8E4oHbP = measuredWidth2;
                drawable7.setBounds(0, 0, measuredWidth2, 1);
                editText = this.f5393zZKhbgvUfsK4AEX3r0;
                drawable2 = drawableArrLEeR5KfoEr4xU5yHH73[0];
                drawable3 = drawableArrLEeR5KfoEr4xU5yHH73[1];
                drawable = this.f5358ZJNyOIPL0usMs2xSAn;
                drawable4 = drawableArrLEeR5KfoEr4xU5yHH73[3];
            }
            PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(editText, drawable2, drawable3, drawable, drawable4);
        } else {
            if (this.f5358ZJNyOIPL0usMs2xSAn == null) {
                return z;
            }
            Drawable[] drawableArrLEeR5KfoEr4xU5yHH74 = PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this.f5393zZKhbgvUfsK4AEX3r0);
            if (drawableArrLEeR5KfoEr4xU5yHH74[2] == this.f5358ZJNyOIPL0usMs2xSAn) {
                PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.pbVGzGjWvY2LDXC8vo(this.f5393zZKhbgvUfsK4AEX3r0, drawableArrLEeR5KfoEr4xU5yHH74[0], drawableArrLEeR5KfoEr4xU5yHH74[1], this.f5378k0CbjZvfUz23r8IN6W, drawableArrLEeR5KfoEr4xU5yHH74[3]);
            } else {
                z2 = z;
            }
            this.f5358ZJNyOIPL0usMs2xSAn = null;
        }
        return z2;
    }

    public final boolean bBVlTkqEpHW053CjWL() {
        int iMax;
        if (this.f5393zZKhbgvUfsK4AEX3r0 == null || this.f5393zZKhbgvUfsK4AEX3r0.getMeasuredHeight() >= (iMax = Math.max(this.f5329HJFh0TGMpafqLE9haL.getMeasuredHeight(), this.f5384s3fjYDxWOUexjjVgyA.getMeasuredHeight()))) {
            return false;
        }
        this.f5393zZKhbgvUfsK4AEX3r0.setMinimumHeight(iMax);
        return true;
    }

    public final void cT5Hs3CQpLK8NvlZAw() {
        if (ao3wqKm5CXFuvC0q47()) {
            RectF rectF = this.f5372hUNBy66ZO1wVLJGW3l;
            this.f5371fLSSbwbzFBVpwBH5FM.aPyGSIylzVNKPT1Bls(rectF, this.f5393zZKhbgvUfsK4AEX3r0.getWidth(), this.f5393zZKhbgvUfsK4AEX3r0.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            aPyGSIylzVNKPT1Bls(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f5353XdzLv4NdAtTYoEzVzB);
            ((auvQiDfBN48eRz3fFq.IPyIQcaNa8aB7drBED) this.f5386tXWeW0sqVddf7ZBflq).eWK41qw3g36LVd4UnS(rectF);
        }
    }

    public final void ctWLFN70QQINH1kyYo() {
        Resources resources;
        int i;
        if (this.f5380lLKzvdU99Iw80uVD5I == 1) {
            if (hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(getContext())) {
                resources = getResources();
                i = tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7019VItLRw50eXTZeEfGl0;
            } else {
                if (!hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(getContext())) {
                    return;
                }
                resources = getResources();
                i = tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f6999A49QRPHynYLCBN0SqP;
            }
            this.f5347ToH8yzk8U1nKT0PUfY = resources.getDimensionPixelSize(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f5374husNiw3snxdgZPAGJm != null) {
            boolean z = this.f5354XzJ1BS7H9Ilbkv4eVM;
            this.f5354XzJ1BS7H9Ilbkv4eVM = false;
            CharSequence hint = editText.getHint();
            this.f5393zZKhbgvUfsK4AEX3r0.setHint(this.f5374husNiw3snxdgZPAGJm);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f5393zZKhbgvUfsK4AEX3r0.setHint(hint);
                this.f5354XzJ1BS7H9Ilbkv4eVM = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f5379lEeR5KfoEr4xU5yHH7.getChildCount());
        for (int i2 = 0; i2 < this.f5379lEeR5KfoEr4xU5yHH7.getChildCount(); i2++) {
            View childAt = this.f5379lEeR5KfoEr4xU5yHH7.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f5393zZKhbgvUfsK4AEX3r0) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f5390yL2E9nlEZpg8ZZx8XE = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5390yL2E9nlEZpg8ZZx8XE = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        XzJ1BS7H9Ilbkv4eVM(canvas);
        jCtUeU2YI1poCxWcjm(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f5375iQCvttGuB7nx4r7kMP) {
            return;
        }
        this.f5375iQCvttGuB7nx4r7kMP = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        WaWv1mJ1ya3uoEaKqz.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f5371fLSSbwbzFBVpwBH5FM;
        boolean zKh0uC90qEEhuLdpgB9 = leer5kfoer4xu5yhh7 != null ? leer5kfoer4xu5yhh7.Kh0uC90qEEhuLdpgB9(drawableState) : false;
        if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
            O1furmptfI76BGfN0d(lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(this) && isEnabled());
        }
        xMfAHy6F7qK0zhxhKG();
        f2zPq7MOnQrtOlZ1Zg();
        if (zKh0uC90qEEhuLdpgB9) {
            invalidate();
        }
        this.f5375iQCvttGuB7nx4r7kMP = false;
    }

    public void e54J8UWNHWALQNixXM(float f) {
        if (this.f5371fLSSbwbzFBVpwBH5FM.A49QRPHynYLCBN0SqP() == f) {
            return;
        }
        if (this.f5337O1furmptfI76BGfN0d == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5337O1furmptfI76BGfN0d = valueAnimator;
            valueAnimator.setInterpolator(fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1(getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7141WWC27LAMFqFFBzfbNw, jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6198s3fjYDxWOUexjjVgyA));
            this.f5337O1furmptfI76BGfN0d.setDuration(fBZDmBPlAHk1Liuf1T.zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ(getContext(), tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7128G7AC3DWIx9i9fdanjk, 167));
            this.f5337O1furmptfI76BGfN0d.addUpdateListener(new HJFh0TGMpafqLE9haL());
        }
        this.f5337O1furmptfI76BGfN0d.setFloatValues(this.f5371fLSSbwbzFBVpwBH5FM.A49QRPHynYLCBN0SqP(), f);
        this.f5337O1furmptfI76BGfN0d.start();
    }

    public void eWK41qw3g36LVd4UnS(Editable editable) {
        int iLEeR5KfoEr4xU5yHH7 = this.f5373hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7(editable);
        boolean z = this.f5344T9PhQIpGRhE4yZDm1C;
        int i = this.f5368e54J8UWNHWALQNixXM;
        if (i == -1) {
            this.f5360aPyGSIylzVNKPT1Bls.setText(String.valueOf(iLEeR5KfoEr4xU5yHH7));
            this.f5360aPyGSIylzVNKPT1Bls.setContentDescription(null);
            this.f5344T9PhQIpGRhE4yZDm1C = false;
        } else {
            this.f5344T9PhQIpGRhE4yZDm1C = iLEeR5KfoEr4xU5yHH7 > i;
            evSiTWao80SbJUZk9E(getContext(), this.f5360aPyGSIylzVNKPT1Bls, iLEeR5KfoEr4xU5yHH7, this.f5368e54J8UWNHWALQNixXM, this.f5344T9PhQIpGRhE4yZDm1C);
            if (z != this.f5344T9PhQIpGRhE4yZDm1C) {
                DFYiVi7zXozAjRciKa();
            }
            this.f5360aPyGSIylzVNKPT1Bls.setText(XzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL().Acstmh57AKoSEkEFNJ(getContext().getString(IPyIQcaNa8aB7drBED.f7067zZKhbgvUfsK4AEX3r0, Integer.valueOf(iLEeR5KfoEr4xU5yHH7), Integer.valueOf(this.f5368e54J8UWNHWALQNixXM))));
        }
        if (this.f5393zZKhbgvUfsK4AEX3r0 == null || z == this.f5344T9PhQIpGRhE4yZDm1C) {
            return;
        }
        O1furmptfI76BGfN0d(false);
        f2zPq7MOnQrtOlZ1Zg();
        xMfAHy6F7qK0zhxhKG();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f2zPq7MOnQrtOlZ1Zg() {
        /*
            r5 = this;
            ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 r0 = r5.f5386tXWeW0sqVddf7ZBflq
            if (r0 == 0) goto Lbe
            int r0 = r5.f5380lLKzvdU99Iw80uVD5I
            if (r0 != 0) goto La
            goto Lbe
        La:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r5.f5393zZKhbgvUfsK4AEX3r0
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L30
            android.widget.EditText r3 = r5.f5393zZKhbgvUfsK4AEX3r0
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L3c
            int r3 = r5.f5389xMfAHy6F7qK0zhxhKG
        L39:
            r5.f5356YlLW4G6OV9TFyuw5ix = r3
            goto L6e
        L3c:
            boolean r3 = r5.Tu4WCh2gEwj8E4oHbP()
            if (r3 == 0) goto L4f
            android.content.res.ColorStateList r3 = r5.f5369eWK41qw3g36LVd4UnS
            if (r3 == 0) goto L4a
        L46:
            r5.Ywqw2A0s86HeuFkDt0(r0, r1)
            goto L6e
        L4a:
            int r3 = r5.getErrorCurrentTextColors()
            goto L39
        L4f:
            boolean r3 = r5.f5344T9PhQIpGRhE4yZDm1C
            if (r3 == 0) goto L61
            android.widget.TextView r3 = r5.f5360aPyGSIylzVNKPT1Bls
            if (r3 == 0) goto L61
            android.content.res.ColorStateList r4 = r5.f5369eWK41qw3g36LVd4UnS
            if (r4 == 0) goto L5c
            goto L46
        L5c:
            int r3 = r3.getCurrentTextColor()
            goto L39
        L61:
            if (r0 == 0) goto L66
            int r3 = r5.f5392zXY7dgnTfw9Pd9RXel
            goto L39
        L66:
            if (r1 == 0) goto L6b
            int r3 = r5.f5377jocVUfxESVhVJU8LoH
            goto L39
        L6b:
            int r3 = r5.f5366ctWLFN70QQINH1kyYo
            goto L39
        L6e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L77
            r5.FtYx4GXtxwA8al5hBy()
        L77:
            com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7 r3 = r5.f5329HJFh0TGMpafqLE9haL
            r3.GyWRxpdt1T8mEJXPoD()
            r5.Uj8rPa1EWADtk6Oe0S()
            int r3 = r5.f5380lLKzvdU99Iw80uVD5I
            r4 = 2
            if (r3 != r4) goto L9d
            int r3 = r5.f5353XdzLv4NdAtTYoEzVzB
            if (r0 == 0) goto L93
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto L93
            int r4 = r5.f5395zcy2NNbtVXgoGQbfuq
        L90:
            r5.f5353XdzLv4NdAtTYoEzVzB = r4
            goto L96
        L93:
            int r4 = r5.f5336LU0fFDMACqnfIfA1AZ
            goto L90
        L96:
            int r4 = r5.f5353XdzLv4NdAtTYoEzVzB
            if (r4 == r3) goto L9d
            r5.hUNBy66ZO1wVLJGW3l()
        L9d:
            int r3 = r5.f5380lLKzvdU99Iw80uVD5I
            if (r3 != r2) goto Lbb
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto Lac
            int r0 = r5.f5323DFYiVi7zXozAjRciKa
        La9:
            r5.f5381oocVJL811qFf0j0XXZ = r0
            goto Lbb
        Lac:
            if (r1 == 0) goto Lb3
            if (r0 != 0) goto Lb3
            int r0 = r5.f5362ayduHasC7VpxsVXE0T
            goto La9
        Lb3:
            if (r0 == 0) goto Lb8
            int r0 = r5.f5326FtYx4GXtxwA8al5hBy
            goto La9
        Lb8:
            int r0 = r5.f5370evSiTWao80SbJUZk9E
            goto La9
        Lbb:
            r5.T9PhQIpGRhE4yZDm1C()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.f2zPq7MOnQrtOlZ1Zg():void");
    }

    public void fLSSbwbzFBVpwBH5FM() {
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || this.f5386tXWeW0sqVddf7ZBflq == null) {
            return;
        }
        if ((this.f5328GyWRxpdt1T8mEJXPoD || editText.getBackground() == null) && this.f5380lLKzvdU99Iw80uVD5I != 0) {
            Jsouc4ileb8SxQhxbX();
            this.f5328GyWRxpdt1T8mEJXPoD = true;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        return editText != null ? editText.getBaseline() + getPaddingTop() + xHA29AmDt6y96AnB3t() : super.getBaseline();
    }

    public ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 getBoxBackground() {
        int i = this.f5380lLKzvdU99Iw80uVD5I;
        if (i == 1 || i == 2) {
            return this.f5386tXWeW0sqVddf7ZBflq;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5381oocVJL811qFf0j0XXZ;
    }

    public int getBoxBackgroundMode() {
        return this.f5380lLKzvdU99Iw80uVD5I;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f5347ToH8yzk8U1nKT0PUfY;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(this) ? this.f5334KqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ() : this.f5334KqgKJKIWne3kz1AdHk.e54J8UWNHWALQNixXM()).lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(this) ? this.f5334KqgKJKIWne3kz1AdHk.e54J8UWNHWALQNixXM() : this.f5334KqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ()).lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(this) ? this.f5334KqgKJKIWne3kz1AdHk.sTkWmhpZ5b1ArQIw4K() : this.f5334KqgKJKIWne3kz1AdHk.R9SAhYMerGybF9OAjL()).lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l);
    }

    public float getBoxCornerRadiusTopStart() {
        return (WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(this) ? this.f5334KqgKJKIWne3kz1AdHk.R9SAhYMerGybF9OAjL() : this.f5334KqgKJKIWne3kz1AdHk.sTkWmhpZ5b1ArQIw4K()).lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l);
    }

    public int getBoxStrokeColor() {
        return this.f5392zXY7dgnTfw9Pd9RXel;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5369eWK41qw3g36LVd4UnS;
    }

    public int getBoxStrokeWidth() {
        return this.f5336LU0fFDMACqnfIfA1AZ;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f5395zcy2NNbtVXgoGQbfuq;
    }

    public int getCounterMaxLength() {
        return this.f5368e54J8UWNHWALQNixXM;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f5357Z9WdNiOsPR0y54zHW4 && this.f5344T9PhQIpGRhE4yZDm1C && (textView = this.f5360aPyGSIylzVNKPT1Bls) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5352WWC27LAMFqFFBzfbNw;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5350VItLRw50eXTZeEfGl0;
    }

    public ColorStateList getCursorColor() {
        return this.f5346THTDvPxsHqMeGb512f;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f5361ao3wqKm5CXFuvC0q47;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5333Kh0uC90qEEhuLdpgB9;
    }

    public EditText getEditText() {
        return this.f5393zZKhbgvUfsK4AEX3r0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5329HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM();
    }

    public Drawable getEndIconDrawable() {
        return this.f5329HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da();
    }

    public int getEndIconMinSize() {
        return this.f5329HJFh0TGMpafqLE9haL.aPyGSIylzVNKPT1Bls();
    }

    public int getEndIconMode() {
        return this.f5329HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5329HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG();
    }

    public CheckableImageButton getEndIconView() {
        return this.f5329HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K();
    }

    public CharSequence getError() {
        if (this.f5321Acstmh57AKoSEkEFNJ.THTDvPxsHqMeGb512f()) {
            return this.f5321Acstmh57AKoSEkEFNJ.OANkd3mP6AYvwbNLJM();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f5321Acstmh57AKoSEkEFNJ.hoXrIDAFrSwfShk8da();
    }

    public CharSequence getErrorContentDescription() {
        return this.f5321Acstmh57AKoSEkEFNJ.aPyGSIylzVNKPT1Bls();
    }

    public int getErrorCurrentTextColors() {
        return this.f5321Acstmh57AKoSEkEFNJ.zaq8hOURtfwbcX17cG();
    }

    public Drawable getErrorIconDrawable() {
        return this.f5329HJFh0TGMpafqLE9haL.Y43RdunnpKgpbny0lE();
    }

    public CharSequence getHelperText() {
        if (this.f5321Acstmh57AKoSEkEFNJ.ao3wqKm5CXFuvC0q47()) {
            return this.f5321Acstmh57AKoSEkEFNJ.Y43RdunnpKgpbny0lE();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f5321Acstmh57AKoSEkEFNJ.G7AC3DWIx9i9fdanjk();
    }

    public CharSequence getHint() {
        if (this.f5339OUd9THiLjZndMj0qdF) {
            return this.f5376jCtUeU2YI1poCxWcjm;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f5371fLSSbwbzFBVpwBH5FM.zaq8hOURtfwbcX17cG();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f5371fLSSbwbzFBVpwBH5FM.R9SAhYMerGybF9OAjL();
    }

    public ColorStateList getHintTextColor() {
        return this.f5342Pum9NZyDBKoCnecvlx;
    }

    public husNiw3snxdgZPAGJm getLengthCounter() {
        return this.f5373hoXrIDAFrSwfShk8da;
    }

    public int getMaxEms() {
        return this.f5345TCyPEKSzIyweCN5yp1;
    }

    public int getMaxWidth() {
        return this.f5383pbVGzGjWvY2LDXC8vo;
    }

    public int getMinEms() {
        return this.f5332KYHag8HRDlnO3X9zmZ;
    }

    public int getMinWidth() {
        return this.f5330IPyIQcaNa8aB7drBED;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5329HJFh0TGMpafqLE9haL.G7AC3DWIx9i9fdanjk();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5329HJFh0TGMpafqLE9haL.xHA29AmDt6y96AnB3t();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5355Y43RdunnpKgpbny0lE) {
            return this.f5385sTkWmhpZ5b1ArQIw4K;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5388xHA29AmDt6y96AnB3t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5327G7AC3DWIx9i9fdanjk;
    }

    public CharSequence getPrefixText() {
        return this.f5384s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5384s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    public TextView getPrefixTextView() {
        return this.f5384s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0();
    }

    public Z9WdNiOsPR0y54zHW4 getShapeAppearanceModel() {
        return this.f5334KqgKJKIWne3kz1AdHk;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5384s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm();
    }

    public Drawable getStartIconDrawable() {
        return this.f5384s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ();
    }

    public int getStartIconMinSize() {
        return this.f5384s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5384s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED();
    }

    public CharSequence getSuffixText() {
        return this.f5329HJFh0TGMpafqLE9haL.LIMtzhnLwQyigzK0KO();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5329HJFh0TGMpafqLE9haL.A49QRPHynYLCBN0SqP();
    }

    public TextView getSuffixTextView() {
        return this.f5329HJFh0TGMpafqLE9haL.WWC27LAMFqFFBzfbNw();
    }

    public Typeface getTypeface() {
        return this.f5364bMSdooljgH14Jgudph;
    }

    public final void hUNBy66ZO1wVLJGW3l() {
        if (!ao3wqKm5CXFuvC0q47() || this.f5331Jsouc4ileb8SxQhxbX) {
            return;
        }
        VItLRw50eXTZeEfGl0();
        cT5Hs3CQpLK8NvlZAw();
    }

    public final void hoXrIDAFrSwfShk8da() {
        if (this.f5324DfpieXfdYs58yZAiXY == null || this.f5367e2F9F6h8YJxTHwLCa0 == null) {
            return;
        }
        if (A49QRPHynYLCBN0SqP()) {
            this.f5324DfpieXfdYs58yZAiXY.YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(this.f5393zZKhbgvUfsK4AEX3r0.isFocused() ? this.f5366ctWLFN70QQINH1kyYo : this.f5356YlLW4G6OV9TFyuw5ix));
            this.f5367e2F9F6h8YJxTHwLCa0.YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(this.f5356YlLW4G6OV9TFyuw5ix));
        }
        invalidate();
    }

    public final void iQCvttGuB7nx4r7kMP(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        WaWv1mJ1ya3uoEaKqz.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        ColorStateList textColors;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.f5333Kh0uC90qEEhuLdpgB9;
        if (colorStateList2 != null) {
            this.f5371fLSSbwbzFBVpwBH5FM.PPkm9uUfOJHHYveeLT(colorStateList2);
        }
        if (zIsEnabled) {
            if (Tu4WCh2gEwj8E4oHbP()) {
                this.f5371fLSSbwbzFBVpwBH5FM.PPkm9uUfOJHHYveeLT(this.f5321Acstmh57AKoSEkEFNJ.sTkWmhpZ5b1ArQIw4K());
            } else if (this.f5344T9PhQIpGRhE4yZDm1C && (textView = this.f5360aPyGSIylzVNKPT1Bls) != null) {
                leer5kfoer4xu5yhh7 = this.f5371fLSSbwbzFBVpwBH5FM;
                textColors = textView.getTextColors();
            } else if (z3 && (colorStateList = this.f5342Pum9NZyDBKoCnecvlx) != null) {
                this.f5371fLSSbwbzFBVpwBH5FM.LU0fFDMACqnfIfA1AZ(colorStateList);
            }
            if (z4 && this.f5363bBVlTkqEpHW053CjWL && (!isEnabled() || !z3)) {
                if (z2 || !this.f5331Jsouc4ileb8SxQhxbX) {
                    tXWeW0sqVddf7ZBflq(z);
                    return;
                }
                return;
            }
            if (!z2 || this.f5331Jsouc4ileb8SxQhxbX) {
                WWC27LAMFqFFBzfbNw(z);
            }
            return;
        }
        ColorStateList colorStateList3 = this.f5333Kh0uC90qEEhuLdpgB9;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f5389xMfAHy6F7qK0zhxhKG) : this.f5389xMfAHy6F7qK0zhxhKG;
        leer5kfoer4xu5yhh7 = this.f5371fLSSbwbzFBVpwBH5FM;
        textColors = ColorStateList.valueOf(colorForState);
        leer5kfoer4xu5yhh7.PPkm9uUfOJHHYveeLT(textColors);
        if (z4) {
        }
        if (z2) {
        }
        WWC27LAMFqFFBzfbNw(z);
    }

    public final void jCtUeU2YI1poCxWcjm(Canvas canvas) {
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1;
        if (this.f5367e2F9F6h8YJxTHwLCa0 == null || (tCyPEKSzIyweCN5yp1 = this.f5324DfpieXfdYs58yZAiXY) == null) {
            return;
        }
        tCyPEKSzIyweCN5yp1.draw(canvas);
        if (this.f5393zZKhbgvUfsK4AEX3r0.isFocused()) {
            Rect bounds = this.f5367e2F9F6h8YJxTHwLCa0.getBounds();
            Rect bounds2 = this.f5324DfpieXfdYs58yZAiXY.getBounds();
            float fA49QRPHynYLCBN0SqP = this.f5371fLSSbwbzFBVpwBH5FM.A49QRPHynYLCBN0SqP();
            int iCenterX = bounds2.centerX();
            bounds.left = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(iCenterX, bounds2.left, fA49QRPHynYLCBN0SqP);
            bounds.right = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(iCenterX, bounds2.right, fA49QRPHynYLCBN0SqP);
            this.f5367e2F9F6h8YJxTHwLCa0.draw(canvas);
        }
    }

    public final void jocVUfxESVhVJU8LoH(Rect rect) {
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f5324DfpieXfdYs58yZAiXY;
        if (tCyPEKSzIyweCN5yp1 != null) {
            int i = rect.bottom;
            tCyPEKSzIyweCN5yp1.setBounds(rect.left, i - this.f5336LU0fFDMACqnfIfA1AZ, rect.right, i);
        }
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = this.f5367e2F9F6h8YJxTHwLCa0;
        if (tCyPEKSzIyweCN5yp12 != null) {
            int i2 = rect.bottom;
            tCyPEKSzIyweCN5yp12.setBounds(rect.left, i2 - this.f5395zcy2NNbtVXgoGQbfuq, rect.right, i2);
        }
    }

    public final boolean k0CbjZvfUz23r8IN6W() {
        return (this.f5329HJFh0TGMpafqLE9haL.W3RZ2dTDKrKpS5Mxdk() || ((this.f5329HJFh0TGMpafqLE9haL.THTDvPxsHqMeGb512f() && PPkm9uUfOJHHYveeLT()) || this.f5329HJFh0TGMpafqLE9haL.LIMtzhnLwQyigzK0KO() != null)) && this.f5329HJFh0TGMpafqLE9haL.getMeasuredWidth() > 0;
    }

    public boolean lLKzvdU99Iw80uVD5I() {
        return this.f5321Acstmh57AKoSEkEFNJ.ao3wqKm5CXFuvC0q47();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5371fLSSbwbzFBVpwBH5FM.OqIo5QF00RDxUQb4qq(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f5329HJFh0TGMpafqLE9haL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f5325Fo9071MN8vwEWamAUX = false;
        boolean zBBVlTkqEpHW053CjWL = bBVlTkqEpHW053CjWL();
        boolean zAyduHasC7VpxsVXE0T = ayduHasC7VpxsVXE0T();
        if (zBBVlTkqEpHW053CjWL || zAyduHasC7VpxsVXE0T) {
            this.f5393zZKhbgvUfsK4AEX3r0.post(new Runnable() { // from class: auvQiDfBN48eRz3fFq.tXWeW0sqVddf7ZBflq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4458lEeR5KfoEr4xU5yHH7.oocVJL811qFf0j0XXZ();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText != null) {
            Rect rect = this.f5387udcVtCzLTM1Loe9KrX;
            WaWv1mJ1ya3uoEaKqz.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this, editText, rect);
            jocVUfxESVhVJU8LoH(rect);
            if (this.f5339OUd9THiLjZndMj0qdF) {
                this.f5371fLSSbwbzFBVpwBH5FM.CSih7GetOUab1dYQjM(this.f5393zZKhbgvUfsK4AEX3r0.getTextSize());
                int gravity = this.f5393zZKhbgvUfsK4AEX3r0.getGravity();
                this.f5371fLSSbwbzFBVpwBH5FM.zcy2NNbtVXgoGQbfuq((gravity & (-113)) | 48);
                this.f5371fLSSbwbzFBVpwBH5FM.Uj8rPa1EWADtk6Oe0S(gravity);
                this.f5371fLSSbwbzFBVpwBH5FM.lLKzvdU99Iw80uVD5I(sTkWmhpZ5b1ArQIw4K(rect));
                this.f5371fLSSbwbzFBVpwBH5FM.cT5Hs3CQpLK8NvlZAw(G7AC3DWIx9i9fdanjk(rect));
                this.f5371fLSSbwbzFBVpwBH5FM.DfpieXfdYs58yZAiXY();
                if (!ao3wqKm5CXFuvC0q47() || this.f5331Jsouc4ileb8SxQhxbX) {
                    return;
                }
                cT5Hs3CQpLK8NvlZAw();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f5325Fo9071MN8vwEWamAUX) {
            this.f5329HJFh0TGMpafqLE9haL.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f5325Fo9071MN8vwEWamAUX = true;
        }
        yL2E9nlEZpg8ZZx8XE();
        this.f5329HJFh0TGMpafqLE9haL.Fo9071MN8vwEWamAUX();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TCyPEKSzIyweCN5yp1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) parcelable;
        super.onRestoreInstanceState(tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL());
        setError(tCyPEKSzIyweCN5yp1.f5397HJFh0TGMpafqLE9haL);
        if (tCyPEKSzIyweCN5yp1.f5398zZKhbgvUfsK4AEX3r0) {
            post(new s3fjYDxWOUexjjVgyA());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f5341PPkm9uUfOJHHYveeLT) {
            float fLEeR5KfoEr4xU5yHH7 = this.f5334KqgKJKIWne3kz1AdHk.sTkWmhpZ5b1ArQIw4K().lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l);
            float fLEeR5KfoEr4xU5yHH72 = this.f5334KqgKJKIWne3kz1AdHk.R9SAhYMerGybF9OAjL().lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l);
            Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4T9PhQIpGRhE4yZDm1C = Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7().WWC27LAMFqFFBzfbNw(this.f5334KqgKJKIWne3kz1AdHk.Y43RdunnpKgpbny0lE()).jCtUeU2YI1poCxWcjm(this.f5334KqgKJKIWne3kz1AdHk.zaq8hOURtfwbcX17cG()).sTkWmhpZ5b1ArQIw4K(this.f5334KqgKJKIWne3kz1AdHk.Z9WdNiOsPR0y54zHW4()).xHA29AmDt6y96AnB3t(this.f5334KqgKJKIWne3kz1AdHk.pbVGzGjWvY2LDXC8vo()).THTDvPxsHqMeGb512f(fLEeR5KfoEr4xU5yHH72).XzJ1BS7H9Ilbkv4eVM(fLEeR5KfoEr4xU5yHH7).Y43RdunnpKgpbny0lE(this.f5334KqgKJKIWne3kz1AdHk.e54J8UWNHWALQNixXM().lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l)).LIMtzhnLwQyigzK0KO(this.f5334KqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ().lEeR5KfoEr4xU5yHH7(this.f5372hUNBy66ZO1wVLJGW3l)).T9PhQIpGRhE4yZDm1C();
            this.f5341PPkm9uUfOJHHYveeLT = z;
            setShapeAppearanceModel(z9WdNiOsPR0y54zHW4T9PhQIpGRhE4yZDm1C);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(super.onSaveInstanceState());
        if (Tu4WCh2gEwj8E4oHbP()) {
            tCyPEKSzIyweCN5yp1.f5397HJFh0TGMpafqLE9haL = getError();
        }
        tCyPEKSzIyweCN5yp1.f5398zZKhbgvUfsK4AEX3r0 = this.f5329HJFh0TGMpafqLE9haL.XzJ1BS7H9Ilbkv4eVM();
        return tCyPEKSzIyweCN5yp1;
    }

    public final /* synthetic */ void oocVJL811qFf0j0XXZ() {
        this.f5393zZKhbgvUfsK4AEX3r0.requestLayout();
    }

    public final void osrHU7fvDp2EgxZPfM() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.f5380lLKzvdU99Iw80uVD5I;
                if (i == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i != 1) {
                    return;
                } else {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    public void pbVGzGjWvY2LDXC8vo(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f5382osrHU7fvDp2EgxZPfM.add(kYHag8HRDlnO3X9zmZ);
        if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
            kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(this);
        }
    }

    public final Rect sTkWmhpZ5b1ArQIw4K(Rect rect) {
        int paddingTop;
        int iDfpieXfdYs58yZAiXY;
        if (this.f5393zZKhbgvUfsK4AEX3r0 == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f5365cT5Hs3CQpLK8NvlZAw;
        boolean zTCyPEKSzIyweCN5yp1 = WaWv1mJ1ya3uoEaKqz.hoXrIDAFrSwfShk8da.TCyPEKSzIyweCN5yp1(this);
        rect2.bottom = rect.bottom;
        int i = this.f5380lLKzvdU99Iw80uVD5I;
        if (i == 1) {
            rect2.left = GyWRxpdt1T8mEJXPoD(rect.left, zTCyPEKSzIyweCN5yp1);
            paddingTop = rect.top + this.f5347ToH8yzk8U1nKT0PUfY;
        } else {
            if (i == 2) {
                rect2.left = rect.left + this.f5393zZKhbgvUfsK4AEX3r0.getPaddingLeft();
                rect2.top = rect.top - xHA29AmDt6y96AnB3t();
                iDfpieXfdYs58yZAiXY = rect.right - this.f5393zZKhbgvUfsK4AEX3r0.getPaddingRight();
                rect2.right = iDfpieXfdYs58yZAiXY;
                return rect2;
            }
            rect2.left = GyWRxpdt1T8mEJXPoD(rect.left, zTCyPEKSzIyweCN5yp1);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        iDfpieXfdYs58yZAiXY = DfpieXfdYs58yZAiXY(rect.right, zTCyPEKSzIyweCN5yp1);
        rect2.right = iDfpieXfdYs58yZAiXY;
        return rect2;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f5381oocVJL811qFf0j0XXZ != i) {
            this.f5381oocVJL811qFf0j0XXZ = i;
            this.f5370evSiTWao80SbJUZk9E = i;
            this.f5326FtYx4GXtxwA8al5hBy = i;
            this.f5362ayduHasC7VpxsVXE0T = i;
            T9PhQIpGRhE4yZDm1C();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5370evSiTWao80SbJUZk9E = defaultColor;
        this.f5381oocVJL811qFf0j0XXZ = defaultColor;
        this.f5323DFYiVi7zXozAjRciKa = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f5326FtYx4GXtxwA8al5hBy = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f5362ayduHasC7VpxsVXE0T = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        T9PhQIpGRhE4yZDm1C();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.f5380lLKzvdU99Iw80uVD5I) {
            return;
        }
        this.f5380lLKzvdU99Iw80uVD5I = i;
        if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
            udcVtCzLTM1Loe9KrX();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f5347ToH8yzk8U1nKT0PUfY = i;
    }

    public void setBoxCornerFamily(int i) {
        this.f5334KqgKJKIWne3kz1AdHk = this.f5334KqgKJKIWne3kz1AdHk.xHA29AmDt6y96AnB3t().VItLRw50eXTZeEfGl0(i, this.f5334KqgKJKIWne3kz1AdHk.sTkWmhpZ5b1ArQIw4K()).OUd9THiLjZndMj0qdF(i, this.f5334KqgKJKIWne3kz1AdHk.R9SAhYMerGybF9OAjL()).zaq8hOURtfwbcX17cG(i, this.f5334KqgKJKIWne3kz1AdHk.Acstmh57AKoSEkEFNJ()).G7AC3DWIx9i9fdanjk(i, this.f5334KqgKJKIWne3kz1AdHk.e54J8UWNHWALQNixXM()).T9PhQIpGRhE4yZDm1C();
        T9PhQIpGRhE4yZDm1C();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5392zXY7dgnTfw9Pd9RXel != i) {
            this.f5392zXY7dgnTfw9Pd9RXel = i;
            f2zPq7MOnQrtOlZ1Zg();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f5392zXY7dgnTfw9Pd9RXel != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            f2zPq7MOnQrtOlZ1Zg();
        } else {
            this.f5366ctWLFN70QQINH1kyYo = colorStateList.getDefaultColor();
            this.f5389xMfAHy6F7qK0zhxhKG = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5377jocVUfxESVhVJU8LoH = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f5392zXY7dgnTfw9Pd9RXel = defaultColor;
        f2zPq7MOnQrtOlZ1Zg();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5369eWK41qw3g36LVd4UnS != colorStateList) {
            this.f5369eWK41qw3g36LVd4UnS = colorStateList;
            f2zPq7MOnQrtOlZ1Zg();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f5336LU0fFDMACqnfIfA1AZ = i;
        f2zPq7MOnQrtOlZ1Zg();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f5395zcy2NNbtVXgoGQbfuq = i;
        f2zPq7MOnQrtOlZ1Zg();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f5357Z9WdNiOsPR0y54zHW4 != z) {
            if (z) {
                IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL = new IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL(getContext());
                this.f5360aPyGSIylzVNKPT1Bls = r9SAhYMerGybF9OAjL;
                r9SAhYMerGybF9OAjL.setId(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7099OqIo5QF00RDxUQb4qq);
                Typeface typeface = this.f5364bMSdooljgH14Jgudph;
                if (typeface != null) {
                    this.f5360aPyGSIylzVNKPT1Bls.setTypeface(typeface);
                }
                this.f5360aPyGSIylzVNKPT1Bls.setMaxLines(1);
                this.f5321Acstmh57AKoSEkEFNJ.husNiw3snxdgZPAGJm(this.f5360aPyGSIylzVNKPT1Bls, 2);
                R9SAhYMerGybF9OAjL.zZKhbgvUfsK4AEX3r0((ViewGroup.MarginLayoutParams) this.f5360aPyGSIylzVNKPT1Bls.getLayoutParams(), getResources().getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7033hUNBy66ZO1wVLJGW3l));
                DFYiVi7zXozAjRciKa();
                zXY7dgnTfw9Pd9RXel();
            } else {
                this.f5321Acstmh57AKoSEkEFNJ.OUd9THiLjZndMj0qdF(this.f5360aPyGSIylzVNKPT1Bls, 2);
                this.f5360aPyGSIylzVNKPT1Bls = null;
            }
            this.f5357Z9WdNiOsPR0y54zHW4 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f5368e54J8UWNHWALQNixXM != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f5368e54J8UWNHWALQNixXM = i;
            if (this.f5357Z9WdNiOsPR0y54zHW4) {
                zXY7dgnTfw9Pd9RXel();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f5338OANkd3mP6AYvwbNLJM != i) {
            this.f5338OANkd3mP6AYvwbNLJM = i;
            DFYiVi7zXozAjRciKa();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5352WWC27LAMFqFFBzfbNw != colorStateList) {
            this.f5352WWC27LAMFqFFBzfbNw = colorStateList;
            DFYiVi7zXozAjRciKa();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f5394zaq8hOURtfwbcX17cG != i) {
            this.f5394zaq8hOURtfwbcX17cG = i;
            DFYiVi7zXozAjRciKa();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5350VItLRw50eXTZeEfGl0 != colorStateList) {
            this.f5350VItLRw50eXTZeEfGl0 = colorStateList;
            DFYiVi7zXozAjRciKa();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f5346THTDvPxsHqMeGb512f != colorStateList) {
            this.f5346THTDvPxsHqMeGb512f = colorStateList;
            FtYx4GXtxwA8al5hBy();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f5361ao3wqKm5CXFuvC0q47 != colorStateList) {
            this.f5361ao3wqKm5CXFuvC0q47 = colorStateList;
            if (XdzLv4NdAtTYoEzVzB()) {
                FtYx4GXtxwA8al5hBy();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5333Kh0uC90qEEhuLdpgB9 = colorStateList;
        this.f5342Pum9NZyDBKoCnecvlx = colorStateList;
        if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
            O1furmptfI76BGfN0d(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        bMSdooljgH14Jgudph(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f5329HJFh0TGMpafqLE9haL.aAp6BD79BhftLCnuvf(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f5329HJFh0TGMpafqLE9haL.lLKzvdU99Iw80uVD5I(z);
    }

    public void setEndIconContentDescription(int i) {
        this.f5329HJFh0TGMpafqLE9haL.ToH8yzk8U1nKT0PUfY(i);
    }

    public void setEndIconDrawable(int i) {
        this.f5329HJFh0TGMpafqLE9haL.LU0fFDMACqnfIfA1AZ(i);
    }

    public void setEndIconMinSize(int i) {
        this.f5329HJFh0TGMpafqLE9haL.YlLW4G6OV9TFyuw5ix(i);
    }

    public void setEndIconMode(int i) {
        this.f5329HJFh0TGMpafqLE9haL.oocVJL811qFf0j0XXZ(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5329HJFh0TGMpafqLE9haL.udcVtCzLTM1Loe9KrX(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5329HJFh0TGMpafqLE9haL.cT5Hs3CQpLK8NvlZAw(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f5329HJFh0TGMpafqLE9haL.hUNBy66ZO1wVLJGW3l(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f5329HJFh0TGMpafqLE9haL.bMSdooljgH14Jgudph(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f5329HJFh0TGMpafqLE9haL.Uj8rPa1EWADtk6Oe0S(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.f5329HJFh0TGMpafqLE9haL.CSih7GetOUab1dYQjM(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f5321Acstmh57AKoSEkEFNJ.THTDvPxsHqMeGb512f()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5321Acstmh57AKoSEkEFNJ.LIMtzhnLwQyigzK0KO();
        } else {
            this.f5321Acstmh57AKoSEkEFNJ.XdzLv4NdAtTYoEzVzB(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.f5321Acstmh57AKoSEkEFNJ.XzJ1BS7H9Ilbkv4eVM(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f5321Acstmh57AKoSEkEFNJ.tXWeW0sqVddf7ZBflq(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f5321Acstmh57AKoSEkEFNJ.W3RZ2dTDKrKpS5Mxdk(z);
    }

    public void setErrorIconDrawable(int i) {
        this.f5329HJFh0TGMpafqLE9haL.osrHU7fvDp2EgxZPfM(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5329HJFh0TGMpafqLE9haL.Tu4WCh2gEwj8E4oHbP(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5329HJFh0TGMpafqLE9haL.k0CbjZvfUz23r8IN6W(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f5329HJFh0TGMpafqLE9haL.Kh0uC90qEEhuLdpgB9(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f5329HJFh0TGMpafqLE9haL.Pum9NZyDBKoCnecvlx(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.f5321Acstmh57AKoSEkEFNJ.OqIo5QF00RDxUQb4qq(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f5321Acstmh57AKoSEkEFNJ.GyWRxpdt1T8mEJXPoD(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f5363bBVlTkqEpHW053CjWL != z) {
            this.f5363bBVlTkqEpHW053CjWL = z;
            O1furmptfI76BGfN0d(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (lLKzvdU99Iw80uVD5I()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!lLKzvdU99Iw80uVD5I()) {
                setHelperTextEnabled(true);
            }
            this.f5321Acstmh57AKoSEkEFNJ.LU0fFDMACqnfIfA1AZ(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f5321Acstmh57AKoSEkEFNJ.KqgKJKIWne3kz1AdHk(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f5321Acstmh57AKoSEkEFNJ.e2F9F6h8YJxTHwLCa0(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f5321Acstmh57AKoSEkEFNJ.DfpieXfdYs58yZAiXY(i);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f5391yvdWWG9COQQotjfedH = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f5339OUd9THiLjZndMj0qdF) {
            this.f5339OUd9THiLjZndMj0qdF = z;
            if (z) {
                CharSequence hint = this.f5393zZKhbgvUfsK4AEX3r0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5376jCtUeU2YI1poCxWcjm)) {
                        setHint(hint);
                    }
                    this.f5393zZKhbgvUfsK4AEX3r0.setHint((CharSequence) null);
                }
                this.f5354XzJ1BS7H9Ilbkv4eVM = true;
            } else {
                this.f5354XzJ1BS7H9Ilbkv4eVM = false;
                if (!TextUtils.isEmpty(this.f5376jCtUeU2YI1poCxWcjm) && TextUtils.isEmpty(this.f5393zZKhbgvUfsK4AEX3r0.getHint())) {
                    this.f5393zZKhbgvUfsK4AEX3r0.setHint(this.f5376jCtUeU2YI1poCxWcjm);
                }
                setHintInternal(null);
            }
            if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
                yvdWWG9COQQotjfedH();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f5371fLSSbwbzFBVpwBH5FM.ToH8yzk8U1nKT0PUfY(i);
        this.f5342Pum9NZyDBKoCnecvlx = this.f5371fLSSbwbzFBVpwBH5FM.OANkd3mP6AYvwbNLJM();
        if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
            O1furmptfI76BGfN0d(false);
            yvdWWG9COQQotjfedH();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5342Pum9NZyDBKoCnecvlx != colorStateList) {
            if (this.f5333Kh0uC90qEEhuLdpgB9 == null) {
                this.f5371fLSSbwbzFBVpwBH5FM.LU0fFDMACqnfIfA1AZ(colorStateList);
            }
            this.f5342Pum9NZyDBKoCnecvlx = colorStateList;
            if (this.f5393zZKhbgvUfsK4AEX3r0 != null) {
                O1furmptfI76BGfN0d(false);
            }
        }
    }

    public void setLengthCounter(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f5373hoXrIDAFrSwfShk8da = husniw3snxdgzpagjm;
    }

    public void setMaxEms(int i) {
        this.f5345TCyPEKSzIyweCN5yp1 = i;
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f5383pbVGzGjWvY2LDXC8vo = i;
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f5332KYHag8HRDlnO3X9zmZ = i;
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f5330IPyIQcaNa8aB7drBED = i;
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.f5329HJFh0TGMpafqLE9haL.jocVUfxESVhVJU8LoH(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.f5329HJFh0TGMpafqLE9haL.eWK41qw3g36LVd4UnS(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.f5329HJFh0TGMpafqLE9haL.DFYiVi7zXozAjRciKa(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f5329HJFh0TGMpafqLE9haL.FtYx4GXtxwA8al5hBy(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f5329HJFh0TGMpafqLE9haL.ayduHasC7VpxsVXE0T(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5343R9SAhYMerGybF9OAjL == null) {
            IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL r9SAhYMerGybF9OAjL = new IPyIQcaNa8aB7drBED.R9SAhYMerGybF9OAjL(getContext());
            this.f5343R9SAhYMerGybF9OAjL = r9SAhYMerGybF9OAjL;
            r9SAhYMerGybF9OAjL.setId(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7113e2F9F6h8YJxTHwLCa0);
            lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this.f5343R9SAhYMerGybF9OAjL, 2);
            Tu4WCh2gEwj8E4oHbP.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0THTDvPxsHqMeGb512f = THTDvPxsHqMeGb512f();
            this.f5335LIMtzhnLwQyigzK0KO = zzkhbgvufsk4aex3r0THTDvPxsHqMeGb512f;
            zzkhbgvufsk4aex3r0THTDvPxsHqMeGb512f.Uj8rPa1EWADtk6Oe0S(67L);
            this.f5320A49QRPHynYLCBN0SqP = THTDvPxsHqMeGb512f();
            setPlaceholderTextAppearance(this.f5388xHA29AmDt6y96AnB3t);
            setPlaceholderTextColor(this.f5327G7AC3DWIx9i9fdanjk);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5355Y43RdunnpKgpbny0lE) {
                setPlaceholderTextEnabled(true);
            }
            this.f5385sTkWmhpZ5b1ArQIw4K = charSequence;
        }
        Fo9071MN8vwEWamAUX();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f5388xHA29AmDt6y96AnB3t = i;
        TextView textView = this.f5343R9SAhYMerGybF9OAjL;
        if (textView != null) {
            PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.aPyGSIylzVNKPT1Bls(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5327G7AC3DWIx9i9fdanjk != colorStateList) {
            this.f5327G7AC3DWIx9i9fdanjk = colorStateList;
            TextView textView = this.f5343R9SAhYMerGybF9OAjL;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f5384s3fjYDxWOUexjjVgyA.hoXrIDAFrSwfShk8da(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f5384s3fjYDxWOUexjjVgyA.aPyGSIylzVNKPT1Bls(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5384s3fjYDxWOUexjjVgyA.OANkd3mP6AYvwbNLJM(colorStateList);
    }

    public void setShapeAppearanceModel(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
        ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f5386tXWeW0sqVddf7ZBflq;
        if (tCyPEKSzIyweCN5yp1 == null || tCyPEKSzIyweCN5yp1.THTDvPxsHqMeGb512f() == z9WdNiOsPR0y54zHW4) {
            return;
        }
        this.f5334KqgKJKIWne3kz1AdHk = z9WdNiOsPR0y54zHW4;
        T9PhQIpGRhE4yZDm1C();
    }

    public void setStartIconCheckable(boolean z) {
        this.f5384s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        this.f5384s3fjYDxWOUexjjVgyA.R9SAhYMerGybF9OAjL(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5384s3fjYDxWOUexjjVgyA.G7AC3DWIx9i9fdanjk(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5384s3fjYDxWOUexjjVgyA.xHA29AmDt6y96AnB3t(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f5384s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f5384s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f5384s3fjYDxWOUexjjVgyA.VItLRw50eXTZeEfGl0(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f5384s3fjYDxWOUexjjVgyA.WWC27LAMFqFFBzfbNw(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f5329HJFh0TGMpafqLE9haL.xMfAHy6F7qK0zhxhKG(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.f5329HJFh0TGMpafqLE9haL.Jsouc4ileb8SxQhxbX(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5329HJFh0TGMpafqLE9haL.fLSSbwbzFBVpwBH5FM(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText != null) {
            lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(editText, zzkhbgvufsk4aex3r0);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5364bMSdooljgH14Jgudph) {
            this.f5364bMSdooljgH14Jgudph = typeface;
            this.f5371fLSSbwbzFBVpwBH5FM.jocVUfxESVhVJU8LoH(typeface);
            this.f5321Acstmh57AKoSEkEFNJ.aAp6BD79BhftLCnuvf(typeface);
            TextView textView = this.f5360aPyGSIylzVNKPT1Bls;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final void tXWeW0sqVddf7ZBflq(boolean z) {
        ValueAnimator valueAnimator = this.f5337O1furmptfI76BGfN0d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5337O1furmptfI76BGfN0d.cancel();
        }
        if (z && this.f5391yvdWWG9COQQotjfedH) {
            e54J8UWNHWALQNixXM(0.0f);
        } else {
            this.f5371fLSSbwbzFBVpwBH5FM.ZJNyOIPL0usMs2xSAn(0.0f);
        }
        if (ao3wqKm5CXFuvC0q47() && ((auvQiDfBN48eRz3fFq.IPyIQcaNa8aB7drBED) this.f5386tXWeW0sqVddf7ZBflq).ctWLFN70QQINH1kyYo()) {
            VItLRw50eXTZeEfGl0();
        }
        this.f5331Jsouc4ileb8SxQhxbX = true;
        KqgKJKIWne3kz1AdHk();
        this.f5384s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM(true);
        this.f5329HJFh0TGMpafqLE9haL.OqIo5QF00RDxUQb4qq(true);
    }

    public final void udcVtCzLTM1Loe9KrX() throws Resources.NotFoundException {
        OANkd3mP6AYvwbNLJM();
        fLSSbwbzFBVpwBH5FM();
        f2zPq7MOnQrtOlZ1Zg();
        ctWLFN70QQINH1kyYo();
        Z9WdNiOsPR0y54zHW4();
        if (this.f5380lLKzvdU99Iw80uVD5I != 0) {
            yvdWWG9COQQotjfedH();
        }
        osrHU7fvDp2EgxZPfM();
    }

    public final int xHA29AmDt6y96AnB3t() {
        float fZaq8hOURtfwbcX17cG;
        if (!this.f5339OUd9THiLjZndMj0qdF) {
            return 0;
        }
        int i = this.f5380lLKzvdU99Iw80uVD5I;
        if (i == 0) {
            fZaq8hOURtfwbcX17cG = this.f5371fLSSbwbzFBVpwBH5FM.zaq8hOURtfwbcX17cG();
        } else {
            if (i != 2) {
                return 0;
            }
            fZaq8hOURtfwbcX17cG = this.f5371fLSSbwbzFBVpwBH5FM.zaq8hOURtfwbcX17cG() / 2.0f;
        }
        return (int) fZaq8hOURtfwbcX17cG;
    }

    public void xMfAHy6F7qK0zhxhKG() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
        if (editText == null || this.f5380lLKzvdU99Iw80uVD5I != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (IPyIQcaNa8aB7drBED.VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7(background)) {
            background = background.mutate();
        }
        if (Tu4WCh2gEwj8E4oHbP()) {
            currentTextColor = getErrorCurrentTextColors();
        } else {
            if (!this.f5344T9PhQIpGRhE4yZDm1C || (textView = this.f5360aPyGSIylzVNKPT1Bls) == null) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(background);
                this.f5393zZKhbgvUfsK4AEX3r0.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(IPyIQcaNa8aB7drBED.IPyIQcaNa8aB7drBED.zZKhbgvUfsK4AEX3r0(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void yL2E9nlEZpg8ZZx8XE() {
        EditText editText;
        if (this.f5343R9SAhYMerGybF9OAjL == null || (editText = this.f5393zZKhbgvUfsK4AEX3r0) == null) {
            return;
        }
        this.f5343R9SAhYMerGybF9OAjL.setGravity(editText.getGravity());
        this.f5343R9SAhYMerGybF9OAjL.setPadding(this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingLeft(), this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingTop(), this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingRight(), this.f5393zZKhbgvUfsK4AEX3r0.getCompoundPaddingBottom());
    }

    public final void yvdWWG9COQQotjfedH() {
        if (this.f5380lLKzvdU99Iw80uVD5I != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5379lEeR5KfoEr4xU5yHH7.getLayoutParams();
            int iXHA29AmDt6y96AnB3t = xHA29AmDt6y96AnB3t();
            if (iXHA29AmDt6y96AnB3t != layoutParams.topMargin) {
                layoutParams.topMargin = iXHA29AmDt6y96AnB3t;
                this.f5379lEeR5KfoEr4xU5yHH7.requestLayout();
            }
        }
    }

    public final void zXY7dgnTfw9Pd9RXel() {
        if (this.f5360aPyGSIylzVNKPT1Bls != null) {
            EditText editText = this.f5393zZKhbgvUfsK4AEX3r0;
            eWK41qw3g36LVd4UnS(editText == null ? null : editText.getText());
        }
    }

    public final int zaq8hOURtfwbcX17cG() {
        return this.f5380lLKzvdU99Iw80uVD5I == 1 ? cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(cr99CPXhoiknALiHbq.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(this, tmIBXGVvBsrJ7i63G2.lEeR5KfoEr4xU5yHH7.f7130IPyIQcaNa8aB7drBED, 0), this.f5381oocVJL811qFf0j0XXZ) : this.f5381oocVJL811qFf0j0XXZ;
    }

    public final boolean zcy2NNbtVXgoGQbfuq() {
        return this.f5380lLKzvdU99Iw80uVD5I == 1 && this.f5393zZKhbgvUfsK4AEX3r0.getMinLines() <= 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int colorForState;
        int i2 = f5318Er40JrQbOM51vCQI8w;
        super(gpnYwZkFpQwu7zi2gb.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, attributeSet, i, i2), attributeSet, i);
        this.f5332KYHag8HRDlnO3X9zmZ = -1;
        this.f5345TCyPEKSzIyweCN5yp1 = -1;
        this.f5330IPyIQcaNa8aB7drBED = -1;
        this.f5383pbVGzGjWvY2LDXC8vo = -1;
        this.f5321Acstmh57AKoSEkEFNJ = new G7AC3DWIx9i9fdanjk(this);
        this.f5373hoXrIDAFrSwfShk8da = new husNiw3snxdgZPAGJm() { // from class: auvQiDfBN48eRz3fFq.W3RZ2dTDKrKpS5Mxdk
            @Override // com.google.android.material.textfield.TextInputLayout.husNiw3snxdgZPAGJm
            public final int lEeR5KfoEr4xU5yHH7(Editable editable) {
                return TextInputLayout.YlLW4G6OV9TFyuw5ix(editable);
            }
        };
        this.f5387udcVtCzLTM1Loe9KrX = new Rect();
        this.f5365cT5Hs3CQpLK8NvlZAw = new Rect();
        this.f5372hUNBy66ZO1wVLJGW3l = new RectF();
        this.f5382osrHU7fvDp2EgxZPfM = new LinkedHashSet();
        WaWv1mJ1ya3uoEaKqz.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new WaWv1mJ1ya3uoEaKqz.lEeR5KfoEr4xU5yHH7(this);
        this.f5371fLSSbwbzFBVpwBH5FM = leer5kfoer4xu5yhh7;
        this.f5325Fo9071MN8vwEWamAUX = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f5379lEeR5KfoEr4xU5yHH7 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.f6197lEeR5KfoEr4xU5yHH7;
        leer5kfoer4xu5yhh7.ctWLFN70QQINH1kyYo(timeInterpolator);
        leer5kfoer4xu5yhh7.k0CbjZvfUz23r8IN6W(timeInterpolator);
        leer5kfoer4xu5yhh7.zcy2NNbtVXgoGQbfuq(8388659);
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo = WaWv1mJ1ya3uoEaKqz.Z9WdNiOsPR0y54zHW4.pbVGzGjWvY2LDXC8vo(context2, attributeSet, Acstmh57AKoSEkEFNJ.ptJA20qPHdNEOXOmTu, i, i2, Acstmh57AKoSEkEFNJ.yvmXoJLlPI2eyTRzJi, Acstmh57AKoSEkEFNJ.tiDhljTjT4UM6aDAqR, Acstmh57AKoSEkEFNJ.gbRorzlup27jGBaDRA, Acstmh57AKoSEkEFNJ.Xax5jokXe9HqcJrEGV, Acstmh57AKoSEkEFNJ.Cui28kftYjGMETHkwc);
        VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0 = new VItLRw50eXTZeEfGl0(this, pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo);
        this.f5384s3fjYDxWOUexjjVgyA = vItLRw50eXTZeEfGl0;
        this.f5339OUd9THiLjZndMj0qdF = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.A4fylYHOpdKNH2lRvA, true);
        setHint(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.aPyGSIylzVNKPT1Bls(Acstmh57AKoSEkEFNJ.nr70FmrSxjFDkeoZzb));
        this.f5391yvdWWG9COQQotjfedH = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.F9k1ytSf0GdMyYf5Ss, true);
        this.f5363bBVlTkqEpHW053CjWL = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.yBKWISRBjQvDZ4wWqj, true);
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.nC7R2iV0dQCYjng7Y0)) {
            setMinEms(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ.nC7R2iV0dQCYjng7Y0, -1));
        } else if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.i7MfZGy5YWm3JQf52R)) {
            setMinWidth(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ(Acstmh57AKoSEkEFNJ.i7MfZGy5YWm3JQf52R, -1));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.ptd27hYC3Kcy20iwk6)) {
            setMaxEms(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ.ptd27hYC3Kcy20iwk6, -1));
        } else if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.Z53NTKd0bUMUvBOAGJ)) {
            setMaxWidth(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ(Acstmh57AKoSEkEFNJ.Z53NTKd0bUMUvBOAGJ, -1));
        }
        this.f5334KqgKJKIWne3kz1AdHk = Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm(context2, attributeSet, i, i2).T9PhQIpGRhE4yZDm1C();
        this.f5359aAp6BD79BhftLCnuvf = context2.getResources().getDimensionPixelOffset(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7039oocVJL811qFf0j0XXZ);
        this.f5347ToH8yzk8U1nKT0PUfY = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(Acstmh57AKoSEkEFNJ.GnzTex5Srj7Hsto49M, 0);
        this.f5336LU0fFDMACqnfIfA1AZ = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ(Acstmh57AKoSEkEFNJ.hNXfNdT5mtxNs1GuVC, context2.getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7044udcVtCzLTM1Loe9KrX));
        this.f5395zcy2NNbtVXgoGQbfuq = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ(Acstmh57AKoSEkEFNJ.aCJ5cclggorQVZBTbW, context2.getResources().getDimensionPixelSize(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7030cT5Hs3CQpLK8NvlZAw));
        this.f5353XdzLv4NdAtTYoEzVzB = this.f5336LU0fFDMACqnfIfA1AZ;
        float fZZKhbgvUfsK4AEX3r0 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(Acstmh57AKoSEkEFNJ.JmuEqzl4NsRhujPMMV, -1.0f);
        float fZZKhbgvUfsK4AEX3r02 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(Acstmh57AKoSEkEFNJ.d99Jdu1XIwVGvnRvUH, -1.0f);
        float fZZKhbgvUfsK4AEX3r03 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(Acstmh57AKoSEkEFNJ.ejXhmJgMedZTf8EpYr, -1.0f);
        float fZZKhbgvUfsK4AEX3r04 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(Acstmh57AKoSEkEFNJ.PDM7aWY7RIz2e8JnJf, -1.0f);
        Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t = this.f5334KqgKJKIWne3kz1AdHk.xHA29AmDt6y96AnB3t();
        if (fZZKhbgvUfsK4AEX3r0 >= 0.0f) {
            s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.THTDvPxsHqMeGb512f(fZZKhbgvUfsK4AEX3r0);
        }
        if (fZZKhbgvUfsK4AEX3r02 >= 0.0f) {
            s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.XzJ1BS7H9Ilbkv4eVM(fZZKhbgvUfsK4AEX3r02);
        }
        if (fZZKhbgvUfsK4AEX3r03 >= 0.0f) {
            s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.LIMtzhnLwQyigzK0KO(fZZKhbgvUfsK4AEX3r03);
        }
        if (fZZKhbgvUfsK4AEX3r04 >= 0.0f) {
            s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.Y43RdunnpKgpbny0lE(fZZKhbgvUfsK4AEX3r04);
        }
        this.f5334KqgKJKIWne3kz1AdHk = s3fjydxwouexjjvgyaXHA29AmDt6y96AnB3t.T9PhQIpGRhE4yZDm1C();
        ColorStateList colorStateListLEeR5KfoEr4xU5yHH7 = hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context2, pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo, Acstmh57AKoSEkEFNJ.jLzfag2cL38rVpu61O);
        if (colorStateListLEeR5KfoEr4xU5yHH7 != null) {
            int defaultColor = colorStateListLEeR5KfoEr4xU5yHH7.getDefaultColor();
            this.f5370evSiTWao80SbJUZk9E = defaultColor;
            this.f5381oocVJL811qFf0j0XXZ = defaultColor;
            if (colorStateListLEeR5KfoEr4xU5yHH7.isStateful()) {
                this.f5323DFYiVi7zXozAjRciKa = colorStateListLEeR5KfoEr4xU5yHH7.getColorForState(new int[]{-16842910}, -1);
                this.f5326FtYx4GXtxwA8al5hBy = colorStateListLEeR5KfoEr4xU5yHH7.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListLEeR5KfoEr4xU5yHH7.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f5326FtYx4GXtxwA8al5hBy = this.f5370evSiTWao80SbJUZk9E;
                ColorStateList colorStateListLEeR5KfoEr4xU5yHH72 = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context2, tmIBXGVvBsrJ7i63G2.s3fjYDxWOUexjjVgyA.f7171HJFh0TGMpafqLE9haL);
                this.f5323DFYiVi7zXozAjRciKa = colorStateListLEeR5KfoEr4xU5yHH72.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListLEeR5KfoEr4xU5yHH72.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.f5362ayduHasC7VpxsVXE0T = colorForState;
        } else {
            this.f5381oocVJL811qFf0j0XXZ = 0;
            this.f5370evSiTWao80SbJUZk9E = 0;
            this.f5323DFYiVi7zXozAjRciKa = 0;
            this.f5326FtYx4GXtxwA8al5hBy = 0;
            this.f5362ayduHasC7VpxsVXE0T = 0;
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.s5Oh75GDdoX7b1l094)) {
            ColorStateList colorStateListHJFh0TGMpafqLE9haL = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.s5Oh75GDdoX7b1l094);
            this.f5342Pum9NZyDBKoCnecvlx = colorStateListHJFh0TGMpafqLE9haL;
            this.f5333Kh0uC90qEEhuLdpgB9 = colorStateListHJFh0TGMpafqLE9haL;
        }
        ColorStateList colorStateListLEeR5KfoEr4xU5yHH73 = hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context2, pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo, Acstmh57AKoSEkEFNJ.bUDsVuwB2OjLREfRmq);
        this.f5392zXY7dgnTfw9Pd9RXel = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(Acstmh57AKoSEkEFNJ.bUDsVuwB2OjLREfRmq, 0);
        this.f5366ctWLFN70QQINH1kyYo = LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context2, tmIBXGVvBsrJ7i63G2.s3fjYDxWOUexjjVgyA.f7176zZKhbgvUfsK4AEX3r0);
        this.f5389xMfAHy6F7qK0zhxhKG = LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context2, tmIBXGVvBsrJ7i63G2.s3fjYDxWOUexjjVgyA.f7173husNiw3snxdgZPAGJm);
        this.f5377jocVUfxESVhVJU8LoH = LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context2, tmIBXGVvBsrJ7i63G2.s3fjYDxWOUexjjVgyA.f7172KYHag8HRDlnO3X9zmZ);
        if (colorStateListLEeR5KfoEr4xU5yHH73 != null) {
            setBoxStrokeColorStateList(colorStateListLEeR5KfoEr4xU5yHH73);
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.gKlx9TCGZPuWbI4HAq)) {
            setBoxStrokeErrorColor(hgxXdWVkE1CPHCTwpz.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context2, pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo, Acstmh57AKoSEkEFNJ.gKlx9TCGZPuWbI4HAq));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.Cui28kftYjGMETHkwc, -1) != -1) {
            setHintTextAppearance(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.Cui28kftYjGMETHkwc, 0));
        }
        this.f5346THTDvPxsHqMeGb512f = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.HNBrvay7JQYkT4BEFY);
        this.f5361ao3wqKm5CXFuvC0q47 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.QlPaVODg40wvJIIyxC);
        int iT9PhQIpGRhE4yZDm1C = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.gbRorzlup27jGBaDRA, 0);
        CharSequence charSequenceAPyGSIylzVNKPT1Bls = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.aPyGSIylzVNKPT1Bls(Acstmh57AKoSEkEFNJ.ifZ13yYSNdc9RYoTDR);
        int iAcstmh57AKoSEkEFNJ = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ.YC7SL9LJ0ywORDgFC8, 1);
        boolean zLEeR5KfoEr4xU5yHH7 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.eIp4vW4M11welmRcRD, false);
        int iT9PhQIpGRhE4yZDm1C2 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.Xax5jokXe9HqcJrEGV, 0);
        boolean zLEeR5KfoEr4xU5yHH72 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.HfJjGky7cW0SbMe7tU, false);
        CharSequence charSequenceAPyGSIylzVNKPT1Bls2 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.aPyGSIylzVNKPT1Bls(Acstmh57AKoSEkEFNJ.Y9bMqxBfgDxubQkGbC);
        int iT9PhQIpGRhE4yZDm1C3 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.zdSeiqS4Ov9hVy58UK, 0);
        CharSequence charSequenceAPyGSIylzVNKPT1Bls3 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.aPyGSIylzVNKPT1Bls(Acstmh57AKoSEkEFNJ.TQMqyCtrpO1vwqx9oG);
        boolean zLEeR5KfoEr4xU5yHH73 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.sZPuLd2rw7yNBmuw5f, false);
        setCounterMaxLength(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ.mo8MK9AKngpxoIW4Yq, -1));
        this.f5394zaq8hOURtfwbcX17cG = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.yvmXoJLlPI2eyTRzJi, 0);
        this.f5338OANkd3mP6AYvwbNLJM = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C(Acstmh57AKoSEkEFNJ.tiDhljTjT4UM6aDAqR, 0);
        setBoxBackgroundMode(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ.Zvm0iEL00igz9SvehN, 0));
        setErrorContentDescription(charSequenceAPyGSIylzVNKPT1Bls);
        setErrorAccessibilityLiveRegion(iAcstmh57AKoSEkEFNJ);
        setCounterOverflowTextAppearance(this.f5338OANkd3mP6AYvwbNLJM);
        setHelperTextTextAppearance(iT9PhQIpGRhE4yZDm1C2);
        setErrorTextAppearance(iT9PhQIpGRhE4yZDm1C);
        setCounterTextAppearance(this.f5394zaq8hOURtfwbcX17cG);
        setPlaceholderText(charSequenceAPyGSIylzVNKPT1Bls3);
        setPlaceholderTextAppearance(iT9PhQIpGRhE4yZDm1C3);
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.CASTHmHJ6tqn02TcBE)) {
            setErrorTextColor(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.CASTHmHJ6tqn02TcBE));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.TfAZCyc4OqL69wHUfB)) {
            setHelperTextColor(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.TfAZCyc4OqL69wHUfB));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.QK72QApCKZTOfspNsx)) {
            setHintTextColor(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.QK72QApCKZTOfspNsx));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.vzRab2y5qw3EMtE8yj)) {
            setCounterTextColor(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.vzRab2y5qw3EMtE8yj));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.cGibYp8HSk4cU6iz3M)) {
            setCounterOverflowTextColor(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.cGibYp8HSk4cU6iz3M));
        }
        if (pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(Acstmh57AKoSEkEFNJ.dZz02SXWuKW33kFb3V)) {
            setPlaceholderTextColor(pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ.dZz02SXWuKW33kFb3V));
        }
        com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new com.google.android.material.textfield.lEeR5KfoEr4xU5yHH7(this, pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo);
        this.f5329HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh72;
        boolean zLEeR5KfoEr4xU5yHH74 = pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ.UP08pABMVrbvM8fNeq, true);
        pPkm9uUfOJHHYveeLTPbVGzGjWvY2LDXC8vo.xHA29AmDt6y96AnB3t();
        lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            lLKzvdU99Iw80uVD5I.yL2E9nlEZpg8ZZx8XE(this, 1);
        }
        frameLayout.addView(vItLRw50eXTZeEfGl0);
        frameLayout.addView(leer5kfoer4xu5yhh72);
        addView(frameLayout);
        setEnabled(zLEeR5KfoEr4xU5yHH74);
        setHelperTextEnabled(zLEeR5KfoEr4xU5yHH72);
        setErrorEnabled(zLEeR5KfoEr4xU5yHH7);
        setCounterEnabled(zLEeR5KfoEr4xU5yHH73);
        setHelperText(charSequenceAPyGSIylzVNKPT1Bls2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f5329HJFh0TGMpafqLE9haL.XdzLv4NdAtTYoEzVzB(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f5329HJFh0TGMpafqLE9haL.zcy2NNbtVXgoGQbfuq(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5329HJFh0TGMpafqLE9haL.ZJNyOIPL0usMs2xSAn(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5339OUd9THiLjZndMj0qdF) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5329HJFh0TGMpafqLE9haL.zXY7dgnTfw9Pd9RXel(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5329HJFh0TGMpafqLE9haL.evSiTWao80SbJUZk9E(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f5384s3fjYDxWOUexjjVgyA.sTkWmhpZ5b1ArQIw4K(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5384s3fjYDxWOUexjjVgyA.Y43RdunnpKgpbny0lE(drawable);
    }
}
