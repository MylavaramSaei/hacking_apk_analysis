package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class WWC27LAMFqFFBzfbNw extends ListView {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public boolean f597Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f598HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f599IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int f600KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f601TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm f602Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ f603e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f604husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Rect f605lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f606pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f607s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f608zZKhbgvUfsK4AEX3r0;

    public static class HJFh0TGMpafqLE9haL {
        public static boolean lEeR5KfoEr4xU5yHH7(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void s3fjYDxWOUexjjVgyA(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    public class KYHag8HRDlnO3X9zmZ implements Runnable {
        public KYHag8HRDlnO3X9zmZ() {
        }

        public void lEeR5KfoEr4xU5yHH7() {
            WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = WWC27LAMFqFFBzfbNw.this;
            wWC27LAMFqFFBzfbNw.f603e54J8UWNHWALQNixXM = null;
            wWC27LAMFqFFBzfbNw.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw = WWC27LAMFqFFBzfbNw.this;
            wWC27LAMFqFFBzfbNw.f603e54J8UWNHWALQNixXM = null;
            wWC27LAMFqFFBzfbNw.drawableStateChanged();
        }

        public void s3fjYDxWOUexjjVgyA() {
            WWC27LAMFqFFBzfbNw.this.post(this);
        }
    }

    public static class husNiw3snxdgZPAGJm {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final Field f610lEeR5KfoEr4xU5yHH7;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f610lEeR5KfoEr4xU5yHH7 = declaredField;
        }

        public static boolean lEeR5KfoEr4xU5yHH7(AbsListView absListView) {
            Field field = f610lEeR5KfoEr4xU5yHH7;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        public static void s3fjYDxWOUexjjVgyA(AbsListView absListView, boolean z) throws IllegalAccessException, IllegalArgumentException {
            Field field = f610lEeR5KfoEr4xU5yHH7;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public static Method f611HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static Method f612lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static Method f613s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public static boolean f614zZKhbgvUfsK4AEX3r0;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f612lEeR5KfoEr4xU5yHH7 = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f613s3fjYDxWOUexjjVgyA = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f611HJFh0TGMpafqLE9haL = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f614zZKhbgvUfsK4AEX3r0 = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean lEeR5KfoEr4xU5yHH7() {
            return f614zZKhbgvUfsK4AEX3r0;
        }

        public static void s3fjYDxWOUexjjVgyA(WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                f612lEeR5KfoEr4xU5yHH7.invoke(wWC27LAMFqFFBzfbNw, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f613s3fjYDxWOUexjjVgyA.invoke(wWC27LAMFqFFBzfbNw, Integer.valueOf(i));
                f611HJFh0TGMpafqLE9haL.invoke(wWC27LAMFqFFBzfbNw, Integer.valueOf(i));
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 extends zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f615s3fjYDxWOUexjjVgyA;

        public zZKhbgvUfsK4AEX3r0(Drawable drawable) {
            super(drawable);
            this.f615s3fjYDxWOUexjjVgyA = true;
        }

        @Override // zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f615s3fjYDxWOUexjjVgyA) {
                super.draw(canvas);
            }
        }

        public void s3fjYDxWOUexjjVgyA(boolean z) {
            this.f615s3fjYDxWOUexjjVgyA = z;
        }

        @Override // zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f615s3fjYDxWOUexjjVgyA) {
                super.setHotspot(f, f2);
            }
        }

        @Override // zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f615s3fjYDxWOUexjjVgyA) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f615s3fjYDxWOUexjjVgyA) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f615s3fjYDxWOUexjjVgyA) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public WWC27LAMFqFFBzfbNw(Context context, boolean z) {
        super(context, null, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6278hoXrIDAFrSwfShk8da);
        this.f605lEeR5KfoEr4xU5yHH7 = new Rect();
        this.f607s3fjYDxWOUexjjVgyA = 0;
        this.f598HJFh0TGMpafqLE9haL = 0;
        this.f608zZKhbgvUfsK4AEX3r0 = 0;
        this.f604husNiw3snxdgZPAGJm = 0;
        this.f606pbVGzGjWvY2LDXC8vo = z;
        setCacheColorHint(0);
    }

    public final void Acstmh57AKoSEkEFNJ(boolean z) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f601TCyPEKSzIyweCN5yp1;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(z);
        }
    }

    public final void HJFh0TGMpafqLE9haL(Canvas canvas) {
        Drawable selector;
        if (this.f605lEeR5KfoEr4xU5yHH7.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f605lEeR5KfoEr4xU5yHH7);
        selector.draw(canvas);
    }

    public final void IPyIQcaNa8aB7drBED(int i, View view, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        TCyPEKSzIyweCN5yp1(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(selector, f, f2);
    }

    public final void KYHag8HRDlnO3X9zmZ(int i, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f605lEeR5KfoEr4xU5yHH7;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f607s3fjYDxWOUexjjVgyA;
        rect.top -= this.f598HJFh0TGMpafqLE9haL;
        rect.right += this.f608zZKhbgvUfsK4AEX3r0;
        rect.bottom += this.f604husNiw3snxdgZPAGJm;
        boolean zZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4();
        if (view.isEnabled() != zZ9WdNiOsPR0y54zHW4) {
            e54J8UWNHWALQNixXM(!zZ9WdNiOsPR0y54zHW4);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    public final boolean T9PhQIpGRhE4yZDm1C() {
        return this.f597Acstmh57AKoSEkEFNJ;
    }

    public final void TCyPEKSzIyweCN5yp1(int i, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        KYHag8HRDlnO3X9zmZ(i, view);
        if (z) {
            Rect rect = this.f605lEeR5KfoEr4xU5yHH7;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(selector, fExactCenterX, fExactCenterY);
        }
    }

    public final boolean Z9WdNiOsPR0y54zHW4() {
        return Build.VERSION.SDK_INT >= 33 ? HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this) : husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(this);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        HJFh0TGMpafqLE9haL(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f603e54J8UWNHWALQNixXM != null) {
            return;
        }
        super.drawableStateChanged();
        Acstmh57AKoSEkEFNJ(true);
        hoXrIDAFrSwfShk8da();
    }

    public final void e54J8UWNHWALQNixXM(boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 33) {
            HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this, z);
        } else {
            husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(this, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f606pbVGzGjWvY2LDXC8vo || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f606pbVGzGjWvY2LDXC8vo || super.hasWindowFocus();
    }

    public final void hoXrIDAFrSwfShk8da() {
        Drawable selector = getSelector();
        if (selector != null && T9PhQIpGRhE4yZDm1C() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean husNiw3snxdgZPAGJm(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.pbVGzGjWvY2LDXC8vo(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.s3fjYDxWOUexjjVgyA(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.lEeR5KfoEr4xU5yHH7()
        L4d:
            if (r3 == 0) goto L65
            PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm r9 = r7.f602Z9WdNiOsPR0y54zHW4
            if (r9 != 0) goto L5a
            PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm r9 = new PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm
            r9.<init>(r7)
            r7.f602Z9WdNiOsPR0y54zHW4 = r9
        L5a:
            PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm r9 = r7.f602Z9WdNiOsPR0y54zHW4
            r9.T9PhQIpGRhE4yZDm1C(r1)
            PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm r9 = r7.f602Z9WdNiOsPR0y54zHW4
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            PPkm9uUfOJHHYveeLT.husNiw3snxdgZPAGJm r8 = r7.f602Z9WdNiOsPR0y54zHW4
            if (r8 == 0) goto L6c
            r8.T9PhQIpGRhE4yZDm1C(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f606pbVGzGjWvY2LDXC8vo || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f606pbVGzGjWvY2LDXC8vo && this.f599IPyIQcaNa8aB7drBED) || super.isInTouchMode();
    }

    public final void lEeR5KfoEr4xU5yHH7() {
        this.f597Acstmh57AKoSEkEFNJ = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f600KYHag8HRDlnO3X9zmZ - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f603e54J8UWNHWALQNixXM = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f603e54J8UWNHWALQNixXM == null) {
            KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = new KYHag8HRDlnO3X9zmZ();
            this.f603e54J8UWNHWALQNixXM = kYHag8HRDlnO3X9zmZ;
            kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this, iPointToPosition, childAt);
                    }
                }
                hoXrIDAFrSwfShk8da();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f600KYHag8HRDlnO3X9zmZ = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f603e54J8UWNHWALQNixXM;
        if (kYHag8HRDlnO3X9zmZ != null) {
            kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void pbVGzGjWvY2LDXC8vo(View view, int i, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f597Acstmh57AKoSEkEFNJ = true;
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f600KYHag8HRDlnO3X9zmZ;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f600KYHag8HRDlnO3X9zmZ = i;
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        IPyIQcaNa8aB7drBED(i, view, f, f2);
        Acstmh57AKoSEkEFNJ(false);
        refreshDrawableState();
    }

    public final void s3fjYDxWOUexjjVgyA(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public void setListSelectionHidden(boolean z) {
        this.f599IPyIQcaNa8aB7drBED = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = drawable != null ? new zZKhbgvUfsK4AEX3r0(drawable) : null;
        this.f601TCyPEKSzIyweCN5yp1 = zzkhbgvufsk4aex3r0;
        super.setSelector(zzkhbgvufsk4aex3r0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f607s3fjYDxWOUexjjVgyA = rect.left;
        this.f598HJFh0TGMpafqLE9haL = rect.top;
        this.f608zZKhbgvUfsK4AEX3r0 = rect.right;
        this.f604husNiw3snxdgZPAGJm = rect.bottom;
    }

    public int zZKhbgvUfsK4AEX3r0(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }
}
