package IPyIQcaNa8aB7drBED;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
public class oocVJL811qFf0j0XXZ {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final TextView f695HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int[] f696KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int[] f697TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Rect f698husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f699lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final View f700s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final WindowManager.LayoutParams f701zZKhbgvUfsK4AEX3r0;

    public oocVJL811qFf0j0XXZ(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f701zZKhbgvUfsK4AEX3r0 = layoutParams;
        this.f698husNiw3snxdgZPAGJm = new Rect();
        this.f696KYHag8HRDlnO3X9zmZ = new int[2];
        this.f697TCyPEKSzIyweCN5yp1 = new int[2];
        this.f699lEeR5KfoEr4xU5yHH7 = context;
        View viewInflate = LayoutInflater.from(context).inflate(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6233Z9WdNiOsPR0y54zHW4, (ViewGroup) null);
        this.f700s3fjYDxWOUexjjVgyA = viewInflate;
        this.f695HJFh0TGMpafqLE9haL = (TextView) viewInflate.findViewById(lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm.f6259e54J8UWNHWALQNixXM);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED.f6226lEeR5KfoEr4xU5yHH7;
        layoutParams.flags = 24;
    }

    public static View s3fjYDxWOUexjjVgyA(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public void HJFh0TGMpafqLE9haL() {
        if (zZKhbgvUfsK4AEX3r0()) {
            ((WindowManager) this.f699lEeR5KfoEr4xU5yHH7.getSystemService("window")).removeView(this.f700s3fjYDxWOUexjjVgyA);
        }
    }

    public void husNiw3snxdgZPAGJm(View view, int i, int i2, boolean z, CharSequence charSequence) throws Resources.NotFoundException {
        if (zZKhbgvUfsK4AEX3r0()) {
            HJFh0TGMpafqLE9haL();
        }
        this.f695HJFh0TGMpafqLE9haL.setText(charSequence);
        lEeR5KfoEr4xU5yHH7(view, i, i2, z, this.f701zZKhbgvUfsK4AEX3r0);
        ((WindowManager) this.f699lEeR5KfoEr4xU5yHH7.getSystemService("window")).addView(this.f700s3fjYDxWOUexjjVgyA, this.f701zZKhbgvUfsK4AEX3r0);
    }

    public final void lEeR5KfoEr4xU5yHH7(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f699lEeR5KfoEr4xU5yHH7.getResources().getDimensionPixelOffset(lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6220TCyPEKSzIyweCN5yp1);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f699lEeR5KfoEr4xU5yHH7.getResources().getDimensionPixelOffset(lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6219KYHag8HRDlnO3X9zmZ);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f699lEeR5KfoEr4xU5yHH7.getResources().getDimensionPixelOffset(z ? lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6223pbVGzGjWvY2LDXC8vo : lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6218IPyIQcaNa8aB7drBED);
        View viewS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(view);
        if (viewS3fjYDxWOUexjjVgyA == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewS3fjYDxWOUexjjVgyA.getWindowVisibleDisplayFrame(this.f698husNiw3snxdgZPAGJm);
        Rect rect = this.f698husNiw3snxdgZPAGJm;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f699lEeR5KfoEr4xU5yHH7.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f698husNiw3snxdgZPAGJm.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewS3fjYDxWOUexjjVgyA.getLocationOnScreen(this.f697TCyPEKSzIyweCN5yp1);
        view.getLocationOnScreen(this.f696KYHag8HRDlnO3X9zmZ);
        int[] iArr = this.f696KYHag8HRDlnO3X9zmZ;
        int i4 = iArr[0];
        int[] iArr2 = this.f697TCyPEKSzIyweCN5yp1;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (viewS3fjYDxWOUexjjVgyA.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f700s3fjYDxWOUexjjVgyA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f700s3fjYDxWOUexjjVgyA.getMeasuredHeight();
        int i6 = this.f696KYHag8HRDlnO3X9zmZ[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i8 <= this.f698husNiw3snxdgZPAGJm.height() : i7 < 0) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i8;
        }
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        return this.f700s3fjYDxWOUexjjVgyA.getParent() != null;
    }
}
