package androidx.constraintlayout.widget;

import OANkd3mP6AYvwbNLJM.pbVGzGjWvY2LDXC8vo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL extends View {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Context f3069HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public HashMap f3070IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public String f3071KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public View[] f3072TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f3073husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int[] f3074lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f3075s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f3076zZKhbgvUfsK4AEX3r0;

    public HJFh0TGMpafqLE9haL(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f3074lEeR5KfoEr4xU5yHH7 = new int[32];
        this.f3073husNiw3snxdgZPAGJm = false;
        this.f3072TCyPEKSzIyweCN5yp1 = null;
        this.f3070IPyIQcaNa8aB7drBED = new HashMap();
        this.f3069HJFh0TGMpafqLE9haL = context;
        TCyPEKSzIyweCN5yp1(null);
    }

    public void Acstmh57AKoSEkEFNJ(ConstraintLayout constraintLayout) {
    }

    public void HJFh0TGMpafqLE9haL() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        zZKhbgvUfsK4AEX3r0((ConstraintLayout) parent);
    }

    public abstract void IPyIQcaNa8aB7drBED(OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, boolean z);

    public final int KYHag8HRDlnO3X9zmZ(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iHusNiw3snxdgZPAGJm = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objKYHag8HRDlnO3X9zmZ = constraintLayout.KYHag8HRDlnO3X9zmZ(0, str);
            if (objKYHag8HRDlnO3X9zmZ instanceof Integer) {
                iHusNiw3snxdgZPAGJm = ((Integer) objKYHag8HRDlnO3X9zmZ).intValue();
            }
        }
        if (iHusNiw3snxdgZPAGJm == 0 && constraintLayout != null) {
            iHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(constraintLayout, str);
        }
        if (iHusNiw3snxdgZPAGJm == 0) {
            try {
                iHusNiw3snxdgZPAGJm = sTkWmhpZ5b1ArQIw4K.HJFh0TGMpafqLE9haL.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iHusNiw3snxdgZPAGJm == 0 ? this.f3069HJFh0TGMpafqLE9haL.getResources().getIdentifier(str, "id", this.f3069HJFh0TGMpafqLE9haL.getPackageName()) : iHusNiw3snxdgZPAGJm;
    }

    public void T9PhQIpGRhE4yZDm1C() {
        if (this.f3076zZKhbgvUfsK4AEX3r0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.s3fjYDxWOUexjjVgyA) {
            ((ConstraintLayout.s3fjYDxWOUexjjVgyA) layoutParams).f3006FtYx4GXtxwA8al5hBy = (OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm) this.f3076zZKhbgvUfsK4AEX3r0;
        }
    }

    public void TCyPEKSzIyweCN5yp1(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6697LFGi8lLul9XOP250o9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6757dvmHGYHwlE2ean7ktb) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f3071KYHag8HRDlnO3X9zmZ = string;
                    setIds(string);
                }
            }
        }
    }

    public void Z9WdNiOsPR0y54zHW4(ConstraintLayout constraintLayout) {
    }

    public void e54J8UWNHWALQNixXM(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iHusNiw3snxdgZPAGJm;
        if (isInEditMode()) {
            setIds(this.f3071KYHag8HRDlnO3X9zmZ);
        }
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f3076zZKhbgvUfsK4AEX3r0;
        if (pbvgzgjwvy2ldxc8vo == null) {
            return;
        }
        pbvgzgjwvy2ldxc8vo.s3fjYDxWOUexjjVgyA();
        for (int i = 0; i < this.f3075s3fjYDxWOUexjjVgyA; i++) {
            int i2 = this.f3074lEeR5KfoEr4xU5yHH7[i];
            View viewIPyIQcaNa8aB7drBED = constraintLayout.IPyIQcaNa8aB7drBED(i2);
            if (viewIPyIQcaNa8aB7drBED == null && (iHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(constraintLayout, (str = (String) this.f3070IPyIQcaNa8aB7drBED.get(Integer.valueOf(i2))))) != 0) {
                this.f3074lEeR5KfoEr4xU5yHH7[i] = iHusNiw3snxdgZPAGJm;
                this.f3070IPyIQcaNa8aB7drBED.put(Integer.valueOf(iHusNiw3snxdgZPAGJm), str);
                viewIPyIQcaNa8aB7drBED = constraintLayout.IPyIQcaNa8aB7drBED(iHusNiw3snxdgZPAGJm);
            }
            if (viewIPyIQcaNa8aB7drBED != null) {
                this.f3076zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(constraintLayout.pbVGzGjWvY2LDXC8vo(viewIPyIQcaNa8aB7drBED));
            }
        }
        this.f3076zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(constraintLayout.f2971HJFh0TGMpafqLE9haL);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3074lEeR5KfoEr4xU5yHH7, this.f3075s3fjYDxWOUexjjVgyA);
    }

    public final int husNiw3snxdgZPAGJm(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f3069HJFh0TGMpafqLE9haL.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final void lEeR5KfoEr4xU5yHH7(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f3069HJFh0TGMpafqLE9haL == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(strTrim);
        if (iKYHag8HRDlnO3X9zmZ != 0) {
            this.f3070IPyIQcaNa8aB7drBED.put(Integer.valueOf(iKYHag8HRDlnO3X9zmZ), strTrim);
            s3fjYDxWOUexjjVgyA(iKYHag8HRDlnO3X9zmZ);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    @Override // android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f3071KYHag8HRDlnO3X9zmZ;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f3073husNiw3snxdgZPAGJm) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void pbVGzGjWvY2LDXC8vo(ConstraintLayout constraintLayout) {
    }

    public final void s3fjYDxWOUexjjVgyA(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f3075s3fjYDxWOUexjjVgyA + 1;
        int[] iArr = this.f3074lEeR5KfoEr4xU5yHH7;
        if (i2 > iArr.length) {
            this.f3074lEeR5KfoEr4xU5yHH7 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3074lEeR5KfoEr4xU5yHH7;
        int i3 = this.f3075s3fjYDxWOUexjjVgyA;
        iArr2[i3] = i;
        this.f3075s3fjYDxWOUexjjVgyA = i3 + 1;
    }

    public void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f3071KYHag8HRDlnO3X9zmZ = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f3075s3fjYDxWOUexjjVgyA = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                lEeR5KfoEr4xU5yHH7(str.substring(i));
                return;
            } else {
                lEeR5KfoEr4xU5yHH7(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3071KYHag8HRDlnO3X9zmZ = null;
        this.f3075s3fjYDxWOUexjjVgyA = 0;
        for (int i : iArr) {
            s3fjYDxWOUexjjVgyA(i);
        }
    }

    public void zZKhbgvUfsK4AEX3r0(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f3075s3fjYDxWOUexjjVgyA; i++) {
            View viewIPyIQcaNa8aB7drBED = constraintLayout.IPyIQcaNa8aB7drBED(this.f3074lEeR5KfoEr4xU5yHH7[i]);
            if (viewIPyIQcaNa8aB7drBED != null) {
                viewIPyIQcaNa8aB7drBED.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewIPyIQcaNa8aB7drBED.setTranslationZ(viewIPyIQcaNa8aB7drBED.getTranslationZ() + elevation);
                }
            }
        }
    }

    public HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f3074lEeR5KfoEr4xU5yHH7 = new int[32];
        this.f3073husNiw3snxdgZPAGJm = false;
        this.f3072TCyPEKSzIyweCN5yp1 = null;
        this.f3070IPyIQcaNa8aB7drBED = new HashMap();
        this.f3069HJFh0TGMpafqLE9haL = context;
        TCyPEKSzIyweCN5yp1(attributeSet);
    }
}
