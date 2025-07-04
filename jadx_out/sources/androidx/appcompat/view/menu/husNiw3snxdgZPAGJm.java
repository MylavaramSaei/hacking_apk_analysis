package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED;

/* loaded from: classes.dex */
public final class husNiw3snxdgZPAGJm implements THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public char f2631Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f2633HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public char f2634IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public CharSequence f2635KYHag8HRDlnO3X9zmZ;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public Runnable f2637OANkd3mP6AYvwbNLJM;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public Intent f2641TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public View f2642THTDvPxsHqMeGb512f;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public int f2644WWC27LAMFqFFBzfbNw;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public CharSequence f2645Y43RdunnpKgpbny0lE;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public Acstmh57AKoSEkEFNJ f2647aPyGSIylzVNKPT1Bls;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2648ao3wqKm5CXFuvC0q47;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public Drawable f2649e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f2650hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public CharSequence f2651husNiw3snxdgZPAGJm;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f2652jCtUeU2YI1poCxWcjm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f2653lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f2655s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public CharSequence f2656sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f2658zZKhbgvUfsK4AEX3r0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2659zaq8hOURtfwbcX17cG;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f2654pbVGzGjWvY2LDXC8vo = 4096;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f2646Z9WdNiOsPR0y54zHW4 = 4096;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f2640T9PhQIpGRhE4yZDm1C = 0;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public ColorStateList f2639R9SAhYMerGybF9OAjL = null;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public PorterDuff.Mode f2632G7AC3DWIx9i9fdanjk = null;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public boolean f2657xHA29AmDt6y96AnB3t = false;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f2636LIMtzhnLwQyigzK0KO = false;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public boolean f2630A49QRPHynYLCBN0SqP = false;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public int f2643VItLRw50eXTZeEfGl0 = 16;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public boolean f2638OUd9THiLjZndMj0qdF = false;

    public husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2650hoXrIDAFrSwfShk8da = zzkhbgvufsk4aex3r0;
        this.f2653lEeR5KfoEr4xU5yHH7 = i2;
        this.f2655s3fjYDxWOUexjjVgyA = i;
        this.f2633HJFh0TGMpafqLE9haL = i3;
        this.f2658zZKhbgvUfsK4AEX3r0 = i4;
        this.f2651husNiw3snxdgZPAGJm = charSequence;
        this.f2644WWC27LAMFqFFBzfbNw = i5;
    }

    public static void s3fjYDxWOUexjjVgyA(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public boolean A49QRPHynYLCBN0SqP(boolean z) {
        int i = this.f2643VItLRw50eXTZeEfGl0;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f2643VItLRw50eXTZeEfGl0 = i2;
        return i != i2;
    }

    public boolean Acstmh57AKoSEkEFNJ() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2659zaq8hOURtfwbcX17cG;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2650hoXrIDAFrSwfShk8da;
        if (zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(zzkhbgvufsk4aex3r0, this)) {
            return true;
        }
        Runnable runnable = this.f2637OANkd3mP6AYvwbNLJM;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2641TCyPEKSzIyweCN5yp1 == null) {
            return false;
        }
        try {
            this.f2650hoXrIDAFrSwfShk8da.Y43RdunnpKgpbny0lE().startActivity(this.f2641TCyPEKSzIyweCN5yp1);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            return false;
        }
    }

    public void G7AC3DWIx9i9fdanjk(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2652jCtUeU2YI1poCxWcjm = contextMenuInfo;
    }

    public final Drawable HJFh0TGMpafqLE9haL(Drawable drawable) {
        if (drawable != null && this.f2630A49QRPHynYLCBN0SqP && (this.f2657xHA29AmDt6y96AnB3t || this.f2636LIMtzhnLwQyigzK0KO)) {
            drawable = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate();
            if (this.f2657xHA29AmDt6y96AnB3t) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, this.f2639R9SAhYMerGybF9OAjL);
            }
            if (this.f2636LIMtzhnLwQyigzK0KO) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawable, this.f2632G7AC3DWIx9i9fdanjk);
            }
            this.f2630A49QRPHynYLCBN0SqP = false;
        }
        return drawable;
    }

    public CharSequence IPyIQcaNa8aB7drBED(IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        return (leer5kfoer4xu5yhh7 == null || !leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL()) ? getTitle() : getTitleCondensed();
    }

    public String KYHag8HRDlnO3X9zmZ() {
        int i;
        char cHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm();
        if (cHusNiw3snxdgZPAGJm == 0) {
            return "";
        }
        Resources resources = this.f2650hoXrIDAFrSwfShk8da.Y43RdunnpKgpbny0lE().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2650hoXrIDAFrSwfShk8da.Y43RdunnpKgpbny0lE()).hasPermanentMenuKey()) {
            sb.append(resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6244Z9WdNiOsPR0y54zHW4));
        }
        int i2 = this.f2650hoXrIDAFrSwfShk8da.jCtUeU2YI1poCxWcjm() ? this.f2646Z9WdNiOsPR0y54zHW4 : this.f2654pbVGzGjWvY2LDXC8vo;
        s3fjYDxWOUexjjVgyA(sb, i2, 65536, resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6243TCyPEKSzIyweCN5yp1));
        s3fjYDxWOUexjjVgyA(sb, i2, 4096, resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6240HJFh0TGMpafqLE9haL));
        s3fjYDxWOUexjjVgyA(sb, i2, 2, resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6248s3fjYDxWOUexjjVgyA));
        s3fjYDxWOUexjjVgyA(sb, i2, 1, resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6241IPyIQcaNa8aB7drBED));
        s3fjYDxWOUexjjVgyA(sb, i2, 4, resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6239Acstmh57AKoSEkEFNJ));
        s3fjYDxWOUexjjVgyA(sb, i2, 8, resources.getString(lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6242KYHag8HRDlnO3X9zmZ));
        if (cHusNiw3snxdgZPAGJm == '\b') {
            i = lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6249zZKhbgvUfsK4AEX3r0;
        } else if (cHusNiw3snxdgZPAGJm == '\n') {
            i = lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6245husNiw3snxdgZPAGJm;
        } else {
            if (cHusNiw3snxdgZPAGJm != ' ') {
                sb.append(cHusNiw3snxdgZPAGJm);
                return sb.toString();
            }
            i = lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1.f6247pbVGzGjWvY2LDXC8vo;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    public void LIMtzhnLwQyigzK0KO(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        this.f2647aPyGSIylzVNKPT1Bls = acstmh57AKoSEkEFNJ;
        acstmh57AKoSEkEFNJ.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    /* renamed from: OANkd3mP6AYvwbNLJM, reason: merged with bridge method [inline-methods] */
    public THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA setActionView(View view) {
        int i;
        this.f2642THTDvPxsHqMeGb512f = view;
        if (view != null && view.getId() == -1 && (i = this.f2653lEeR5KfoEr4xU5yHH7) > 0) {
            view.setId(i);
        }
        this.f2650hoXrIDAFrSwfShk8da.tXWeW0sqVddf7ZBflq(this);
        return this;
    }

    public void R9SAhYMerGybF9OAjL(boolean z) {
        this.f2643VItLRw50eXTZeEfGl0 = z ? this.f2643VItLRw50eXTZeEfGl0 | 32 : this.f2643VItLRw50eXTZeEfGl0 & (-33);
    }

    public boolean T9PhQIpGRhE4yZDm1C() {
        return (this.f2644WWC27LAMFqFFBzfbNw & 1) == 1;
    }

    public W3RZ2dTDKrKpS5Mxdk.s3fjYDxWOUexjjVgyA TCyPEKSzIyweCN5yp1() {
        return null;
    }

    public boolean THTDvPxsHqMeGb512f() {
        return (this.f2644WWC27LAMFqFFBzfbNw & 4) == 4;
    }

    public boolean VItLRw50eXTZeEfGl0() {
        return this.f2650hoXrIDAFrSwfShk8da.LIMtzhnLwQyigzK0KO();
    }

    public boolean WWC27LAMFqFFBzfbNw() {
        return this.f2650hoXrIDAFrSwfShk8da.XzJ1BS7H9Ilbkv4eVM() && husNiw3snxdgZPAGJm() != 0;
    }

    public void Y43RdunnpKgpbny0lE(boolean z) {
        this.f2643VItLRw50eXTZeEfGl0 = (z ? 4 : 0) | (this.f2643VItLRw50eXTZeEfGl0 & (-5));
    }

    public boolean Z9WdNiOsPR0y54zHW4() {
        return (this.f2643VItLRw50eXTZeEfGl0 & 32) == 32;
    }

    @Override // android.view.MenuItem
    /* renamed from: aPyGSIylzVNKPT1Bls, reason: merged with bridge method [inline-methods] */
    public THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA setActionView(int i) {
        Context contextY43RdunnpKgpbny0lE = this.f2650hoXrIDAFrSwfShk8da.Y43RdunnpKgpbny0lE();
        setActionView(LayoutInflater.from(contextY43RdunnpKgpbny0lE).inflate(i, (ViewGroup) new LinearLayout(contextY43RdunnpKgpbny0lE), false));
        return this;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2644WWC27LAMFqFFBzfbNw & 8) == 0) {
            return false;
        }
        if (this.f2642THTDvPxsHqMeGb512f == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2648ao3wqKm5CXFuvC0q47;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2650hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(this);
        }
        return false;
    }

    public boolean e54J8UWNHWALQNixXM() {
        return (this.f2643VItLRw50eXTZeEfGl0 & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!pbVGzGjWvY2LDXC8vo()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2648ao3wqKm5CXFuvC0q47;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2650hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f2642THTDvPxsHqMeGb512f;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2646Z9WdNiOsPR0y54zHW4;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2631Acstmh57AKoSEkEFNJ;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2656sTkWmhpZ5b1ArQIw4K;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2655s3fjYDxWOUexjjVgyA;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f2649e54J8UWNHWALQNixXM;
        if (drawable != null) {
            return HJFh0TGMpafqLE9haL(drawable);
        }
        if (this.f2640T9PhQIpGRhE4yZDm1C == 0) {
            return null;
        }
        Drawable drawableS3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f2650hoXrIDAFrSwfShk8da.Y43RdunnpKgpbny0lE(), this.f2640T9PhQIpGRhE4yZDm1C);
        this.f2640T9PhQIpGRhE4yZDm1C = 0;
        this.f2649e54J8UWNHWALQNixXM = drawableS3fjYDxWOUexjjVgyA;
        return HJFh0TGMpafqLE9haL(drawableS3fjYDxWOUexjjVgyA);
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2639R9SAhYMerGybF9OAjL;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2632G7AC3DWIx9i9fdanjk;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2641TCyPEKSzIyweCN5yp1;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2653lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2652jCtUeU2YI1poCxWcjm;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2654pbVGzGjWvY2LDXC8vo;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2634IPyIQcaNa8aB7drBED;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2633HJFh0TGMpafqLE9haL;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2647aPyGSIylzVNKPT1Bls;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2651husNiw3snxdgZPAGJm;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2635KYHag8HRDlnO3X9zmZ;
        return charSequence != null ? charSequence : this.f2651husNiw3snxdgZPAGJm;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2645Y43RdunnpKgpbny0lE;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2647aPyGSIylzVNKPT1Bls != null;
    }

    public boolean hoXrIDAFrSwfShk8da() {
        return (this.f2644WWC27LAMFqFFBzfbNw & 2) == 2;
    }

    public char husNiw3snxdgZPAGJm() {
        return this.f2650hoXrIDAFrSwfShk8da.jCtUeU2YI1poCxWcjm() ? this.f2631Acstmh57AKoSEkEFNJ : this.f2634IPyIQcaNa8aB7drBED;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2638OUd9THiLjZndMj0qdF;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2643VItLRw50eXTZeEfGl0 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2643VItLRw50eXTZeEfGl0 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2643VItLRw50eXTZeEfGl0 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2643VItLRw50eXTZeEfGl0 & 8) == 0;
    }

    public void lEeR5KfoEr4xU5yHH7() {
        this.f2650hoXrIDAFrSwfShk8da.tXWeW0sqVddf7ZBflq(this);
    }

    public boolean pbVGzGjWvY2LDXC8vo() {
        return ((this.f2644WWC27LAMFqFFBzfbNw & 8) == 0 || this.f2642THTDvPxsHqMeGb512f == null) ? false : true;
    }

    public void sTkWmhpZ5b1ArQIw4K(boolean z) {
        int i = this.f2643VItLRw50eXTZeEfGl0;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f2643VItLRw50eXTZeEfGl0 = i2;
        if (i != i2) {
            this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2631Acstmh57AKoSEkEFNJ == c) {
            return this;
        }
        this.f2631Acstmh57AKoSEkEFNJ = Character.toLowerCase(c);
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f2643VItLRw50eXTZeEfGl0;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f2643VItLRw50eXTZeEfGl0 = i2;
        if (i != i2) {
            this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f2643VItLRw50eXTZeEfGl0 & 4) != 0) {
            this.f2650hoXrIDAFrSwfShk8da.aAp6BD79BhftLCnuvf(this);
        } else {
            sTkWmhpZ5b1ArQIw4K(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA setContentDescription(CharSequence charSequence) {
        this.f2656sTkWmhpZ5b1ArQIw4K = charSequence;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f2643VItLRw50eXTZeEfGl0 = z ? this.f2643VItLRw50eXTZeEfGl0 | 16 : this.f2643VItLRw50eXTZeEfGl0 & (-17);
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2649e54J8UWNHWALQNixXM = null;
        this.f2640T9PhQIpGRhE4yZDm1C = i;
        this.f2630A49QRPHynYLCBN0SqP = true;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2639R9SAhYMerGybF9OAjL = colorStateList;
        this.f2657xHA29AmDt6y96AnB3t = true;
        this.f2630A49QRPHynYLCBN0SqP = true;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2632G7AC3DWIx9i9fdanjk = mode;
        this.f2636LIMtzhnLwQyigzK0KO = true;
        this.f2630A49QRPHynYLCBN0SqP = true;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2641TCyPEKSzIyweCN5yp1 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f2634IPyIQcaNa8aB7drBED == c) {
            return this;
        }
        this.f2634IPyIQcaNa8aB7drBED = c;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2648ao3wqKm5CXFuvC0q47 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2659zaq8hOURtfwbcX17cG = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f2634IPyIQcaNa8aB7drBED = c;
        this.f2631Acstmh57AKoSEkEFNJ = Character.toLowerCase(c2);
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2644WWC27LAMFqFFBzfbNw = i;
        this.f2650hoXrIDAFrSwfShk8da.tXWeW0sqVddf7ZBflq(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f2650hoXrIDAFrSwfShk8da.Y43RdunnpKgpbny0lE().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2635KYHag8HRDlnO3X9zmZ = charSequence;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA setTooltipText(CharSequence charSequence) {
        this.f2645Y43RdunnpKgpbny0lE = charSequence;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (A49QRPHynYLCBN0SqP(z)) {
            this.f2650hoXrIDAFrSwfShk8da.W3RZ2dTDKrKpS5Mxdk(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f2651husNiw3snxdgZPAGJm;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    /* renamed from: xHA29AmDt6y96AnB3t, reason: merged with bridge method [inline-methods] */
    public THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public int zZKhbgvUfsK4AEX3r0() {
        return this.f2658zZKhbgvUfsK4AEX3r0;
    }

    public void zaq8hOURtfwbcX17cG(boolean z) {
        this.f2638OUd9THiLjZndMj0qdF = z;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
    }

    @Override // THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2631Acstmh57AKoSEkEFNJ == c && this.f2646Z9WdNiOsPR0y54zHW4 == i) {
            return this;
        }
        this.f2631Acstmh57AKoSEkEFNJ = Character.toLowerCase(c);
        this.f2646Z9WdNiOsPR0y54zHW4 = KeyEvent.normalizeMetaState(i);
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2640T9PhQIpGRhE4yZDm1C = 0;
        this.f2649e54J8UWNHWALQNixXM = drawable;
        this.f2630A49QRPHynYLCBN0SqP = true;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // THTDvPxsHqMeGb512f.s3fjYDxWOUexjjVgyA, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2634IPyIQcaNa8aB7drBED == c && this.f2654pbVGzGjWvY2LDXC8vo == i) {
            return this;
        }
        this.f2634IPyIQcaNa8aB7drBED = c;
        this.f2654pbVGzGjWvY2LDXC8vo = KeyEvent.normalizeMetaState(i);
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2634IPyIQcaNa8aB7drBED = c;
        this.f2654pbVGzGjWvY2LDXC8vo = KeyEvent.normalizeMetaState(i);
        this.f2631Acstmh57AKoSEkEFNJ = Character.toLowerCase(c2);
        this.f2646Z9WdNiOsPR0y54zHW4 = KeyEvent.normalizeMetaState(i2);
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2651husNiw3snxdgZPAGJm = charSequence;
        this.f2650hoXrIDAFrSwfShk8da.OqIo5QF00RDxUQb4qq(false);
        Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = this.f2647aPyGSIylzVNKPT1Bls;
        if (acstmh57AKoSEkEFNJ != null) {
            acstmh57AKoSEkEFNJ.setHeaderTitle(charSequence);
        }
        return this;
    }
}
