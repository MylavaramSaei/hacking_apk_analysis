package VItLRw50eXTZeEfGl0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class OANkd3mP6AYvwbNLJM {
    public static boolean HJFh0TGMpafqLE9haL(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(file, inputStreamOpenRawResource);
                lEeR5KfoEr4xU5yHH7(inputStreamOpenRawResource);
                return zZZKhbgvUfsK4AEX3r0;
            } catch (Throwable th) {
                th = th;
                lEeR5KfoEr4xU5yHH7(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static Map IPyIQcaNa8aB7drBED(Context context, TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            if (s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA() == 0) {
                Uri uriZZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0();
                if (!map.containsKey(uriZZKhbgvUfsK4AEX3r0)) {
                    map.put(uriZZKhbgvUfsK4AEX3r0, KYHag8HRDlnO3X9zmZ(context, cancellationSignal, uriZZKhbgvUfsK4AEX3r0));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static ByteBuffer KYHag8HRDlnO3X9zmZ(Context context, CancellationSignal cancellationSignal, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static ByteBuffer TCyPEKSzIyweCN5yp1(File file) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static File husNiw3snxdgZPAGJm(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static void lEeR5KfoEr4xU5yHH7(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer s3fjYDxWOUexjjVgyA(Context context, Resources resources, int i) {
        File fileHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(context);
        if (fileHusNiw3snxdgZPAGJm == null) {
            return null;
        }
        try {
            if (HJFh0TGMpafqLE9haL(fileHusNiw3snxdgZPAGJm, resources, i)) {
                return TCyPEKSzIyweCN5yp1(fileHusNiw3snxdgZPAGJm);
            }
            return null;
        } finally {
            fileHusNiw3snxdgZPAGJm.delete();
        }
    }

    public static boolean zZKhbgvUfsK4AEX3r0(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    lEeR5KfoEr4xU5yHH7(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            lEeR5KfoEr4xU5yHH7(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            lEeR5KfoEr4xU5yHH7(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }
}
