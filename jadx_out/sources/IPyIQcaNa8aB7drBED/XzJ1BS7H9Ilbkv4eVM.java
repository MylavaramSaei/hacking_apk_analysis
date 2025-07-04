package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class XzJ1BS7H9Ilbkv4eVM extends OUd9THiLjZndMj0qdF implements jCtUeU2YI1poCxWcjm {

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public static Method f616DfpieXfdYs58yZAiXY;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public jCtUeU2YI1poCxWcjm f617GyWRxpdt1T8mEJXPoD;

    public static class HJFh0TGMpafqLE9haL extends WWC27LAMFqFFBzfbNw {

        /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
        public MenuItem f618OANkd3mP6AYvwbNLJM;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public final int f619T9PhQIpGRhE4yZDm1C;

        /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
        public jCtUeU2YI1poCxWcjm f620aPyGSIylzVNKPT1Bls;

        /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
        public final int f621hoXrIDAFrSwfShk8da;

        public HJFh0TGMpafqLE9haL(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f619T9PhQIpGRhE4yZDm1C = 21;
                this.f621hoXrIDAFrSwfShk8da = 22;
            } else {
                this.f619T9PhQIpGRhE4yZDm1C = 22;
                this.f621hoXrIDAFrSwfShk8da = 21;
            }
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw
        public /* bridge */ /* synthetic */ boolean husNiw3snxdgZPAGJm(MotionEvent motionEvent, int i) {
            return super.husNiw3snxdgZPAGJm(motionEvent, i);
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f620aPyGSIylzVNKPT1Bls != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hJFh0TGMpafqLE9haL = (androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hJFh0TGMpafqLE9haL = (androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.husNiw3snxdgZPAGJm item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= hJFh0TGMpafqLE9haL.getCount()) ? null : hJFh0TGMpafqLE9haL.getItem(i);
                MenuItem menuItem = this.f618OANkd3mP6AYvwbNLJM;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0S3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
                    if (menuItem != null) {
                        this.f620aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL(zzkhbgvufsk4aex3r0S3fjYDxWOUexjjVgyA, menuItem);
                    }
                    this.f618OANkd3mP6AYvwbNLJM = item;
                    if (item != null) {
                        this.f620aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0S3fjYDxWOUexjjVgyA, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f619T9PhQIpGRhE4yZDm1C) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f621hoXrIDAFrSwfShk8da) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) adapter).s3fjYDxWOUexjjVgyA().zZKhbgvUfsK4AEX3r0(false);
            return true;
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
            this.f620aPyGSIylzVNKPT1Bls = jctueu2yi1pocxwcjm;
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // IPyIQcaNa8aB7drBED.WWC27LAMFqFFBzfbNw
        public /* bridge */ /* synthetic */ int zZKhbgvUfsK4AEX3r0(int i, int i2, int i3, int i4, int i5) {
            return super.zZKhbgvUfsK4AEX3r0(i, i2, i3, i4, i5);
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void s3fjYDxWOUexjjVgyA(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static void lEeR5KfoEr4xU5yHH7(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f616DfpieXfdYs58yZAiXY = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public XzJ1BS7H9Ilbkv4eVM(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm
    public void HJFh0TGMpafqLE9haL(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem) {
        jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm = this.f617GyWRxpdt1T8mEJXPoD;
        if (jctueu2yi1pocxwcjm != null) {
            jctueu2yi1pocxwcjm.HJFh0TGMpafqLE9haL(zzkhbgvufsk4aex3r0, menuItem);
        }
    }

    @Override // IPyIQcaNa8aB7drBED.OUd9THiLjZndMj0qdF
    public WWC27LAMFqFFBzfbNw IPyIQcaNa8aB7drBED(Context context, boolean z) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(context, z);
        hJFh0TGMpafqLE9haL.setHoverListener(this);
        return hJFh0TGMpafqLE9haL;
    }

    public void OqIo5QF00RDxUQb4qq(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f551tXWeW0sqVddf7ZBflq, z);
            return;
        }
        Method method = f616DfpieXfdYs58yZAiXY;
        if (method != null) {
            try {
                method.invoke(this.f551tXWeW0sqVddf7ZBflq, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    public void W3RZ2dTDKrKpS5Mxdk(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
        this.f617GyWRxpdt1T8mEJXPoD = jctueu2yi1pocxwcjm;
    }

    public void XzJ1BS7H9Ilbkv4eVM(Object obj) {
        lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f551tXWeW0sqVddf7ZBflq, (Transition) obj);
    }

    @Override // IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm
    public void lEeR5KfoEr4xU5yHH7(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem) {
        jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm = this.f617GyWRxpdt1T8mEJXPoD;
        if (jctueu2yi1pocxwcjm != null) {
            jctueu2yi1pocxwcjm.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0, menuItem);
        }
    }

    public void tXWeW0sqVddf7ZBflq(Object obj) {
        lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f551tXWeW0sqVddf7ZBflq, (Transition) obj);
    }
}
